package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

public class zzca
{
  private final zzcb zzpe;
  private final Map zzxy;
  
  public zzca(zzcb paramzzcb)
  {
    zzpe = paramzzcb;
    zzxy = new HashMap();
  }
  
  public void zza(String paramString, zzbz paramzzbz)
  {
    zzxy.put(paramString, paramzzbz);
  }
  
  public void zza(String paramString1, String paramString2, long paramLong)
  {
    zzbx.zza(zzpe, (zzbz)zzxy.get(paramString2), paramLong, new String[] { paramString1 });
    zzxy.put(paramString1, zzbx.zza(zzpe, paramLong));
  }
  
  public zzcb zzdA()
  {
    return zzpe;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzca
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */