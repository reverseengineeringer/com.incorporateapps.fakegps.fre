package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Bucket
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  public static final int TYPE_ACTIVITY_SEGMENT = 4;
  public static final int TYPE_ACTIVITY_TYPE = 3;
  public static final int TYPE_SESSION = 2;
  public static final int TYPE_TIME = 1;
  private final int mVersionCode;
  private final long zzRD;
  private final long zzavV;
  private final Session zzavX;
  private final int zzawf;
  private final List zzawg;
  private final int zzawh;
  private boolean zzawi = false;
  
  Bucket(int paramInt1, long paramLong1, long paramLong2, Session paramSession, int paramInt2, List paramList, int paramInt3, boolean paramBoolean)
  {
    mVersionCode = paramInt1;
    zzRD = paramLong1;
    zzavV = paramLong2;
    zzavX = paramSession;
    zzawf = paramInt2;
    zzawg = paramList;
    zzawh = paramInt3;
    zzawi = paramBoolean;
  }
  
  public Bucket(RawBucket paramRawBucket, List paramList)
  {
    this(2, zzRD, zzavV, zzavX, zzaxf, zza(zzawg, paramList), zzawh, zzawi);
  }
  
  private static List zza(Collection paramCollection, List paramList)
  {
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      localArrayList.add(new DataSet((RawDataSet)paramCollection.next(), paramList));
    }
    return localArrayList;
  }
  
  private boolean zza(Bucket paramBucket)
  {
    return (zzRD == zzRD) && (zzavV == zzavV) && (zzawf == zzawf) && (zzw.equal(zzawg, zzawg)) && (zzawh == zzawh) && (zzawi == zzawi);
  }
  
  public static String zzeM(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "bug";
    case 1: 
      return "time";
    case 3: 
      return "type";
    case 4: 
      return "segment";
    case 2: 
      return "session";
    }
    return "unknown";
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof Bucket)) && (zza((Bucket)paramObject)));
  }
  
  public String getActivity()
  {
    return FitnessActivities.getName(zzawf);
  }
  
  public int getBucketType()
  {
    return zzawh;
  }
  
  public DataSet getDataSet(DataType paramDataType)
  {
    Iterator localIterator = zzawg.iterator();
    while (localIterator.hasNext())
    {
      DataSet localDataSet = (DataSet)localIterator.next();
      if (localDataSet.getDataType().equals(paramDataType)) {
        return localDataSet;
      }
    }
    return null;
  }
  
  public List getDataSets()
  {
    return zzawg;
  }
  
  public long getEndTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzavV, TimeUnit.MILLISECONDS);
  }
  
  public Session getSession()
  {
    return zzavX;
  }
  
  public long getStartTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzRD, TimeUnit.MILLISECONDS);
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Long.valueOf(zzRD), Long.valueOf(zzavV), Integer.valueOf(zzawf), Integer.valueOf(zzawh) });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("startTime", Long.valueOf(zzRD)).zzg("endTime", Long.valueOf(zzavV)).zzg("activity", Integer.valueOf(zzawf)).zzg("dataSets", zzawg).zzg("bucketType", zzeM(zzawh)).zzg("serverHasMoreData", Boolean.valueOf(zzawi)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public boolean zzb(Bucket paramBucket)
  {
    return (zzRD == zzRD) && (zzavV == zzavV) && (zzawf == zzawf) && (zzawh == zzawh);
  }
  
  public long zzlO()
  {
    return zzRD;
  }
  
  public int zzub()
  {
    return zzawf;
  }
  
  public boolean zzuc()
  {
    if (zzawi) {
      return true;
    }
    Iterator localIterator = zzawg.iterator();
    while (localIterator.hasNext()) {
      if (((DataSet)localIterator.next()).zzuc()) {
        return true;
      }
    }
    return false;
  }
  
  public long zzud()
  {
    return zzavV;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.Bucket
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */