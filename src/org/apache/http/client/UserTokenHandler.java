package org.apache.http.client;

import org.apache.http.protocol.HttpContext;

public abstract interface UserTokenHandler
{
  public abstract Object getUserToken(HttpContext paramHttpContext);
}

/* Location:
 * Qualified Name:     org.apache.http.client.UserTokenHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */