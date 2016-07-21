package org.apache.http.client;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

public abstract interface RequestDirector
{
  public abstract HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext);
}

/* Location:
 * Qualified Name:     org.apache.http.client.RequestDirector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */