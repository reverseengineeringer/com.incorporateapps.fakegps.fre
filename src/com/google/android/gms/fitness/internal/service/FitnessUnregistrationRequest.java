package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

public class FitnessUnregistrationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private final int mVersionCode;
  private final DataSource zzavU;
  
  FitnessUnregistrationRequest(int paramInt, DataSource paramDataSource)
  {
    mVersionCode = paramInt;
    zzavU = paramDataSource;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public DataSource getDataSource()
  {
    return zzavU;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public String toString()
  {
    return String.format("ApplicationUnregistrationRequest{%s}", new Object[] { zzavU });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.internal.service.FitnessUnregistrationRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */