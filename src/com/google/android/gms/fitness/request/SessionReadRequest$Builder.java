package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionReadRequest$Builder
{
  private String zzLq;
  private long zzRD = 0L;
  private List zzaAF = new ArrayList();
  private boolean zzaAQ = false;
  private String zzaBu;
  private boolean zzaBv = false;
  private List zzaBw = new ArrayList();
  private long zzavV = 0L;
  private List zzawe = new ArrayList();
  
  public SessionReadRequest build()
  {
    if (zzRD > 0L)
    {
      bool = true;
      zzx.zzb(bool, "Invalid start time: %s", new Object[] { Long.valueOf(zzRD) });
      if ((zzavV <= 0L) || (zzavV <= zzRD)) {
        break label89;
      }
    }
    label89:
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Invalid end time: %s", new Object[] { Long.valueOf(zzavV) });
      return new SessionReadRequest(this, null);
      bool = false;
      break;
    }
  }
  
  public Builder enableServerQueries()
  {
    zzaAQ = true;
    return this;
  }
  
  public Builder excludePackage(String paramString)
  {
    zzx.zzb(paramString, "Attempting to use a null package name");
    if (!zzaBw.contains(paramString)) {
      zzaBw.add(paramString);
    }
    return this;
  }
  
  public Builder read(DataSource paramDataSource)
  {
    zzx.zzb(paramDataSource, "Attempting to add a null data source");
    if (!zzaAF.contains(paramDataSource)) {
      zzaAF.add(paramDataSource);
    }
    return this;
  }
  
  public Builder read(DataType paramDataType)
  {
    zzx.zzb(paramDataType, "Attempting to use a null data type");
    if (!zzawe.contains(paramDataType)) {
      zzawe.add(paramDataType);
    }
    return this;
  }
  
  public Builder readSessionsFromAllApps()
  {
    zzaBv = true;
    return this;
  }
  
  public Builder setSessionId(String paramString)
  {
    zzLq = paramString;
    return this;
  }
  
  public Builder setSessionName(String paramString)
  {
    zzaBu = paramString;
    return this;
  }
  
  public Builder setTimeInterval(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    zzRD = paramTimeUnit.toMillis(paramLong1);
    zzavV = paramTimeUnit.toMillis(paramLong2);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.SessionReadRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */