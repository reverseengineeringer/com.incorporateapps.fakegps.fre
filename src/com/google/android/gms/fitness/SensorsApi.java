package com.google.android.gms.fitness;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRequest;

public abstract interface SensorsApi
{
  public abstract PendingResult add(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, PendingIntent paramPendingIntent);
  
  public abstract PendingResult add(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, OnDataPointListener paramOnDataPointListener);
  
  public abstract PendingResult findDataSources(GoogleApiClient paramGoogleApiClient, DataSourcesRequest paramDataSourcesRequest);
  
  public abstract PendingResult remove(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);
  
  public abstract PendingResult remove(GoogleApiClient paramGoogleApiClient, OnDataPointListener paramOnDataPointListener);
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.SensorsApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */