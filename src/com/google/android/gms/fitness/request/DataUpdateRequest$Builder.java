package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataUpdateRequest$Builder
{
  private long zzRD;
  private long zzavV;
  private DataSet zzaxn;
  
  private void zzuV()
  {
    zzx.zza(zzRD, "Must set a non-zero value for startTimeMillis/startTime");
    zzx.zza(zzavV, "Must set a non-zero value for endTimeMillis/endTime");
    zzx.zzb(zzaxn, "Must set the data set");
    Iterator localIterator = zzaxn.getDataPoints().iterator();
    if (localIterator.hasNext())
    {
      DataPoint localDataPoint = (DataPoint)localIterator.next();
      long l1 = localDataPoint.getStartTime(TimeUnit.MILLISECONDS);
      long l2 = localDataPoint.getEndTime(TimeUnit.MILLISECONDS);
      int i;
      if ((l1 > l2) || ((l1 != 0L) && (l1 < zzRD)) || ((l1 != 0L) && (l1 > zzavV)) || (l2 > zzavV) || (l2 < zzRD))
      {
        i = 1;
        label144:
        if (i != 0) {
          break label205;
        }
      }
      label205:
      for (boolean bool = true;; bool = false)
      {
        zzx.zza(bool, "Data Point's startTimeMillis %d, endTimeMillis %d should lie between timeRange provided in the request. StartTimeMillis %d, EndTimeMillis: %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(zzRD), Long.valueOf(zzavV) });
        break;
        i = 0;
        break label144;
      }
    }
  }
  
  public DataUpdateRequest build()
  {
    zzuV();
    return new DataUpdateRequest(this, null);
  }
  
  public Builder setDataSet(DataSet paramDataSet)
  {
    zzx.zzb(paramDataSet, "Must set the data set");
    zzaxn = paramDataSet;
    return this;
  }
  
  public Builder setTimeInterval(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    if (paramLong1 > 0L)
    {
      bool = true;
      zzx.zzb(bool, "Invalid start time :%d", new Object[] { Long.valueOf(paramLong1) });
      if (paramLong2 < paramLong1) {
        break label82;
      }
    }
    label82:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Invalid end time :%d", new Object[] { Long.valueOf(paramLong2) });
      zzRD = paramTimeUnit.toMillis(paramLong1);
      zzavV = paramTimeUnit.toMillis(paramLong2);
      return this;
      bool = false;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataUpdateRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */