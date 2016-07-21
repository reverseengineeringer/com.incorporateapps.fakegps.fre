package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataDeleteRequest$Builder
{
  private long zzRD;
  private List zzaAF = new ArrayList();
  private List zzaAG = new ArrayList();
  private boolean zzaAH = false;
  private boolean zzaAI = false;
  private long zzavV;
  private List zzawe = new ArrayList();
  
  private void zzuN()
  {
    if (zzaAG.isEmpty()) {
      return;
    }
    Iterator localIterator = zzaAG.iterator();
    label23:
    Session localSession;
    if (localIterator.hasNext())
    {
      localSession = (Session)localIterator.next();
      if ((localSession.getStartTime(TimeUnit.MILLISECONDS) < zzRD) || (localSession.getEndTime(TimeUnit.MILLISECONDS) > zzavV)) {
        break label111;
      }
    }
    label111:
    for (boolean bool = true;; bool = false)
    {
      zzx.zza(bool, "Session %s is outside the time interval [%d, %d]", new Object[] { localSession, Long.valueOf(zzRD), Long.valueOf(zzavV) });
      break label23;
      break;
    }
  }
  
  public Builder addDataSource(DataSource paramDataSource)
  {
    boolean bool2 = true;
    if (!zzaAH)
    {
      bool1 = true;
      zzx.zzb(bool1, "All data is already marked for deletion.  addDataSource() cannot be combined with deleteAllData()");
      if (paramDataSource == null) {
        break label60;
      }
    }
    label60:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zzb(bool1, "Must specify a valid data source");
      if (!zzaAF.contains(paramDataSource)) {
        zzaAF.add(paramDataSource);
      }
      return this;
      bool1 = false;
      break;
    }
  }
  
  public Builder addDataType(DataType paramDataType)
  {
    boolean bool2 = true;
    if (!zzaAH)
    {
      bool1 = true;
      zzx.zzb(bool1, "All data is already marked for deletion.  addDataType() cannot be combined with deleteAllData()");
      if (paramDataType == null) {
        break label60;
      }
    }
    label60:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zzb(bool1, "Must specify a valid data type");
      if (!zzawe.contains(paramDataType)) {
        zzawe.add(paramDataType);
      }
      return this;
      bool1 = false;
      break;
    }
  }
  
  public Builder addSession(Session paramSession)
  {
    boolean bool2 = true;
    if (!zzaAI)
    {
      bool1 = true;
      zzx.zzb(bool1, "All sessions already marked for deletion.  addSession() cannot be combined with deleteAllSessions()");
      if (paramSession == null) {
        break label67;
      }
      bool1 = true;
      label23:
      zzx.zzb(bool1, "Must specify a valid session");
      if (paramSession.getEndTime(TimeUnit.MILLISECONDS) <= 0L) {
        break label72;
      }
    }
    label67:
    label72:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zzb(bool1, "Cannot delete an ongoing session. Please stop the session prior to deleting it");
      zzaAG.add(paramSession);
      return this;
      bool1 = false;
      break;
      bool1 = false;
      break label23;
    }
  }
  
  public DataDeleteRequest build()
  {
    boolean bool2 = false;
    boolean bool1;
    int i;
    if ((zzRD > 0L) && (zzavV > zzRD))
    {
      bool1 = true;
      zzx.zza(bool1, "Must specify a valid time interval");
      if ((!zzaAH) && (zzaAF.isEmpty()) && (zzawe.isEmpty())) {
        break label124;
      }
      i = 1;
      label65:
      if ((!zzaAI) && (zzaAG.isEmpty())) {
        break label129;
      }
    }
    label124:
    label129:
    for (int j = 1;; j = 0)
    {
      if (i == 0)
      {
        bool1 = bool2;
        if (j == 0) {}
      }
      else
      {
        bool1 = true;
      }
      zzx.zza(bool1, "No data or session marked for deletion");
      zzuN();
      return new DataDeleteRequest(this, null);
      bool1 = false;
      break;
      i = 0;
      break label65;
    }
  }
  
  public Builder deleteAllData()
  {
    zzx.zzb(zzawe.isEmpty(), "Specific data type already added for deletion. deleteAllData() will delete all data types and cannot be combined with addDataType()");
    zzx.zzb(zzaAF.isEmpty(), "Specific data source already added for deletion. deleteAllData() will delete all data sources and cannot be combined with addDataSource()");
    zzaAH = true;
    return this;
  }
  
  public Builder deleteAllSessions()
  {
    zzx.zzb(zzaAG.isEmpty(), "Specific session already added for deletion. deleteAllData() will delete all sessions and cannot be combined with addSession()");
    zzaAI = true;
    return this;
  }
  
  public Builder setTimeInterval(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    if (paramLong1 > 0L)
    {
      bool = true;
      zzx.zzb(bool, "Invalid start time :%d", new Object[] { Long.valueOf(paramLong1) });
      if (paramLong2 <= paramLong1) {
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
 * Qualified Name:     com.google.android.gms.fitness.request.DataDeleteRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */