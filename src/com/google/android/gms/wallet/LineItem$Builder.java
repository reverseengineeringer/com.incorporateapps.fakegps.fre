package com.google.android.gms.wallet;

public final class LineItem$Builder
{
  private LineItem$Builder(LineItem paramLineItem) {}
  
  public final LineItem build()
  {
    return zzboO;
  }
  
  public final Builder setCurrencyCode(String paramString)
  {
    zzboO.zzboi = paramString;
    return this;
  }
  
  public final Builder setDescription(String paramString)
  {
    zzboO.description = paramString;
    return this;
  }
  
  public final Builder setQuantity(String paramString)
  {
    zzboO.zzboL = paramString;
    return this;
  }
  
  public final Builder setRole(int paramInt)
  {
    zzboO.zzboN = paramInt;
    return this;
  }
  
  public final Builder setTotalPrice(String paramString)
  {
    zzboO.zzboh = paramString;
    return this;
  }
  
  public final Builder setUnitPrice(String paramString)
  {
    zzboO.zzboM = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.LineItem.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */