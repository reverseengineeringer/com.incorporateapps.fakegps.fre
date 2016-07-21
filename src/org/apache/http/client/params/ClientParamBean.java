package org.apache.http.client.params;

import java.util.Collection;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionManagerFactory;
import org.apache.http.params.HttpAbstractParamBean;
import org.apache.http.params.HttpParams;

public class ClientParamBean
  extends HttpAbstractParamBean
{
  public ClientParamBean(HttpParams paramHttpParams)
  {
    super(null);
    throw new RuntimeException("Stub!");
  }
  
  public void setAllowCircularRedirects(boolean paramBoolean)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setConnectionManagerFactory(ClientConnectionManagerFactory paramClientConnectionManagerFactory)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setConnectionManagerFactoryClassName(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setCookiePolicy(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setDefaultHeaders(Collection paramCollection)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setDefaultHost(HttpHost paramHttpHost)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setHandleAuthentication(boolean paramBoolean)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setHandleRedirects(boolean paramBoolean)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setMaxRedirects(int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setRejectRelativeRedirect(boolean paramBoolean)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setVirtualHost(HttpHost paramHttpHost)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.client.params.ClientParamBean
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */