package com.google.android.gms.internal;

public class zzeg$zzd
  extends zzjj
{
  private final zzeg.zze zzBo;
  private boolean zzBp;
  private final Object zzpV = new Object();
  
  public zzeg$zzd(zzeg.zze paramzze)
  {
    zzBo = paramzze;
  }
  
  public void release()
  {
    synchronized (zzpV)
    {
      if (zzBp) {
        return;
      }
      zzBp = true;
      zza(new zzeg.zzd.1(this), new zzji.zzb());
      zza(new zzeg.zzd.2(this), new zzeg.zzd.3(this));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzeg.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */