package android.net.http;

import android.content.ContentResolver;
import android.content.Context;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public final class AndroidHttpClient
  implements HttpClient
{
  public static long DEFAULT_SYNC_MIN_GZIP_BYTES;
  
  AndroidHttpClient()
  {
    throw new RuntimeException("Stub!");
  }
  
  public static AbstractHttpEntity getCompressedEntity(byte[] paramArrayOfByte, ContentResolver paramContentResolver)
  {
    throw new RuntimeException("Stub!");
  }
  
  public static long getMinGzipSize(ContentResolver paramContentResolver)
  {
    throw new RuntimeException("Stub!");
  }
  
  public static InputStream getUngzippedContent(HttpEntity paramHttpEntity)
  {
    throw new RuntimeException("Stub!");
  }
  
  public static void modifyRequestToAcceptGzipResponse(HttpRequest paramHttpRequest)
  {
    throw new RuntimeException("Stub!");
  }
  
  public static AndroidHttpClient newInstance(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public static AndroidHttpClient newInstance(String paramString, Context paramContext)
  {
    throw new RuntimeException("Stub!");
  }
  
  public static long parseDate(String paramString)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void close()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void disableCurlLogging()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final void enableCurlLogging(String paramString, int paramInt)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final Object execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final Object execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final Object execute(HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final Object execute(HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final HttpResponse execute(HttpUriRequest paramHttpUriRequest)
  {
    throw new RuntimeException("Stub!");
  }
  
  public final HttpResponse execute(HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext)
  {
    throw new RuntimeException("Stub!");
  }
  
  protected final void finalize()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final ClientConnectionManager getConnectionManager()
  {
    throw new RuntimeException("Stub!");
  }
  
  public final HttpParams getParams()
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     android.net.http.AndroidHttpClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */