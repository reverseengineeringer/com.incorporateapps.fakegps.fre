package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletFragmentOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private int mTheme;
  final int mVersionCode;
  private int zzaoy;
  private int zzbpM;
  private WalletFragmentStyle zzbqs;
  
  private WalletFragmentOptions()
  {
    mVersionCode = 1;
    zzbpM = 3;
    zzbqs = new WalletFragmentStyle();
  }
  
  WalletFragmentOptions(int paramInt1, int paramInt2, int paramInt3, WalletFragmentStyle paramWalletFragmentStyle, int paramInt4)
  {
    mVersionCode = paramInt1;
    zzbpM = paramInt2;
    mTheme = paramInt3;
    zzbqs = paramWalletFragmentStyle;
    zzaoy = paramInt4;
  }
  
  public static WalletFragmentOptions.Builder newBuilder()
  {
    WalletFragmentOptions localWalletFragmentOptions = new WalletFragmentOptions();
    localWalletFragmentOptions.getClass();
    return new WalletFragmentOptions.Builder(localWalletFragmentOptions, null);
  }
  
  public static WalletFragmentOptions zzb(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.WalletFragmentOptions);
    int i = paramAttributeSet.getInt(R.styleable.WalletFragmentOptions_appTheme, 0);
    int j = paramAttributeSet.getInt(R.styleable.WalletFragmentOptions_environment, 1);
    int k = paramAttributeSet.getResourceId(R.styleable.WalletFragmentOptions_fragmentStyle, 0);
    int m = paramAttributeSet.getInt(R.styleable.WalletFragmentOptions_fragmentMode, 1);
    paramAttributeSet.recycle();
    paramAttributeSet = new WalletFragmentOptions();
    mTheme = i;
    zzbpM = j;
    zzbqs = new WalletFragmentStyle().setStyleResourceId(k);
    zzbqs.zzbc(paramContext);
    zzaoy = m;
    return paramAttributeSet;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int getEnvironment()
  {
    return zzbpM;
  }
  
  public final WalletFragmentStyle getFragmentStyle()
  {
    return zzbqs;
  }
  
  public final int getMode()
  {
    return zzaoy;
  }
  
  public final int getTheme()
  {
    return mTheme;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public final void zzbc(Context paramContext)
  {
    if (zzbqs != null) {
      zzbqs.zzbc(paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */