package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

class zzpe$2
  extends zzod.zza
{
  zzpe$2(zzpe paramzzpe, GoogleApiClient paramGoogleApiClient, DataType paramDataType)
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
    ((zzoo)paramzzod.zzqJ()).zza(new ListSubscriptionsRequest(zzaAa, localzza));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpe.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */