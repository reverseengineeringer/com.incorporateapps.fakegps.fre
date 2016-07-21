package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveResource.MetadataResult;

abstract class zzab$zzd
  extends zzt
{
  private zzab$zzd(zzab paramzzab, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public DriveResource.MetadataResult zzH(Status paramStatus)
  {
    return new zzab.zzc(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzab.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */