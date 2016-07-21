package com.google.android.gms.ads.formats;

import java.util.List;

public abstract interface NativeCustomTemplateAd
{
  public abstract List getAvailableAssetNames();
  
  public abstract String getCustomTemplateId();
  
  public abstract NativeAd.Image getImage(String paramString);
  
  public abstract CharSequence getText(String paramString);
  
  public abstract void performClick(String paramString);
  
  public abstract void recordImpression();
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.formats.NativeCustomTemplateAd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */