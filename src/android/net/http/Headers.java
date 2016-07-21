package android.net.http;

import java.util.ArrayList;
import org.apache.http.util.CharArrayBuffer;

public final class Headers
{
  public static final String ACCEPT_RANGES = "accept-ranges";
  public static final String CACHE_CONTROL = "cache-control";
  public static final int CONN_CLOSE = 1;
  public static final String CONN_DIRECTIVE = "connection";
  public static final int CONN_KEEP_ALIVE = 2;
  public static final String CONTENT_DISPOSITION = "content-disposition";
  public static final String CONTENT_ENCODING = "content-encoding";
  public static final String CONTENT_LEN = "content-length";
  public static final String CONTENT_TYPE = "content-type";
  public static final String ETAG = "etag";
  public static final String EXPIRES = "expires";
  public static final String LAST_MODIFIED = "last-modified";
  public static final String LOCATION = "location";
  public static final int NO_CONN_TYPE = 0;
  public static final long NO_CONTENT_LENGTH = -1L;
  public static final long NO_TRANSFER_ENCODING = 0L;
  public static final String PRAGMA = "pragma";
  public static final String PROXY_AUTHENTICATE = "proxy-authenticate";
  public static final String PROXY_CONNECTION = "proxy-connection";
  public static final String REFRESH = "refresh";
  public static final String SET_COOKIE = "set-cookie";
  public static final String TRANSFER_ENCODING = "transfer-encoding";
  public static final String WWW_AUTHENTICATE = "www-authenticate";
  public static final String X_PERMITTED_CROSS_DOMAIN_POLICIES = "x-permitted-cross-domain-policies";
  
  public Headers()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getAcceptRanges()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getCacheControl()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final int getConnectionType()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getContentDisposition()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getContentEncoding()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final long getContentLength()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getContentType()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getEtag()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getExpires()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void getHeaders(Headers.HeaderCallback paramHeaderCallback)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getLastModified()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getLocation()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getPragma()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getProxyAuthenticate()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getRefresh()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final ArrayList getSetCookie()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final long getTransferEncoding()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getWwwAuthenticate()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final String getXPermittedCrossDomainPolicies()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void parseHeader(CharArrayBuffer paramCharArrayBuffer)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setAcceptRanges(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setCacheControl(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setContentDisposition(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setContentEncoding(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setContentLength(long paramLong)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setContentType(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setEtag(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setExpires(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setLastModified(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setLocation(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setProxyAuthenticate(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setWwwAuthenticate(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setXPermittedCrossDomainPolicies(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     android.net.http.Headers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */