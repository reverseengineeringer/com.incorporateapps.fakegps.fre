package com.google.android.gms.measurement.internal;

abstract class zzz
  extends zzy
{
  private boolean zzQk;
  private boolean zzQl;
  private boolean zzaYC;
  
  zzz(zzw paramzzw)
  {
    super(paramzzw);
    zzaTV.zzb(this);
  }
  
  boolean isInitialized()
  {
    return (zzQk) && (!zzQl);
  }
  
  boolean zzDi()
  {
    return zzaYC;
  }
  
  public final void zza()
  {
    if (zzQk) {
      throw new IllegalStateException("Can't initialize twice");
    }
    zziJ();
    zzaTV.zzDg();
    zzQk = true;
  }
  
  protected abstract void zziJ();
  
  protected void zzjv()
  {
    if (!isInitialized()) {
      throw new IllegalStateException("Not initialized");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */