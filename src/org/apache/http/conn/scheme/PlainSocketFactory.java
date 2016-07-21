package org.apache.http.conn.scheme;

import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;

public final class PlainSocketFactory
  implements SocketFactory
{
  public PlainSocketFactory()
  {
    throw new RuntimeException("Stub!");
  }
  
  public PlainSocketFactory(HostNameResolver paramHostNameResolver)
  {
    throw new RuntimeException("Stub!");
  }
  
  public static PlainSocketFactory getSocketFactory()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final Socket connectSocket(Socket paramSocket, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2, HttpParams paramHttpParams)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final Socket createSocket()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final boolean equals(Object paramObject)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final int hashCode()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final boolean isSecure(Socket paramSocket)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.conn.scheme.PlainSocketFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */