package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource.Builder;
import com.google.android.gms.fitness.data.DataType;

public class DailyTotalResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private final int mVersionCode;
  private final Status zzUX;
  private final DataSet zzaxn;
  
  DailyTotalResult(int paramInt, Status paramStatus, DataSet paramDataSet)
  {
    mVersionCode = paramInt;
    zzUX = paramStatus;
    zzaxn = paramDataSet;
  }
  
  public DailyTotalResult(DataSet paramDataSet, Status paramStatus)
  {
    mVersionCode = 1;
    zzUX = paramStatus;
    zzaxn = paramDataSet;
  }
  
  public static DailyTotalResult zza(Status paramStatus, DataType paramDataType)
  {
    return new DailyTotalResult(DataSet.create(new DataSource.Builder().setDataType(paramDataType).setType(1).build()), paramStatus);
  }
  
  private boolean zzb(DailyTotalResult paramDailyTotalResult)
  {
    return (zzUX.equals(zzUX)) && (zzw.equal(zzaxn, zzaxn));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DailyTotalResult)) && (zzb((DailyTotalResult)paramObject)));
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  public DataSet getTotal()
  {
    return zzaxn;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzUX, zzaxn });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("status", zzUX).zzg("dataPoint", zzaxn).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.DailyTotalResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */