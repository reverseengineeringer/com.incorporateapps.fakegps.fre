package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.zzx;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class zzq
  extends zzz
{
  public zzq(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  private byte[] zzc(HttpURLConnection paramHttpURLConnection)
  {
    byte[] arrayOfByte = null;
    Object localObject = arrayOfByte;
    ByteArrayOutputStream localByteArrayOutputStream;
    try
    {
      localByteArrayOutputStream = new ByteArrayOutputStream();
      localObject = arrayOfByte;
      paramHttpURLConnection = paramHttpURLConnection.getInputStream();
      localObject = paramHttpURLConnection;
      arrayOfByte = new byte['Ѐ'];
      for (;;)
      {
        localObject = paramHttpURLConnection;
        int i = paramHttpURLConnection.read(arrayOfByte);
        if (i <= 0) {
          break;
        }
        localObject = paramHttpURLConnection;
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      localObject = paramHttpURLConnection;
    }
    finally
    {
      if (localObject != null) {
        ((InputStream)localObject).close();
      }
    }
    arrayOfByte = localByteArrayOutputStream.toByteArray();
    if (paramHttpURLConnection != null) {
      paramHttpURLConnection.close();
    }
    return arrayOfByte;
  }
  
  public void zza(String paramString, URL paramURL, Map paramMap, zzq.zza paramzza)
  {
    zzjk();
    zzjv();
    zzx.zzz(paramURL);
    zzx.zzz(paramzza);
    zzCn().zzh(new zzq.zzc(this, paramString, paramURL, null, paramMap, paramzza));
  }
  
  public void zza(String paramString, URL paramURL, byte[] paramArrayOfByte, Map paramMap, zzq.zza paramzza)
  {
    zzjk();
    zzjv();
    zzx.zzz(paramURL);
    zzx.zzz(paramArrayOfByte);
    zzx.zzz(paramzza);
    zzCn().zzh(new zzq.zzc(this, paramString, paramURL, paramArrayOfByte, paramMap, paramzza));
  }
  
  protected HttpURLConnection zzc(URL paramURL)
  {
    paramURL = paramURL.openConnection();
    if (!(paramURL instanceof HttpURLConnection)) {
      throw new IOException("Failed to obtain HTTP connection");
    }
    paramURL = (HttpURLConnection)paramURL;
    paramURL.setDefaultUseCaches(false);
    paramURL.setConnectTimeout((int)zzCp().zzBO());
    paramURL.setReadTimeout((int)zzCp().zzBP());
    paramURL.setInstanceFollowRedirects(false);
    paramURL.setDoInput(true);
    return paramURL;
  }
  
  protected void zziJ() {}
  
  public boolean zzlB()
  {
    zzjv();
    Object localObject1 = (ConnectivityManager)getContext().getSystemService("connectivity");
    try
    {
      localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
      if ((localObject1 != null) && (((NetworkInfo)localObject1).isConnected())) {
        return true;
      }
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */