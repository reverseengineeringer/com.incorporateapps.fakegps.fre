package com.google.android.gms.analytics.internal;

public abstract class zzd
  extends zzc
{
  private boolean zzQk;
  private boolean zzQl;
  
  protected zzd(zzf paramzzf)
  {
    super(paramzzf);
  }
  
  public boolean isInitialized()
  {
    return (zzQk) && (!zzQl);
  }
  
  public void zza()
  {
    zziJ();
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
 * Qualified Name:     com.google.android.gms.analytics.internal.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */