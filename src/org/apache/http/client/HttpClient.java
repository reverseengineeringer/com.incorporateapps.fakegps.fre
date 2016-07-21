package org.apache.http.client;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public abstract interface HttpClient
{
  public abstract Object execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler);
  
  public abstract Object execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext);
  
  public abstract Object execute(HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler);
  
  public abstract Object execute(HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext);
  
  public abstract HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest);
  
  public abstract HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext);
  
  public abstract HttpResponse execute(HttpUriRequest paramHttpUriRequest);
  
  public abstract HttpResponse execute(HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext);
  
  public abstract ClientConnectionManager getConnectionManager();
  
  public abstract HttpParams getParams();
}

/* Location:
 * Qualified Name:     org.apache.http.client.HttpClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */