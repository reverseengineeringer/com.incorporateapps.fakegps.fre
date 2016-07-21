package com.google.android.gms.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

class zzru
  implements zzrv
{
  private HttpURLConnection zzbmy;
  
  private InputStream zzd(HttpURLConnection paramHttpURLConnection)
  {
    int i = paramHttpURLConnection.getResponseCode();
    if (i == 200) {
      return paramHttpURLConnection.getInputStream();
    }
    paramHttpURLConnection = "Bad response: " + i;
    if (i == 404) {
      throw new FileNotFoundException(paramHttpURLConnection);
    }
    throw new IOException(paramHttpURLConnection);
  }
  
  private void zze(HttpURLConnection paramHttpURLConnection)
  {
    if (paramHttpURLConnection != null) {
      paramHttpURLConnection.disconnect();
    }
  }
  
  public void close()
  {
    zze(zzbmy);
  }
  
  public InputStream zzgI(String paramString)
  {
    zzbmy = zzgJ(paramString);
    return zzd(zzbmy);
  }
  
  HttpURLConnection zzgJ(String paramString)
  {
    paramString = (HttpURLConnection)new URL(paramString).openConnection();
    paramString.setReadTimeout(20000);
    paramString.setConnectTimeout(20000);
    return paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzru
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */