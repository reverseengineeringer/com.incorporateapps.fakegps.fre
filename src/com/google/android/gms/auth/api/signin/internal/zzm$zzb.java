package com.google.android.gms.auth.api.signin.internal;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class zzm$zzb
  extends LinkedHashMap
{
  private final int zzav;
  
  public zzm$zzb(int paramInt)
  {
    zzav = paramInt;
  }
  
  protected boolean removeEldestEntry(Map.Entry paramEntry)
  {
    return size() > zzav;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzm.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */