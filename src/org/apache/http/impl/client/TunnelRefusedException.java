package org.apache.http.impl.client;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;

public class TunnelRefusedException
  extends HttpException
{
  public TunnelRefusedException(String paramString, HttpResponse paramHttpResponse)
  {
    throw new RuntimeException("Stub!");
  }
  
  public HttpResponse getResponse()
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.client.TunnelRefusedException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */