package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.HistoryApi;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import java.util.List;

public class zzpc
  implements HistoryApi
{
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, DataSet paramDataSet, boolean paramBoolean)
  {
    zzx.zzb(paramDataSet, "Must set the data set");
    if (!paramDataSet.getDataPoints().isEmpty()) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Cannot use an empty data set");
      zzx.zzb(paramDataSet.getDataSource().zzum(), "Must set the app package name for the data source");
      return paramGoogleApiClient.zza(new zzpc.1(this, paramGoogleApiClient, paramDataSet, paramBoolean));
    }
  }
  
  public PendingResult deleteData(GoogleApiClient paramGoogleApiClient, DataDeleteRequest paramDataDeleteRequest)
  {
    return paramGoogleApiClient.zza(new zzpc.2(this, paramGoogleApiClient, paramDataDeleteRequest));
  }
  
  public PendingResult insertData(GoogleApiClient paramGoogleApiClient, DataSet paramDataSet)
  {
    return zza(paramGoogleApiClient, paramDataSet, false);
  }
  
  public PendingResult readDailyTotal(GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    return paramGoogleApiClient.zza(new zzpc.5(this, paramGoogleApiClient, paramDataType));
  }
  
  public PendingResult readData(GoogleApiClient paramGoogleApiClient, DataReadRequest paramDataReadRequest)
  {
    return paramGoogleApiClient.zza(new zzpc.4(this, paramGoogleApiClient, paramDataReadRequest));
  }
  
  public PendingResult updateData(GoogleApiClient paramGoogleApiClient, DataUpdateRequest paramDataUpdateRequest)
  {
    zzx.zzb(paramDataUpdateRequest.getDataSet(), "Must set the data set");
    zzx.zza(paramDataUpdateRequest.zzlO(), "Must set a non-zero value for startTimeMillis/startTime");
    zzx.zza(paramDataUpdateRequest.zzud(), "Must set a non-zero value for endTimeMillis/endTime");
    return paramGoogleApiClient.zza(new zzpc.3(this, paramGoogleApiClient, paramDataUpdateRequest));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */