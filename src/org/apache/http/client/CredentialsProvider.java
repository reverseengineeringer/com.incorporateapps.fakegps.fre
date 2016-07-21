package org.apache.http.client;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;

public abstract interface CredentialsProvider
{
  public abstract void clear();
  
  public abstract Credentials getCredentials(AuthScope paramAuthScope);
  
  public abstract void setCredentials(AuthScope paramAuthScope, Credentials paramCredentials);
}

/* Location:
 * Qualified Name:     org.apache.http.client.CredentialsProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */