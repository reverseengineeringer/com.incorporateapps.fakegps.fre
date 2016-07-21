package org.apache.http.impl.auth;

import java.util.Map;
import org.apache.http.util.CharArrayBuffer;

public abstract class RFC2617Scheme
  extends AuthSchemeBase
{
  public RFC2617Scheme()
  {
    throw new RuntimeException("Stub!");
  }
  
  public String getParameter(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  protected Map getParameters()
  {
    throw new RuntimeException("Stub!");
  }
  
  public String getRealm()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected void parseChallenge(CharArrayBuffer paramCharArrayBuffer, int paramInt1, int paramInt2)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.auth.RFC2617Scheme
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */