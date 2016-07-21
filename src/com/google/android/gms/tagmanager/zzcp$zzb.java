package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;

class zzcp$zzb
{
  private zzbw zzbkH;
  private zzag.zza zzbkI;
  
  public zzcp$zzb(zzbw paramzzbw, zzag.zza paramzza)
  {
    zzbkH = paramzzbw;
    zzbkI = paramzza;
  }
  
  public int getSize()
  {
    int j = ((zzag.zza)zzbkH.getObject()).getCachedSize();
    if (zzbkI == null) {}
    for (int i = 0;; i = zzbkI.getCachedSize()) {
      return i + j;
    }
  }
  
  public zzbw zzHg()
  {
    return zzbkH;
  }
  
  public zzag.zza zzHh()
  {
    return zzbkI;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcp.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */