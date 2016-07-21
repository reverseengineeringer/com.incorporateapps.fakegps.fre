package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.measurement.zzg;

public class CampaignTrackingService
  extends Service
{
  private static Boolean zzOO;
  private Handler mHandler;
  
  private Handler getHandler()
  {
    Handler localHandler2 = mHandler;
    Handler localHandler1 = localHandler2;
    if (localHandler2 == null)
    {
      localHandler1 = new Handler(getMainLooper());
      mHandler = localHandler1;
    }
    return localHandler1;
  }
  
  public static boolean zzZ(Context paramContext)
  {
    zzx.zzz(paramContext);
    if (zzOO != null) {
      return zzOO.booleanValue();
    }
    boolean bool = zzam.zza(paramContext, CampaignTrackingService.class);
    zzOO = Boolean.valueOf(bool);
    return bool;
  }
  
  private void zziz()
  {
    try
    {
      synchronized (CampaignTrackingReceiver.zzqy)
      {
        zzrp localzzrp = CampaignTrackingReceiver.zzOM;
        if ((localzzrp != null) && (localzzrp.isHeld())) {
          localzzrp.release();
        }
        return;
      }
      return;
    }
    catch (SecurityException localSecurityException) {}
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    zzf.zzaa(this).zzjm().zzbd("CampaignTrackingService is starting up");
  }
  
  public void onDestroy()
  {
    zzf.zzaa(this).zzjm().zzbd("CampaignTrackingService is shutting down");
    super.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    zziz();
    zzf localzzf = zzf.zzaa(this);
    zzaf localzzaf = localzzf.zzjm();
    Object localObject = null;
    if (localzzf.zzjn().zzkr()) {
      localzzaf.zzbh("Unexpected installation campaign (package side)");
    }
    Handler localHandler;
    for (paramIntent = (Intent)localObject;; paramIntent = paramIntent.getStringExtra("referrer"))
    {
      localHandler = getHandler();
      if (!TextUtils.isEmpty(paramIntent)) {
        break;
      }
      if (!localzzf.zzjn().zzkr()) {
        localzzaf.zzbg("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
      }
      localzzf.zzjo().zzf(new CampaignTrackingService.1(this, localzzaf, localHandler, paramInt2));
      return 2;
    }
    paramInt1 = localzzf.zzjn().zzkv();
    localObject = paramIntent;
    if (paramIntent.length() > paramInt1)
    {
      localzzaf.zzc("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(paramIntent.length()), Integer.valueOf(paramInt1));
      localObject = paramIntent.substring(0, paramInt1);
    }
    localzzaf.zza("CampaignTrackingService called. startId, campaign", Integer.valueOf(paramInt2), localObject);
    localzzf.zziH().zza((String)localObject, new CampaignTrackingService.2(this, localzzaf, localHandler, paramInt2));
    return 2;
  }
  
  protected void zza(zzaf paramzzaf, Handler paramHandler, int paramInt)
  {
    paramHandler.post(new CampaignTrackingService.3(this, paramInt, paramzzaf));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.CampaignTrackingService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */