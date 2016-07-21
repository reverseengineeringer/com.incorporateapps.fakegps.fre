package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder.DriveFileResult;

class zzy$zzc
  implements DriveFolder.DriveFileResult
{
  private final Status zzUX;
  private final DriveFile zzarr;
  
  public zzy$zzc(Status paramStatus, DriveFile paramDriveFile)
  {
    zzUX = paramStatus;
    zzarr = paramDriveFile;
  }
  
  public DriveFile getDriveFile()
  {
    return zzarr;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzy.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */