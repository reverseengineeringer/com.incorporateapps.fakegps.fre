package org.apache.http.impl.conn.tsccm;

import java.lang.ref.Reference;

public abstract interface RefQueueHandler
{
  public abstract void handleReference(Reference paramReference);
}

/* Location:
 * Qualified Name:     org.apache.http.impl.conn.tsccm.RefQueueHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */