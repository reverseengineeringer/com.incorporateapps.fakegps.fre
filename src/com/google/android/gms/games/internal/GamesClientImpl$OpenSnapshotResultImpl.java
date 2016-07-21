package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;

final class GamesClientImpl$OpenSnapshotResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Snapshots.OpenSnapshotResult
{
  private final Snapshot zzaEV;
  private final String zzaEW;
  private final Snapshot zzaEX;
  private final Contents zzaEY;
  private final SnapshotContents zzaEZ;
  
  GamesClientImpl$OpenSnapshotResultImpl(DataHolder paramDataHolder, Contents paramContents)
  {
    this(paramDataHolder, null, paramContents, null, null);
  }
  
  GamesClientImpl$OpenSnapshotResultImpl(DataHolder paramDataHolder, String paramString, Contents paramContents1, Contents paramContents2, Contents paramContents3)
  {
    super(paramDataHolder);
    SnapshotMetadataBuffer localSnapshotMetadataBuffer = new SnapshotMetadataBuffer(paramDataHolder);
    for (;;)
    {
      try
      {
        if (localSnapshotMetadataBuffer.getCount() == 0)
        {
          zzaEV = null;
          zzaEX = null;
          localSnapshotMetadataBuffer.release();
          zzaEW = paramString;
          zzaEY = paramContents3;
          zzaEZ = new SnapshotContentsEntity(paramContents3);
          return;
        }
        if (localSnapshotMetadataBuffer.getCount() != 1) {
          break label144;
        }
        if (paramDataHolder.getStatusCode() != 4004)
        {
          zzb.zzab(bool);
          zzaEV = new SnapshotEntity(new SnapshotMetadataEntity(localSnapshotMetadataBuffer.get(0)), new SnapshotContentsEntity(paramContents1));
          zzaEX = null;
          continue;
        }
        bool = false;
      }
      finally
      {
        localSnapshotMetadataBuffer.release();
      }
      continue;
      label144:
      zzaEV = new SnapshotEntity(new SnapshotMetadataEntity(localSnapshotMetadataBuffer.get(0)), new SnapshotContentsEntity(paramContents1));
      zzaEX = new SnapshotEntity(new SnapshotMetadataEntity(localSnapshotMetadataBuffer.get(1)), new SnapshotContentsEntity(paramContents2));
    }
  }
  
  public final String getConflictId()
  {
    return zzaEW;
  }
  
  public final Snapshot getConflictingSnapshot()
  {
    return zzaEX;
  }
  
  public final SnapshotContents getResolutionSnapshotContents()
  {
    return zzaEZ;
  }
  
  public final Snapshot getSnapshot()
  {
    return zzaEV;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.OpenSnapshotResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */