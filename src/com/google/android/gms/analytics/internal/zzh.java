package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzh
{
  private final String zzPO;
  private final long zzQD;
  private final String zzQE;
  private final boolean zzQF;
  private long zzQG;
  private final Map zzxA;
  
  public zzh(long paramLong1, String paramString1, String paramString2, boolean paramBoolean, long paramLong2, Map paramMap)
  {
    zzx.zzcM(paramString1);
    zzx.zzcM(paramString2);
    zzQD = paramLong1;
    zzPO = paramString1;
    zzQE = paramString2;
    zzQF = paramBoolean;
    zzQG = paramLong2;
    if (paramMap != null)
    {
      zzxA = new HashMap(paramMap);
      return;
    }
    zzxA = Collections.emptyMap();
  }
  
  public String getClientId()
  {
    return zzPO;
  }
  
  public long zzjD()
  {
    return zzQD;
  }
  
  public String zzjE()
  {
    return zzQE;
  }
  
  public boolean zzjF()
  {
    return zzQF;
  }
  
  public long zzjG()
  {
    return zzQG;
  }
  
  public Map zzn()
  {
    return zzxA;
  }
  
  public void zzn(long paramLong)
  {
    zzQG = paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */