package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.SessionDataSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SessionReadResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzj();
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaAG;
  private final List zzaBO;
  
  SessionReadResult(int paramInt, List paramList1, List paramList2, Status paramStatus)
  {
    mVersionCode = paramInt;
    zzaAG = paramList1;
    zzaBO = Collections.unmodifiableList(paramList2);
    zzUX = paramStatus;
  }
  
  public SessionReadResult(List paramList1, List paramList2, Status paramStatus)
  {
    mVersionCode = 3;
    zzaAG = paramList1;
    zzaBO = Collections.unmodifiableList(paramList2);
    zzUX = paramStatus;
  }
  
  public static SessionReadResult zzU(Status paramStatus)
  {
    return new SessionReadResult(new ArrayList(), new ArrayList(), paramStatus);
  }
  
  private boolean zzb(SessionReadResult paramSessionReadResult)
  {
    return (zzUX.equals(zzUX)) && (zzw.equal(zzaAG, zzaAG)) && (zzw.equal(zzaBO, zzaBO));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof SessionReadResult)) && (zzb((SessionReadResult)paramObject)));
  }
  
  public List getDataSet(Session paramSession)
  {
    zzx.zzb(zzaAG.contains(paramSession), "Attempting to read data for session %s which was not returned", new Object[] { paramSession });
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = zzaBO.iterator();
    while (localIterator.hasNext())
    {
      SessionDataSet localSessionDataSet = (SessionDataSet)localIterator.next();
      if (zzw.equal(paramSession, localSessionDataSet.getSession())) {
        localArrayList.add(localSessionDataSet.getDataSet());
      }
    }
    return localArrayList;
  }
  
  public List getDataSet(Session paramSession, DataType paramDataType)
  {
    zzx.zzb(zzaAG.contains(paramSession), "Attempting to read data for session %s which was not returned", new Object[] { paramSession });
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = zzaBO.iterator();
    while (localIterator.hasNext())
    {
      SessionDataSet localSessionDataSet = (SessionDataSet)localIterator.next();
      if ((zzw.equal(paramSession, localSessionDataSet.getSession())) && (paramDataType.equals(localSessionDataSet.getDataSet().getDataType()))) {
        localArrayList.add(localSessionDataSet.getDataSet());
      }
    }
    return localArrayList;
  }
  
  public List getSessions()
  {
    return zzaAG;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzUX, zzaAG, zzaBO });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("status", zzUX).zzg("sessions", zzaAG).zzg("sessionDataSets", zzaBO).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
  
  public List zzvp()
  {
    return zzaBO;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.SessionReadResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */