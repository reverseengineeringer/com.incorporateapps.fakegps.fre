package com.google.android.gms.fitness.service;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.internal.service.FitnessDataSourcesRequest;
import com.google.android.gms.fitness.internal.service.FitnessUnregistrationRequest;
import com.google.android.gms.fitness.internal.service.zzc.zza;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzow;

class FitnessSensorService$zza
  extends zzc.zza
{
  private final FitnessSensorService zzaBQ;
  
  private FitnessSensorService$zza(FitnessSensorService paramFitnessSensorService)
  {
    zzaBQ = paramFitnessSensorService;
  }
  
  public void zza(FitnessDataSourcesRequest paramFitnessDataSourcesRequest, zzoi paramzzoi)
  {
    zzaBQ.zzvr();
    paramzzoi.zza(new DataSourcesResult(zzaBQ.onFindDataSources(paramFitnessDataSourcesRequest.getDataTypes()), Status.zzagC));
  }
  
  public void zza(FitnessUnregistrationRequest paramFitnessUnregistrationRequest, zzow paramzzow)
  {
    zzaBQ.zzvr();
    if (zzaBQ.onUnregister(paramFitnessUnregistrationRequest.getDataSource()))
    {
      paramzzow.zzp(Status.zzagC);
      return;
    }
    paramzzow.zzp(new Status(13));
  }
  
  public void zza(FitnessSensorServiceRequest paramFitnessSensorServiceRequest, zzow paramzzow)
  {
    zzaBQ.zzvr();
    if (zzaBQ.onRegister(paramFitnessSensorServiceRequest))
    {
      paramzzow.zzp(Status.zzagC);
      return;
    }
    paramzzow.zzp(new Status(13));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.service.FitnessSensorService.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */