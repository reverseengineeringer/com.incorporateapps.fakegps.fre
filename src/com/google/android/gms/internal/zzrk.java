package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.search.SearchAuthApi;

public class zzrk
  implements SearchAuthApi
{
  public PendingResult clearToken(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zza(new zzrk.zzb(paramGoogleApiClient, paramString));
  }
  
  public PendingResult getGoogleNowAuth(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zza(new zzrk.zzc(paramGoogleApiClient, paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */