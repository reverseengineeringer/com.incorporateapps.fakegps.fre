package org.apache.http.message;

import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;

public class BasicHttpEntityEnclosingRequest
  extends BasicHttpRequest
  implements HttpEntityEnclosingRequest
{
  public BasicHttpEntityEnclosingRequest(String paramString1, String paramString2)
  {
    super(null);
    throw new RuntimeException("Stub!");
  }
  
  public BasicHttpEntityEnclosingRequest(String paramString1, String paramString2, ProtocolVersion paramProtocolVersion)
  {
    super(null);
    throw new RuntimeException("Stub!");
  }
  
  public BasicHttpEntityEnclosingRequest(RequestLine paramRequestLine)
  {
    super(null);
    throw new RuntimeException("Stub!");
  }
  
  public boolean expectContinue()
  {
    throw new RuntimeException("Stub!");
  }
  
  public HttpEntity getEntity()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setEntity(HttpEntity paramHttpEntity)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.message.BasicHttpEntityEnclosingRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */