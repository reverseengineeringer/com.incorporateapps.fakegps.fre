package org.apache.http.impl.auth;

import org.apache.http.Header;
import org.apache.http.auth.AuthScheme;
import org.apache.http.util.CharArrayBuffer;

public abstract class AuthSchemeBase
  implements AuthScheme
{
  public AuthSchemeBase()
  {
    throw new RuntimeException("Stub!");
  }
  
  public boolean isProxy()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected abstract void parseChallenge(CharArrayBuffer paramCharArrayBuffer, int paramInt1, int paramInt2);
  
  public void processChallenge(Header paramHeader)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.impl.auth.AuthSchemeBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */