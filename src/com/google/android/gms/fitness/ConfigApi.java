package com.google.android.gms.fitness;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;

public abstract interface ConfigApi
{
  public abstract PendingResult createCustomDataType(GoogleApiClient paramGoogleApiClient, DataTypeCreateRequest paramDataTypeCreateRequest);
  
  public abstract PendingResult disableFit(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult readDataType(GoogleApiClient paramGoogleApiClient, String paramString);
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.ConfigApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */