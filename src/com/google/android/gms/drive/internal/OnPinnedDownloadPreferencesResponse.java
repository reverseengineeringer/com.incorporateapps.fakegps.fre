package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnPinnedDownloadPreferencesResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbf();
  final int mVersionCode;
  final ParcelableTransferPreferences zzasu;
  
  OnPinnedDownloadPreferencesResponse(int paramInt, ParcelableTransferPreferences paramParcelableTransferPreferences)
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
    zzbf.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnPinnedDownloadPreferencesResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */