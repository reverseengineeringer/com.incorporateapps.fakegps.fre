package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzoh;
import com.google.android.gms.internal.zzoh.zza;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataReadRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzf();
  public static final int NO_LIMIT = 0;
  private final int mVersionCode;
  private final long zzRD;
  private final List zzaAF;
  private final List zzaAK;
  private final List zzaAL;
  private final long zzaAM;
  private final DataSource zzaAN;
  private final int zzaAO;
  private final boolean zzaAP;
  private final boolean zzaAQ;
  private final zzoh zzaAR;
  private final List zzaAS;
  private final long zzavV;
  private final List zzawe;
  private final int zzawh;
  
  DataReadRequest(int paramInt1, List paramList1, List paramList2, long paramLong1, long paramLong2, List paramList3, List paramList4, int paramInt2, long paramLong3, DataSource paramDataSource, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, IBinder paramIBinder, List paramList5)
  {
    mVersionCode = paramInt1;
    zzawe = paramList1;
    zzaAF = paramList2;
    zzRD = paramLong1;
    zzavV = paramLong2;
    zzaAK = paramList3;
    zzaAL = paramList4;
    zzawh = paramInt2;
    zzaAM = paramLong3;
    zzaAN = paramDataSource;
    zzaAO = paramInt3;
    zzaAP = paramBoolean1;
    zzaAQ = paramBoolean2;
    if (paramIBinder == null) {}
    for (paramList1 = null;; paramList1 = zzoh.zza.zzbC(paramIBinder))
    {
      zzaAR = paramList1;
      paramList1 = paramList5;
      if (paramList5 == null) {
        paramList1 = Collections.emptyList();
      }
      zzaAS = paramList1;
      return;
    }
  }
  
  private DataReadRequest(DataReadRequest.Builder paramBuilder)
  {
    this(DataReadRequest.Builder.zza(paramBuilder), DataReadRequest.Builder.zzb(paramBuilder), DataReadRequest.Builder.zzc(paramBuilder), DataReadRequest.Builder.zzd(paramBuilder), DataReadRequest.Builder.zze(paramBuilder), DataReadRequest.Builder.zzf(paramBuilder), DataReadRequest.Builder.zzg(paramBuilder), DataReadRequest.Builder.zzh(paramBuilder), DataReadRequest.Builder.zzi(paramBuilder), DataReadRequest.Builder.zzj(paramBuilder), DataReadRequest.Builder.zzk(paramBuilder), DataReadRequest.Builder.zzl(paramBuilder), null, DataReadRequest.Builder.zzm(paramBuilder));
  }
  
  public DataReadRequest(DataReadRequest paramDataReadRequest, zzoh paramzzoh)
  {
    this(zzawe, zzaAF, zzRD, zzavV, zzaAK, zzaAL, zzawh, zzaAM, zzaAN, zzaAO, zzaAP, zzaAQ, paramzzoh, zzaAS);
  }
  
  public DataReadRequest(List paramList1, List paramList2, long paramLong1, long paramLong2, List paramList3, List paramList4, int paramInt1, long paramLong3, DataSource paramDataSource, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, zzoh paramzzoh, List paramList5) {}
  
  private boolean zzb(DataReadRequest paramDataReadRequest)
  {
    return (zzawe.equals(zzawe)) && (zzaAF.equals(zzaAF)) && (zzRD == zzRD) && (zzavV == zzavV) && (zzawh == zzawh) && (zzaAL.equals(zzaAL)) && (zzaAK.equals(zzaAK)) && (zzw.equal(zzaAN, zzaAN)) && (zzaAM == zzaAM) && (zzaAQ == zzaAQ);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DataReadRequest)) && (zzb((DataReadRequest)paramObject)));
  }
  
  public DataSource getActivityDataSource()
  {
    return zzaAN;
  }
  
  public List getAggregatedDataSources()
  {
    return zzaAL;
  }
  
  public List getAggregatedDataTypes()
  {
    return zzaAK;
  }
  
  public long getBucketDuration(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzaAM, TimeUnit.MILLISECONDS);
  }
  
  public int getBucketType()
  {
    return zzawh;
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaAR == null) {
      return null;
    }
    return zzaAR.asBinder();
  }
  
  public List getDataSources()
  {
    return zzaAF;
  }
  
  public List getDataTypes()
  {
    return zzawe;
  }
  
  public long getEndTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzavV, TimeUnit.MILLISECONDS);
  }
  
  public int getLimit()
  {
    return zzaAO;
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
    return zzw.hashCode(new Object[] { Integer.valueOf(zzawh), Long.valueOf(zzRD), Long.valueOf(zzavV) });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataReadRequest{");
    Iterator localIterator;
    if (!zzawe.isEmpty())
    {
      localIterator = zzawe.iterator();
      while (localIterator.hasNext()) {
        localStringBuilder.append(((DataType)localIterator.next()).zzuo()).append(" ");
      }
    }
    if (!zzaAF.isEmpty())
    {
      localIterator = zzaAF.iterator();
      while (localIterator.hasNext()) {
        localStringBuilder.append(((DataSource)localIterator.next()).toDebugString()).append(" ");
      }
    }
    if (zzawh != 0)
    {
      localStringBuilder.append("bucket by ").append(Bucket.zzeM(zzawh));
      if (zzaAM > 0L) {
        localStringBuilder.append(" >").append(zzaAM).append("ms");
      }
      localStringBuilder.append(": ");
    }
    if (!zzaAK.isEmpty())
    {
      localIterator = zzaAK.iterator();
      while (localIterator.hasNext()) {
        localStringBuilder.append(((DataType)localIterator.next()).zzuo()).append(" ");
      }
    }
    if (!zzaAL.isEmpty())
    {
      localIterator = zzaAL.iterator();
      while (localIterator.hasNext()) {
        localStringBuilder.append(((DataSource)localIterator.next()).toDebugString()).append(" ");
      }
    }
    localStringBuilder.append(String.format("(%tF %tT - %tF %tT)", new Object[] { Long.valueOf(zzRD), Long.valueOf(zzRD), Long.valueOf(zzavV), Long.valueOf(zzavV) }));
    if (zzaAN != null) {
      localStringBuilder.append("activities: ").append(zzaAN.toDebugString());
    }
    if (zzaAQ) {
      localStringBuilder.append(" +server");
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public long zzlO()
  {
    return zzRD;
  }
  
  public boolean zzuP()
  {
    return zzaAQ;
  }
  
  public boolean zzuQ()
  {
    return zzaAP;
  }
  
  public long zzuR()
  {
    return zzaAM;
  }
  
  public List zzuS()
  {
    return zzaAS;
  }
  
  public long zzud()
  {
    return zzavV;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataReadRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */