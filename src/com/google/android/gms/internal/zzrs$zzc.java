package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class zzrs$zzc
{
  private final String zzadc;
  private final List zzbmj;
  private final Map zzbmk;
  private final int zzbml;
  
  private zzrs$zzc(List paramList, Map paramMap, String paramString, int paramInt)
  {
    zzbmj = Collections.unmodifiableList(paramList);
    zzbmk = Collections.unmodifiableMap(paramMap);
    zzadc = paramString;
    zzbml = paramInt;
  }
  
  public static zzrs.zzd zzHK()
  {
    return new zzrs.zzd(null);
  }
  
  public String getVersion()
  {
    return zzadc;
  }
  
  public String toString()
  {
    return "Rules: " + zzHL() + "  Macros: " + zzbmk;
  }
  
  public List zzHL()
  {
    return zzbmj;
  }
  
  public Map zzHM()
  {
    return zzbmk;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrs.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */