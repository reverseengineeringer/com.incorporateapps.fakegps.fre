package org.apache.http.impl.cookie;

import java.util.Collection;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieSpec;

public abstract class AbstractCookieSpec
  implements CookieSpec
{
  public AbstractCookieSpec()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected CookieAttributeHandler findAttribHandler(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  protected CookieAttributeHandler getAttribHandler(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  protected Collection getAttribHandlers()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void registerAttribHandler(String paramString, CookieAttributeHandler paramCookieAttributeHandler)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.cookie.AbstractCookieSpec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */