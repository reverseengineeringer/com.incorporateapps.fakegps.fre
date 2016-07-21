package org.apache.http.entity;

import org.apache.http.Header;
import org.apache.http.HttpEntity;

public abstract class AbstractHttpEntity
  implements HttpEntity
{
  protected boolean chunked;
  protected Header contentEncoding;
  protected Header contentType;
  
  protected AbstractHttpEntity()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void consumeContent()
  {
    throw new RuntimeException("Stub!");
  }
  
  public Header getContentEncoding()
  {
    throw new RuntimeException("Stub!");
  }
  
  public Header getContentType()
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean isChunked()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setChunked(boolean paramBoolean)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setContentEncoding(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setContentEncoding(Header paramHeader)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setContentType(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public void setContentType(Header paramHeader)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.entity.AbstractHttpEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */