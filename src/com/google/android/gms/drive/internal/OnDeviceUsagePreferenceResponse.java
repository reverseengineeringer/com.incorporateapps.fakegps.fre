package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnDeviceUsagePreferenceResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzax();
  final int mVersionCode;
  final FileUploadPreferencesImpl zzasg;
  
  OnDeviceUsagePreferenceResponse(int paramInt, FileUploadPreferencesImpl paramFileUploadPreferencesImpl)
  {
    mVersionCode = paramInt;
    zzasg = paramFileUploadPreferencesImpl;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzax.zza(this, paramParcel, paramInt);
  }
  
  public FileUploadPreferencesImpl zztp()
  {
    return zzasg;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */