package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$ContactInfo
  implements SafeParcelable
{
  public static final zze CREATOR = new zze();
  public Barcode.Address[] addresses;
  public Barcode.Email[] emails;
  public Barcode.PersonName name;
  public String organization;
  public Barcode.Phone[] phones;
  public String title;
  public String[] urls;
  final int versionCode;
  
  public Barcode$ContactInfo()
  {
    versionCode = 1;
  }
  
  public Barcode$ContactInfo(int paramInt, Barcode.PersonName paramPersonName, String paramString1, String paramString2, Barcode.Phone[] paramArrayOfPhone, Barcode.Email[] paramArrayOfEmail, String[] paramArrayOfString, Barcode.Address[] paramArrayOfAddress)
  {
    versionCode = paramInt;
    name = paramPersonName;
    organization = paramString1;
    title = paramString2;
    phones = paramArrayOfPhone;
    emails = paramArrayOfEmail;
    urls = paramArrayOfString;
    addresses = paramArrayOfAddress;
  }
  
  public int describeContents()
  {
    zze localzze = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze localzze = CREATOR;
    zze.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.Barcode.ContactInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */