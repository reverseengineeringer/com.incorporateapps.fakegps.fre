package org.apache.http.entity;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SerializableEntity
  extends AbstractHttpEntity
{
  public SerializableEntity(Serializable paramSerializable, boolean paramBoolean)
  {
    throw new RuntimeException("Stub!");
  }
  
  public InputStream getContent()
  {
    throw new RuntimeException("Stub!");
  }
  
  public long getContentLength()
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean isRepeatable()
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean isStreaming()
  {
    throw new RuntimeException("Stub!");
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.entity.SerializableEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */