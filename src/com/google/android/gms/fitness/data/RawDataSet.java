package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.List;

public final class RawDataSet
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzp();
  final int mVersionCode;
  public final boolean zzawi;
  public final int zzaxg;
  public final int zzaxi;
  public final List zzaxj;
  
  public RawDataSet(int paramInt1, int paramInt2, int paramInt3, List paramList, boolean paramBoolean)
  {
    mVersionCode = paramInt1;
    zzaxg = paramInt2;
    zzaxi = paramInt3;
    zzaxj = paramList;
    zzawi = paramBoolean;
  }
  
  public RawDataSet(DataSet paramDataSet, List paramList1, List paramList2)
  {
    mVersionCode = 3;
    zzaxj = paramDataSet.zzv(paramList1);
    zzawi = paramDataSet.zzuc();
    zzaxg = zzt.zza(paramDataSet.getDataSource(), paramList1);
    zzaxi = zzt.zza(paramDataSet.getDataType(), paramList2);
  }
  
  private boolean zza(RawDataSet paramRawDataSet)
  {
    return (zzaxg == zzaxg) && (zzawi == zzawi) && (zzw.equal(zzaxj, zzaxj));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof RawDataSet)) && (zza((RawDataSet)paramObject)));
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(zzaxg) });
  }
  
  public final String toString()
  {
    return String.format("RawDataSet{%s@[%s]}", new Object[] { Integer.valueOf(zzaxg), zzaxj });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzp.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.RawDataSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */