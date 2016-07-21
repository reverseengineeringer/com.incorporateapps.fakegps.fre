package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.LocationSettingsResult;

final class zzl$zzc
  extends zzj.zza
{
  private zza.zzb zzaON;
  
  public zzl$zzc(zza.zzb paramzzb)
  {
    if (paramzzb != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "listener can't be null.");
      zzaON = paramzzb;
      return;
    }
  }
  
  public final void zza(LocationSettingsResult paramLocationSettingsResult)
  {
    zzaON.zzs(paramLocationSettingsResult);
    zzaON = null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zzl.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */