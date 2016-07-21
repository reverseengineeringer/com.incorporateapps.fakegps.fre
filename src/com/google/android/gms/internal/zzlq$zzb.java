package com.google.android.gms.internal;

import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zza;

abstract class zzlq$zzb
  extends zza.zza
{
  public zzlq$zzb(zzlq paramzzlq, GoogleApiClient paramGoogleApiClient)
  {
    super(zzlq.zzc(paramzzlq), paramGoogleApiClient);
  }
  
  protected CastRemoteDisplay.CastRemoteDisplaySessionResult zzt(Status paramStatus)
  {
    return new zzlq.zzc(paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlq.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */