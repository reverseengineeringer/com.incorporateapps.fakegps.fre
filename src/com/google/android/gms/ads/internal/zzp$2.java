package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzin;

class zzp$2
  implements Runnable
{
  zzp$2(zzp paramzzp, zzd paramzzd) {}
  
  public void run()
  {
    try
    {
      zzqC.zzpj.zzrz.zza(zzqD);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzp.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */