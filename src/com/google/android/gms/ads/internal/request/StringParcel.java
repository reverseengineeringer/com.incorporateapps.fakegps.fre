package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class StringParcel
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzn();
  final int mVersionCode;
  String zzxG;
  
  StringParcel(int paramInt, String paramString)
  {
    mVersionCode = paramInt;
    zzxG = paramString;
  }
  
  public StringParcel(String paramString)
  {
    mVersionCode = 1;
    zzxG = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzn.zza(this, paramParcel, paramInt);
  }
  
  public String zzgz()
  {
    return zzxG;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.StringParcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */