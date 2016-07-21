package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$CalendarEvent
  implements SafeParcelable
{
  public static final zzd CREATOR = new zzd();
  public String description;
  public Barcode.CalendarDateTime end;
  public String location;
  public String organizer;
  public Barcode.CalendarDateTime start;
  public String status;
  public String summary;
  final int versionCode;
  
  public Barcode$CalendarEvent()
  {
    versionCode = 1;
  }
  
  public Barcode$CalendarEvent(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Barcode.CalendarDateTime paramCalendarDateTime1, Barcode.CalendarDateTime paramCalendarDateTime2)
  {
    versionCode = paramInt;
    summary = paramString1;
    description = paramString2;
    location = paramString3;
    organizer = paramString4;
    status = paramString5;
    start = paramCalendarDateTime1;
    end = paramCalendarDateTime2;
  }
  
  public int describeContents()
  {
    zzd localzzd = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd localzzd = CREATOR;
    zzd.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.Barcode.CalendarEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */