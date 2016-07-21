package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class RawDataPoint
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzo();
  final int mVersionCode;
  public final long zzawj;
  public final long zzawk;
  public final Value[] zzawl;
  public final long zzawn;
  public final long zzawo;
  public final int zzaxg;
  public final int zzaxh;
  
  public RawDataPoint(int paramInt1, long paramLong1, long paramLong2, Value[] paramArrayOfValue, int paramInt2, int paramInt3, long paramLong3, long paramLong4)
  {
    mVersionCode = paramInt1;
    zzawj = paramLong1;
    zzawk = paramLong2;
    zzaxg = paramInt2;
    zzaxh = paramInt3;
    zzawn = paramLong3;
    zzawo = paramLong4;
    zzawl = paramArrayOfValue;
  }
  
  RawDataPoint(DataPoint paramDataPoint, List paramList)
  {
    mVersionCode = 4;
    zzawj = paramDataPoint.getTimestamp(TimeUnit.NANOSECONDS);
    zzawk = paramDataPoint.getStartTime(TimeUnit.NANOSECONDS);
    zzawl = paramDataPoint.zzuf();
    zzaxg = zzt.zza(paramDataPoint.getDataSource(), paramList);
    zzaxh = zzt.zza(paramDataPoint.getOriginalDataSource(), paramList);
    zzawn = paramDataPoint.zzug();
    zzawo = paramDataPoint.zzuh();
  }
  
  private boolean zza(RawDataPoint paramRawDataPoint)
  {
    return (zzawj == zzawj) && (zzawk == zzawk) && (Arrays.equals(zzawl, zzawl)) && (zzaxg == zzaxg) && (zzaxh == zzaxh) && (zzawn == zzawn);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof RawDataPoint)) && (zza((RawDataPoint)paramObject)));
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Long.valueOf(zzawj), Long.valueOf(zzawk) });
  }
  
  public final String toString()
  {
    return String.format("RawDataPoint{%s@[%s, %s](%d,%d)}", new Object[] { Arrays.toString(zzawl), Long.valueOf(zzawk), Long.valueOf(zzawj), Integer.valueOf(zzaxg), Integer.valueOf(zzaxh) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.data.RawDataPoint
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */