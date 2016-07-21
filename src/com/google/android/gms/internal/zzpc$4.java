package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.result.DataReadResult;

class zzpc$4
  extends zzob.zza
{
  zzpc$4(zzpc paramzzpc, GoogleApiClient paramGoogleApiClient, DataReadRequest paramDataReadRequest)
  {
    super(paramGoogleApiClient);
  }
  
  protected DataReadResult zzK(Status paramStatus)
  {
    return DataReadResult.zza(paramStatus, zzazZ);
  }
  
  protected void zza(zzob paramzzob)
  {
    zzpc.zza localzza = new zzpc.zza(this, null);
    ((zzom)paramzzob.zzqJ()).zza(new DataReadRequest(zzazZ, localzza));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpc.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */