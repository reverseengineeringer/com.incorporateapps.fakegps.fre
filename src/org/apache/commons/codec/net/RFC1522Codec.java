package org.apache.commons.codec.net;

abstract class RFC1522Codec
{
  RFC1522Codec()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected String decodeText(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  protected abstract byte[] doDecoding(byte[] paramArrayOfByte);
  
  protected abstract byte[] doEncoding(byte[] paramArrayOfByte);
  
  protected String encodeText(String paramString1, String paramString2)
  {
    throw new RuntimeException("Stub!");
  }
  
  protected abstract String getEncoding();
}

/* Location:
 * Qualified Name:     org.apache.commons.codec.net.RFC1522Codec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */