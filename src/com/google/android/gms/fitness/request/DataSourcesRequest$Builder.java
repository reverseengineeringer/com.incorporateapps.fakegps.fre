package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataType;

public class DataSourcesRequest$Builder
{
  private boolean zzaAW = false;
  private DataType[] zzaAY = new DataType[0];
  private int[] zzaAZ = { 0, 1 };
  
  public DataSourcesRequest build()
  {
    boolean bool2 = true;
    if (zzaAY.length > 0)
    {
      bool1 = true;
      zzx.zza(bool1, "Must add at least one data type");
      if (zzaAZ.length <= 0) {
        break label49;
      }
    }
    label49:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zza(bool1, "Must add at least one data source type");
      return new DataSourcesRequest(this, null);
      bool1 = false;
      break;
    }
  }
  
  public Builder setDataSourceTypes(int... paramVarArgs)
  {
    zzaAZ = paramVarArgs;
    return this;
  }
  
  public Builder setDataTypes(DataType... paramVarArgs)
  {
    zzaAY = paramVarArgs;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataSourcesRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */