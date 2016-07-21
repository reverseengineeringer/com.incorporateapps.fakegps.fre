package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.Plus.zza;

abstract class zzqy$zza
  extends Plus.zza
{
  private zzqy$zza(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Moments.LoadMomentsResult zzbf(Status paramStatus)
  {
    return new zzqy.zza.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqy.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */