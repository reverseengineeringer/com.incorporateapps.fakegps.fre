package com.google.android.gms.tagmanager;

import android.util.LruCache;

class zzba
  implements zzl
{
  private LruCache zzbjq;
  
  zzba(int paramInt, zzm.zza paramzza)
  {
    zzbjq = new zzba.1(this, paramInt, paramzza);
  }
  
  public Object get(Object paramObject)
  {
    return zzbjq.get(paramObject);
  }
  
  public void zzh(Object paramObject1, Object paramObject2)
  {
    zzbjq.put(paramObject1, paramObject2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzba
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */