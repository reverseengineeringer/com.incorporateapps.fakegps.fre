package com.google.android.gms.ads.formats;

public final class NativeAdOptions
{
  public static final int ORIENTATION_ANY = 0;
  public static final int ORIENTATION_LANDSCAPE = 2;
  public static final int ORIENTATION_PORTRAIT = 1;
  private final boolean zzoN;
  private final int zzoO;
  private final boolean zzoP;
  
  private NativeAdOptions(NativeAdOptions.Builder paramBuilder)
  {
    zzoN = NativeAdOptions.Builder.zza(paramBuilder);
    zzoO = NativeAdOptions.Builder.zzb(paramBuilder);
    zzoP = NativeAdOptions.Builder.zzc(paramBuilder);
  }
  
  public final int getImageOrientation()
  {
    return zzoO;
  }
  
  public final boolean shouldRequestMultipleImages()
  {
    return zzoP;
  }
  
  public final boolean shouldReturnUrlsForImageAssets()
  {
    return zzoN;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.formats.NativeAdOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */