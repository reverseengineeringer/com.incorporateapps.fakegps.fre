package android.net.http;

import android.content.Context;
import org.apache.http.HttpHost;

abstract class Connection
{
  protected SslCertificate mCertificate;
  protected AndroidHttpClientConnection mHttpClientConnection;
  
  protected Connection(Context paramContext, HttpHost paramHttpHost, RequestFeeder paramRequestFeeder)
  {
    throw new RuntimeException("Stub!");
  }
  
  public String toString()
  {
    try
    {
      throw new RuntimeException("Stub!");
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     android.net.http.Connection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */