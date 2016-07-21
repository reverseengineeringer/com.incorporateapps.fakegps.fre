package com.google.android.gms.wallet;

import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet$Builder
{
  private MaskedWallet$Builder(MaskedWallet paramMaskedWallet) {}
  
  public final MaskedWallet build()
  {
    return zzbpk;
  }
  
  public final Builder setBillingAddress(Address paramAddress)
  {
    zzbpk.zzbos = paramAddress;
    return this;
  }
  
  public final Builder setBuyerBillingAddress(UserAddress paramUserAddress)
  {
    zzbpk.zzbov = paramUserAddress;
    return this;
  }
  
  public final Builder setBuyerShippingAddress(UserAddress paramUserAddress)
  {
    zzbpk.zzbow = paramUserAddress;
    return this;
  }
  
  public final Builder setEmail(String paramString)
  {
    zzbpk.zzbor = paramString;
    return this;
  }
  
  public final Builder setGoogleTransactionId(String paramString)
  {
    zzbpk.zzboo = paramString;
    return this;
  }
  
  public final Builder setInstrumentInfos(InstrumentInfo[] paramArrayOfInstrumentInfo)
  {
    zzbpk.zzbox = paramArrayOfInstrumentInfo;
    return this;
  }
  
  public final Builder setMerchantTransactionId(String paramString)
  {
    zzbpk.zzbop = paramString;
    return this;
  }
  
  public final Builder setPaymentDescriptions(String[] paramArrayOfString)
  {
    zzbpk.zzbou = paramArrayOfString;
    return this;
  }
  
  public final Builder setShippingAddress(Address paramAddress)
  {
    zzbpk.zzbot = paramAddress;
    return this;
  }
  
  public final Builder zza(LoyaltyWalletObject[] paramArrayOfLoyaltyWalletObject)
  {
    zzbpk.zzbpi = paramArrayOfLoyaltyWalletObject;
    return this;
  }
  
  public final Builder zza(OfferWalletObject[] paramArrayOfOfferWalletObject)
  {
    zzbpk.zzbpj = paramArrayOfOfferWalletObject;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.MaskedWallet.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */