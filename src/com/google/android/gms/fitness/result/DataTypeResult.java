package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataType;

public class DataTypeResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzg();
  private final int mVersionCode;
  private final Status zzUX;
  private final DataType zzavT;
  
  DataTypeResult(int paramInt, Status paramStatus, DataType paramDataType)
  {
    mVersionCode = paramInt;
    zzUX = paramStatus;
    zzavT = paramDataType;
  }
  
  public DataTypeResult(Status paramStatus, DataType paramDataType)
  {
    mVersionCode = 2;
    zzUX = paramStatus;
    zzavT = paramDataType;
  }
  
  public static DataTypeResult zzS(Status paramStatus)
  {
    return new DataTypeResult(paramStatus, null);
  }
  
  private boolean zzb(DataTypeResult paramDataTypeResult)
  {
    return (zzUX.equals(zzUX)) && (zzw.equal(zzavT, zzavT));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof DataTypeResult)) && (zzb((DataTypeResult)paramObject)));
  }
  
  public DataType getDataType()
  {
    return zzavT;
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
    return zzw.hashCode(new Object[] { zzUX, zzavT });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("status", zzUX).zzg("dataType", zzavT).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.DataTypeResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */