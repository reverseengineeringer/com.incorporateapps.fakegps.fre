package org.apache.http.conn;

import java.io.InputStream;

public abstract interface EofSensorWatcher
{
  public abstract boolean eofDetected(InputStream paramInputStream);
  
  public abstract boolean streamAbort(InputStream paramInputStream);
  
  public abstract boolean streamClosed(InputStream paramInputStream);
}

/* Location:
 * Qualified Name:     org.apache.http.conn.EofSensorWatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */