package com.google.android.gms.wallet.fragment;

import android.os.Bundle;
import com.google.android.gms.internal.zzry.zza;

class SupportWalletFragment$zza
  extends zzry.zza
{
  private SupportWalletFragment.OnStateChangedListener zzbqf;
  private final SupportWalletFragment zzbqg;
  
  SupportWalletFragment$zza(SupportWalletFragment paramSupportWalletFragment)
  {
    zzbqg = paramSupportWalletFragment;
  }
  
  public void zza(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    if (zzbqf != null) {
      zzbqf.onStateChanged(zzbqg, paramInt1, paramInt2, paramBundle);
    }
  }
  
  public void zza(SupportWalletFragment.OnStateChangedListener paramOnStateChangedListener)
  {
    zzbqf = paramOnStateChangedListener;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.fragment.SupportWalletFragment.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */