package com.google.android.gms.internal;

import android.net.http.SslError;
import android.webkit.WebChromeClient;

public class zzis$zzc
  extends zzis.zzb
{
  public String zza(SslError paramSslError)
  {
    return paramSslError.getUrl();
  }
  
  public WebChromeClient zzk(zzjp paramzzjp)
  {
    return new zzjx(paramzzjp);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzis.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */