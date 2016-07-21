package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Address
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  private final int mVersionCode;
  String name;
  String phoneNumber;
  String zzJU;
  String zzaMD;
  String zzaME;
  String zzaMF;
  String zzaMK;
  boolean zzaMM;
  String zzaMN;
  String zzbof;
  String zzbog;
  
  Address()
  {
    mVersionCode = 1;
  }
  
  Address(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, boolean paramBoolean, String paramString10)
  {
    mVersionCode = paramInt;
    name = paramString1;
    zzaMD = paramString2;
    zzaME = paramString3;
    zzaMF = paramString4;
    zzJU = paramString5;
    zzbof = paramString6;
    zzbog = paramString7;
    zzaMK = paramString8;
    phoneNumber = paramString9;
    zzaMM = paramBoolean;
    zzaMN = paramString10;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getAddress1()
  {
    return zzaMD;
  }
  
  public final String getAddress2()
  {
    return zzaME;
  }
  
  public final String getAddress3()
  {
    return zzaMF;
  }
  
  public final String getCity()
  {
    return zzbof;
  }
  
  public final String getCompanyName()
  {
    return zzaMN;
  }
  
  public final String getCountryCode()
  {
    return zzJU;
  }
  
  public final String getName()
  {
    return name;
  }
  
  public final String getPhoneNumber()
  {
    return phoneNumber;
  }
  
  public final String getPostalCode()
  {
    return zzaMK;
  }
  
  public final String getState()
  {
    return zzbog;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final boolean isPostBox()
  {
    return zzaMM;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.Address
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */