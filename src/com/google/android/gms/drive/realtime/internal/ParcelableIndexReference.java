package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ParcelableIndexReference
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzr();
  final int mIndex;
  final int mVersionCode;
  final String zzauL;
  final boolean zzauM;
  final int zzauN;
  
  ParcelableIndexReference(int paramInt1, String paramString, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    mVersionCode = paramInt1;
    zzauL = paramString;
    mIndex = paramInt2;
    zzauM = paramBoolean;
    zzauN = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzr.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.ParcelableIndexReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */