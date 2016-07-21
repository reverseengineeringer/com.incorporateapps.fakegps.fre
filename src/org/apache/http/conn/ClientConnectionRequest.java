package org.apache.http.conn;

import java.util.concurrent.TimeUnit;

public abstract interface ClientConnectionRequest
{
  public abstract void abortRequest();
  
  public abstract ManagedClientConnection getConnection(long paramLong, TimeUnit paramTimeUnit);
}

/* Location:
 * Qualified Name:     org.apache.http.conn.ClientConnectionRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */