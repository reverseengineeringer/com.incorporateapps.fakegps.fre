package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zznw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class DataSet
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zze();
  private final int mVersionCode;
  private final DataType zzavT;
  private final DataSource zzavU;
  private boolean zzawi = false;
  private final List zzawp;
  private final List zzawq;
  
  DataSet(int paramInt, DataSource paramDataSource, DataType paramDataType, List paramList1, List paramList2, boolean paramBoolean)
  {
    mVersionCode = paramInt;
    zzavU = paramDataSource;
    zzavT = paramDataSource.getDataType();
    zzawi = paramBoolean;
    zzawp = new ArrayList(paramList1.size());
    if (paramInt >= 2) {}
    for (;;)
    {
      zzawq = paramList2;
      paramDataSource = paramList1.iterator();
      while (paramDataSource.hasNext())
      {
        paramDataType = (RawDataPoint)paramDataSource.next();
        zzawp.add(new DataPoint(zzawq, paramDataType));
      }
      paramList2 = Collections.singletonList(paramDataSource);
    }
  }
  
  public DataSet(DataSource paramDataSource)
  {
    mVersionCode = 3;
    zzavU = ((DataSource)zzx.zzz(paramDataSource));
    zzavT = paramDataSource.getDataType();
    zzawp = new ArrayList();
    zzawq = new ArrayList();
    zzawq.add(zzavU);
  }
  
  public DataSet(RawDataSet paramRawDataSet, List paramList)
  {
    mVersionCode = 3;
    zzavU = ((DataSource)zzb(paramList, zzaxg));
    zzavT = zzavU.getDataType();
    zzawq = paramList;
    zzawi = zzawi;
    paramRawDataSet = zzaxj;
    zzawp = new ArrayList(paramRawDataSet.size());
    paramRawDataSet = paramRawDataSet.iterator();
    while (paramRawDataSet.hasNext())
    {
      paramList = (RawDataPoint)paramRawDataSet.next();
      zzawp.add(new DataPoint(zzawq, paramList));
    }
  }
  
  public static DataSet create(DataSource paramDataSource)
  {
    zzx.zzb(paramDataSource, "DataSource should be specified");
    return new DataSet(paramDataSource);
  }
  
  private boolean zza(DataSet paramDataSet)
  {
    return (zzw.equal(getDataType(), paramDataSet.getDataType())) && (zzw.equal(zzavU, zzavU)) && (zzw.equal(zzawp, zzawp)) && (zzawi == zzawi);
  }
  
  private static Object zzb(List paramList, int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < paramList.size())) {
      return paramList.get(paramInt);
    }
    return null;
  }
  
  public final void add(DataPoint paramDataPoint)
  {
    DataSource localDataSource = paramDataPoint.getDataSource();
    zzx.zzb(localDataSource.getStreamIdentifier().equals(zzavU.getStreamIdentifier()), "Conflicting data sources found %s vs %s", new Object[] { localDataSource, zzavU });
    paramDataPoint.zzui();
    zznw.zze(paramDataPoint);
    zzb(paramDataPoint);
  }
  
  public final void addAll(Iterable paramIterable)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      add((DataPoint)paramIterable.next());
    }
  }
  
  public final DataPoint createDataPoint()
  {
    return DataPoint.create(zzavU);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof DataSet)) && (zza((DataSet)paramObject)));
  }
  
  public final List getDataPoints()
  {
    return Collections.unmodifiableList(zzawp);
  }
  
  public final DataSource getDataSource()
  {
    return zzavU;
  }
  
  public final DataType getDataType()
  {
    return zzavU.getDataType();
  }
  
  final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzavU });
  }
  
  public final boolean isEmpty()
  {
    return zzawp.isEmpty();
  }
  
  public final String toString()
  {
    Object localObject = zzuk();
    String str = zzavU.toDebugString();
    if (zzawp.size() < 10) {}
    for (;;)
    {
      return String.format("DataSet{%s %s}", new Object[] { str, localObject });
      localObject = String.format("%d data points, first 5: %s", new Object[] { Integer.valueOf(zzawp.size()), ((List)localObject).subList(0, 5) });
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public final void zzb(DataPoint paramDataPoint)
  {
    zzawp.add(paramDataPoint);
    paramDataPoint = paramDataPoint.getOriginalDataSource();
    if ((paramDataPoint != null) && (!zzawq.contains(paramDataPoint))) {
      zzawq.add(paramDataPoint);
    }
  }
  
  public final void zzb(Iterable paramIterable)
  {
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      zzb((DataPoint)paramIterable.next());
    }
  }
  
  public final boolean zzuc()
  {
    return zzawi;
  }
  
  final List zzuk()
  {
    return zzv(zzawq);
  }
  
  final List zzul()
  {
    return zzawq;
  }
  
  final List zzv(List paramList)
  {
    ArrayList localArrayList = new ArrayList(zzawp.size());
    Iterator localIterator = zzawp.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(new RawDataPoint((DataPoint)localIterator.next(), paramList));
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.DataSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */