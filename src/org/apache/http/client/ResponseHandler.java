package org.apache.http.client;

import org.apache.http.HttpResponse;

public abstract interface ResponseHandler
{
  public abstract Object handleResponse(HttpResponse paramHttpResponse);
}

/* Location:
 * Qualified Name:     org.apache.http.client.ResponseHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */