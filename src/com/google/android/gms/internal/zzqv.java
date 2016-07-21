package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zze;

public final class zzqv
  implements Account
{
  public final void clearDefaultAccount(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = Plus.zzf(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzEY();
    }
  }
  
  public final String getAccountName(GoogleApiClient paramGoogleApiClient)
  {
    return Plus.zzf(paramGoogleApiClient, true).getAccountName();
  }
  
  public final PendingResult revokeAccessAndDisconnect(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zzb(new zzqv.1(this, paramGoogleApiClient));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */