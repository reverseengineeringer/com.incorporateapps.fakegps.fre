package org.apache.http.impl.client;

import java.net.URI;
import org.apache.http.HttpResponse;
import org.apache.http.client.RedirectHandler;
import org.apache.http.protocol.HttpContext;

public class DefaultRedirectHandler
  implements RedirectHandler
{
  public DefaultRedirectHandler()
  {
    throw new RuntimeException("Stub!");
  }
  
  public URI getLocationURI(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean isRedirectRequested(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.client.DefaultRedirectHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */