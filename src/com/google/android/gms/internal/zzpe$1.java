package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

class zzpe$1
  extends zzod.zza
{
  zzpe$1(zzpe paramzzpe, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected ListSubscriptionsResult zzM(Status paramStatus)
  {
    return ListSubscriptionsResult.zzT(paramStatus);
  }
  
  protected void zza(zzod paramzzod)
  {
    zzpe.zza localzza = new zzpe.zza(this, null);
    ((zzoo)paramzzod.zzqJ()).zza(new ListSubscriptionsRequest(null, localzza));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpe.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */