package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zzp
  extends zze.zza
{
  private final zza.zzb zzbcS;
  
  private zzp(zza.zzb paramzzb)
  {
    zzbcS = paramzzb;
  }
  
  static zzp zzn(zza.zzb paramzzb)
  {
    return new zzp(paramzzb);
  }
  
  public final void zzbb(Status paramStatus)
  {
    zzbcS.zzs(paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */