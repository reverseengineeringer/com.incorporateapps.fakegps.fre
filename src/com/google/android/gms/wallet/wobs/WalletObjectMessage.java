package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletObjectMessage
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzi();
  String body;
  private final int mVersionCode;
  String zzbqO;
  TimeInterval zzbqR;
  UriData zzbqS;
  UriData zzbqT;
  
  WalletObjectMessage()
  {
    mVersionCode = 1;
  }
  
  WalletObjectMessage(int paramInt, String paramString1, String paramString2, TimeInterval paramTimeInterval, UriData paramUriData1, UriData paramUriData2)
  {
    mVersionCode = paramInt;
    zzbqO = paramString1;
    body = paramString2;
    zzbqR = paramTimeInterval;
    zzbqS = paramUriData1;
    zzbqT = paramUriData2;
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
 * Qualified Name:     com.google.android.gms.wallet.wobs.WalletObjectMessage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */