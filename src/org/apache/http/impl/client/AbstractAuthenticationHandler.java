package org.apache.http.impl.client;

import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScheme;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.protocol.HttpContext;

public abstract class AbstractAuthenticationHandler
  implements AuthenticationHandler
{
  public AbstractAuthenticationHandler()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected List getAuthPreferences()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected Map parseChallenges(Header[] paramArrayOfHeader)
  {
    throw new RuntimeException("Stub!");
  }
  
  public AuthScheme selectScheme(Map paramMap, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.client.AbstractAuthenticationHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */