package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class zzd$2
  extends zze
{
  zzd$2(zzd paramzzd, GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(Context paramContext, zzj paramzzj)
  {
    paramzzj.zza(new zzd.zza(this), new SaveRequest(zzWy));
  }
  
  protected Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.zzd.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */