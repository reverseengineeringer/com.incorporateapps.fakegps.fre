package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LoyaltyPointsBalance
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzd();
  private final int mVersionCode;
  String zzboF;
  int zzbqJ;
  String zzbqK;
  double zzbqL;
  long zzbqM;
  int zzbqN;
  
  LoyaltyPointsBalance()
  {
    mVersionCode = 1;
    zzbqN = -1;
    zzbqJ = -1;
    zzbqL = -1.0D;
  }
  
  LoyaltyPointsBalance(int paramInt1, int paramInt2, String paramString1, double paramDouble, String paramString2, long paramLong, int paramInt3)
  {
    mVersionCode = paramInt1;
    zzbqJ = paramInt2;
    zzbqK = paramString1;
    zzbqL = paramDouble;
    zzboF = paramString2;
    zzbqM = paramLong;
    zzbqN = paramInt3;
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
    zzd.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.wobs.LoyaltyPointsBalance
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */