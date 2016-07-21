package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$WiFi
  implements SafeParcelable
{
  public static final zzm CREATOR = new zzm();
  public static final int OPEN = 1;
  public static final int WEP = 3;
  public static final int WPA = 2;
  public int encryptionType;
  public String password;
  public String ssid;
  final int versionCode;
  
  public Barcode$WiFi()
  {
    versionCode = 1;
  }
  
  public Barcode$WiFi(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    versionCode = paramInt1;
    ssid = paramString1;
    password = paramString2;
    encryptionType = paramInt2;
  }
  
  public int describeContents()
  {
    zzm localzzm = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzm localzzm = CREATOR;
    zzm.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.Barcode.WiFi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */