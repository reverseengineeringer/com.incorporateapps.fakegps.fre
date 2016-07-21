package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

class zzs$zzd
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzs$zzd(zza.zzb paramzzb)
  {
    zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zzamC.zzs(new zzs.zze(paramStatus, null));
  }
  
  public void zza(OnDriveIdResponse paramOnDriveIdResponse)
  {
    zzamC.zzs(new zzs.zze(Status.zzagC, paramOnDriveIdResponse.getDriveId()));
  }
  
  public void zza(OnMetadataResponse paramOnMetadataResponse)
  {
    zzamC.zzs(new zzs.zze(Status.zzagC, new zzp(paramOnMetadataResponse.zztw()).getDriveId()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzs.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */