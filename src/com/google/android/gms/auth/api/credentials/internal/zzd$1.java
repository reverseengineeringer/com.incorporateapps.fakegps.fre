package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

class zzd$1
  extends zze
{
  zzd$1(zzd paramzzd, GoogleApiClient paramGoogleApiClient, CredentialRequest paramCredentialRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(Context paramContext, zzj paramzzj)
  {
    paramzzj.zza(new zzd.1.1(this), zzWv);
  }
  
  protected CredentialRequestResult zzi(Status paramStatus)
  {
    return zzc.zzh(paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.zzd.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */