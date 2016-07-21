package org.apache.http.impl.io;

import java.io.InputStream;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

public abstract class AbstractSessionInputBuffer
  implements SessionInputBuffer
{
  public AbstractSessionInputBuffer()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected int fillBuffer()
  {
    throw new RuntimeException("Stub!");
  }
  
  public HttpTransportMetrics getMetrics()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected boolean hasBufferedData()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected void init(InputStream paramInputStream, int paramInt, HttpParams paramHttpParams)
  {
    throw new RuntimeException("Stub!");
  }
  
  public int read()
  {
    throw new RuntimeException("Stub!");
  }
  
  public int read(byte[] paramArrayOfByte)
  {
    throw new RuntimeException("Stub!");
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    throw new RuntimeException("Stub!");
  }
  
  public int readLine(CharArrayBuffer paramCharArrayBuffer)
  {
    throw new RuntimeException("Stub!");
  }
  
  public String readLine()
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.io.AbstractSessionInputBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */