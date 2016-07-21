package com.google.android.gms.games.snapshot;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface Snapshot
  extends Parcelable, Freezable
{
  public abstract SnapshotMetadata getMetadata();
  
  public abstract SnapshotContents getSnapshotContents();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.snapshot.Snapshot
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */