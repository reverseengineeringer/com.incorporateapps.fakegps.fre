package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.request.Requests.UpdateRequestsResult;

abstract class RequestsImpl$UpdateRequestsImpl
  extends Games.BaseGamesApiMethodImpl
{
  private RequestsImpl$UpdateRequestsImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Requests.UpdateRequestsResult zzaC(Status paramStatus)
  {
    return new RequestsImpl.UpdateRequestsImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.RequestsImpl.UpdateRequestsImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */