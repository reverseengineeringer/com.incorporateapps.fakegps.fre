package org.apache.http.impl.conn.tsccm;

import java.util.LinkedList;
import java.util.Queue;
import org.apache.http.conn.routing.HttpRoute;

public class RouteSpecificPool
{
  protected final LinkedList freeEntries;
  protected final int maxEntries;
  protected int numEntries;
  protected final HttpRoute route;
  protected final Queue waitingThreads;
  
  public RouteSpecificPool(HttpRoute paramHttpRoute, int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public BasicPoolEntry allocEntry(Object paramObject)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void createdEntry(BasicPoolEntry paramBasicPoolEntry)
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean deleteEntry(BasicPoolEntry paramBasicPoolEntry)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void dropEntry()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void freeEntry(BasicPoolEntry paramBasicPoolEntry)
  {
    throw new RuntimeException("Stub!");
  }
  
  public int getCapacity()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final int getEntryCount()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final int getMaxEntries()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final HttpRoute getRoute()
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean hasThread()
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean isUnused()
  {
    throw new RuntimeException("Stub!");
  }
  
  public WaitingThread nextThread()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void queueThread(WaitingThread paramWaitingThread)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void removeThread(WaitingThread paramWaitingThread)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.conn.tsccm.RouteSpecificPool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */