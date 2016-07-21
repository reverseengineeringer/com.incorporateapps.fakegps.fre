package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;

abstract class zzql$zzb
  extends zzql.zza
{
  private zzql$zzb(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Connections.StartAdvertisingResult zzbc(Status paramStatus)
  {
    return new zzql.zzb.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzql.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */