package com.google.android.gms.plus;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Account
{
  public abstract void clearDefaultAccount(GoogleApiClient paramGoogleApiClient);
  
  public abstract String getAccountName(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult revokeAccessAndDisconnect(GoogleApiClient paramGoogleApiClient);
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.Account
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */