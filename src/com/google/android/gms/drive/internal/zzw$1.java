package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;

class zzw$1
  extends zzs.zzc
{
  zzw$1(zzw paramzzw, GoogleApiClient paramGoogleApiClient, int paramInt, DriveFile.DownloadProgressListener paramDownloadProgressListener)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zza(paramzzu.zzte().zza(new OpenContentsRequest(zzarh.getDriveId(), zzaqE, 0), new zzbl(this, zzarg)).zztj());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzw.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */