package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject.zza;

public final class GiftCardWalletObject
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzg();
  final int mVersionCode;
  String pin;
  CommonWalletObject zzboB = CommonWalletObject.zzIr().zzIs();
  String zzboC;
  String zzboD;
  long zzboE;
  String zzboF;
  long zzboG;
  String zzboH;
  
  GiftCardWalletObject()
  {
    mVersionCode = 1;
  }
  
  GiftCardWalletObject(int paramInt, CommonWalletObject paramCommonWalletObject, String paramString1, String paramString2, String paramString3, long paramLong1, String paramString4, long paramLong2, String paramString5)
  {
    mVersionCode = paramInt;
    zzboB = paramCommonWalletObject;
    zzboC = paramString1;
    pin = paramString2;
    zzboE = paramLong1;
    zzboF = paramString4;
    zzboG = paramLong2;
    zzboH = paramString5;
    zzboD = paramString3;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getId()
  {
    return zzboB.getId();
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.GiftCardWalletObject
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */