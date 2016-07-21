package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$GeoPoint
  implements SafeParcelable
{
  public static final zzh CREATOR = new zzh();
  public double lat;
  public double lng;
  final int versionCode;
  
  public Barcode$GeoPoint()
  {
    versionCode = 1;
  }
  
  public Barcode$GeoPoint(int paramInt, double paramDouble1, double paramDouble2)
  {
    versionCode = paramInt;
    lat = paramDouble1;
    lng = paramDouble2;
  }
  
  public int describeContents()
  {
    zzh localzzh = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh localzzh = CREATOR;
    zzh.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.Barcode.GeoPoint
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */