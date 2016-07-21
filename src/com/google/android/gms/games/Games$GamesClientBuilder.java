package com.google.android.gms.games;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.games.internal.GamesClientImpl;

abstract class Games$GamesClientBuilder
  extends Api.zza
{
  public int getPriority()
  {
    return 1;
  }
  
  public GamesClientImpl zza(Context paramContext, Looper paramLooper, zzf paramzzf, Games.GamesOptions paramGamesOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    if (paramGamesOptions == null) {
      paramGamesOptions = new Games.GamesOptions(null);
    }
    for (;;)
    {
      return new GamesClientImpl(paramContext, paramLooper, paramzzf, paramGamesOptions, paramConnectionCallbacks, paramOnConnectionFailedListener);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.Games.GamesClientBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */