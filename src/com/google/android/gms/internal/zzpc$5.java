package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;

class zzpc$5
  extends zzob.zza
{
  zzpc$5(zzpc paramzzpc, GoogleApiClient paramGoogleApiClient, DataType paramDataType)
  {
    super(paramGoogleApiClient);
  }
  
  protected DailyTotalResult zzL(Status paramStatus)
  {
    return DailyTotalResult.zza(paramStatus, zzaAa);
  }
  
  protected void zza(zzob paramzzob)
  {
    DailyTotalRequest localDailyTotalRequest = new DailyTotalRequest(new zzpc.5.1(this), zzaAa);
    ((zzom)paramzzob.zzqJ()).zza(localDailyTotalRequest);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpc.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */