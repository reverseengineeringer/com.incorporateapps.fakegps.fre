package org.apache.http.conn;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

public class BasicManagedEntity
  extends HttpEntityWrapper
  implements ConnectionReleaseTrigger, EofSensorWatcher
{
  protected final boolean attemptReuse;
  protected ManagedClientConnection managedConn;
  
  public BasicManagedEntity(HttpEntity paramHttpEntity, ManagedClientConnection paramManagedClientConnection, boolean paramBoolean)
  {
    super(null);
    throw new RuntimeException("Stub!");
  }
  
  public void abortConnection()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void consumeContent()
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean eofDetected(InputStream paramInputStream)
  {
    throw new RuntimeException("Stub!");
  }
  
  public InputStream getContent()
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean isRepeatable()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void releaseConnection()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected void releaseManagedConnection()
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
  
  public void writeTo(OutputStream paramOutputStream)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.conn.BasicManagedEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */