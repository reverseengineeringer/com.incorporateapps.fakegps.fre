package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Collections;
import java.util.List;

public class FitnessDataSourcesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  private final int mVersionCode;
  private final List zzawe;
  
  FitnessDataSourcesRequest(int paramInt, List paramList)
  {
    mVersionCode = paramInt;
    zzawe = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public List getDataTypes()
  {
    return Collections.unmodifiableList(zzawe);
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("dataTypes", zzawe).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.internal.service.FitnessDataSourcesRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */