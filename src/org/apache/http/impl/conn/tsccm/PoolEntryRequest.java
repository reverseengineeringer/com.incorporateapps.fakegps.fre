package org.apache.http.impl.conn.tsccm;

import java.util.concurrent.TimeUnit;

public abstract interface PoolEntryRequest
{
  public abstract void abortRequest();
  
  public abstract BasicPoolEntry getPoolEntry(long paramLong, TimeUnit paramTimeUnit);
}

/* Location:
 * Qualified Name:     org.apache.http.impl.conn.tsccm.PoolEntryRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */