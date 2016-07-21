package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class DataStatsResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzf();
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaBL;
  
  DataStatsResult(int paramInt, Status paramStatus, List paramList)
  {
    mVersionCode = paramInt;
    zzUX = paramStatus;
    zzaBL = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  List zzvn()
  {
    return zzaBL;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.result.DataStatsResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */