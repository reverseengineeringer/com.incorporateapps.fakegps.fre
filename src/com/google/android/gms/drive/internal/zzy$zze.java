package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveFolder.DriveFolderResult;

class zzy$zze
  implements DriveFolder.DriveFolderResult
{
  private final Status zzUX;
  private final DriveFolder zzars;
  
  public zzy$zze(Status paramStatus, DriveFolder paramDriveFolder)
  {
    zzUX = paramStatus;
    zzars = paramDriveFolder;
  }
  
  public DriveFolder getDriveFolder()
  {
    return zzars;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzy.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */