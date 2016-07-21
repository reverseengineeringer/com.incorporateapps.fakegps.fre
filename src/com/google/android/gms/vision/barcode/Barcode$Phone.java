package com.google.android.gms.vision.barcode;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Barcode$Phone
  implements SafeParcelable
{
  public static final zzj CREATOR = new zzj();
  public static final int FAX = 3;
  public static final int HOME = 2;
  public static final int MOBILE = 4;
  public static final int UNKNOWN = 0;
  public static final int WORK = 1;
  public String number;
  public int type;
  final int versionCode;
  
  public Barcode$Phone()
  {
    versionCode = 1;
  }
  
  public Barcode$Phone(int paramInt1, int paramInt2, String paramString)
  {
    versionCode = paramInt1;
    type = paramInt2;
    number = paramString;
  }
  
  public int describeContents()
  {
    zzj localzzj = CREATOR;
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj localzzj = CREATOR;
    zzj.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.barcode.Barcode.Phone
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */