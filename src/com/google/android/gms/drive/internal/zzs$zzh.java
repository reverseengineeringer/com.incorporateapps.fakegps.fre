package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;

abstract class zzs$zzh
  extends zzt
{
  zzs$zzh(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public DriveApi.MetadataBufferResult zzD(Status paramStatus)
  {
    return new zzs.zzg(paramStatus, null, false);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzs.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */