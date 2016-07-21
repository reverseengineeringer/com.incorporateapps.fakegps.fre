package com.google.android.gms.search;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface SearchAuthApi
{
  public abstract PendingResult clearToken(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult getGoogleNowAuth(GoogleApiClient paramGoogleApiClient, String paramString);
}

/* Location:
 * Qualified Name:     com.google.android.gms.search.SearchAuthApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */