package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveResource.MetadataResult;
import com.google.android.gms.drive.Metadata;

class zzab$zzc
  implements DriveResource.MetadataResult
{
  private final Status zzUX;
  private final Metadata zzarA;
  
  public zzab$zzc(Status paramStatus, Metadata paramMetadata)
  {
    zzUX = paramStatus;
    zzarA = paramMetadata;
  }
  
  public Metadata getMetadata()
  {
    return zzarA;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzab.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */