package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.zzq;

class zzm$zze
  extends zzh.zza
  implements zzm.zza
{
  private final zzq zzbcH;
  
  private zzm$zze(zzq paramzzq)
  {
    zzbcH = paramzzq;
  }
  
  public void onPermissionChanged(boolean paramBoolean)
  {
    zzbcH.zza(new zzm.zze.1(this, paramBoolean));
  }
  
  public zzq zzEE()
  {
    return zzbcH;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzm.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */