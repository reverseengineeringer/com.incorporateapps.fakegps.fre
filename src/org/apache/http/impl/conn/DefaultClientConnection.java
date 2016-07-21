package org.apache.http.impl.conn;

import java.net.Socket;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.impl.SocketHttpClientConnection;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;

public class DefaultClientConnection
  extends SocketHttpClientConnection
  implements OperatedClientConnection
{
  public DefaultClientConnection()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void close()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected HttpMessageParser createResponseParser(SessionInputBuffer paramSessionInputBuffer, HttpResponseFactory paramHttpResponseFactory, HttpParams paramHttpParams)
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
  
  public final Socket getSocket()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final HttpHost getTargetHost()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final boolean isSecure()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void openCompleted(boolean paramBoolean, HttpParams paramHttpParams)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void opening(Socket paramSocket, HttpHost paramHttpHost)
  {
    throw new RuntimeException("Stub!");
  }
  
  public HttpResponse receiveResponseHeader()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void sendRequestHeader(HttpRequest paramHttpRequest)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void shutdown()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void update(Socket paramSocket, HttpHost paramHttpHost, boolean paramBoolean, HttpParams paramHttpParams)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.conn.DefaultClientConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */