package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$UrlBookmark
  implements SafeParcelable
{
  public static final zzl CREATOR = new zzl();
  public String title;
  public String url;
  final int versionCode;
  
  public Barcode$UrlBookmark()
  {
    versionCode = 1;
  }
  
  public Barcode$UrlBookmark(int paramInt, String paramString1, String paramString2)
  {
    versionCode = paramInt;
    title = paramString1;
    url = paramString2;
  }
  
  public int describeContents()
  {
    zzl localzzl = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl localzzl = CREATOR;
    zzl.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.Barcode.UrlBookmark
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */