package com.google.android.gms.games.snapshot;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class SnapshotMetadataBuffer
  extends AbstractDataBuffer
{
  public SnapshotMetadataBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public final SnapshotMetadata get(int paramInt)
  {
    return new SnapshotMetadataRef(zzahi, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.snapshot.SnapshotMetadataBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */