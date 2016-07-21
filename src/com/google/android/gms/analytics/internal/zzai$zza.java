package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import java.util.UUID;

public final class zzai$zza
{
  private final String mName;
  private final long zzTl;
  
  private zzai$zza(zzai paramzzai, String paramString, long paramLong)
  {
    zzx.zzcM(paramString);
    if (paramLong > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzac(bool);
      mName = paramString;
      zzTl = paramLong;
      return;
    }
  }
  
  private void zzlL()
  {
    long l = zzTm.zzjl().currentTimeMillis();
    SharedPreferences.Editor localEditor = zzai.zza(zzTm).edit();
    localEditor.remove(zzlQ());
    localEditor.remove(zzlR());
    localEditor.putLong(zzlP(), l);
    localEditor.commit();
  }
  
  private long zzlM()
  {
    long l = zzlO();
    if (l == 0L) {
      return 0L;
    }
    return Math.abs(l - zzTm.zzjl().currentTimeMillis());
  }
  
  private long zzlO()
  {
    return zzai.zza(zzTm).getLong(zzlP(), 0L);
  }
  
  private String zzlP()
  {
    return mName + ":start";
  }
  
  private String zzlQ()
  {
    return mName + ":count";
  }
  
  public final void zzbq(String paramString)
  {
    if (zzlO() == 0L) {
      zzlL();
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    for (;;)
    {
      try
      {
        long l = zzai.zza(zzTm).getLong(zzlQ(), 0L);
        if (l <= 0L)
        {
          paramString = zzai.zza(zzTm).edit();
          paramString.putString(zzlR(), str);
          paramString.putLong(zzlQ(), 1L);
          paramString.apply();
          return;
        }
        if ((UUID.randomUUID().getLeastSignificantBits() & 0x7FFFFFFFFFFFFFFF) < Long.MAX_VALUE / (l + 1L))
        {
          i = 1;
          paramString = zzai.zza(zzTm).edit();
          if (i != 0) {
            paramString.putString(zzlR(), str);
          }
          paramString.putLong(zzlQ(), l + 1L);
          paramString.apply();
          return;
        }
      }
      finally {}
      int i = 0;
    }
  }
  
  public final Pair zzlN()
  {
    long l = zzlM();
    if (l < zzTl) {}
    String str;
    do
    {
      return null;
      if (l > zzTl * 2L)
      {
        zzlL();
        return null;
      }
      str = zzai.zza(zzTm).getString(zzlR(), null);
      l = zzai.zza(zzTm).getLong(zzlQ(), 0L);
      zzlL();
    } while ((str == null) || (l <= 0L));
    return new Pair(str, Long.valueOf(l));
  }
  
  protected final String zzlR()
  {
    return mName + ":value";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzai.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */