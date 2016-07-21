package com.google.android.gms.internal;

import com.google.android.gms.common.api.BooleanResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest.zza;
import com.google.android.gms.wallet.Wallet.zza;

class zzsd$7
  extends Wallet.zza
{
  zzsd$7(zzsd paramzzsd, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected BooleanResult zzA(Status paramStatus)
  {
    return new BooleanResult(paramStatus, false);
  }
  
  protected void zza(zzse paramzzse)
  {
    paramzzse.zza(IsReadyToPayRequest.zzIj().zzIk(), this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsd.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */