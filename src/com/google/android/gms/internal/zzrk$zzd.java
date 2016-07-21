package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;
import com.google.android.gms.search.SearchAuthApi.GoogleNowAuthResult;

class zzrk$zzd
  implements SearchAuthApi.GoogleNowAuthResult
{
  private final Status zzUX;
  private final GoogleNowAuthState zzbgO;
  
  zzrk$zzd(Status paramStatus, GoogleNowAuthState paramGoogleNowAuthState)
  {
    zzUX = paramStatus;
    zzbgO = paramGoogleNowAuthState;
  }
  
  public GoogleNowAuthState getGoogleNowAuthState()
  {
    return zzbgO;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrk.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */