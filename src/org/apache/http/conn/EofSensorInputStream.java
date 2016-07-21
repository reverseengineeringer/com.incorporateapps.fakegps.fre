package org.apache.http.conn;

import java.io.InputStream;

public class EofSensorInputStream
  extends InputStream
  implements ConnectionReleaseTrigger
{
  protected InputStream wrappedStream;
  
  public EofSensorInputStream(InputStream paramInputStream, EofSensorWatcher paramEofSensorWatcher)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void abortConnection()
  {
    throw new RuntimeException("Stub!");
  }
  
  public int available()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected void checkAbort()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected void checkClose()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected void checkEOF(int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void close()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected boolean isReadAllowed()
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
  
  public void releaseConnection()
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.conn.EofSensorInputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */