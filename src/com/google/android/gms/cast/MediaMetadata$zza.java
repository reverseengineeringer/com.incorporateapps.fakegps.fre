package com.google.android.gms.cast;

import java.util.HashMap;
import java.util.Map;

class MediaMetadata$zza
{
  private final Map zzaba = new HashMap();
  private final Map zzabb = new HashMap();
  private final Map zzabc = new HashMap();
  
  public zza zzc(String paramString1, String paramString2, int paramInt)
  {
    zzaba.put(paramString1, paramString2);
    zzabb.put(paramString2, paramString1);
    zzabc.put(paramString1, Integer.valueOf(paramInt));
    return this;
  }
  
  public String zzca(String paramString)
  {
    return (String)zzaba.get(paramString);
  }
  
  public String zzcb(String paramString)
  {
    return (String)zzabb.get(paramString);
  }
  
  public int zzcc(String paramString)
  {
    paramString = (Integer)zzabc.get(paramString);
    if (paramString != null) {
      return paramString.intValue();
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.MediaMetadata.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */