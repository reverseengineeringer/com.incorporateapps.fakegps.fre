package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class EventsImpl
  implements Events
{
  public final void increment(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    GamesClientImpl localGamesClientImpl = Games.zzc(paramGoogleApiClient, false);
    if (localGamesClientImpl == null) {
      return;
    }
    if (localGamesClientImpl.isConnected())
    {
      localGamesClientImpl.zzp(paramString, paramInt);
      return;
    }
    paramGoogleApiClient.zzb(new EventsImpl.3(this, paramGoogleApiClient, paramString, paramInt));
  }
  
  public final PendingResult load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new EventsImpl.2(this, paramGoogleApiClient, paramBoolean));
  }
  
  public final PendingResult loadByIds(GoogleApiClient paramGoogleApiClient, boolean paramBoolean, String... paramVarArgs)
  {
    return paramGoogleApiClient.zza(new EventsImpl.1(this, paramGoogleApiClient, paramBoolean, paramVarArgs));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.EventsImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */