package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.zzx;

public class Strategy$Builder
{
  private int zzbbR = 3;
  private int zzbbS = 300;
  private int zzbbT = 0;
  private int zzbbU = -1;
  
  public Strategy build()
  {
    if ((zzbbU == 2) && (zzbbT == 1)) {
      throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
    }
    return new Strategy(2, 0, zzbbS, zzbbT, false, zzbbU, zzbbR);
  }
  
  public Builder setDiscoveryMode(int paramInt)
  {
    zzbbR = paramInt;
    return this;
  }
  
  public Builder setDistanceType(int paramInt)
  {
    zzbbT = paramInt;
    return this;
  }
  
  public Builder setTtlSeconds(int paramInt)
  {
    if ((paramInt == Integer.MAX_VALUE) || ((paramInt > 0) && (paramInt <= 86400))) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(86400) });
      zzbbS = paramInt;
      return this;
    }
  }
  
  public Builder zzjg(int paramInt)
  {
    zzbbU = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.Strategy.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */