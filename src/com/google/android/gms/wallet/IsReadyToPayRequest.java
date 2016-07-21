package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class IsReadyToPayRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzi();
  final int mVersionCode;
  
  IsReadyToPayRequest()
  {
    mVersionCode = 1;
  }
  
  IsReadyToPayRequest(int paramInt)
  {
    mVersionCode = paramInt;
  }
  
  public static IsReadyToPayRequest.zza zzIj()
  {
    IsReadyToPayRequest localIsReadyToPayRequest = new IsReadyToPayRequest();
    localIsReadyToPayRequest.getClass();
    return new IsReadyToPayRequest.zza(localIsReadyToPayRequest, null);
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
    zzi.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.IsReadyToPayRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */