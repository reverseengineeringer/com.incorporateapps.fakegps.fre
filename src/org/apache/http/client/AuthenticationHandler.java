package org.apache.http.client;

import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScheme;
import org.apache.http.protocol.HttpContext;

public abstract interface AuthenticationHandler
{
  public abstract Map getChallenges(HttpResponse paramHttpResponse, HttpContext paramHttpContext);
  
  public abstract boolean isAuthenticationRequested(HttpResponse paramHttpResponse, HttpContext paramHttpContext);
  
  public abstract AuthScheme selectScheme(Map paramMap, HttpResponse paramHttpResponse, HttpContext paramHttpContext);
}

/* Location:
 * Qualified Name:     org.apache.http.client.AuthenticationHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */