package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafetyNetApi.AttestationResult;

abstract class zzre$zzb
  extends zzrb
{
  protected zzrc zzbgC = new zzre.zzb.1(this);
  
  public zzre$zzb(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected SafetyNetApi.AttestationResult zzbh(Status paramStatus)
  {
    return new zzre.zza(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzre.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */