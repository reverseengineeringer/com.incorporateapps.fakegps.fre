package org.apache.http.conn;

import java.io.InterruptedIOException;

public class ConnectTimeoutException
  extends InterruptedIOException
{
  public ConnectTimeoutException()
  {
    throw new RuntimeException("Stub!");
  }
  
  public ConnectTimeoutException(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.conn.ConnectTimeoutException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */