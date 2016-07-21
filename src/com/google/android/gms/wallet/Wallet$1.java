package com.google.android.gms.wallet;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.internal.zzse;

final class Wallet$1
  extends Api.zza
{
  public final zzse zza(Context paramContext, Looper paramLooper, zzf paramzzf, Wallet.WalletOptions paramWalletOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    if (paramWalletOptions != null) {}
    for (;;)
    {
      return new zzse(paramContext, paramLooper, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener, environment, theme, Wallet.WalletOptions.zza(paramWalletOptions));
      paramWalletOptions = new Wallet.WalletOptions(null);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.Wallet.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */