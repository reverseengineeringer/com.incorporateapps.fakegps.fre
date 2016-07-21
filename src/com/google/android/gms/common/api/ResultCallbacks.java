package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.zzb;

public abstract class ResultCallbacks
  implements ResultCallback
{
  public abstract void onFailure(Status paramStatus);
  
  public final void onResult(Result paramResult)
  {
    Status localStatus = paramResult.getStatus();
    if (localStatus.isSuccess())
    {
      onSuccess(paramResult);
      return;
    }
    onFailure(localStatus);
    zzb.zzc(paramResult);
  }
  
  public abstract void onSuccess(Result paramResult);
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.ResultCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */