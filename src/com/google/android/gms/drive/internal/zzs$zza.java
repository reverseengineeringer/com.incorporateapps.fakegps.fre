package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

class zzs$zza
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzs$zza(zza.zzb paramzzb)
  {
    zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zzamC.zzs(new zzs.zzb(paramStatus, null));
  }
  
  public void zza(OnContentsResponse paramOnContentsResponse)
  {
    zzamC.zzs(new zzs.zzb(Status.zzagC, new zzv(paramOnContentsResponse.zztn())));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzs.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */