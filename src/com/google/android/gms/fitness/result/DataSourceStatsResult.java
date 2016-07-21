package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

public class DataSourceStatsResult
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzd();
  final int mVersionCode;
  public final long zzUZ;
  public final boolean zzaBI;
  public final long zzaBJ;
  public final long zzaBK;
  public final DataSource zzavU;
  
  DataSourceStatsResult(int paramInt, DataSource paramDataSource, long paramLong1, boolean paramBoolean, long paramLong2, long paramLong3)
  {
    mVersionCode = paramInt;
    zzavU = paramDataSource;
    zzUZ = paramLong1;
    zzaBI = paramBoolean;
    zzaBJ = paramLong2;
    zzaBK = paramLong3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.DataSourceStatsResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */