package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.Plus.zza;

abstract class zzqz$zza
  extends Plus.zza
{
  private zzqz$zza(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public People.LoadPeopleResult zzbg(Status paramStatus)
  {
    return new zzqz.zza.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqz.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */