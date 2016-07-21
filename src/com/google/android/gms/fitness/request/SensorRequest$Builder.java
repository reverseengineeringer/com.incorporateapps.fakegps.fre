package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.concurrent.TimeUnit;

public class SensorRequest$Builder
{
  private long zzaBk = 0L;
  private long zzaBl = 0L;
  private long zzaBq = Long.MAX_VALUE;
  private boolean zzaBr = false;
  private DataType zzavT;
  private DataSource zzavU;
  private long zzaxo = -1L;
  private int zzaxp = 2;
  
  public SensorRequest build()
  {
    boolean bool2 = false;
    if ((zzavU != null) || (zzavT != null)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      zzx.zza(bool1, "Must call setDataSource() or setDataType()");
      if ((zzavT != null) && (zzavU != null))
      {
        bool1 = bool2;
        if (!zzavT.equals(zzavU.getDataType())) {}
      }
      else
      {
        bool1 = true;
      }
      zzx.zza(bool1, "Specified data type is incompatible with specified data source");
      return new SensorRequest(this, null);
    }
  }
  
  public Builder setAccuracyMode(int paramInt)
  {
    zzaxp = SensorRequest.zzfB(paramInt);
    return this;
  }
  
  public Builder setDataSource(DataSource paramDataSource)
  {
    zzavU = paramDataSource;
    return this;
  }
  
  public Builder setDataType(DataType paramDataType)
  {
    zzavT = paramDataType;
    return this;
  }
  
  public Builder setFastestRate(int paramInt, TimeUnit paramTimeUnit)
  {
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Cannot use a negative interval");
      zzaBr = true;
      zzaBl = paramTimeUnit.toMicros(paramInt);
      return this;
    }
  }
  
  public Builder setMaxDeliveryLatency(int paramInt, TimeUnit paramTimeUnit)
  {
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Cannot use a negative delivery interval");
      zzaBk = paramTimeUnit.toMicros(paramInt);
      return this;
    }
  }
  
  public Builder setSamplingRate(long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramLong >= 0L) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Cannot use a negative sampling interval");
      zzaxo = paramTimeUnit.toMicros(paramLong);
      if (!zzaBr) {
        zzaBl = (zzaxo / 2L);
      }
      return this;
    }
  }
  
  public Builder setTimeout(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool2 = true;
    if (paramLong > 0L)
    {
      bool1 = true;
      zzx.zzb(bool1, "Invalid time out value specified: %d", new Object[] { Long.valueOf(paramLong) });
      if (paramTimeUnit == null) {
        break label62;
      }
    }
    label62:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zzb(bool1, "Invalid time unit specified");
      zzaBq = paramTimeUnit.toMicros(paramLong);
      return this;
      bool1 = false;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.SensorRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */