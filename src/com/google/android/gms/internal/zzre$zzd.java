package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult;

class zzre$zzd
  implements SafetyNetApi.SafeBrowsingResult
{
  private Status zzUX;
  private final SafeBrowsingData zzbgF;
  private String zzbgv;
  
  public zzre$zzd(Status paramStatus, SafeBrowsingData paramSafeBrowsingData)
  {
    zzUX = paramStatus;
    zzbgF = paramSafeBrowsingData;
    zzbgv = null;
    if (zzbgF != null) {
      zzbgv = zzbgF.getMetadata();
    }
    while (!zzUX.isSuccess()) {
      return;
    }
    zzUX = new Status(8);
  }
  
  public String getMetadata()
  {
    return zzbgv;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzre.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */