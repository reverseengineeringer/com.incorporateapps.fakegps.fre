package org.apache.http.cookie;

import org.apache.http.params.HttpParams;

public abstract interface CookieSpecFactory
{
  public abstract CookieSpec newInstance(HttpParams paramHttpParams);
}

/* Location:
 * Qualified Name:     org.apache.http.cookie.CookieSpecFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */