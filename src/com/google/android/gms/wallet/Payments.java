package com.google.android.gms.wallet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Payments
{
  public abstract void changeMaskedWallet(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, int paramInt);
  
  public abstract void checkForPreAuthorization(GoogleApiClient paramGoogleApiClient, int paramInt);
  
  public abstract void isNewUser(GoogleApiClient paramGoogleApiClient, int paramInt);
  
  public abstract PendingResult isReadyToPay(GoogleApiClient paramGoogleApiClient);
  
  public abstract void loadFullWallet(GoogleApiClient paramGoogleApiClient, FullWalletRequest paramFullWalletRequest, int paramInt);
  
  public abstract void loadMaskedWallet(GoogleApiClient paramGoogleApiClient, MaskedWalletRequest paramMaskedWalletRequest, int paramInt);
  
  public abstract void notifyTransactionStatus(GoogleApiClient paramGoogleApiClient, NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest);
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.Payments
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */