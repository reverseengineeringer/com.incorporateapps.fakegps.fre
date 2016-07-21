package com.google.android.gms.wallet;

import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;

public final class MaskedWalletRequest$Builder
{
  private MaskedWalletRequest$Builder(MaskedWalletRequest paramMaskedWalletRequest) {}
  
  public final Builder addAllowedCardNetwork(int paramInt)
  {
    if (zzbpy.zzbpx == null) {
      zzbpy.zzbpx = new ArrayList();
    }
    zzbpy.zzbpx.add(Integer.valueOf(paramInt));
    return this;
  }
  
  public final Builder addAllowedCardNetworks(Collection paramCollection)
  {
    if (paramCollection != null)
    {
      if (zzbpy.zzbpx == null) {
        zzbpy.zzbpx = new ArrayList();
      }
      zzbpy.zzbpx.addAll(paramCollection);
    }
    return this;
  }
  
  public final Builder addAllowedCountrySpecificationForShipping(CountrySpecification paramCountrySpecification)
  {
    if (zzbpy.zzbpv == null) {
      zzbpy.zzbpv = new ArrayList();
    }
    zzbpy.zzbpv.add(paramCountrySpecification);
    return this;
  }
  
  public final Builder addAllowedCountrySpecificationsForShipping(Collection paramCollection)
  {
    if (paramCollection != null)
    {
      if (zzbpy.zzbpv == null) {
        zzbpy.zzbpv = new ArrayList();
      }
      zzbpy.zzbpv.addAll(paramCollection);
    }
    return this;
  }
  
  public final MaskedWalletRequest build()
  {
    return zzbpy;
  }
  
  public final Builder setAllowDebitCard(boolean paramBoolean)
  {
    zzbpy.zzbpu = paramBoolean;
    return this;
  }
  
  public final Builder setAllowPrepaidCard(boolean paramBoolean)
  {
    zzbpy.zzbpt = paramBoolean;
    return this;
  }
  
  public final Builder setCart(Cart paramCart)
  {
    zzbpy.zzboz = paramCart;
    return this;
  }
  
  public final Builder setCurrencyCode(String paramString)
  {
    zzbpy.zzboi = paramString;
    return this;
  }
  
  public final Builder setEstimatedTotalPrice(String paramString)
  {
    zzbpy.zzbpo = paramString;
    return this;
  }
  
  public final Builder setIsBillingAgreement(boolean paramBoolean)
  {
    zzbpy.zzbpr = paramBoolean;
    return this;
  }
  
  public final Builder setMerchantName(String paramString)
  {
    zzbpy.zzbpp = paramString;
    return this;
  }
  
  public final Builder setMerchantTransactionId(String paramString)
  {
    zzbpy.zzbop = paramString;
    return this;
  }
  
  public final Builder setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters paramPaymentMethodTokenizationParameters)
  {
    zzbpy.zzbpw = paramPaymentMethodTokenizationParameters;
    return this;
  }
  
  public final Builder setPhoneNumberRequired(boolean paramBoolean)
  {
    zzbpy.zzbpl = paramBoolean;
    return this;
  }
  
  public final Builder setShippingAddressRequired(boolean paramBoolean)
  {
    zzbpy.zzbpm = paramBoolean;
    return this;
  }
  
  public final Builder setUseMinimalBillingAddress(boolean paramBoolean)
  {
    zzbpy.zzbpn = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.MaskedWalletRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */