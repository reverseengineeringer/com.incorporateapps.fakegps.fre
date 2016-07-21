package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

class zzpf$zzc
  extends zzow.zza
{
  private final zzpf.zza zzaAq;
  private final zza.zzb zzamC;
  
  private zzpf$zzc(zza.zzb paramzzb, zzpf.zza paramzza)
  {
    zzamC = paramzzb;
    zzaAq = paramzza;
  }
  
  public void zzp(Status paramStatus)
  {
    if ((zzaAq != null) && (paramStatus.isSuccess())) {
      zzaAq.zzuI();
    }
    zzamC.zzs(paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpf.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */