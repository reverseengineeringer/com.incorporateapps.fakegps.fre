package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ParcelableTransferPreferences
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbn();
  final int mVersionCode;
  final int zzarG;
  final int zzarH;
  final boolean zzasA;
  
  ParcelableTransferPreferences(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    mVersionCode = paramInt1;
    zzarG = paramInt2;
    zzarH = paramInt3;
    zzasA = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbn.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.ParcelableTransferPreferences
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */