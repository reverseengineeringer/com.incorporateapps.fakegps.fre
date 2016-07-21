package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.zze;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzkd
  extends zze
{
  private final Map zzxA = new HashMap();
  
  private String zzaW(String paramString)
  {
    zzx.zzcM(paramString);
    String str = paramString;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.startsWith("&")) {
        str = paramString.substring(1);
      }
    }
    zzx.zzh(str, "Name can not be empty or \"&\"");
    return str;
  }
  
  public final void set(String paramString1, String paramString2)
  {
    paramString1 = zzaW(paramString1);
    zzxA.put(paramString1, paramString2);
  }
  
  public final String toString()
  {
    return zzF(zzxA);
  }
  
  public final void zza(zzkd paramzzkd)
  {
    zzx.zzz(paramzzkd);
    zzxA.putAll(zzxA);
  }
  
  public final Map zziR()
  {
    return Collections.unmodifiableMap(zzxA);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */