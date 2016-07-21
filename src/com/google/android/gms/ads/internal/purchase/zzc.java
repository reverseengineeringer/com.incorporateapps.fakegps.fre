package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class zzc
  extends zzim
  implements ServiceConnection
{
  private Context mContext;
  private zzgh zzAK;
  private boolean zzFB = false;
  private zzb zzFC;
  private zzh zzFD;
  private List zzFE = null;
  private zzk zzFF;
  private final Object zzpV = new Object();
  
  public zzc(Context paramContext, zzgh paramzzgh, zzk paramzzk)
  {
    this(paramContext, paramzzgh, paramzzk, new zzb(paramContext), zzh.zzy(paramContext.getApplicationContext()));
  }
  
  zzc(Context paramContext, zzgh paramzzgh, zzk paramzzk, zzb paramzzb, zzh paramzzh)
  {
    mContext = paramContext;
    zzAK = paramzzgh;
    zzFF = paramzzk;
    zzFC = paramzzb;
    zzFD = paramzzh;
    zzFE = zzFD.zzg(10L);
  }
  
  private void zze(long paramLong)
  {
    do
    {
      if (!zzf(paramLong)) {
        zzin.v("Timeout waiting for pending transaction to be processed.");
      }
    } while (!zzFB);
  }
  
  private boolean zzf(long paramLong)
  {
    paramLong = 60000L - (SystemClock.elapsedRealtime() - paramLong);
    if (paramLong <= 0L) {
      return false;
    }
    try
    {
      zzpV.wait(paramLong);
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        zzin.zzaK("waitWithTimeout_lock interrupted");
      }
    }
  }
  
  public void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
  {
    synchronized (zzpV)
    {
      zzFC.zzN(paramIBinder);
      zzfW();
      zzFB = true;
      zzpV.notify();
      return;
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    zzin.zzaJ("In-app billing service disconnected.");
    zzFC.destroy();
  }
  
  public void onStop()
  {
    synchronized (zzpV)
    {
      com.google.android.gms.common.stats.zzb.zzrP().zza(mContext, this);
      zzFC.destroy();
      return;
    }
  }
  
  protected void zza(zzf paramzzf, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent();
    zzr.zzbM();
    localIntent.putExtra("RESPONSE_CODE", 0);
    zzr.zzbM();
    localIntent.putExtra("INAPP_PURCHASE_DATA", paramString1);
    zzr.zzbM();
    localIntent.putExtra("INAPP_DATA_SIGNATURE", paramString2);
    zzir.zzMc.post(new zzc.1(this, paramzzf, localIntent));
  }
  
  public void zzbr()
  {
    synchronized (zzpV)
    {
      Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
      localIntent.setPackage("com.android.vending");
      com.google.android.gms.common.stats.zzb.zzrP().zza(mContext, localIntent, this, 1);
      zze(SystemClock.elapsedRealtime());
      com.google.android.gms.common.stats.zzb.zzrP().zza(mContext, this);
      zzFC.destroy();
      return;
    }
  }
  
  protected void zzfW()
  {
    if (zzFE.isEmpty()) {
      return;
    }
    HashMap localHashMap = new HashMap();
    Object localObject1 = zzFE.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (zzf)((Iterator)localObject1).next();
      localHashMap.put(zzFR, localObject2);
    }
    localObject1 = null;
    for (;;)
    {
      localObject1 = zzFC.zzi(mContext.getPackageName(), (String)localObject1);
      if ((localObject1 != null) && (zzr.zzbM().zzd((Bundle)localObject1) == 0))
      {
        localObject2 = ((Bundle)localObject1).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList localArrayList1 = ((Bundle)localObject1).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList localArrayList2 = ((Bundle)localObject1).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        localObject1 = ((Bundle)localObject1).getString("INAPP_CONTINUATION_TOKEN");
        int i = 0;
        while (i < ((ArrayList)localObject2).size())
        {
          if (localHashMap.containsKey(((ArrayList)localObject2).get(i)))
          {
            String str1 = (String)((ArrayList)localObject2).get(i);
            String str2 = (String)localArrayList1.get(i);
            String str3 = (String)localArrayList2.get(i);
            zzf localzzf = (zzf)localHashMap.get(str1);
            String str4 = zzr.zzbM().zzaq(str2);
            if (zzFQ.equals(str4))
            {
              zza(localzzf, str2, str3);
              localHashMap.remove(str1);
            }
          }
          i += 1;
        }
        if ((localObject1 != null) && (!localHashMap.isEmpty())) {}
      }
      else
      {
        localObject1 = localHashMap.keySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          zzFD.zza((zzf)localHashMap.get(localObject2));
        }
        break;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */