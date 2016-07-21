package org.apache.http.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;

public abstract interface AuthScheme
{
  public abstract Header authenticate(Credentials paramCredentials, HttpRequest paramHttpRequest);
  
  public abstract String getParameter(String paramString);
  
  public abstract String getRealm();
  
  public abstract String getSchemeName();
  
  public abstract boolean isComplete();
  
  public abstract boolean isConnectionBased();
  
  public abstract void processChallenge(Header paramHeader);
}

/* Location:
 * Qualified Name:     org.apache.http.auth.AuthScheme
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */