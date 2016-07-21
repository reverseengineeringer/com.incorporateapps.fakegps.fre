package com.google.android.gms.fitness.internal.service;

import android.os.IInterface;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzow;

public abstract interface zzc
  extends IInterface
{
  public abstract void zza(FitnessDataSourcesRequest paramFitnessDataSourcesRequest, zzoi paramzzoi);
  
  public abstract void zza(FitnessUnregistrationRequest paramFitnessUnregistrationRequest, zzow paramzzow);
  
  public abstract void zza(FitnessSensorServiceRequest paramFitnessSensorServiceRequest, zzow paramzzow);
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.internal.service.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */