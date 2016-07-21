package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class PackageStorageInfo
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzbe();
  public final String label;
  public final String packageName;
  public final int versionCode;
  public final long zzbta;
  
  PackageStorageInfo(int paramInt, String paramString1, String paramString2, long paramLong)
  {
    versionCode = paramInt;
    packageName = paramString1;
    label = paramString2;
    zzbta = paramLong;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbe.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.PackageStorageInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */