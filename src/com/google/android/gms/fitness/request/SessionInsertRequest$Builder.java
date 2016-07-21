package com.google.android.gms.fitness.request;

import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zznw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionInsertRequest$Builder
{
  private List zzaBs = new ArrayList();
  private List zzaBt = new ArrayList();
  private Session zzavX;
  private List zzawg = new ArrayList();
  
  private void zzf(DataPoint paramDataPoint)
  {
    zzh(paramDataPoint);
    zzg(paramDataPoint);
  }
  
  private void zzg(DataPoint paramDataPoint)
  {
    long l3 = zzavX.getStartTime(TimeUnit.NANOSECONDS);
    long l4 = zzavX.getEndTime(TimeUnit.NANOSECONDS);
    long l5 = paramDataPoint.getStartTime(TimeUnit.NANOSECONDS);
    long l2 = paramDataPoint.getEndTime(TimeUnit.NANOSECONDS);
    TimeUnit localTimeUnit;
    long l1;
    if ((l5 != 0L) && (l2 != 0L))
    {
      localTimeUnit = TimeUnit.MILLISECONDS;
      l1 = l2;
      if (l2 > l4) {
        l1 = zzns.zza(l2, TimeUnit.NANOSECONDS, localTimeUnit);
      }
      if ((l5 < l3) || (l1 > l4)) {
        break label196;
      }
    }
    label196:
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Data point %s has start and end times outside session interval [%d, %d]", new Object[] { paramDataPoint, Long.valueOf(l3), Long.valueOf(l4) });
      if (l1 != paramDataPoint.getEndTime(TimeUnit.NANOSECONDS))
      {
        Log.w("Fitness", String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[] { Long.valueOf(paramDataPoint.getEndTime(TimeUnit.NANOSECONDS)), Long.valueOf(l1), localTimeUnit }));
        paramDataPoint.setTimeInterval(l5, l1, TimeUnit.NANOSECONDS);
      }
      return;
    }
  }
  
  private void zzh(DataPoint paramDataPoint)
  {
    long l3 = zzavX.getStartTime(TimeUnit.NANOSECONDS);
    long l4 = zzavX.getEndTime(TimeUnit.NANOSECONDS);
    long l2 = paramDataPoint.getTimestamp(TimeUnit.NANOSECONDS);
    TimeUnit localTimeUnit;
    long l1;
    if (l2 != 0L)
    {
      localTimeUnit = TimeUnit.MILLISECONDS;
      if (l2 >= l3)
      {
        l1 = l2;
        if (l2 <= l4) {}
      }
      else
      {
        l1 = zzns.zza(l2, TimeUnit.NANOSECONDS, localTimeUnit);
      }
      if ((l1 < l3) || (l1 > l4)) {
        break label185;
      }
    }
    label185:
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Data point %s has time stamp outside session interval [%d, %d]", new Object[] { paramDataPoint, Long.valueOf(l3), Long.valueOf(l4) });
      if (paramDataPoint.getTimestamp(TimeUnit.NANOSECONDS) != l1)
      {
        Log.w("Fitness", String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[] { Long.valueOf(paramDataPoint.getTimestamp(TimeUnit.NANOSECONDS)), Long.valueOf(l1), localTimeUnit }));
        paramDataPoint.setTimestamp(l1, TimeUnit.NANOSECONDS);
      }
      return;
    }
  }
  
  private void zzvd()
  {
    Iterator localIterator1 = zzawg.iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((DataSet)localIterator1.next()).getDataPoints().iterator();
      while (localIterator2.hasNext()) {
        zzf((DataPoint)localIterator2.next());
      }
    }
    localIterator1 = zzaBs.iterator();
    while (localIterator1.hasNext()) {
      zzf((DataPoint)localIterator1.next());
    }
  }
  
  public Builder addAggregateDataPoint(DataPoint paramDataPoint)
  {
    DataSource localDataSource;
    if (paramDataPoint != null)
    {
      bool = true;
      zzx.zzb(bool, "Must specify a valid aggregate data point.");
      localDataSource = paramDataPoint.getDataSource();
      if (zzaBt.contains(localDataSource)) {
        break label79;
      }
    }
    label79:
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Data set/Aggregate data point for this data source %s is already added.", new Object[] { localDataSource });
      zznw.zze(paramDataPoint);
      zzaBt.add(localDataSource);
      zzaBs.add(paramDataPoint);
      return this;
      bool = false;
      break;
    }
  }
  
  public Builder addDataSet(DataSet paramDataSet)
  {
    boolean bool2 = true;
    DataSource localDataSource;
    if (paramDataSet != null)
    {
      bool1 = true;
      zzx.zzb(bool1, "Must specify a valid data set.");
      localDataSource = paramDataSet.getDataSource();
      if (zzaBt.contains(localDataSource)) {
        break label101;
      }
      bool1 = true;
      label36:
      zzx.zza(bool1, "Data set for this data source %s is already added.", new Object[] { localDataSource });
      if (paramDataSet.getDataPoints().isEmpty()) {
        break label106;
      }
    }
    label101:
    label106:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zzb(bool1, "No data points specified in the input data set.");
      zzaBt.add(localDataSource);
      zzawg.add(paramDataSet);
      return this;
      bool1 = false;
      break;
      bool1 = false;
      break label36;
    }
  }
  
  public SessionInsertRequest build()
  {
    boolean bool2 = true;
    if (zzavX != null)
    {
      bool1 = true;
      zzx.zza(bool1, "Must specify a valid session.");
      if (zzavX.getEndTime(TimeUnit.MILLISECONDS) == 0L) {
        break label59;
      }
    }
    label59:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zza(bool1, "Must specify a valid end time, cannot insert a continuing session.");
      zzvd();
      return new SessionInsertRequest(this, null);
      bool1 = false;
      break;
    }
  }
  
  public Builder setSession(Session paramSession)
  {
    zzavX = paramSession;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.SessionInsertRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */