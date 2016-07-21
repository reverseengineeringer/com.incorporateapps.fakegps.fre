package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

public abstract class PendingResult
{
  public abstract Result await();
  
  public abstract Result await(long paramLong, TimeUnit paramTimeUnit);
  
  public abstract void cancel();
  
  public abstract boolean isCanceled();
  
  public abstract void setResultCallback(ResultCallback paramResultCallback);
  
  public abstract void setResultCallback(ResultCallback paramResultCallback, long paramLong, TimeUnit paramTimeUnit);
  
  public TransformedResult then(ResultTransform paramResultTransform)
  {
    throw new UnsupportedOperationException();
  }
  
  public void zza(PendingResult.zza paramzza)
  {
    throw new UnsupportedOperationException();
  }
  
  public Integer zzpa()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.PendingResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */