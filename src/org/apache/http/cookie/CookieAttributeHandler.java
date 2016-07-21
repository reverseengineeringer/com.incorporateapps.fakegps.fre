package org.apache.http.cookie;

public abstract interface CookieAttributeHandler
{
  public abstract boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin);
  
  public abstract void parse(SetCookie paramSetCookie, String paramString);
  
  public abstract void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin);
}

/* Location:
 * Qualified Name:     org.apache.http.cookie.CookieAttributeHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */