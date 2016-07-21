package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;

public abstract class zzc
  extends zzd
{
  protected final Handler mHandler = new Handler(Looper.getMainLooper());
  protected final long zzadq;
  protected final Runnable zzadr = new zzc.zza(this, null);
  protected boolean zzads;
  
  public zzc(String paramString1, String paramString2, String paramString3)
  {
    this(paramString1, paramString2, paramString3, 1000L);
  }
  
  public zzc(String paramString1, String paramString2, String paramString3, long paramLong)
  {
    super(paramString1, paramString2, paramString3);
    zzadq = paramLong;
    zzW(false);
  }
  
  protected final void zzW(boolean paramBoolean)
  {
    if (zzads != paramBoolean)
    {
      zzads = paramBoolean;
      if (paramBoolean) {
        mHandler.postDelayed(zzadr, zzadq);
      }
    }
    else
    {
      return;
    }
    mHandler.removeCallbacks(zzadr);
  }
  
  public void zzof()
  {
    zzW(false);
  }
  
  protected abstract boolean zzz(long paramLong);
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.internal.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */