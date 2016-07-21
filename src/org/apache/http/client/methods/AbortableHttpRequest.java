package org.apache.http.client.methods;

import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionReleaseTrigger;

public abstract interface AbortableHttpRequest
{
  public abstract void abort();
  
  public abstract void setConnectionRequest(ClientConnectionRequest paramClientConnectionRequest);
  
  public abstract void setReleaseTrigger(ConnectionReleaseTrigger paramConnectionReleaseTrigger);
}

/* Location:
 * Qualified Name:     org.apache.http.client.methods.AbortableHttpRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */