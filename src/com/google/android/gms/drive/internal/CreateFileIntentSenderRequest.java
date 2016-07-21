package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFileIntentSenderRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzm();
  final int mVersionCode;
  final int zzaox;
  final String zzapg;
  final DriveId zzapj;
  final MetadataBundle zzaqw;
  final Integer zzaqx;
  
  CreateFileIntentSenderRequest(int paramInt1, MetadataBundle paramMetadataBundle, int paramInt2, String paramString, DriveId paramDriveId, Integer paramInteger)
  {
    mVersionCode = paramInt1;
    zzaqw = paramMetadataBundle;
    zzaox = paramInt2;
    zzapg = paramString;
    zzapj = paramDriveId;
    zzaqx = paramInteger;
  }
  
  public CreateFileIntentSenderRequest(MetadataBundle paramMetadataBundle, int paramInt1, String paramString, DriveId paramDriveId, int paramInt2)
  {
    this(1, paramMetadataBundle, paramInt1, paramString, paramDriveId, Integer.valueOf(paramInt2));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.CreateFileIntentSenderRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */