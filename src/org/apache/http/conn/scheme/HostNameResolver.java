package org.apache.http.conn.scheme;

import java.net.InetAddress;

public abstract interface HostNameResolver
{
  public abstract InetAddress resolve(String paramString);
}

/* Location:
 * Qualified Name:     org.apache.http.conn.scheme.HostNameResolver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */