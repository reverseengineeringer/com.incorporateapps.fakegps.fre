package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.WriteAwareParcelable;

public class OnListEntriesResponse
  extends WriteAwareParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbc();
  final int mVersionCode;
  final boolean zzaqJ;
  final DataHolder zzass;
  
  OnListEntriesResponse(int paramInt, DataHolder paramDataHolder, boolean paramBoolean)
  {
    mVersionCode = paramInt;
    zzass = paramDataHolder;
    zzaqJ = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  protected void zzJ(Parcel paramParcel, int paramInt)
  {
    zzbc.zza(this, paramParcel, paramInt);
  }
  
  public DataHolder zztt()
  {
    return zzass;
  }
  
  public boolean zztu()
  {
    return zzaqJ;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnListEntriesResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */