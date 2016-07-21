package com.google.android.gms.internal;

import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

class zzle
  implements ProxyApi.ProxyResult
{
  private Status zzUX;
  private ProxyResponse zzWK;
  
  public zzle(ProxyResponse paramProxyResponse)
  {
    zzWK = paramProxyResponse;
    zzUX = Status.zzagC;
  }
  
  public zzle(Status paramStatus)
  {
    zzUX = paramStatus;
  }
  
  public ProxyResponse getResponse()
  {
    return zzWK;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */