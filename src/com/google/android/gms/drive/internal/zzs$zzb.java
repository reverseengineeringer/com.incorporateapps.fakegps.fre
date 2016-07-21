package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveContents;

class zzs$zzb
  implements Releasable, DriveApi.DriveContentsResult
{
  private final Status zzUX;
  private final DriveContents zzaoC;
  
  public zzs$zzb(Status paramStatus, DriveContents paramDriveContents)
  {
    zzUX = paramStatus;
    zzaoC = paramDriveContents;
  }
  
  public DriveContents getDriveContents()
  {
    return zzaoC;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  public void release()
  {
    if (zzaoC != null) {
      zzaoC.zzsy();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzs.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */