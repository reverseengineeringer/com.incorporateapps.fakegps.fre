package org.apache.http.impl.cookie;

import java.util.List;
import org.apache.http.Header;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.util.CharArrayBuffer;

public class RFC2965Spec
  extends RFC2109Spec
{
  public RFC2965Spec()
  {
    throw new RuntimeException("Stub!");
  }
  
  public RFC2965Spec(String[] paramArrayOfString, boolean paramBoolean)
  {
    throw new RuntimeException("Stub!");
  }
  
  protected void formatCookieAsVer(CharArrayBuffer paramCharArrayBuffer, Cookie paramCookie, int paramInt)
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
 * Qualified Name:     org.apache.http.impl.cookie.RFC2965Spec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */