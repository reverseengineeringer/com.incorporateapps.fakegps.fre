package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$Email
  implements SafeParcelable
{
  public static final zzg CREATOR = new zzg();
  public static final int HOME = 2;
  public static final int UNKNOWN = 0;
  public static final int WORK = 1;
  public String address;
  public String body;
  public String subject;
  public int type;
  final int versionCode;
  
  public Barcode$Email()
  {
    versionCode = 1;
  }
  
  public Barcode$Email(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3)
  {
    versionCode = paramInt1;
    type = paramInt2;
    address = paramString1;
    subject = paramString2;
    body = paramString3;
  }
  
  public int describeContents()
  {
    zzg localzzg = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg localzzg = CREATOR;
    zzg.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.Barcode.Email
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */