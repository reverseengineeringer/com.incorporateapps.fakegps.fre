package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;

public class zzhu
  extends zzim
  implements zzhv, zzhy
{
  private final Context mContext;
  private final String zzCd;
  private final zzif.zza zzGd;
  private int zzGu = 3;
  private final zzia zzKB;
  private final zzhy zzKC;
  private final String zzKD;
  private final String zzKE;
  private int zzKF = 0;
  private final Object zzpV;
  private final String zzrG;
  
  public zzhu(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, zzif.zza paramzza, zzia paramzzia, zzhy paramzzhy)
  {
    mContext = paramContext;
    zzCd = paramString1;
    zzrG = paramString2;
    zzKD = paramString3;
    zzKE = paramString4;
    zzGd = paramzza;
    zzKB = paramzzia;
    zzpV = new Object();
    zzKC = paramzzhy;
  }
  
  private void zza(AdRequestParcel paramAdRequestParcel, zzey paramzzey)
  {
    try
    {
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(zzCd))
      {
        paramzzey.zza(paramAdRequestParcel, zzKD, zzKE);
        return;
      }
      paramzzey.zzb(paramAdRequestParcel, zzKD);
      return;
    }
    catch (RemoteException paramAdRequestParcel)
    {
      zzin.zzd("Fail to load ad from adapter.", paramAdRequestParcel);
      zza(zzCd, 0);
    }
  }
  
  private void zzk(long paramLong)
  {
    for (;;)
    {
      synchronized (zzpV)
      {
        if (zzKF != 0) {
          return;
        }
        if (!zzf(paramLong)) {
          return;
        }
      }
    }
  }
  
  public void onStop() {}
  
  public void zzN(int paramInt)
  {
    zza(zzCd, 0);
  }
  
  public void zza(String arg1, int paramInt)
  {
    synchronized (zzpV)
    {
      zzKF = 2;
      zzGu = paramInt;
      zzpV.notify();
      return;
    }
  }
  
  public void zzax(String arg1)
  {
    synchronized (zzpV)
    {
      zzKF = 1;
      zzpV.notify();
      return;
    }
  }
  
  public void zzbr()
  {
    if ((zzKB == null) || (zzKB.zzgQ() == null) || (zzKB.zzgP() == null)) {
      return;
    }
    zzhx localzzhx = zzKB.zzgQ();
    localzzhx.zza(this);
    localzzhx.zza(this);
    AdRequestParcel localAdRequestParcel = zzGd.zzLd.zzHt;
    zzey localzzey = zzKB.zzgP();
    try
    {
      if (localzzey.isInitialized()) {
        zza.zzMS.post(new zzhu.1(this, localAdRequestParcel, localzzey));
      }
      for (;;)
      {
        zzk(zzr.zzbG().elapsedRealtime());
        localzzhx.zza(null);
        localzzhx.zza(null);
        if (zzKF != 1) {
          break;
        }
        zzKC.zzax(zzCd);
        return;
        zza.zzMS.post(new zzhu.2(this, localzzey, localAdRequestParcel, localzzhx));
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzin.zzd("Fail to check if adapter is initialized.", localRemoteException);
        zza(zzCd, 0);
      }
      zzKC.zza(zzCd, zzGu);
    }
  }
  
  protected boolean zzf(long paramLong)
  {
    paramLong = 20000L - (zzr.zzbG().elapsedRealtime() - paramLong);
    if (paramLong <= 0L) {
      return false;
    }
    try
    {
      zzpV.wait(paramLong);
      return true;
    }
    catch (InterruptedException localInterruptedException) {}
    return false;
  }
  
  public void zzgN()
  {
    zza(zzGd.zzLd.zzHt, zzKB.zzgP());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */