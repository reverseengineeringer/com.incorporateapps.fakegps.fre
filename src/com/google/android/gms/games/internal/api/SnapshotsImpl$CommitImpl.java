package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult;

abstract class SnapshotsImpl$CommitImpl
  extends Games.BaseGamesApiMethodImpl
{
  private SnapshotsImpl$CommitImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Snapshots.CommitSnapshotResult zzaD(Status paramStatus)
  {
    return new SnapshotsImpl.CommitImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.SnapshotsImpl.CommitImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */