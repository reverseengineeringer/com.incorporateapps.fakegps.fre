package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$RequestSummariesLoadedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFk;
  
  public GamesClientImpl$RequestSummariesLoadedBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFk = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzM(DataHolder paramDataHolder)
  {
    zzaFk.zzs(new GamesClientImpl.LoadRequestSummariesResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.RequestSummariesLoadedBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */