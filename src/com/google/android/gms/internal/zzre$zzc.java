package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult;

abstract class zzre$zzc
  extends zzrb
{
  protected zzrc zzbgC = new zzre.zzc.1(this);
  
  public zzre$zzc(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected SafetyNetApi.SafeBrowsingResult zzbi(Status paramStatus)
  {
    return new zzre.zzd(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzre.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */