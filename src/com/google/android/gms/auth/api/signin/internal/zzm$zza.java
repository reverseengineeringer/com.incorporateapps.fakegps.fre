package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzmt;

public class zzm$zza
{
  private final String zzXI;
  private final long zzXJ;
  private final zzmq zzqW;
  
  public zzm$zza(String paramString, long paramLong)
  {
    this(paramString, paramLong, zzmt.zzsc());
  }
  
  private zzm$zza(String paramString, long paramLong, zzmq paramzzmq)
  {
    zzXI = zzx.zzcM(paramString);
    if (paramLong > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzac(bool);
      zzXJ = paramLong;
      zzqW = ((zzmq)zzx.zzz(paramzzmq));
      return;
    }
  }
  
  public boolean zzb()
  {
    return zzqW.currentTimeMillis() / 1000L >= zzXJ - 300L;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzm.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */