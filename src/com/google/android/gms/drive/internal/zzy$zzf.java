package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFolder.DriveFolderResult;

abstract class zzy$zzf
  extends zzt
{
  zzy$zzf(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public DriveFolder.DriveFolderResult zzF(Status paramStatus)
  {
    return new zzy.zze(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzy.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */