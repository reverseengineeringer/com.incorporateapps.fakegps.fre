package com.google.android.gms.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.SensorsApi;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.data.zzl;
import com.google.android.gms.fitness.data.zzl.zza;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRequest;

public class zzpf
  implements SensorsApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, zzk paramzzk, PendingIntent paramPendingIntent, zzpf.zza paramzza)
  {
    return paramGoogleApiClient.zzb(new zzpf.4(this, paramGoogleApiClient, paramzza, paramzzk, paramPendingIntent));
  }
  
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, zzk paramzzk, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.zza(new zzpf.2(this, paramGoogleApiClient, paramSensorRequest, paramzzk, paramPendingIntent));
  }
  
  public PendingResult add(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, PendingIntent paramPendingIntent)
  {
    return zza(paramGoogleApiClient, paramSensorRequest, null, paramPendingIntent);
  }
  
  public PendingResult add(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, OnDataPointListener paramOnDataPointListener)
  {
    return zza(paramGoogleApiClient, paramSensorRequest, zzl.zza.zzuu().zza(paramOnDataPointListener), null);
  }
  
  public PendingResult findDataSources(GoogleApiClient paramGoogleApiClient, DataSourcesRequest paramDataSourcesRequest)
  {
    return paramGoogleApiClient.zza(new zzpf.1(this, paramGoogleApiClient, paramDataSourcesRequest));
  }
  
  public PendingResult remove(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return zza(paramGoogleApiClient, null, paramPendingIntent, null);
  }
  
  public PendingResult remove(GoogleApiClient paramGoogleApiClient, OnDataPointListener paramOnDataPointListener)
  {
    zzl localzzl = zzl.zza.zzuu().zzb(paramOnDataPointListener);
    if (localzzl == null) {
      return PendingResults.zza(Status.zzagC, paramGoogleApiClient);
    }
    return zza(paramGoogleApiClient, localzzl, null, new zzpf.3(this, paramOnDataPointListener));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */