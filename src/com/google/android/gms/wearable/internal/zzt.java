package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzx;

public final class zzt
  extends zzau.zza
{
  private zzm zzbsk;
  private zzu zzbso;
  private final Object zzpV = new Object();
  
  public final void zza(zzu paramzzu)
  {
    synchronized (zzpV)
    {
      zzbso = ((zzu)zzx.zzz(paramzzu));
      zzm localzzm = zzbsk;
      if (localzzm != null) {
        paramzzu.zzb(localzzm);
      }
      return;
    }
  }
  
  public final void zzy(int paramInt1, int paramInt2)
  {
    synchronized (zzpV)
    {
      zzu localzzu = zzbso;
      zzm localzzm = new zzm(paramInt1, paramInt2);
      zzbsk = localzzm;
      if (localzzu != null) {
        localzzu.zzb(localzzm);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */