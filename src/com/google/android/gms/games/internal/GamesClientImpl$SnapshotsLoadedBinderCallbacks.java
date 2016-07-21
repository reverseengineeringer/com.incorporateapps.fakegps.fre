package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$SnapshotsLoadedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFs;
  
  public GamesClientImpl$SnapshotsLoadedBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFs = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzN(DataHolder paramDataHolder)
  {
    zzaFs.zzs(new GamesClientImpl.LoadSnapshotsResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.SnapshotsLoadedBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */