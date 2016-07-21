package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult;

final class GamesClientImpl$DeleteSnapshotResultImpl
  implements Snapshots.DeleteSnapshotResult
{
  private final Status zzUX;
  private final String zzaEp;
  
  GamesClientImpl$DeleteSnapshotResultImpl(int paramInt, String paramString)
  {
    zzUX = GamesStatusCodes.zzgc(paramInt);
    zzaEp = paramString;
  }
  
  public final String getSnapshotId()
  {
    return zzaEp;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.DeleteSnapshotResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */