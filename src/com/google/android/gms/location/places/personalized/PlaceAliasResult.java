package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class PlaceAliasResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  final int mVersionCode;
  private final Status zzUX;
  final PlaceUserData zzaRf;
  
  PlaceAliasResult(int paramInt, Status paramStatus, PlaceUserData paramPlaceUserData)
  {
    mVersionCode = paramInt;
    zzUX = paramStatus;
    zzaRf = paramPlaceUserData;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public PlaceUserData zzzC()
  {
    return zzaRf;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.personalized.PlaceAliasResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */