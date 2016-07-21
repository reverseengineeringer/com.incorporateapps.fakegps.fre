package com.google.android.gms.safetynet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.List;

public abstract interface SafetyNetApi
{
  public abstract PendingResult attest(GoogleApiClient paramGoogleApiClient, byte[] paramArrayOfByte);
  
  public abstract PendingResult lookupUri(GoogleApiClient paramGoogleApiClient, List paramList, String paramString);
}

/* Location:
 * Qualified Name:     com.google.android.gms.safetynet.SafetyNetApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */