package org.apache.http.impl.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;

public class BasicScheme
  extends RFC2617Scheme
{
  public BasicScheme()
  {
    throw new RuntimeException("Stub!");
  }
  
  public static Header authenticate(Credentials paramCredentials, String paramString, boolean paramBoolean)
  {
    throw new RuntimeException("Stub!");
  }
  
  public Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest)
  {
    throw new RuntimeException("Stub!");
  }
  
  public String getSchemeName()
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean isComplete()
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean isConnectionBased()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void processChallenge(Header paramHeader)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.auth.BasicScheme
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */