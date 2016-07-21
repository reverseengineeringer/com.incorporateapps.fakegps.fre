package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFw;
  
  public GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFw = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzv(DataHolder paramDataHolder)
  {
    zzaFw.zzs(new GamesClientImpl.InitiateMatchResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */