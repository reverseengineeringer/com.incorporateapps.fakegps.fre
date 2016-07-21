package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$SnapshotCommittedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFq;
  
  public GamesClientImpl$SnapshotCommittedBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFq = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzO(DataHolder paramDataHolder)
  {
    zzaFq.zzs(new GamesClientImpl.CommitSnapshotResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.SnapshotCommittedBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */