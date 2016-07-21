package org.apache.http.conn.params;

import java.util.Map;
import org.apache.http.conn.routing.HttpRoute;

public final class ConnPerRouteBean
  implements ConnPerRoute
{
  public static final int DEFAULT_MAX_CONNECTIONS_PER_ROUTE = 2;
  
  public ConnPerRouteBean()
  {
    throw new RuntimeException("Stub!");
  }
  
  public ConnPerRouteBean(int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final int getDefaultMax()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final int getMaxForRoute(HttpRoute paramHttpRoute)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setDefaultMaxPerRoute(int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setMaxForRoute(HttpRoute paramHttpRoute, int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setMaxForRoutes(Map paramMap)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.conn.params.ConnPerRouteBean
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */