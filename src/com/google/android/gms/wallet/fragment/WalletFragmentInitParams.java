package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragmentInitParams
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  final int mVersionCode;
  private String zzVa;
  private MaskedWalletRequest zzbqc;
  private MaskedWallet zzbqd;
  private int zzbqq;
  
  private WalletFragmentInitParams()
  {
    mVersionCode = 1;
    zzbqq = -1;
  }
  
  WalletFragmentInitParams(int paramInt1, String paramString, MaskedWalletRequest paramMaskedWalletRequest, int paramInt2, MaskedWallet paramMaskedWallet)
  {
    mVersionCode = paramInt1;
    zzVa = paramString;
    zzbqc = paramMaskedWalletRequest;
    zzbqq = paramInt2;
    zzbqd = paramMaskedWallet;
  }
  
  public static WalletFragmentInitParams.Builder newBuilder()
  {
    WalletFragmentInitParams localWalletFragmentInitParams = new WalletFragmentInitParams();
    localWalletFragmentInitParams.getClass();
    return new WalletFragmentInitParams.Builder(localWalletFragmentInitParams, null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String getAccountName()
  {
    return zzVa;
  }
  
  public final MaskedWallet getMaskedWallet()
  {
    return zzbqd;
  }
  
  public final MaskedWalletRequest getMaskedWalletRequest()
  {
    return zzbqc;
  }
  
  public final int getMaskedWalletRequestCode()
  {
    return zzbqq;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentInitParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */