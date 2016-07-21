package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.zzb;

final class PendingResults$zza
  extends zzb
{
  private final Result zzagx;
  
  public PendingResults$zza(Result paramResult)
  {
    super(Looper.getMainLooper());
    zzagx = paramResult;
  }
  
  protected final Result zzc(Status paramStatus)
  {
    if (paramStatus.getStatusCode() != zzagx.getStatus().getStatusCode()) {
      throw new UnsupportedOperationException("Creating failed results is not supported");
    }
    return zzagx;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.PendingResults.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */