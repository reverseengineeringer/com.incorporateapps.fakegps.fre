package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.zzx;

public final class zzq
{
  private volatile Object mListener;
  private final zzq.zza zzaiw;
  
  zzq(Looper paramLooper, Object paramObject)
  {
    zzaiw = new zzq.zza(this, paramLooper);
    mListener = zzx.zzb(paramObject, "Listener must not be null");
  }
  
  public final void clear()
  {
    mListener = null;
  }
  
  public final void zza(zzq.zzb paramzzb)
  {
    zzx.zzb(paramzzb, "Notifier must not be null");
    paramzzb = zzaiw.obtainMessage(1, paramzzb);
    zzaiw.sendMessage(paramzzb);
  }
  
  final void zzb(zzq.zzb paramzzb)
  {
    Object localObject = mListener;
    if (localObject == null)
    {
      paramzzb.zzpr();
      return;
    }
    try
    {
      paramzzb.zzt(localObject);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      paramzzb.zzpr();
      throw localRuntimeException;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */