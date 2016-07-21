package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LoyaltyPoints
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zze();
  String label;
  private final int mVersionCode;
  String type;
  TimeInterval zzboY;
  LoyaltyPointsBalance zzbqI;
  
  LoyaltyPoints()
  {
    mVersionCode = 1;
  }
  
  LoyaltyPoints(int paramInt, String paramString1, LoyaltyPointsBalance paramLoyaltyPointsBalance, String paramString2, TimeInterval paramTimeInterval)
  {
    mVersionCode = paramInt;
    label = paramString1;
    zzbqI = paramLoyaltyPointsBalance;
    type = paramString2;
    zzboY = paramTimeInterval;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.wobs.LoyaltyPoints
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */