package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataSource.Builder;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.request.DataReadRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DataReadResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaBF;
  private int zzaBG;
  private final List zzaBH;
  private final List zzawg;
  private final List zzawq;
  
  DataReadResult(int paramInt1, List paramList1, Status paramStatus, List paramList2, int paramInt2, List paramList3, List paramList4)
  {
    mVersionCode = paramInt1;
    zzUX = paramStatus;
    zzaBG = paramInt2;
    zzawq = paramList3;
    zzaBH = paramList4;
    zzawg = new ArrayList(paramList1.size());
    paramList1 = paramList1.iterator();
    while (paramList1.hasNext())
    {
      paramStatus = (RawDataSet)paramList1.next();
      zzawg.add(new DataSet(paramStatus, paramList3));
    }
    zzaBF = new ArrayList(paramList2.size());
    paramList1 = paramList2.iterator();
    while (paramList1.hasNext())
    {
      paramStatus = (RawBucket)paramList1.next();
      zzaBF.add(new Bucket(paramStatus, paramList3));
    }
  }
  
  public DataReadResult(List paramList1, List paramList2, Status paramStatus)
  {
    mVersionCode = 5;
    zzawg = paramList1;
    zzUX = paramStatus;
    zzaBF = paramList2;
    zzaBG = 1;
    zzawq = new ArrayList();
    zzaBH = new ArrayList();
  }
  
  public static DataReadResult zza(Status paramStatus, DataReadRequest paramDataReadRequest)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = paramDataReadRequest.getDataSources().iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.add(DataSet.create((DataSource)((Iterator)localObject).next()));
    }
    paramDataReadRequest = paramDataReadRequest.getDataTypes().iterator();
    while (paramDataReadRequest.hasNext())
    {
      localObject = (DataType)paramDataReadRequest.next();
      localArrayList.add(DataSet.create(new DataSource.Builder().setDataType((DataType)localObject).setType(1).setName("Default").build()));
    }
    return new DataReadResult(localArrayList, Collections.emptyList(), paramStatus);
  }
  
  private void zza(Bucket paramBucket, List paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (Bucket)localIterator.next();
      if (paramList.zzb(paramBucket))
      {
        paramBucket = paramBucket.getDataSets().iterator();
        while (paramBucket.hasNext()) {
          zza((DataSet)paramBucket.next(), paramList.getDataSets());
        }
      }
    }
    zzaBF.add(paramBucket);
  }
  
  private void zza(DataSet paramDataSet, List paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      DataSet localDataSet = (DataSet)localIterator.next();
      if (localDataSet.getDataSource().equals(paramDataSet.getDataSource()))
      {
        localDataSet.zzb(paramDataSet.getDataPoints());
        return;
      }
    }
    paramList.add(paramDataSet);
  }
  
  private boolean zzc(DataReadResult paramDataReadResult)
  {
    return (zzUX.equals(zzUX)) && (zzw.equal(zzawg, zzawg)) && (zzw.equal(zzaBF, zzaBF));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DataReadResult)) && (zzc((DataReadResult)paramObject)));
  }
  
  public List getBuckets()
  {
    return zzaBF;
  }
  
  public DataSet getDataSet(DataSource paramDataSource)
  {
    Iterator localIterator = zzawg.iterator();
    while (localIterator.hasNext())
    {
      DataSet localDataSet = (DataSet)localIterator.next();
      if (paramDataSource.equals(localDataSet.getDataSource())) {
        return localDataSet;
      }
    }
    return DataSet.create(paramDataSource);
  }
  
  public DataSet getDataSet(DataType paramDataType)
  {
    Iterator localIterator = zzawg.iterator();
    while (localIterator.hasNext())
    {
      DataSet localDataSet = (DataSet)localIterator.next();
      if (paramDataType.equals(localDataSet.getDataType())) {
        return localDataSet;
      }
    }
    return DataSet.create(new DataSource.Builder().setDataType(paramDataType).setType(1).build());
  }
  
  public List getDataSets()
  {
    return zzawg;
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
    return zzw.hashCode(new Object[] { zzUX, zzawg, zzaBF });
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this).zzg("status", zzUX);
    if (zzawg.size() > 5)
    {
      localObject = zzawg.size() + " data sets";
      localzza = localzza.zzg("dataSets", localObject);
      if (zzaBF.size() <= 5) {
        break label123;
      }
    }
    label123:
    for (Object localObject = zzaBF.size() + " buckets";; localObject = zzaBF)
    {
      return localzza.zzg("buckets", localObject).toString();
      localObject = zzawg;
      break;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public void zzb(DataReadResult paramDataReadResult)
  {
    Iterator localIterator = paramDataReadResult.getDataSets().iterator();
    while (localIterator.hasNext()) {
      zza((DataSet)localIterator.next(), zzawg);
    }
    paramDataReadResult = paramDataReadResult.getBuckets().iterator();
    while (paramDataReadResult.hasNext()) {
      zza((Bucket)paramDataReadResult.next(), zzaBF);
    }
  }
  
  List zzul()
  {
    return zzawq;
  }
  
  public int zzvj()
  {
    return zzaBG;
  }
  
  List zzvk()
  {
    ArrayList localArrayList = new ArrayList(zzaBF.size());
    Iterator localIterator = zzaBF.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(new RawBucket((Bucket)localIterator.next(), zzawq, zzaBH));
    }
    return localArrayList;
  }
  
  List zzvl()
  {
    ArrayList localArrayList = new ArrayList(zzawg.size());
    Iterator localIterator = zzawg.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(new RawDataSet((DataSet)localIterator.next(), zzawq, zzaBH));
    }
    return localArrayList;
  }
  
  List zzvm()
  {
    return zzaBH;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.DataReadResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */