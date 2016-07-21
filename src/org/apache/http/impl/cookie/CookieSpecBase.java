package org.apache.http.impl.cookie;

import java.util.List;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;

public abstract class CookieSpecBase
  extends AbstractCookieSpec
{
  public CookieSpecBase()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected static String getDefaultDomain(CookieOrigin paramCookieOrigin)
  {
    throw new RuntimeException("Stub!");
  }
  
  protected static String getDefaultPath(CookieOrigin paramCookieOrigin)
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    throw new RuntimeException("Stub!");
  }
  
  protected List parse(HeaderElement[] paramArrayOfHeaderElement, CookieOrigin paramCookieOrigin)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.cookie.CookieSpecBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */