package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SetPinnedDownloadPreferencesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbs();
  final int mVersionCode;
  final ParcelableTransferPreferences zzasu;
  
  SetPinnedDownloadPreferencesRequest(int paramInt, ParcelableTransferPreferences paramParcelableTransferPreferences)
  {
    mVersionCode = paramInt;
    zzasu = paramParcelableTransferPreferences;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbs.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.SetPinnedDownloadPreferencesRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */