package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.ConfigApi;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;

public class zzpb
  implements ConfigApi
{
  public PendingResult createCustomDataType(GoogleApiClient paramGoogleApiClient, DataTypeCreateRequest paramDataTypeCreateRequest)
  {
    return paramGoogleApiClient.zzb(new zzpb.1(this, paramGoogleApiClient, paramDataTypeCreateRequest));
  }
  
  public PendingResult disableFit(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zzb(new zzpb.3(this, paramGoogleApiClient));
  }
  
  public PendingResult readDataType(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zza(new zzpb.2(this, paramGoogleApiClient, paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */