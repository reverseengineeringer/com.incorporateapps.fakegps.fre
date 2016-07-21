package com.google.android.gms.internal;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;

public class zzld
  implements ProxyApi
{
  public PendingResult performProxyRequest(GoogleApiClient paramGoogleApiClient, ProxyRequest paramProxyRequest)
  {
    zzx.zzz(paramGoogleApiClient);
    zzx.zzz(paramProxyRequest);
    return paramGoogleApiClient.zzb(new zzld.1(this, paramGoogleApiClient, paramProxyRequest));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzld
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */