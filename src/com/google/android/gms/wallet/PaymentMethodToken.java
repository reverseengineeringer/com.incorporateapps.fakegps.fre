package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PaymentMethodToken
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzp();
  private final int mVersionCode;
  String zzbaW;
  int zzbpC;
  
  private PaymentMethodToken()
  {
    mVersionCode = 1;
  }
  
  PaymentMethodToken(int paramInt1, int paramInt2, String paramString)
  {
    mVersionCode = paramInt1;
    zzbpC = paramInt2;
    zzbaW = paramString;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int getPaymentMethodTokenizationType()
  {
    return zzbpC;
  }
  
  public final String getToken()
  {
    return zzbaW;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzp.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.PaymentMethodToken
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */