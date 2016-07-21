package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DataSourcesResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zze();
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaAF;
  
  DataSourcesResult(int paramInt, List paramList, Status paramStatus)
  {
    mVersionCode = paramInt;
    zzaAF = Collections.unmodifiableList(paramList);
    zzUX = paramStatus;
  }
  
  public DataSourcesResult(List paramList, Status paramStatus)
  {
    mVersionCode = 3;
    zzaAF = Collections.unmodifiableList(paramList);
    zzUX = paramStatus;
  }
  
  public static DataSourcesResult zzR(Status paramStatus)
  {
    return new DataSourcesResult(Collections.emptyList(), paramStatus);
  }
  
  private boolean zzb(DataSourcesResult paramDataSourcesResult)
  {
    return (zzUX.equals(zzUX)) && (zzw.equal(zzaAF, zzaAF));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DataSourcesResult)) && (zzb((DataSourcesResult)paramObject)));
  }
  
  public List getDataSources()
  {
    return zzaAF;
  }
  
  public List getDataSources(DataType paramDataType)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = zzaAF.iterator();
    while (localIterator.hasNext())
    {
      DataSource localDataSource = (DataSource)localIterator.next();
      if (localDataSource.getDataType().equals(paramDataType)) {
        localArrayList.add(localDataSource);
      }
    }
    return Collections.unmodifiableList(localArrayList);
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
    return zzw.hashCode(new Object[] { zzUX, zzaAF });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("status", zzUX).zzg("dataSets", zzaAF).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.DataSourcesResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */