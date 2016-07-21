package org.apache.http.message;

import org.apache.http.HttpRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;

public class BasicHttpRequest
  extends AbstractHttpMessage
  implements HttpRequest
{
  public BasicHttpRequest(String paramString1, String paramString2)
  {
    throw new RuntimeException("Stub!");
  }
  
  public BasicHttpRequest(String paramString1, String paramString2, ProtocolVersion paramProtocolVersion)
  {
    throw new RuntimeException("Stub!");
  }
  
  public BasicHttpRequest(RequestLine paramRequestLine)
  {
    throw new RuntimeException("Stub!");
  }
  
  public ProtocolVersion getProtocolVersion()
  {
    throw new RuntimeException("Stub!");
  }
  
  public RequestLine getRequestLine()
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.message.BasicHttpRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */