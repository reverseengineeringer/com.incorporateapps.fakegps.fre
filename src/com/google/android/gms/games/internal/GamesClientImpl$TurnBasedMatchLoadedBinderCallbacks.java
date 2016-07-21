package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$TurnBasedMatchLoadedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFy;
  
  public GamesClientImpl$TurnBasedMatchLoadedBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFy = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzu(DataHolder paramDataHolder)
  {
    zzaFy.zzs(new GamesClientImpl.LoadMatchResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.TurnBasedMatchLoadedBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */