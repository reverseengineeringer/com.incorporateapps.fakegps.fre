package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.GamesStatusCodes;

final class GamesClientImpl$TurnBasedMatchCanceledBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFv;
  
  public GamesClientImpl$TurnBasedMatchCanceledBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFv = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzi(int paramInt, String paramString)
  {
    Status localStatus = GamesStatusCodes.zzgc(paramInt);
    zzaFv.zzs(new GamesClientImpl.CancelMatchResultImpl(localStatus, paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.TurnBasedMatchCanceledBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */