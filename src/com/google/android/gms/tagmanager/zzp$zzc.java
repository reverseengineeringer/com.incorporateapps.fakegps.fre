package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzaf.zzj;
import com.google.android.gms.internal.zzmq;

class zzp$zzc
  implements zzbf
{
  private zzp$zzc(zzp paramzzp) {}
  
  public void zzGk() {}
  
  public void zza(zzbf.zza arg1)
  {
    synchronized (zzbim)
    {
      if (!zzbim.isReady())
      {
        if (zzp.zzb(zzbim) != null) {
          zzbim.zza(zzp.zzb(zzbim));
        }
      }
      else
      {
        zzp.zza(zzbim, 3600000L);
        return;
      }
      zzbim.zza(zzbim.zzbn(Status.zzagF));
    }
  }
  
  public void zzb(zzaf.zzj paramzzj)
  {
    synchronized (zzbim)
    {
      if (zzju == null)
      {
        if (zzezzbim).zzju == null)
        {
          zzbg.e("Current resource is null; network resource is also null");
          zzp.zza(zzbim, 3600000L);
          return;
        }
        zzju = zzezzbim).zzju;
      }
      zzp.zza(zzbim, paramzzj, zzp.zzc(zzbim).currentTimeMillis(), false);
      zzbg.v("setting refresh time to current time: " + zzp.zzf(zzbim));
      if (!zzp.zzg(zzbim)) {
        zzp.zza(zzbim, paramzzj);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzp.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */