package org.apache.http.protocol;

import java.util.List;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;

public final class BasicHttpProcessor
  implements HttpProcessor, HttpRequestInterceptorList, HttpResponseInterceptorList
{
  protected List requestInterceptors;
  protected List responseInterceptors;
  
  public BasicHttpProcessor()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void addInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void addInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor, int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void addInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void addInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor, int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void addRequestInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void addRequestInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor, int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void addResponseInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void addResponseInterceptor(HttpResponseInterceptor paramHttpResponseInterceptor, int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void clearInterceptors()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void clearRequestInterceptors()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void clearResponseInterceptors()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final Object clone()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final BasicHttpProcessor copy()
  {
    throw new RuntimeException("Stub!");
  }
  
  protected final void copyInterceptors(BasicHttpProcessor paramBasicHttpProcessor)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final HttpRequestInterceptor getRequestInterceptor(int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final int getRequestInterceptorCount()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final HttpResponseInterceptor getResponseInterceptor(int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final int getResponseInterceptorCount()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void process(HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void process(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void removeRequestInterceptorByClass(Class paramClass)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void removeResponseInterceptorByClass(Class paramClass)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void setInterceptors(List paramList)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     org.apache.http.protocol.BasicHttpProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */