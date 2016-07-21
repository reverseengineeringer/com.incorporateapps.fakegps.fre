package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

class zzdg$zzd
{
  private final String zzxY;
  private final String zzzp;
  private final int zzzw;
  private final List zzzx;
  
  public zzdg$zzd(String paramString1, int paramInt, List paramList, String paramString2)
  {
    zzzp = paramString1;
    zzzw = paramInt;
    if (paramList == null) {}
    for (zzzx = new ArrayList();; zzzx = paramList)
    {
      zzxY = paramString2;
      return;
    }
  }
  
  public String getBody()
  {
    return zzxY;
  }
  
  public int getResponseCode()
  {
    return zzzw;
  }
  
  public String zzdU()
  {
    return zzzp;
  }
  
  public Iterable zzdZ()
  {
    return zzzx;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdg.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */