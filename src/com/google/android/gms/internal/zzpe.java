package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.RecordingApi;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.data.Subscription.zza;

public class zzpe
  implements RecordingApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, Subscription paramSubscription)
  {
    return paramGoogleApiClient.zza(new zzpe.3(this, paramGoogleApiClient, paramSubscription));
  }
  
  public PendingResult listSubscriptions(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zza(new zzpe.1(this, paramGoogleApiClient));
  }
  
  public PendingResult listSubscriptions(GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    return paramGoogleApiClient.zza(new zzpe.2(this, paramGoogleApiClient, paramDataType));
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, DataSource paramDataSource)
  {
    return zza(paramGoogleApiClient, new Subscription.zza().zzb(paramDataSource).zzuz());
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    return zza(paramGoogleApiClient, new Subscription.zza().zzb(paramDataType).zzuz());
  }
  
  public PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, DataSource paramDataSource)
  {
    return paramGoogleApiClient.zzb(new zzpe.5(this, paramGoogleApiClient, paramDataSource));
  }
  
  public PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    return paramGoogleApiClient.zzb(new zzpe.4(this, paramGoogleApiClient, paramDataType));
  }
  
  public PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, Subscription paramSubscription)
  {
    if (paramSubscription.getDataType() == null) {
      return unsubscribe(paramGoogleApiClient, paramSubscription.getDataSource());
    }
    return unsubscribe(paramGoogleApiClient, paramSubscription.getDataType());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */