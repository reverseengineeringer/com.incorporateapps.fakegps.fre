package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$TurnBasedMatchLeftBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFx;
  
  public GamesClientImpl$TurnBasedMatchLeftBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFx = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzx(DataHolder paramDataHolder)
  {
    zzaFx.zzs(new GamesClientImpl.LeaveMatchResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.TurnBasedMatchLeftBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */