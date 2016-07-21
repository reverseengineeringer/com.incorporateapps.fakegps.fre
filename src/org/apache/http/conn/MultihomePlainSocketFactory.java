package org.apache.http.conn;

import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpParams;

public final class MultihomePlainSocketFactory
  implements SocketFactory
{
  MultihomePlainSocketFactory()
  {
    throw new RuntimeException("Stub!");
  }
  
  public static MultihomePlainSocketFactory getSocketFactory()
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
 * Qualified Name:     org.apache.http.conn.MultihomePlainSocketFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */