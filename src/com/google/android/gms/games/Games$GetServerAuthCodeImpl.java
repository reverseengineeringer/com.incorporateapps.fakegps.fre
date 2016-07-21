package com.google.android.gms.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

abstract class Games$GetServerAuthCodeImpl
  extends Games.BaseGamesApiMethodImpl
{
  private Games$GetServerAuthCodeImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Games.GetServerAuthCodeResult zzX(Status paramStatus)
  {
    return new Games.GetServerAuthCodeImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.Games.GetServerAuthCodeImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */