package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$Address
  implements SafeParcelable
{
  public static final zza CREATOR = new zza();
  public static final int HOME = 2;
  public static final int UNKNOWN = 0;
  public static final int WORK = 1;
  public String[] addressLines;
  public int type;
  final int versionCode;
  
  public Barcode$Address()
  {
    versionCode = 1;
  }
  
  public Barcode$Address(int paramInt1, int paramInt2, String[] paramArrayOfString)
  {
    versionCode = paramInt1;
    type = paramInt2;
    addressLines = paramArrayOfString;
  }
  
  public int describeContents()
  {
    zza localzza = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza localzza = CREATOR;
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.Barcode.Address
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */