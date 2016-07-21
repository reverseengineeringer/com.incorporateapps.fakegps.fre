package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;

abstract class SnapshotsImpl$OpenImpl
  extends Games.BaseGamesApiMethodImpl
{
  private SnapshotsImpl$OpenImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Snapshots.OpenSnapshotResult zzaG(Status paramStatus)
  {
    return new SnapshotsImpl.OpenImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.SnapshotsImpl.OpenImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */