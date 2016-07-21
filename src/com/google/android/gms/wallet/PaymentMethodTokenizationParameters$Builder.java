package com.google.android.gms.wallet;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;

public final class PaymentMethodTokenizationParameters$Builder
{
  private PaymentMethodTokenizationParameters$Builder(PaymentMethodTokenizationParameters paramPaymentMethodTokenizationParameters) {}
  
  public final Builder addParameter(String paramString1, String paramString2)
  {
    zzx.zzh(paramString1, "Tokenization parameter name must not be empty");
    zzx.zzh(paramString2, "Tokenization parameter value must not be empty");
    zzbpE.zzbpD.putString(paramString1, paramString2);
    return this;
  }
  
  public final PaymentMethodTokenizationParameters build()
  {
    return zzbpE;
  }
  
  public final Builder setPaymentMethodTokenizationType(int paramInt)
  {
    zzbpE.zzbpC = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.PaymentMethodTokenizationParameters.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */