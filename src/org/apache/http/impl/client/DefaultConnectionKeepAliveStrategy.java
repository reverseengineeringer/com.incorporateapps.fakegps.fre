package org.apache.http.impl.client;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

public class DefaultConnectionKeepAliveStrategy
  implements ConnectionKeepAliveStrategy
{
  public DefaultConnectionKeepAliveStrategy()
  {
    throw new RuntimeException("Stub!");
  }
  
  public long getKeepAliveDuration(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */