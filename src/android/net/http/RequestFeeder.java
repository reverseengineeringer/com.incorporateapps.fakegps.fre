package android.net.http;

import org.apache.http.HttpHost;

abstract interface RequestFeeder
{
  public abstract Request getRequest();
  
  public abstract Request getRequest(HttpHost paramHttpHost);
  
  public abstract boolean haveRequest(HttpHost paramHttpHost);
  
  public abstract void requeueRequest(Request paramRequest);
}

/* Location:
 * Qualified Name:     android.net.http.RequestFeeder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */