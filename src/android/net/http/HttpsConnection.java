package android.net.http;

import java.io.File;

public class HttpsConnection
  extends Connection
{
  protected SslCertificate mCertificate;
  protected AndroidHttpClientConnection mHttpClientConnection;
  
  HttpsConnection()
  {
    super(null, null, null);
    throw new RuntimeException("Stub!");
  }
  
  public static void initializeEngine(File paramFile)
  {
    throw new RuntimeException("Stub!");
  }
}

/* Location:
 * Qualified Name:     android.net.http.HttpsConnection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */