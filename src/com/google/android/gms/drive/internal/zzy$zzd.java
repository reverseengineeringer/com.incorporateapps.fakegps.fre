package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFolder.DriveFileResult;

abstract class zzy$zzd
  extends zzt
{
  zzy$zzd(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public DriveFolder.DriveFileResult zzE(Status paramStatus)
  {
    return new zzy.zzc(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzy.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */