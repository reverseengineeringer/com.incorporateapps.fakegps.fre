package org.apache.http.impl.conn.tsccm;

import java.lang.ref.ReferenceQueue;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.AbstractPoolEntry;

public class BasicPoolEntry
  extends AbstractPoolEntry
{
  public BasicPoolEntry(ClientConnectionOperator paramClientConnectionOperator, HttpRoute paramHttpRoute, ReferenceQueue paramReferenceQueue)
  {
    super(null, null);
    throw new RuntimeException("Stub!");
  }
  
  protected final OperatedClientConnection getConnection()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected final HttpRoute getPlannedRoute()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected final BasicPoolEntryRef getWeakRef()
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.conn.tsccm.BasicPoolEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */