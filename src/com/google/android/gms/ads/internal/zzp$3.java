package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzin;

class zzp$3
  implements Runnable
{
  zzp$3(zzp paramzzp, zze paramzze) {}
  
  public void run()
  {
    try
    {
      zzqC.zzpj.zzrA.zza(zzqE);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call OnContentAdLoadedListener.onContentAdLoaded().", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzp.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */