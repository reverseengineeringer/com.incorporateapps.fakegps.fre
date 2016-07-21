package org.apache.http.impl;

import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.HttpInetConnection;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;

public class SocketHttpClientConnection
  extends AbstractHttpClientConnection
  implements HttpInetConnection
{
  public SocketHttpClientConnection()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected void assertNotOpen()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected void assertOpen()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected void bind(Socket paramSocket, HttpParams paramHttpParams)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void close()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected SessionInputBuffer createSessionInputBuffer(Socket paramSocket, int paramInt, HttpParams paramHttpParams)
  {
    throw new RuntimeException("Stub!");
  }
  
  protected SessionOutputBuffer createSessionOutputBuffer(Socket paramSocket, int paramInt, HttpParams paramHttpParams)
  {
    throw new RuntimeException("Stub!");
  }
  
  public InetAddress getLocalAddress()
  {
    throw new RuntimeException("Stub!");
  }
  
  public int getLocalPort()
  {
    throw new RuntimeException("Stub!");
  }
  
  public InetAddress getRemoteAddress()
  {
    throw new RuntimeException("Stub!");
  }
  
  public int getRemotePort()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected Socket getSocket()
  {
    throw new RuntimeException("Stub!");
  }
  
  public int getSocketTimeout()
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean isOpen()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setSocketTimeout(int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void shutdown()
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.SocketHttpClientConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */