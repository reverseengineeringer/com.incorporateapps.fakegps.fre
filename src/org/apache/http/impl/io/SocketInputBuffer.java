package org.apache.http.impl.io;

import java.net.Socket;
import org.apache.http.params.HttpParams;

public class SocketInputBuffer
  extends AbstractSessionInputBuffer
{
  public SocketInputBuffer(Socket paramSocket, int paramInt, HttpParams paramHttpParams)
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean isDataAvailable(int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean isStale()
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.io.SocketInputBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */