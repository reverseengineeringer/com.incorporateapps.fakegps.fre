package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class UserAddress
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private final int mVersionCode;
  String name;
  String phoneNumber;
  String zzJU;
  String zzaMD;
  String zzaME;
  String zzaMF;
  String zzaMG;
  String zzaMH;
  String zzaMI;
  String zzaMJ;
  String zzaMK;
  String zzaML;
  boolean zzaMM;
  String zzaMN;
  String zzaMO;
  
  UserAddress()
  {
    mVersionCode = 1;
  }
  
  UserAddress(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, boolean paramBoolean, String paramString13, String paramString14)
  {
    mVersionCode = paramInt;
    name = paramString1;
    zzaMD = paramString2;
    zzaME = paramString3;
    zzaMF = paramString4;
    zzaMG = paramString5;
    zzaMH = paramString6;
    zzaMI = paramString7;
    zzaMJ = paramString8;
    zzJU = paramString9;
    zzaMK = paramString10;
    zzaML = paramString11;
    phoneNumber = paramString12;
    zzaMM = paramBoolean;
    zzaMN = paramString13;
    zzaMO = paramString14;
  }
  
  public static UserAddress fromIntent(Intent paramIntent)
  {
    if ((paramIntent == null) || (!paramIntent.hasExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS"))) {
      return null;
    }
    return (UserAddress)paramIntent.getParcelableExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS");
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
  
  public final String getAddress4()
  {
    return zzaMG;
  }
  
  public final String getAddress5()
  {
    return zzaMH;
  }
  
  public final String getAdministrativeArea()
  {
    return zzaMI;
  }
  
  public final String getCompanyName()
  {
    return zzaMN;
  }
  
  public final String getCountryCode()
  {
    return zzJU;
  }
  
  public final String getEmailAddress()
  {
    return zzaMO;
  }
  
  public final String getLocality()
  {
    return zzaMJ;
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
  
  public final String getSortingCode()
  {
    return zzaML;
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
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.identity.intents.model.UserAddress
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */