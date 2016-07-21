package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;

class zzw$zza
  implements DriveFile.DownloadProgressListener
{
  private final zzq zzari;
  
  public zzw$zza(zzq paramzzq)
  {
    zzari = paramzzq;
  }
  
  public void onProgress(long paramLong1, long paramLong2)
  {
    zzari.zza(new zzw.zza.1(this, paramLong1, paramLong2));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzw.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */