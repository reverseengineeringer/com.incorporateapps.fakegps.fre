package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject.zza;

public final class OfferWalletObject
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzo();
  private final int mVersionCode;
  CommonWalletObject zzboB;
  String zzbpB;
  String zzio;
  
  OfferWalletObject()
  {
    mVersionCode = 3;
  }
  
  OfferWalletObject(int paramInt, String paramString1, String paramString2, CommonWalletObject paramCommonWalletObject)
  {
    mVersionCode = paramInt;
    zzbpB = paramString2;
    if (paramInt < 3)
    {
      zzboB = CommonWalletObject.zzIr().zzgK(paramString1).zzIs();
      return;
    }
    zzboB = paramCommonWalletObject;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getId()
  {
    return zzboB.getId();
  }
  
  public final String getRedemptionCode()
  {
    return zzbpB;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzo.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.OfferWalletObject
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */