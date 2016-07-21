package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface CastRemoteDisplayApi
{
  public abstract PendingResult startRemoteDisplay(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult stopRemoteDisplay(GoogleApiClient paramGoogleApiClient);
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplayApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */