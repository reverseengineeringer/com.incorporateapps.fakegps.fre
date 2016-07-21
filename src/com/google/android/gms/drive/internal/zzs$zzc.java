package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;

abstract class zzs$zzc
  extends zzt
{
  zzs$zzc(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public DriveApi.DriveContentsResult zzB(Status paramStatus)
  {
    return new zzs.zzb(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzs.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */