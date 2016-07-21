package org.apache.http.conn.scheme;

import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.params.HttpParams;

public abstract interface SocketFactory
{
  public abstract Socket connectSocket(Socket paramSocket, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2, HttpParams paramHttpParams);
  
  public abstract Socket createSocket();
  
  public abstract boolean isSecure(Socket paramSocket);
}

/* Location:
 * Qualified Name:     org.apache.http.conn.scheme.SocketFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */