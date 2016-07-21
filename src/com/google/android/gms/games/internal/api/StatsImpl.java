package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.stats.Stats;

public final class StatsImpl
  implements Stats
{
  public final PendingResult loadPlayerStats(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new StatsImpl.1(this, paramGoogleApiClient, paramBoolean));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.StatsImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */