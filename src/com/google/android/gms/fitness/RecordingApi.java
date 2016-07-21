package com.google.android.gms.fitness;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;

public abstract interface RecordingApi
{
  public abstract PendingResult listSubscriptions(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult listSubscriptions(GoogleApiClient paramGoogleApiClient, DataType paramDataType);
  
  public abstract PendingResult subscribe(GoogleApiClient paramGoogleApiClient, DataSource paramDataSource);
  
  public abstract PendingResult subscribe(GoogleApiClient paramGoogleApiClient, DataType paramDataType);
  
  public abstract PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, DataSource paramDataSource);
  
  public abstract PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, DataType paramDataType);
  
  public abstract PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, Subscription paramSubscription);
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.RecordingApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */