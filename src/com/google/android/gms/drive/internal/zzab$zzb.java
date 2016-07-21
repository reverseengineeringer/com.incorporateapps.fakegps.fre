package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

class zzab$zzb
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzab$zzb(zza.zzb paramzzb)
  {
    zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zzamC.zzs(new zzab.zzc(paramStatus, null));
  }
  
  public void zza(OnMetadataResponse paramOnMetadataResponse)
  {
    zzamC.zzs(new zzab.zzc(Status.zzagC, new zzp(paramOnMetadataResponse.zztw())));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzab.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */