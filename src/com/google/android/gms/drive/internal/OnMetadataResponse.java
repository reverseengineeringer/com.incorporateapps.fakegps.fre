package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class OnMetadataResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbe();
  final int mVersionCode;
  final MetadataBundle zzaqw;
  
  OnMetadataResponse(int paramInt, MetadataBundle paramMetadataBundle)
  {
    mVersionCode = paramInt;
    zzaqw = paramMetadataBundle;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbe.zza(this, paramParcel, paramInt);
  }
  
  public MetadataBundle zztw()
  {
    return zzaqw;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnMetadataResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */