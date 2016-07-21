package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class RawBucket
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzn();
  final int mVersionCode;
  public final long zzRD;
  public final long zzavV;
  public final Session zzavX;
  public final List zzawg;
  public final int zzawh;
  public final boolean zzawi;
  public final int zzaxf;
  
  public RawBucket(int paramInt1, long paramLong1, long paramLong2, Session paramSession, int paramInt2, List paramList, int paramInt3, boolean paramBoolean)
  {
    mVersionCode = paramInt1;
    zzRD = paramLong1;
    zzavV = paramLong2;
    zzavX = paramSession;
    zzaxf = paramInt2;
    zzawg = paramList;
    zzawh = paramInt3;
    zzawi = paramBoolean;
  }
  
  public RawBucket(Bucket paramBucket, List paramList1, List paramList2)
  {
    mVersionCode = 2;
    zzRD = paramBucket.getStartTime(TimeUnit.MILLISECONDS);
    zzavV = paramBucket.getEndTime(TimeUnit.MILLISECONDS);
    zzavX = paramBucket.getSession();
    zzaxf = paramBucket.zzub();
    zzawh = paramBucket.getBucketType();
    zzawi = paramBucket.zzuc();
    paramBucket = paramBucket.getDataSets();
    zzawg = new ArrayList(paramBucket.size());
    paramBucket = paramBucket.iterator();
    while (paramBucket.hasNext())
    {
      DataSet localDataSet = (DataSet)paramBucket.next();
      zzawg.add(new RawDataSet(localDataSet, paramList1, paramList2));
    }
  }
  
  private boolean zza(RawBucket paramRawBucket)
  {
    return (zzRD == zzRD) && (zzavV == zzavV) && (zzaxf == zzaxf) && (zzw.equal(zzawg, zzawg)) && (zzawh == zzawh) && (zzawi == zzawi);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof RawBucket)) && (zza((RawBucket)paramObject)));
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Long.valueOf(zzRD), Long.valueOf(zzavV), Integer.valueOf(zzawh) });
  }
  
  public final String toString()
  {
    return zzw.zzy(this).zzg("startTime", Long.valueOf(zzRD)).zzg("endTime", Long.valueOf(zzavV)).zzg("activity", Integer.valueOf(zzaxf)).zzg("dataSets", zzawg).zzg("bucketType", Integer.valueOf(zzawh)).zzg("serverHasMoreData", Boolean.valueOf(zzawi)).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.RawBucket
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */