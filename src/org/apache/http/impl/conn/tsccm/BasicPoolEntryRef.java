package org.apache.http.impl.conn.tsccm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.apache.http.conn.routing.HttpRoute;

public class BasicPoolEntryRef
  extends WeakReference
{
  public BasicPoolEntryRef(BasicPoolEntry paramBasicPoolEntry, ReferenceQueue paramReferenceQueue)
  {
    super(null, null);
    throw new RuntimeException("Stub!");
  }
  
  public final HttpRoute getRoute()
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.conn.tsccm.BasicPoolEntryRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */