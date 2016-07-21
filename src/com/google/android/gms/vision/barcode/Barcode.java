package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode
  implements SafeParcelable
{
  public static final int ALL_FORMATS = 0;
  public static final int AZTEC = 4096;
  public static final int CALENDAR_EVENT = 11;
  public static final int CODABAR = 8;
  public static final int CODE_128 = 1;
  public static final int CODE_39 = 2;
  public static final int CODE_93 = 4;
  public static final int CONTACT_INFO = 1;
  public static final zzb CREATOR = new zzb();
  public static final int DATA_MATRIX = 16;
  public static final int DRIVER_LICENSE = 12;
  public static final int EAN_13 = 32;
  public static final int EAN_8 = 64;
  public static final int EMAIL = 2;
  public static final int GEO = 10;
  public static final int ISBN = 3;
  public static final int ITF = 128;
  public static final int PDF417 = 2048;
  public static final int PHONE = 4;
  public static final int PRODUCT = 5;
  public static final int QR_CODE = 256;
  public static final int SMS = 6;
  public static final int TEXT = 7;
  public static final int UPC_A = 512;
  public static final int UPC_E = 1024;
  public static final int URL = 8;
  public static final int WIFI = 9;
  public Barcode.CalendarEvent calendarEvent;
  public Barcode.ContactInfo contactInfo;
  public Point[] cornerPoints;
  public String displayValue;
  public Barcode.DriverLicense driverLicense;
  public Barcode.Email email;
  public int format;
  public Barcode.GeoPoint geoPoint;
  public Barcode.Phone phone;
  public String rawValue;
  public Barcode.Sms sms;
  public Barcode.UrlBookmark url;
  public int valueFormat;
  final int versionCode;
  public Barcode.WiFi wifi;
  
  public Barcode()
  {
    versionCode = 1;
  }
  
  public Barcode(int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3, Point[] paramArrayOfPoint, Barcode.Email paramEmail, Barcode.Phone paramPhone, Barcode.Sms paramSms, Barcode.WiFi paramWiFi, Barcode.UrlBookmark paramUrlBookmark, Barcode.GeoPoint paramGeoPoint, Barcode.CalendarEvent paramCalendarEvent, Barcode.ContactInfo paramContactInfo, Barcode.DriverLicense paramDriverLicense)
  {
    versionCode = paramInt1;
    format = paramInt2;
    rawValue = paramString1;
    displayValue = paramString2;
    valueFormat = paramInt3;
    cornerPoints = paramArrayOfPoint;
    email = paramEmail;
    phone = paramPhone;
    sms = paramSms;
    wifi = paramWiFi;
    url = paramUrlBookmark;
    geoPoint = paramGeoPoint;
    calendarEvent = paramCalendarEvent;
    contactInfo = paramContactInfo;
    driverLicense = paramDriverLicense;
  }
  
  public int describeContents()
  {
    zzb localzzb = CREATOR;
    return 0;
  }
  
  public Rect getBoundingBox()
  {
    int k = Integer.MAX_VALUE;
    int j = Integer.MIN_VALUE;
    int i = 0;
    int m = Integer.MIN_VALUE;
    int n = Integer.MAX_VALUE;
    while (i < cornerPoints.length)
    {
      Point localPoint = cornerPoints[i];
      n = Math.min(n, x);
      m = Math.max(m, x);
      k = Math.min(k, y);
      j = Math.max(j, y);
      i += 1;
    }
    return new Rect(n, k, m, j);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb localzzb = CREATOR;
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.Barcode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */