package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.R.style;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletFragmentStyle
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  final int mVersionCode;
  Bundle zzbqu;
  int zzbqv;
  
  public WalletFragmentStyle()
  {
    mVersionCode = 1;
    zzbqu = new Bundle();
    zzbqu.putInt("buyButtonAppearanceDefault", 4);
    zzbqu.putInt("maskedWalletDetailsLogoImageTypeDefault", 3);
  }
  
  WalletFragmentStyle(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    mVersionCode = paramInt1;
    zzbqu = paramBundle;
    zzbqv = paramInt2;
  }
  
  private static int zza(long paramLong, DisplayMetrics paramDisplayMetrics)
  {
    int i = (int)(paramLong >>> 32);
    int j = (int)paramLong;
    switch (i)
    {
    default: 
      throw new IllegalStateException("Unexpected unit or type: " + i);
    case 129: 
      return j;
    case 128: 
      return TypedValue.complexToDimensionPixelSize(j, paramDisplayMetrics);
    case 0: 
      i = 0;
    }
    for (;;)
    {
      return Math.round(TypedValue.applyDimension(i, Float.intBitsToFloat(j), paramDisplayMetrics));
      i = 1;
      continue;
      i = 2;
      continue;
      i = 3;
      continue;
      i = 4;
      continue;
      i = 5;
    }
  }
  
  private static long zza(int paramInt, float paramFloat)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Unrecognized unit: " + paramInt);
    }
    return zzv(paramInt, Float.floatToIntBits(paramFloat));
  }
  
  private static long zza(TypedValue paramTypedValue)
  {
    switch (type)
    {
    default: 
      throw new IllegalArgumentException("Unexpected dimension type: " + type);
    case 16: 
      return zzll(data);
    }
    return zzv(128, data);
  }
  
  private void zza(TypedArray paramTypedArray, int paramInt, String paramString)
  {
    if (zzbqu.containsKey(paramString)) {}
    do
    {
      return;
      paramTypedArray = paramTypedArray.peekValue(paramInt);
    } while (paramTypedArray == null);
    zzbqu.putLong(paramString, zza(paramTypedArray));
  }
  
  private void zza(TypedArray paramTypedArray, int paramInt, String paramString1, String paramString2)
  {
    if ((zzbqu.containsKey(paramString1)) || (zzbqu.containsKey(paramString2))) {}
    do
    {
      return;
      paramTypedArray = paramTypedArray.peekValue(paramInt);
    } while (paramTypedArray == null);
    if ((type >= 28) && (type <= 31))
    {
      zzbqu.putInt(paramString1, data);
      return;
    }
    zzbqu.putInt(paramString2, resourceId);
  }
  
  private void zzb(TypedArray paramTypedArray, int paramInt, String paramString)
  {
    if (zzbqu.containsKey(paramString)) {}
    do
    {
      return;
      paramTypedArray = paramTypedArray.peekValue(paramInt);
    } while (paramTypedArray == null);
    zzbqu.putInt(paramString, data);
  }
  
  private static long zzll(int paramInt)
  {
    if (paramInt < 0)
    {
      if ((paramInt == -1) || (paramInt == -2)) {
        return zzv(129, paramInt);
      }
      throw new IllegalArgumentException("Unexpected dimension value: " + paramInt);
    }
    return zza(0, paramInt);
  }
  
  private static long zzv(int paramInt1, int paramInt2)
  {
    return paramInt1 << 32 | paramInt2 & 0xFFFFFFFF;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final WalletFragmentStyle setBuyButtonAppearance(int paramInt)
  {
    zzbqu.putInt("buyButtonAppearance", paramInt);
    return this;
  }
  
  public final WalletFragmentStyle setBuyButtonHeight(int paramInt)
  {
    zzbqu.putLong("buyButtonHeight", zzll(paramInt));
    return this;
  }
  
  public final WalletFragmentStyle setBuyButtonHeight(int paramInt, float paramFloat)
  {
    zzbqu.putLong("buyButtonHeight", zza(paramInt, paramFloat));
    return this;
  }
  
  public final WalletFragmentStyle setBuyButtonText(int paramInt)
  {
    zzbqu.putInt("buyButtonText", paramInt);
    return this;
  }
  
  public final WalletFragmentStyle setBuyButtonWidth(int paramInt)
  {
    zzbqu.putLong("buyButtonWidth", zzll(paramInt));
    return this;
  }
  
  public final WalletFragmentStyle setBuyButtonWidth(int paramInt, float paramFloat)
  {
    zzbqu.putLong("buyButtonWidth", zza(paramInt, paramFloat));
    return this;
  }
  
  public final WalletFragmentStyle setMaskedWalletDetailsBackgroundColor(int paramInt)
  {
    zzbqu.remove("maskedWalletDetailsBackgroundResource");
    zzbqu.putInt("maskedWalletDetailsBackgroundColor", paramInt);
    return this;
  }
  
  public final WalletFragmentStyle setMaskedWalletDetailsBackgroundResource(int paramInt)
  {
    zzbqu.remove("maskedWalletDetailsBackgroundColor");
    zzbqu.putInt("maskedWalletDetailsBackgroundResource", paramInt);
    return this;
  }
  
  public final WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundColor(int paramInt)
  {
    zzbqu.remove("maskedWalletDetailsButtonBackgroundResource");
    zzbqu.putInt("maskedWalletDetailsButtonBackgroundColor", paramInt);
    return this;
  }
  
  public final WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundResource(int paramInt)
  {
    zzbqu.remove("maskedWalletDetailsButtonBackgroundColor");
    zzbqu.putInt("maskedWalletDetailsButtonBackgroundResource", paramInt);
    return this;
  }
  
  public final WalletFragmentStyle setMaskedWalletDetailsButtonTextAppearance(int paramInt)
  {
    zzbqu.putInt("maskedWalletDetailsButtonTextAppearance", paramInt);
    return this;
  }
  
  public final WalletFragmentStyle setMaskedWalletDetailsHeaderTextAppearance(int paramInt)
  {
    zzbqu.putInt("maskedWalletDetailsHeaderTextAppearance", paramInt);
    return this;
  }
  
  public final WalletFragmentStyle setMaskedWalletDetailsLogoImageType(int paramInt)
  {
    zzbqu.putInt("maskedWalletDetailsLogoImageType", paramInt);
    return this;
  }
  
  public final WalletFragmentStyle setMaskedWalletDetailsLogoTextColor(int paramInt)
  {
    zzbqu.putInt("maskedWalletDetailsLogoTextColor", paramInt);
    return this;
  }
  
  public final WalletFragmentStyle setMaskedWalletDetailsTextAppearance(int paramInt)
  {
    zzbqu.putInt("maskedWalletDetailsTextAppearance", paramInt);
    return this;
  }
  
  public final WalletFragmentStyle setStyleResourceId(int paramInt)
  {
    zzbqv = paramInt;
    return this;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public final int zza(String paramString, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    if (zzbqu.containsKey(paramString)) {
      paramInt = zza(zzbqu.getLong(paramString), paramDisplayMetrics);
    }
    return paramInt;
  }
  
  public final void zzbc(Context paramContext)
  {
    if (zzbqv <= 0) {}
    for (int i = R.style.WalletFragmentDefaultStyle;; i = zzbqv)
    {
      paramContext = paramContext.obtainStyledAttributes(i, R.styleable.WalletFragmentStyle);
      zza(paramContext, R.styleable.WalletFragmentStyle_buyButtonWidth, "buyButtonWidth");
      zza(paramContext, R.styleable.WalletFragmentStyle_buyButtonHeight, "buyButtonHeight");
      zzb(paramContext, R.styleable.WalletFragmentStyle_buyButtonText, "buyButtonText");
      zzb(paramContext, R.styleable.WalletFragmentStyle_buyButtonAppearance, "buyButtonAppearance");
      zzb(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsTextAppearance, "maskedWalletDetailsTextAppearance");
      zzb(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance, "maskedWalletDetailsHeaderTextAppearance");
      zza(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsBackground, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
      zzb(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance, "maskedWalletDetailsButtonTextAppearance");
      zza(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsButtonBackground, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
      zzb(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoTextColor, "maskedWalletDetailsLogoTextColor");
      zzb(paramContext, R.styleable.WalletFragmentStyle_maskedWalletDetailsLogoImageType, "maskedWalletDetailsLogoImageType");
      paramContext.recycle();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentStyle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */