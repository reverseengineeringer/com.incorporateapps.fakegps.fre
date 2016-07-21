package org.apache.http;

import java.io.Serializable;

public final class HttpVersion
  extends ProtocolVersion
  implements Serializable
{
  public static final String HTTP = "HTTP";
  public static final HttpVersion HTTP_0_9 = null;
  public static final HttpVersion HTTP_1_0 = null;
  public static final HttpVersion HTTP_1_1 = null;
  
  public HttpVersion(int paramInt1, int paramInt2)
  {
    super(null, 0, 0);
    throw new RuntimeException("Stub!");
  }
  
  public final ProtocolVersion forVersion(int paramInt1, int paramInt2)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.HttpVersion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */