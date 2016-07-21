package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.zzb;

final class PendingResults$zzb
  extends zzb
{
  private final Result zzagy;
  
  public PendingResults$zzb(GoogleApiClient paramGoogleApiClient, Result paramResult)
  {
    super(paramGoogleApiClient);
    zzagy = paramResult;
  }
  
  protected final Result zzc(Status paramStatus)
  {
    return zzagy;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.PendingResults.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */