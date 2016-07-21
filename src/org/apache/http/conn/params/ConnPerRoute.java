package org.apache.http.conn.params;

import org.apache.http.conn.routing.HttpRoute;

public abstract interface ConnPerRoute
{
  public abstract int getMaxForRoute(HttpRoute paramHttpRoute);
}

/* Location:
 * Qualified Name:     org.apache.http.conn.params.ConnPerRoute
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */