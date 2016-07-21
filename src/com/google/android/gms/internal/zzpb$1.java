package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.result.DataTypeResult;

class zzpb$1
  extends zzoa.zza
{
  zzpb$1(zzpb paramzzpb, GoogleApiClient paramGoogleApiClient, DataTypeCreateRequest paramDataTypeCreateRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected DataTypeResult zzJ(Status paramStatus)
  {
    return DataTypeResult.zzS(paramStatus);
  }
  
  protected void zza(zzoa paramzzoa)
  {
    zzpb.zza localzza = new zzpb.zza(this, null);
    ((zzol)paramzzoa.zzqJ()).zza(new DataTypeCreateRequest(zzazR, localzza));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpb.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */