package com.google.android.gms.wallet;

public final class FullWalletRequest$Builder
{
  private FullWalletRequest$Builder(FullWalletRequest paramFullWalletRequest) {}
  
  public final FullWalletRequest build()
  {
    return zzboA;
  }
  
  public final Builder setCart(Cart paramCart)
  {
    zzboA.zzboz = paramCart;
    return this;
  }
  
  public final Builder setGoogleTransactionId(String paramString)
  {
    zzboA.zzboo = paramString;
    return this;
  }
  
  public final Builder setMerchantTransactionId(String paramString)
  {
    zzboA.zzbop = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.FullWalletRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */