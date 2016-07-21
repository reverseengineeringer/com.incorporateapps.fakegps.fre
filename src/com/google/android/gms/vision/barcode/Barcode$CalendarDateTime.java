package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$CalendarDateTime
  implements SafeParcelable
{
  public static final zzc CREATOR = new zzc();
  public int day;
  public int hours;
  public boolean isUtc;
  public int minutes;
  public int month;
  public String rawValue;
  public int seconds;
  final int versionCode;
  public int year;
  
  public Barcode$CalendarDateTime()
  {
    versionCode = 1;
  }
  
  public Barcode$CalendarDateTime(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean, String paramString)
  {
    versionCode = paramInt1;
    year = paramInt2;
    month = paramInt3;
    day = paramInt4;
    hours = paramInt5;
    minutes = paramInt6;
    seconds = paramInt7;
    isUtc = paramBoolean;
    rawValue = paramString;
  }
  
  public int describeContents()
  {
    zzc localzzc = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc localzzc = CREATOR;
    zzc.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.Barcode.CalendarDateTime
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */