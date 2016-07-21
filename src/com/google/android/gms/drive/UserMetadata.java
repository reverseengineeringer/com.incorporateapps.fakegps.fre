package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class UserMetadata
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzl();
  final int mVersionCode;
  final String zzWQ;
  final String zzaps;
  final String zzapt;
  final boolean zzapu;
  final String zzapv;
  
  UserMetadata(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4)
  {
    mVersionCode = paramInt;
    zzaps = paramString1;
    zzWQ = paramString2;
    zzapt = paramString3;
    zzapu = paramBoolean;
    zzapv = paramString4;
  }
  
  public UserMetadata(String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4)
  {
    this(1, paramString1, paramString2, paramString3, paramBoolean, paramString4);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", new Object[] { zzaps, zzWQ, zzapt, Boolean.valueOf(zzapu), zzapv });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.UserMetadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */