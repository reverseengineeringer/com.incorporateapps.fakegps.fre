package org.apache.http.impl.cookie;

import java.util.List;
import org.apache.http.Header;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;

public class BestMatchSpec
  implements CookieSpec
{
  public BestMatchSpec()
  {
    throw new RuntimeException("Stub!");
  }
  
  public BestMatchSpec(String[] paramArrayOfString, boolean paramBoolean)
  {
    throw new RuntimeException("Stub!");
  }
  
  public List formatCookies(List paramList)
  {
    throw new RuntimeException("Stub!");
  }
  
  public int getVersion()
  {
    throw new RuntimeException("Stub!");
  }
  
  public Header getVersionHeader()
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    throw new RuntimeException("Stub!");
  }
  
  public List parse(Header paramHeader, CookieOrigin paramCookieOrigin)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.cookie.BestMatchSpec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */