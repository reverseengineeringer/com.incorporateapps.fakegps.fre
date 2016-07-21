package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult;

abstract class zzaa$zzc
  extends zzt
{
  public zzaa$zzc(zzaa paramzzaa, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected DrivePreferencesApi.FileUploadPreferencesResult zzG(Status paramStatus)
  {
    return new zzaa.zzb(zzaru, paramStatus, null, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzaa.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */