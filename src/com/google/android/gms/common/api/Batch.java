package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.zzb;
import java.util.List;

public final class Batch
  extends zzb
{
  private int zzafZ;
  private boolean zzaga;
  private boolean zzagb;
  private final PendingResult[] zzagc;
  private final Object zzpV = new Object();
  
  private Batch(List paramList, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
    zzafZ = paramList.size();
    zzagc = new PendingResult[zzafZ];
    if (paramList.isEmpty()) {
      zza(new BatchResult(Status.zzagC, zzagc));
    }
    for (;;)
    {
      return;
      int i = 0;
      while (i < paramList.size())
      {
        paramGoogleApiClient = (PendingResult)paramList.get(i);
        zzagc[i] = paramGoogleApiClient;
        paramGoogleApiClient.zza(new Batch.1(this));
        i += 1;
      }
    }
  }
  
  public final void cancel()
  {
    super.cancel();
    PendingResult[] arrayOfPendingResult = zzagc;
    int j = arrayOfPendingResult.length;
    int i = 0;
    while (i < j)
    {
      arrayOfPendingResult[i].cancel();
      i += 1;
    }
  }
  
  public final BatchResult createFailedResult(Status paramStatus)
  {
    return new BatchResult(paramStatus, zzagc);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.Batch
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */