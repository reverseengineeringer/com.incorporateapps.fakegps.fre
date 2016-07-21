package com.google.android.gms.fitness;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;

public abstract interface HistoryApi
{
  public abstract PendingResult deleteData(GoogleApiClient paramGoogleApiClient, DataDeleteRequest paramDataDeleteRequest);
  
  public abstract PendingResult insertData(GoogleApiClient paramGoogleApiClient, DataSet paramDataSet);
  
  public abstract PendingResult readDailyTotal(GoogleApiClient paramGoogleApiClient, DataType paramDataType);
  
  public abstract PendingResult readData(GoogleApiClient paramGoogleApiClient, DataReadRequest paramDataReadRequest);
  
  public abstract PendingResult updateData(GoogleApiClient paramGoogleApiClient, DataUpdateRequest paramDataUpdateRequest);
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.HistoryApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */