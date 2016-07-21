package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$DriverLicense
  implements SafeParcelable
{
  public static final zzf CREATOR = new zzf();
  public String addressCity;
  public String addressState;
  public String addressStreet;
  public String addressZip;
  public String birthDate;
  public String documentType;
  public String expiryDate;
  public String firstName;
  public String gender;
  public String issueDate;
  public String issuingCountry;
  public String lastName;
  public String licenseNumber;
  public String middleName;
  final int versionCode;
  
  public Barcode$DriverLicense()
  {
    versionCode = 1;
  }
  
  public Barcode$DriverLicense(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14)
  {
    versionCode = paramInt;
    documentType = paramString1;
    firstName = paramString2;
    middleName = paramString3;
    lastName = paramString4;
    gender = paramString5;
    addressStreet = paramString6;
    addressCity = paramString7;
    addressState = paramString8;
    addressZip = paramString9;
    licenseNumber = paramString10;
    issueDate = paramString11;
    expiryDate = paramString12;
    birthDate = paramString13;
    issuingCountry = paramString14;
  }
  
  public int describeContents()
  {
    zzf localzzf = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf localzzf = CREATOR;
    zzf.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.Barcode.DriverLicense
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */