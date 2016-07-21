package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;

class SnapshotsImpl$5
  extends SnapshotsImpl.OpenImpl
{
  SnapshotsImpl$5(SnapshotsImpl paramSnapshotsImpl, GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, SnapshotMetadataChange paramSnapshotMetadataChange, SnapshotContents paramSnapshotContents)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    paramGamesClientImpl.zza(this, zzaHx, zzaHy, zzaHv, zzaHz);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.SnapshotsImpl.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */