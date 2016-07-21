package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$TurnBasedMatchUpdatedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFz;
  
  public GamesClientImpl$TurnBasedMatchUpdatedBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFz = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzw(DataHolder paramDataHolder)
  {
    zzaFz.zzs(new GamesClientImpl.UpdateMatchResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.TurnBasedMatchUpdatedBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */