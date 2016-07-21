package org.apache.http.client;

import java.util.Date;
import java.util.List;
import org.apache.http.cookie.Cookie;

public abstract interface CookieStore
{
  public abstract void addCookie(Cookie paramCookie);
  
  public abstract void clear();
  
  public abstract boolean clearExpired(Date paramDate);
  
  public abstract List getCookies();
}

/* Location:
 * Qualified Name:     org.apache.http.client.CookieStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */