package com.google.android.gms.ads.formats;

public final class NativeAdOptions$Builder
{
  private boolean zzoN = false;
  private int zzoO = 0;
  private boolean zzoP = false;
  
  public final NativeAdOptions build()
  {
    return new NativeAdOptions(this, null);
  }
  
  public final Builder setImageOrientation(int paramInt)
  {
    zzoO = paramInt;
    return this;
  }
  
  public final Builder setRequestMultipleImages(boolean paramBoolean)
  {
    zzoP = paramBoolean;
    return this;
  }
  
  public final Builder setReturnUrlsForImageAssets(boolean paramBoolean)
  {
    zzoN = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.formats.NativeAdOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */