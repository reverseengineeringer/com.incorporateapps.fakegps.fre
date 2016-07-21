package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GetBuyFlowInitializationTokenRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private final int mVersionCode;
  byte[] zzbpP;
  byte[] zzbpQ;
  
  GetBuyFlowInitializationTokenRequest()
  {
    this(1, null, null);
  }
  
  GetBuyFlowInitializationTokenRequest(int paramInt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    mVersionCode = paramInt;
    zzbpP = paramArrayOfByte1;
    zzbpQ = paramArrayOfByte2;
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
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */