package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$Sms
  implements SafeParcelable
{
  public static final zzk CREATOR = new zzk();
  public String message;
  public String phoneNumber;
  final int versionCode;
  
  public Barcode$Sms()
  {
    versionCode = 1;
  }
  
  public Barcode$Sms(int paramInt, String paramString1, String paramString2)
  {
    versionCode = paramInt;
    message = paramString1;
    phoneNumber = paramString2;
  }
  
  public int describeContents()
  {
    zzk localzzk = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk localzzk = CREATOR;
    zzk.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.Barcode.Sms
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */