package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.Api.zzc;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public final class zzk
{
  public static final Api.zzc zzUI = new Api.zzc();
  public static final Charset zzaec;
  
  static
  {
    Object localObject = null;
    try
    {
      Charset localCharset = Charset.forName("UTF-8");
      localObject = localCharset;
    }
    catch (UnsupportedCharsetException localUnsupportedCharsetException)
    {
      for (;;) {}
    }
    catch (IllegalCharsetNameException localIllegalCharsetNameException)
    {
      for (;;) {}
    }
    zzaec = (Charset)localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.internal.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */