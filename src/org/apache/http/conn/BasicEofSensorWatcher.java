package org.apache.http.conn;

import java.io.InputStream;

public class BasicEofSensorWatcher
  implements EofSensorWatcher
{
  protected boolean attemptReuse;
  protected ManagedClientConnection managedConn;
  
  public BasicEofSensorWatcher(ManagedClientConnection paramManagedClientConnection, boolean paramBoolean)
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean eofDetected(InputStream paramInputStream)
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean streamAbort(InputStream paramInputStream)
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean streamClosed(InputStream paramInputStream)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.conn.BasicEofSensorWatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */