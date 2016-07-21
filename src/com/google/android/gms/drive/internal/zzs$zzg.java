package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.MetadataBuffer;

class zzs$zzg
  implements DriveApi.MetadataBufferResult
{
  private final Status zzUX;
  private final MetadataBuffer zzaqI;
  private final boolean zzaqJ;
  
  public zzs$zzg(Status paramStatus, MetadataBuffer paramMetadataBuffer, boolean paramBoolean)
  {
    zzUX = paramStatus;
    zzaqI = paramMetadataBuffer;
    zzaqJ = paramBoolean;
  }
  
  public MetadataBuffer getMetadataBuffer()
  {
    return zzaqI;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  public void release()
  {
    if (zzaqI != null) {
      zzaqI.release();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzs.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */