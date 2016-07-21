package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

public class OpenFileIntentSenderRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbm();
  final int mVersionCode;
  final String zzapg;
  final String[] zzaph;
  final DriveId zzapj;
  final FilterHolder zzasz;
  
  OpenFileIntentSenderRequest(int paramInt, String paramString, String[] paramArrayOfString, DriveId paramDriveId, FilterHolder paramFilterHolder)
  {
    mVersionCode = paramInt;
    zzapg = paramString;
    zzaph = paramArrayOfString;
    zzapj = paramDriveId;
    zzasz = paramFilterHolder;
  }
  
  public OpenFileIntentSenderRequest(String paramString, String[] paramArrayOfString, DriveId paramDriveId, FilterHolder paramFilterHolder)
  {
    this(1, paramString, paramArrayOfString, paramDriveId, paramFilterHolder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbm.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OpenFileIntentSenderRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */