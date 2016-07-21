package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;

final class zzqk$zza
  extends zzqk.zzb
{
  private final zza.zzb zzamC;
  
  public zzqk$zza(zza.zzb paramzzb, zzq paramzzq)
  {
    super(paramzzq);
    zzamC = ((zza.zzb)zzx.zzz(paramzzb));
  }
  
  public final void zziZ(int paramInt)
  {
    zzamC.zzs(new Status(paramInt));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqk.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */