package com.google.android.gms.wallet;

import java.util.ArrayList;
import java.util.List;

public final class Cart$Builder
{
  private Cart$Builder(Cart paramCart) {}
  
  public final Builder addLineItem(LineItem paramLineItem)
  {
    zzbok.zzboj.add(paramLineItem);
    return this;
  }
  
  public final Cart build()
  {
    return zzbok;
  }
  
  public final Builder setCurrencyCode(String paramString)
  {
    zzbok.zzboi = paramString;
    return this;
  }
  
  public final Builder setLineItems(List paramList)
  {
    zzbok.zzboj.clear();
    zzbok.zzboj.addAll(paramList);
    return this;
  }
  
  public final Builder setTotalPrice(String paramString)
  {
    zzbok.zzboh = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.Cart.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */