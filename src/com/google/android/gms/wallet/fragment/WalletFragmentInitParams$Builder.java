package com.google.android.gms.wallet.fragment;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragmentInitParams$Builder
{
  private WalletFragmentInitParams$Builder(WalletFragmentInitParams paramWalletFragmentInitParams) {}
  
  public final WalletFragmentInitParams build()
  {
    boolean bool2 = true;
    if (((WalletFragmentInitParams.zza(zzbqr) != null) && (WalletFragmentInitParams.zzb(zzbqr) == null)) || ((WalletFragmentInitParams.zza(zzbqr) == null) && (WalletFragmentInitParams.zzb(zzbqr) != null)))
    {
      bool1 = true;
      zzx.zza(bool1, "Exactly one of MaskedWallet or MaskedWalletRequest is required");
      if (WalletFragmentInitParams.zzc(zzbqr) < 0) {
        break label78;
      }
    }
    label78:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      zzx.zza(bool1, "masked wallet request code is required and must be non-negative");
      return zzbqr;
      bool1 = false;
      break;
    }
  }
  
  public final Builder setAccountName(String paramString)
  {
    WalletFragmentInitParams.zza(zzbqr, paramString);
    return this;
  }
  
  public final Builder setMaskedWallet(MaskedWallet paramMaskedWallet)
  {
    WalletFragmentInitParams.zza(zzbqr, paramMaskedWallet);
    return this;
  }
  
  public final Builder setMaskedWalletRequest(MaskedWalletRequest paramMaskedWalletRequest)
  {
    WalletFragmentInitParams.zza(zzbqr, paramMaskedWalletRequest);
    return this;
  }
  
  public final Builder setMaskedWalletRequestCode(int paramInt)
  {
    WalletFragmentInitParams.zza(zzbqr, paramInt);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentInitParams.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */