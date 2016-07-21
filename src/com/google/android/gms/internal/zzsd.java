package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.Payments;

public class zzsd
  implements Payments
{
  public void changeMaskedWallet(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, int paramInt)
  {
    paramGoogleApiClient.zza(new zzsd.4(this, paramGoogleApiClient, paramString1, paramString2, paramInt));
  }
  
  public void checkForPreAuthorization(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    paramGoogleApiClient.zza(new zzsd.1(this, paramGoogleApiClient, paramInt));
  }
  
  public void isNewUser(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    paramGoogleApiClient.zza(new zzsd.6(this, paramGoogleApiClient, paramInt));
  }
  
  public PendingResult isReadyToPay(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new zzsd.7(this, paramGoogleApiClient));
  }
  
  public void loadFullWallet(GoogleApiClient paramGoogleApiClient, FullWalletRequest paramFullWalletRequest, int paramInt)
  {
    paramGoogleApiClient.zza(new zzsd.3(this, paramGoogleApiClient, paramFullWalletRequest, paramInt));
  }
  
  public void loadMaskedWallet(GoogleApiClient paramGoogleApiClient, MaskedWalletRequest paramMaskedWalletRequest, int paramInt)
  {
    paramGoogleApiClient.zza(new zzsd.2(this, paramGoogleApiClient, paramMaskedWalletRequest, paramInt));
  }
  
  public void notifyTransactionStatus(GoogleApiClient paramGoogleApiClient, NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    paramGoogleApiClient.zza(new zzsd.5(this, paramGoogleApiClient, paramNotifyTransactionStatusRequest));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */