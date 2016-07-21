package org.apache.http.client.methods;

import java.net.URI;
import org.apache.http.HttpRequest;

public abstract interface HttpUriRequest
  extends HttpRequest
{
  public abstract void abort();
  
  public abstract String getMethod();
  
  public abstract URI getURI();
  
  public abstract boolean isAborted();
}

/* Location:
 * Qualified Name:     org.apache.http.client.methods.HttpUriRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */