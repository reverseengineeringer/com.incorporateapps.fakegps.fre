package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class CloseContentsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzi();
  final int mVersionCode;
  final Contents zzaql;
  final int zzaqn;
  final Boolean zzaqp;
  
  CloseContentsRequest(int paramInt1, Contents paramContents, Boolean paramBoolean, int paramInt2)
  {
    mVersionCode = paramInt1;
    zzaql = paramContents;
    zzaqp = paramBoolean;
    zzaqn = paramInt2;
  }
  
  public CloseContentsRequest(int paramInt, boolean paramBoolean)
  {
    this(1, null, Boolean.valueOf(paramBoolean), paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.CloseContentsRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */