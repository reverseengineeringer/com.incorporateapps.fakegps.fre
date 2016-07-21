package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;
import java.util.concurrent.TimeUnit;

public class DataUpdateRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzm();
  private final int mVersionCode;
  private final long zzRD;
  private final zzow zzaAD;
  private final long zzavV;
  private final DataSet zzaxn;
  
  DataUpdateRequest(int paramInt, long paramLong1, long paramLong2, DataSet paramDataSet, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzRD = paramLong1;
    zzavV = paramLong2;
    zzaxn = paramDataSet;
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  public DataUpdateRequest(long paramLong1, long paramLong2, DataSet paramDataSet, IBinder paramIBinder)
  {
    mVersionCode = 1;
    zzRD = paramLong1;
    zzavV = paramLong2;
    zzaxn = paramDataSet;
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  private DataUpdateRequest(DataUpdateRequest.Builder paramBuilder)
  {
    this(DataUpdateRequest.Builder.zza(paramBuilder), DataUpdateRequest.Builder.zzb(paramBuilder), DataUpdateRequest.Builder.zzc(paramBuilder), null);
  }
  
  public DataUpdateRequest(DataUpdateRequest paramDataUpdateRequest, IBinder paramIBinder)
  {
    this(paramDataUpdateRequest.zzlO(), paramDataUpdateRequest.zzud(), paramDataUpdateRequest.getDataSet(), paramIBinder);
  }
  
  private boolean zzb(DataUpdateRequest paramDataUpdateRequest)
  {
    return (zzRD == zzRD) && (zzavV == zzavV) && (zzw.equal(zzaxn, zzaxn));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof DataUpdateRequest)) && (zzb((DataUpdateRequest)paramObject)));
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaAD == null) {
      return null;
    }
    return zzaAD.asBinder();
  }
  
  public DataSet getDataSet()
  {
    return zzaxn;
  }
  
  public long getEndTime(TimeUnit paramTimeUnit)
  {
    return paramTimeUnit.convert(zzavV, TimeUnit.MILLISECONDS);
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
    return zzw.hashCode(new Object[] { Long.valueOf(zzRD), Long.valueOf(zzavV), zzaxn });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("startTimeMillis", Long.valueOf(zzRD)).zzg("endTimeMillis", Long.valueOf(zzavV)).zzg("dataSet", zzaxn).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
  
  public long zzlO()
  {
    return zzRD;
  }
  
  public long zzud()
  {
    return zzavV;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataUpdateRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */