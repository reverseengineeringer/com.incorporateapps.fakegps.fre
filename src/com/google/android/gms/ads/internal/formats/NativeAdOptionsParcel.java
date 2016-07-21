package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class NativeAdOptionsParcel
  implements SafeParcelable
{
  public static final zzj CREATOR = new zzj();
  public final int versionCode;
  public final boolean zzyA;
  public final int zzyB;
  public final boolean zzyC;
  
  public NativeAdOptionsParcel(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    versionCode = paramInt1;
    zzyA = paramBoolean1;
    zzyB = paramInt2;
    zzyC = paramBoolean2;
  }
  
  public NativeAdOptionsParcel(NativeAdOptions paramNativeAdOptions)
  {
    this(1, paramNativeAdOptions.shouldReturnUrlsForImageAssets(), paramNativeAdOptions.getImageOrientation(), paramNativeAdOptions.shouldRequestMultipleImages());
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */