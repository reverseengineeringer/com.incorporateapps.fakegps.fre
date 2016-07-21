package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class InitializeBuyFlowRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzf();
  private final int mVersionCode;
  byte[][] zzbpV;
  
  InitializeBuyFlowRequest(int paramInt, byte[][] paramArrayOfByte)
  {
    mVersionCode = paramInt;
    zzbpV = paramArrayOfByte;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */