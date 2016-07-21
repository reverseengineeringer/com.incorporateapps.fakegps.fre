package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.TimeUnit;

public final class BatchResult
  implements Result
{
  private final Status zzUX;
  private final PendingResult[] zzagc;
  
  BatchResult(Status paramStatus, PendingResult[] paramArrayOfPendingResult)
  {
    zzUX = paramStatus;
    zzagc = paramArrayOfPendingResult;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
  
  public final Result take(BatchResultToken paramBatchResultToken)
  {
    if (mId < zzagc.length) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "The result token does not belong to this batch");
      return zzagc[mId].await(0L, TimeUnit.MILLISECONDS);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.BatchResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */