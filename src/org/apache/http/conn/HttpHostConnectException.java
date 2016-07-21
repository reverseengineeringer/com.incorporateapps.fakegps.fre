package org.apache.http.conn;

import java.net.ConnectException;
import org.apache.http.HttpHost;

public class HttpHostConnectException
  extends ConnectException
{
  public HttpHostConnectException(HttpHost paramHttpHost, ConnectException paramConnectException)
  {
    throw new RuntimeException("Stub!");
  }
  
  public HttpHost getHost()
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.conn.HttpHostConnectException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */