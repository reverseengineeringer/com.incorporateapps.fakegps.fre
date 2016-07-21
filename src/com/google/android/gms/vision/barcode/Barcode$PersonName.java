package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$PersonName
  implements SafeParcelable
{
  public static final zzi CREATOR = new zzi();
  public String first;
  public String formattedName;
  public String last;
  public String middle;
  public String prefix;
  public String pronunciation;
  public String suffix;
  final int versionCode;
  
  public Barcode$PersonName()
  {
    versionCode = 1;
  }
  
  public Barcode$PersonName(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    versionCode = paramInt;
    formattedName = paramString1;
    pronunciation = paramString2;
    prefix = paramString3;
    first = paramString4;
    middle = paramString5;
    last = paramString6;
    suffix = paramString7;
  }
  
  public int describeContents()
  {
    zzi localzzi = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi localzzi = CREATOR;
    zzi.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.Barcode.PersonName
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */