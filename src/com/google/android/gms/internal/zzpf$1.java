package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;

class zzpf$1
  extends zzoe.zza
{
  zzpf$1(zzpf paramzzpf, GoogleApiClient paramGoogleApiClient, DataSourcesRequest paramDataSourcesRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected DataSourcesResult zzN(Status paramStatus)
  {
    return DataSourcesResult.zzR(paramStatus);
  }
  
  protected void zza(zzoe paramzzoe)
  {
    zzpf.zzb localzzb = new zzpf.zzb(this, null);
    ((zzop)paramzzoe.zzqJ()).zza(new DataSourcesRequest(zzaAh, localzzb));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpf.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */