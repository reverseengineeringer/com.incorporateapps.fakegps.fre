package org.apache.http.conn;

public abstract interface ConnectionReleaseTrigger
{
  public abstract void abortConnection();
  
  public abstract void releaseConnection();
}

/* Location:
 * Qualified Name:     org.apache.http.conn.ConnectionReleaseTrigger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */