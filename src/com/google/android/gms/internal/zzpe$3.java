package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.request.SubscribeRequest;

class zzpe$3
  extends zzod.zzc
{
  zzpe$3(zzpe paramzzpe, GoogleApiClient paramGoogleApiClient, Subscription paramSubscription)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzod paramzzod)
  {
    zzph localzzph = new zzph(this);
    ((zzoo)paramzzod.zzqJ()).zza(new SubscribeRequest(zzaAf, false, localzzph));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpe.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */