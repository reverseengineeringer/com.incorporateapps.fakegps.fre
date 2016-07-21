package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.zzr;
import com.google.android.gms.common.api.internal.zzv;
import com.google.android.gms.common.internal.zzx;

public final class PendingResults
{
  public static PendingResult canceledPendingResult()
  {
    zzv localzzv = new zzv(Looper.getMainLooper());
    localzzv.cancel();
    return localzzv;
  }
  
  public static PendingResult canceledPendingResult(Result paramResult)
  {
    zzx.zzb(paramResult, "Result must not be null");
    if (paramResult.getStatus().getStatusCode() == 16) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Status code must be CommonStatusCodes.CANCELED");
      paramResult = new PendingResults.zza(paramResult);
      paramResult.cancel();
      return paramResult;
    }
  }
  
  public static OptionalPendingResult immediatePendingResult(Result paramResult)
  {
    zzx.zzb(paramResult, "Result must not be null");
    PendingResults.zzc localzzc = new PendingResults.zzc(null);
    localzzc.zza(paramResult);
    return new zzr(localzzc);
  }
  
  public static PendingResult immediatePendingResult(Status paramStatus)
  {
    zzx.zzb(paramStatus, "Result must not be null");
    zzv localzzv = new zzv(Looper.getMainLooper());
    localzzv.zza(paramStatus);
    return localzzv;
  }
  
  public static PendingResult zza(Result paramResult, GoogleApiClient paramGoogleApiClient)
  {
    zzx.zzb(paramResult, "Result must not be null");
    if (!paramResult.getStatus().isSuccess()) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Status code must not be SUCCESS");
      paramGoogleApiClient = new PendingResults.zzb(paramGoogleApiClient, paramResult);
      paramGoogleApiClient.zza(paramResult);
      return paramGoogleApiClient;
    }
  }
  
  public static PendingResult zza(Status paramStatus, GoogleApiClient paramGoogleApiClient)
  {
    zzx.zzb(paramStatus, "Result must not be null");
    paramGoogleApiClient = new zzv(paramGoogleApiClient);
    paramGoogleApiClient.zza(paramStatus);
    return paramGoogleApiClient;
  }
  
  public static OptionalPendingResult zzb(Result paramResult, GoogleApiClient paramGoogleApiClient)
  {
    zzx.zzb(paramResult, "Result must not be null");
    paramGoogleApiClient = new PendingResults.zzc(paramGoogleApiClient);
    paramGoogleApiClient.zza(paramResult);
    return new zzr(paramGoogleApiClient);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.PendingResults
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */