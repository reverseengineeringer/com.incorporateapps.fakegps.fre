package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PaymentMethodTokenizationParameters
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzq();
  private final int mVersionCode;
  int zzbpC;
  Bundle zzbpD = new Bundle();
  
  private PaymentMethodTokenizationParameters()
  {
    mVersionCode = 1;
  }
  
  PaymentMethodTokenizationParameters(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    mVersionCode = paramInt1;
    zzbpC = paramInt2;
    zzbpD = paramBundle;
  }
  
  public static PaymentMethodTokenizationParameters.Builder newBuilder()
  {
    PaymentMethodTokenizationParameters localPaymentMethodTokenizationParameters = new PaymentMethodTokenizationParameters();
    localPaymentMethodTokenizationParameters.getClass();
    return new PaymentMethodTokenizationParameters.Builder(localPaymentMethodTokenizationParameters, null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final Bundle getParameters()
  {
    return new Bundle(zzbpD);
  }
  
  public final int getPaymentMethodTokenizationType()
  {
    return zzbpC;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzq.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.PaymentMethodTokenizationParameters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */