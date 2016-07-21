package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafetyNetApi.AttestationResult;

class zzre$zza
  implements SafetyNetApi.AttestationResult
{
  private final Status zzUX;
  private final AttestationData zzbgB;
  
  public zzre$zza(Status paramStatus, AttestationData paramAttestationData)
  {
    zzUX = paramStatus;
    zzbgB = paramAttestationData;
  }
  
  public String getJwsResult()
  {
    if (zzbgB == null) {
      return null;
    }
    return zzbgB.getJwsResult();
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzre.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */