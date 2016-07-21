package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface ProxyApi
{
  public abstract PendingResult performProxyRequest(GoogleApiClient paramGoogleApiClient, ProxyRequest paramProxyRequest);
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.proxy.ProxyApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */