package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

public final class SnapshotMetadataChange$Builder
{
  private Long zzaKN;
  private Long zzaKO;
  private BitmapTeleporter zzaKP;
  private Uri zzaKQ;
  private String zzaxl;
  
  public final SnapshotMetadataChange build()
  {
    return new SnapshotMetadataChangeEntity(zzaxl, zzaKN, zzaKP, zzaKQ, zzaKO);
  }
  
  public final Builder fromMetadata(SnapshotMetadata paramSnapshotMetadata)
  {
    zzaxl = paramSnapshotMetadata.getDescription();
    zzaKN = Long.valueOf(paramSnapshotMetadata.getPlayedTime());
    zzaKO = Long.valueOf(paramSnapshotMetadata.getProgressValue());
    if (zzaKN.longValue() == -1L) {
      zzaKN = null;
    }
    zzaKQ = paramSnapshotMetadata.getCoverImageUri();
    if (zzaKQ != null) {
      zzaKP = null;
    }
    return this;
  }
  
  public final Builder setCoverImage(Bitmap paramBitmap)
  {
    zzaKP = new BitmapTeleporter(paramBitmap);
    zzaKQ = null;
    return this;
  }
  
  public final Builder setDescription(String paramString)
  {
    zzaxl = paramString;
    return this;
  }
  
  public final Builder setPlayedTimeMillis(long paramLong)
  {
    zzaKN = Long.valueOf(paramLong);
    return this;
  }
  
  public final Builder setProgressValue(long paramLong)
  {
    zzaKO = Long.valueOf(paramLong);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */