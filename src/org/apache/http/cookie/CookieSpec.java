package org.apache.http.cookie;

import java.util.List;
import org.apache.http.Header;

public abstract interface CookieSpec
{
  public abstract List formatCookies(List paramList);
  
  public abstract int getVersion();
  
  public abstract Header getVersionHeader();
  
  public abstract boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin);
  
  public abstract List parse(Header paramHeader, CookieOrigin paramCookieOrigin);
  
  public abstract void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin);
}

/* Location:
 * Qualified Name:     org.apache.http.cookie.CookieSpec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */