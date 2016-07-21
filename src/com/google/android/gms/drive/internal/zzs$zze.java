package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.DriveIdResult;
import com.google.android.gms.drive.DriveId;

class zzs$zze
  implements DriveApi.DriveIdResult
{
  private final Status zzUX;
  private final DriveId zzaoz;
  
  public zzs$zze(Status paramStatus, DriveId paramDriveId)
  {
    zzUX = paramStatus;
    zzaoz = paramDriveId;
  }
  
  public DriveId getDriveId()
  {
    return zzaoz;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzs.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */