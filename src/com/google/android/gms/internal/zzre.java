package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.safetynet.SafetyNetApi;
import java.util.List;

public class zzre
  implements SafetyNetApi
{
  public PendingResult attest(GoogleApiClient paramGoogleApiClient, byte[] paramArrayOfByte)
  {
    return paramGoogleApiClient.zza(new zzre.1(this, paramGoogleApiClient, paramArrayOfByte));
  }
  
  public PendingResult lookupUri(GoogleApiClient paramGoogleApiClient, List paramList, String paramString)
  {
    if (paramList == null) {
      throw new IllegalArgumentException("Null threatTypes in lookupUri");
    }
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Null or empty uri in lookupUri");
    }
    return paramGoogleApiClient.zza(new zzre.2(this, paramGoogleApiClient, paramList, paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzre
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */