package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.GamesStatusCodes;

final class GamesClientImpl$TurnBasedMatchesLoadedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFA;
  
  public GamesClientImpl$TurnBasedMatchesLoadedBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFA = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzc(int paramInt, Bundle paramBundle)
  {
    paramBundle.setClassLoader(getClass().getClassLoader());
    Status localStatus = GamesStatusCodes.zzgc(paramInt);
    zzaFA.zzs(new GamesClientImpl.LoadMatchesResultImpl(localStatus, paramBundle));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.TurnBasedMatchesLoadedBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */