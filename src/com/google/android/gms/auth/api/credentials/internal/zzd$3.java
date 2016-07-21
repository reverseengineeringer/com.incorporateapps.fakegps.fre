package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class zzd$3
  extends zze
{
  zzd$3(zzd paramzzd, GoogleApiClient paramGoogleApiClient, Credential paramCredential)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(Context paramContext, zzj paramzzj)
  {
    paramzzj.zza(new zzd.zza(this), new DeleteRequest(zzWy));
  }
  
  protected Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.zzd.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */