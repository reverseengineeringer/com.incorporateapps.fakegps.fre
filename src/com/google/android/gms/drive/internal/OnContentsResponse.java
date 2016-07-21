package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class OnContentsResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzaw();
  final int mVersionCode;
  final Contents zzara;
  final boolean zzasf;
  
  OnContentsResponse(int paramInt, Contents paramContents, boolean paramBoolean)
  {
    mVersionCode = paramInt;
    zzara = paramContents;
    zzasf = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaw.zza(this, paramParcel, paramInt);
  }
  
  public Contents zztn()
  {
    return zzara;
  }
  
  public boolean zzto()
  {
    return zzasf;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnContentsResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */