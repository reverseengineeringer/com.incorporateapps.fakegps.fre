package com.google.android.gms.games.stats;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Stats
{
  public abstract PendingResult loadPlayerStats(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.stats.Stats
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */