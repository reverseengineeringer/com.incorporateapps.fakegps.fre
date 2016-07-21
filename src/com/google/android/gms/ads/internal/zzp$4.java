package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzin;

class zzp$4
  implements Runnable
{
  zzp$4(zzp paramzzp, String paramString, zzif paramzzif) {}
  
  public void run()
  {
    try
    {
      ((zzcu)zzqC.zzpj.zzrC.get(zzqF)).zza((zzf)zzpF.zzLa);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzp.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */