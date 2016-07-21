package org.apache.http.impl.cookie;

import java.util.List;
import org.apache.http.Header;
import org.apache.http.cookie.CookieOrigin;

public class NetscapeDraftSpec
  extends CookieSpecBase
{
  protected static final String EXPIRES_PATTERN = "EEE, dd-MMM-yyyy HH:mm:ss z";
  
  public NetscapeDraftSpec()
  {
    throw new RuntimeException("Stub!");
  }
  
  public NetscapeDraftSpec(String[] paramArrayOfString)
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
  
  public List parse(Header paramHeader, CookieOrigin paramCookieOrigin)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.cookie.NetscapeDraftSpec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */