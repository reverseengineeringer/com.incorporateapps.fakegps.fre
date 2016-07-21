package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;

class zzm
{
  final zzm.zza zzbhK = new zzm.1(this);
  
  int zzFY()
  {
    return Build.VERSION.SDK_INT;
  }
  
  public zzl zza(int paramInt, zzm.zza paramzza)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("maxSize <= 0");
    }
    if (zzFY() < 12) {
      return new zzcw(paramInt, paramzza);
    }
    return new zzba(paramInt, paramzza);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */