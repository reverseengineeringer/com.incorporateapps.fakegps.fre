package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;

class zzbl
  extends zzd
{
  private final zza.zzb zzamC;
  private final DriveFile.DownloadProgressListener zzasy;
  
  zzbl(zza.zzb paramzzb, DriveFile.DownloadProgressListener paramDownloadProgressListener)
  {
    zzamC = paramzzb;
    zzasy = paramDownloadProgressListener;
  }
  
  public void onError(Status paramStatus)
  {
    zzamC.zzs(new zzs.zzb(paramStatus, null));
  }
  
  public void zza(OnContentsResponse paramOnContentsResponse)
  {
    if (paramOnContentsResponse.zzto()) {}
    for (Status localStatus = new Status(-1);; localStatus = Status.zzagC)
    {
      zzamC.zzs(new zzs.zzb(localStatus, new zzv(paramOnContentsResponse.zztn())));
      return;
    }
  }
  
  public void zza(OnDownloadProgressResponse paramOnDownloadProgressResponse)
  {
    if (zzasy != null) {
      zzasy.onProgress(paramOnDownloadProgressResponse.zztq(), paramOnDownloadProgressResponse.zztr());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzbl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */