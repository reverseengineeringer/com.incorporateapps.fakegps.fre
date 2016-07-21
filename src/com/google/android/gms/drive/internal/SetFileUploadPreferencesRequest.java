package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SetFileUploadPreferencesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbr();
  final int mVersionCode;
  final FileUploadPreferencesImpl zzasg;
  
  SetFileUploadPreferencesRequest(int paramInt, FileUploadPreferencesImpl paramFileUploadPreferencesImpl)
  {
    mVersionCode = paramInt;
    zzasg = paramFileUploadPreferencesImpl;
  }
  
  public SetFileUploadPreferencesRequest(FileUploadPreferencesImpl paramFileUploadPreferencesImpl)
  {
    this(1, paramFileUploadPreferencesImpl);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbr.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */