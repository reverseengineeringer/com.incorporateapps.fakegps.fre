package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.DriveIdResult;

abstract class zzs$zzf
  extends zzt
{
  zzs$zzf(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public DriveApi.DriveIdResult zzC(Status paramStatus)
  {
    return new zzs.zze(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzs.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */