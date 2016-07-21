package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataType;

public class StartBleScanRequest$Builder
{
  private DataType[] zzaAY = new DataType[0];
  private zzq zzaBA;
  private int zzaBB = 10;
  
  public StartBleScanRequest build()
  {
    if (zzaBA != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Must set BleScanCallback");
      return new StartBleScanRequest(this, null);
    }
  }
  
  public Builder setBleScanCallback(BleScanCallback paramBleScanCallback)
  {
    zza(zza.zza.zzuJ().zza(paramBleScanCallback));
    return this;
  }
  
  public Builder setDataTypes(DataType... paramVarArgs)
  {
    zzaAY = paramVarArgs;
    return this;
  }
  
  public Builder setTimeoutSecs(int paramInt)
  {
    boolean bool2 = true;
    if (paramInt > 0)
    {
      bool1 = true;
      zzx.zzb(bool1, "Stop time must be greater than zero");
      if (paramInt > 60) {
        break label40;
      }
    }
    label40:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zzb(bool1, "Stop time must be less than 1 minute");
      zzaBB = paramInt;
      return this;
      bool1 = false;
      break;
    }
  }
  
  public Builder zza(zzq paramzzq)
  {
    zzaBA = paramzzq;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.StartBleScanRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */