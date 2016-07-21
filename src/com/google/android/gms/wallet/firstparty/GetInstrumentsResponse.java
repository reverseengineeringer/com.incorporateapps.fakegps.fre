package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GetInstrumentsResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zze();
  private final int mVersionCode;
  String[] zzbpT;
  byte[][] zzbpU;
  
  GetInstrumentsResponse()
  {
    this(1, new String[0], new byte[0][]);
  }
  
  GetInstrumentsResponse(int paramInt, String[] paramArrayOfString, byte[][] paramArrayOfByte)
  {
    mVersionCode = paramInt;
    zzbpT = paramArrayOfString;
    zzbpU = paramArrayOfByte;
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
 * Qualified Name:     com.google.android.gms.wallet.firstparty.GetInstrumentsResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */