package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DataReadRequest$Builder
{
  private long zzRD;
  private List zzaAF = new ArrayList();
  private List zzaAK = new ArrayList();
  private List zzaAL = new ArrayList();
  private long zzaAM = 0L;
  private DataSource zzaAN;
  private int zzaAO = 0;
  private boolean zzaAP = false;
  private boolean zzaAQ = false;
  private List zzaAS = new ArrayList();
  private long zzavV;
  private List zzawe = new ArrayList();
  private int zzawh = 0;
  
  public Builder aggregate(DataSource paramDataSource, DataType paramDataType)
  {
    zzx.zzb(paramDataSource, "Attempting to add a null data source");
    if (!zzaAF.contains(paramDataSource)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Cannot add the same data source for aggregated and detailed");
      DataType localDataType = paramDataSource.getDataType();
      zzx.zzb(DataType.AGGREGATE_INPUT_TYPES.contains(localDataType), "Unsupported input data type specified for aggregation: %s", new Object[] { localDataType });
      zzx.zzb(DataType.getAggregatesForInput(localDataType).contains(paramDataType), "Invalid output aggregate data type specified: %s -> %s", new Object[] { localDataType, paramDataType });
      if (!zzaAL.contains(paramDataSource)) {
        zzaAL.add(paramDataSource);
      }
      return this;
    }
  }
  
  public Builder aggregate(DataType paramDataType1, DataType paramDataType2)
  {
    zzx.zzb(paramDataType1, "Attempting to use a null data type");
    if (!zzawe.contains(paramDataType1)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Cannot add the same data type as aggregated and detailed");
      zzx.zzb(DataType.AGGREGATE_INPUT_TYPES.contains(paramDataType1), "Unsupported input data type specified for aggregation: %s", new Object[] { paramDataType1 });
      zzx.zzb(DataType.getAggregatesForInput(paramDataType1).contains(paramDataType2), "Invalid output aggregate data type specified: %s -> %s", new Object[] { paramDataType1, paramDataType2 });
      if (!zzaAK.contains(paramDataType1)) {
        zzaAK.add(paramDataType1);
      }
      return this;
    }
  }
  
  public Builder bucketByActivitySegment(int paramInt, TimeUnit paramTimeUnit)
  {
    if (zzawh == 0)
    {
      bool = true;
      zzx.zzb(bool, "Bucketing strategy already set to %s", new Object[] { Integer.valueOf(zzawh) });
      if (paramInt <= 0) {
        break label74;
      }
    }
    label74:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Must specify a valid minimum duration for an activity segment: %d", new Object[] { Integer.valueOf(paramInt) });
      zzawh = 4;
      zzaAM = paramTimeUnit.toMillis(paramInt);
      return this;
      bool = false;
      break;
    }
  }
  
  public Builder bucketByActivitySegment(int paramInt, TimeUnit paramTimeUnit, DataSource paramDataSource)
  {
    if (zzawh == 0)
    {
      bool = true;
      zzx.zzb(bool, "Bucketing strategy already set to %s", new Object[] { Integer.valueOf(zzawh) });
      if (paramInt <= 0) {
        break label121;
      }
      bool = true;
      label38:
      zzx.zzb(bool, "Must specify a valid minimum duration for an activity segment: %d", new Object[] { Integer.valueOf(paramInt) });
      if (paramDataSource == null) {
        break label127;
      }
    }
    label121:
    label127:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Invalid activity data source specified");
      zzx.zzb(paramDataSource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[] { paramDataSource });
      zzaAN = paramDataSource;
      zzawh = 4;
      zzaAM = paramTimeUnit.toMillis(paramInt);
      return this;
      bool = false;
      break;
      bool = false;
      break label38;
    }
  }
  
  public Builder bucketByActivityType(int paramInt, TimeUnit paramTimeUnit)
  {
    if (zzawh == 0)
    {
      bool = true;
      zzx.zzb(bool, "Bucketing strategy already set to %s", new Object[] { Integer.valueOf(zzawh) });
      if (paramInt <= 0) {
        break label74;
      }
    }
    label74:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Must specify a valid minimum duration for an activity segment: %d", new Object[] { Integer.valueOf(paramInt) });
      zzawh = 3;
      zzaAM = paramTimeUnit.toMillis(paramInt);
      return this;
      bool = false;
      break;
    }
  }
  
  public Builder bucketByActivityType(int paramInt, TimeUnit paramTimeUnit, DataSource paramDataSource)
  {
    if (zzawh == 0)
    {
      bool = true;
      zzx.zzb(bool, "Bucketing strategy already set to %s", new Object[] { Integer.valueOf(zzawh) });
      if (paramInt <= 0) {
        break label121;
      }
      bool = true;
      label38:
      zzx.zzb(bool, "Must specify a valid minimum duration for an activity segment: %d", new Object[] { Integer.valueOf(paramInt) });
      if (paramDataSource == null) {
        break label127;
      }
    }
    label121:
    label127:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Invalid activity data source specified");
      zzx.zzb(paramDataSource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[] { paramDataSource });
      zzaAN = paramDataSource;
      zzawh = 3;
      zzaAM = paramTimeUnit.toMillis(paramInt);
      return this;
      bool = false;
      break;
      bool = false;
      break label38;
    }
  }
  
  public Builder bucketBySession(int paramInt, TimeUnit paramTimeUnit)
  {
    if (zzawh == 0)
    {
      bool = true;
      zzx.zzb(bool, "Bucketing strategy already set to %s", new Object[] { Integer.valueOf(zzawh) });
      if (paramInt <= 0) {
        break label74;
      }
    }
    label74:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Must specify a valid minimum duration for an activity segment: %d", new Object[] { Integer.valueOf(paramInt) });
      zzawh = 2;
      zzaAM = paramTimeUnit.toMillis(paramInt);
      return this;
      bool = false;
      break;
    }
  }
  
  public Builder bucketByTime(int paramInt, TimeUnit paramTimeUnit)
  {
    if (zzawh == 0)
    {
      bool = true;
      zzx.zzb(bool, "Bucketing strategy already set to %s", new Object[] { Integer.valueOf(zzawh) });
      if (paramInt <= 0) {
        break label74;
      }
    }
    label74:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Must specify a valid minimum duration for an activity segment: %d", new Object[] { Integer.valueOf(paramInt) });
      zzawh = 1;
      zzaAM = paramTimeUnit.toMillis(paramInt);
      return this;
      bool = false;
      break;
    }
  }
  
  public DataReadRequest build()
  {
    boolean bool2 = true;
    label69:
    label112:
    int i;
    if ((!zzaAF.isEmpty()) || (!zzawe.isEmpty()) || (!zzaAL.isEmpty()) || (!zzaAK.isEmpty()))
    {
      bool1 = true;
      zzx.zza(bool1, "Must add at least one data source (aggregated or detailed)");
      if (zzRD <= 0L) {
        break label205;
      }
      bool1 = true;
      zzx.zza(bool1, "Invalid start time: %s", new Object[] { Long.valueOf(zzRD) });
      if ((zzavV <= 0L) || (zzavV <= zzRD)) {
        break label210;
      }
      bool1 = true;
      zzx.zza(bool1, "Invalid end time: %s", new Object[] { Long.valueOf(zzavV) });
      if ((!zzaAL.isEmpty()) || (!zzaAK.isEmpty())) {
        break label215;
      }
      i = 1;
      label158:
      if (i != 0)
      {
        bool1 = bool2;
        if (zzawh == 0) {}
      }
      else
      {
        if ((i != 0) || (zzawh == 0)) {
          break label220;
        }
      }
    }
    label205:
    label210:
    label215:
    label220:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zza(bool1, "Must specify a valid bucketing strategy while requesting aggregation");
      return new DataReadRequest(this, null);
      bool1 = false;
      break;
      bool1 = false;
      break label69;
      bool1 = false;
      break label112;
      i = 0;
      break label158;
    }
  }
  
  public Builder enableServerQueries()
  {
    zzaAQ = true;
    return this;
  }
  
  public Builder read(DataSource paramDataSource)
  {
    zzx.zzb(paramDataSource, "Attempting to add a null data source");
    if (!zzaAL.contains(paramDataSource)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Cannot add the same data source as aggregated and detailed");
      if (!zzaAF.contains(paramDataSource)) {
        zzaAF.add(paramDataSource);
      }
      return this;
    }
  }
  
  public Builder read(DataType paramDataType)
  {
    zzx.zzb(paramDataType, "Attempting to use a null data type");
    if (!zzaAK.contains(paramDataType)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Cannot add the same data type as aggregated and detailed");
      if (!zzawe.contains(paramDataType)) {
        zzawe.add(paramDataType);
      }
      return this;
    }
  }
  
  public Builder setLimit(int paramInt)
  {
    if (paramInt > 0) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Invalid limit %d is specified", new Object[] { Integer.valueOf(paramInt) });
      zzaAO = paramInt;
      return this;
    }
  }
  
  public Builder setTimeRange(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    zzRD = paramTimeUnit.toMillis(paramLong1);
    zzavV = paramTimeUnit.toMillis(paramLong2);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataReadRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */