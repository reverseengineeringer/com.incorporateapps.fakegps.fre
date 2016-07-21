package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.data.DataHolder;

public abstract class zze
  implements zzq.zzb
{
  private final DataHolder zzahi;
  
  protected zze(DataHolder paramDataHolder)
  {
    zzahi = paramDataHolder;
  }
  
  protected abstract void zza(Object paramObject, DataHolder paramDataHolder);
  
  public void zzpr()
  {
    if (zzahi != null) {
      zzahi.close();
    }
  }
  
  public final void zzt(Object paramObject)
  {
    zza(paramObject, zzahi);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */