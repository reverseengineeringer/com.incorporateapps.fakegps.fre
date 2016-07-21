package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.lang.ref.WeakReference;

class zzi$1
  implements Runnable
{
  zzi$1(zzi paramzzi, AdRequestParcel paramAdRequestParcel) {}
  
  public void run()
  {
    synchronized (zzi.zza(zzpX))
    {
      zzp localzzp = zzpX.zzbm();
      zzi.zza(zzpX, new WeakReference(localzzp));
      localzzp.zzb(zzi.zzb(zzpX));
      localzzp.zzb(zzi.zzc(zzpX));
      localzzp.zza(zzi.zzd(zzpX));
      localzzp.zza(zzi.zze(zzpX));
      localzzp.zzb(zzi.zzf(zzpX));
      localzzp.zza(zzi.zzg(zzpX));
      localzzp.zzb(zzi.zzh(zzpX));
      localzzp.zza(zzi.zzi(zzpX));
      localzzp.zzb(zzpW);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzi.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */