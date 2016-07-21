package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.WriteAwareParcelable;

public class OnListParentsResponse
  extends WriteAwareParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbd();
  final int mVersionCode;
  final DataHolder zzast;
  
  OnListParentsResponse(int paramInt, DataHolder paramDataHolder)
  {
    mVersionCode = paramInt;
    zzast = paramDataHolder;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  protected void zzJ(Parcel paramParcel, int paramInt)
  {
    zzbd.zza(this, paramParcel, paramInt);
  }
  
  public DataHolder zztv()
  {
    return zzast;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnListParentsResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */