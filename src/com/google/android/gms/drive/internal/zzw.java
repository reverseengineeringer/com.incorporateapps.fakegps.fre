package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;
import com.google.android.gms.drive.DriveId;

public class zzw
  extends zzab
  implements DriveFile
{
  public zzw(DriveId paramDriveId)
  {
    super(paramDriveId);
  }
  
  private static DriveFile.DownloadProgressListener zza(GoogleApiClient paramGoogleApiClient, DriveFile.DownloadProgressListener paramDownloadProgressListener)
  {
    if (paramDownloadProgressListener == null) {
      return null;
    }
    return new zzw.zza(paramGoogleApiClient.zzr(paramDownloadProgressListener));
  }
  
  public PendingResult open(GoogleApiClient paramGoogleApiClient, int paramInt, DriveFile.DownloadProgressListener paramDownloadProgressListener)
  {
    if ((paramInt != 268435456) && (paramInt != 536870912) && (paramInt != 805306368)) {
      throw new IllegalArgumentException("Invalid mode provided.");
    }
    return paramGoogleApiClient.zza(new zzw.1(this, paramGoogleApiClient, paramInt, zza(paramGoogleApiClient, paramDownloadProgressListener)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */