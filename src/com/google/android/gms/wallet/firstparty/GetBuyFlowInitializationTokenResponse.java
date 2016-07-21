package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GetBuyFlowInitializationTokenResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  private final int mVersionCode;
  byte[] zzbpR;
  
  GetBuyFlowInitializationTokenResponse()
  {
    this(1, new byte[0]);
  }
  
  GetBuyFlowInitializationTokenResponse(int paramInt, byte[] paramArrayOfByte)
  {
    mVersionCode = paramInt;
    zzbpR = paramArrayOfByte;
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
    zzc.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */