package com.google.android.gms.wallet.fragment;

import android.os.Bundle;
import com.google.android.gms.internal.zzry.zza;

class WalletFragment$zza
  extends zzry.zza
{
  private WalletFragment.OnStateChangedListener zzbqn;
  private final WalletFragment zzbqo;
  
  WalletFragment$zza(WalletFragment paramWalletFragment)
  {
    zzbqo = paramWalletFragment;
  }
  
  public void zza(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    if (zzbqn != null) {
      zzbqn.onStateChanged(zzbqo, paramInt1, paramInt2, paramBundle);
    }
  }
  
  public void zza(WalletFragment.OnStateChangedListener paramOnStateChangedListener)
  {
    zzbqn = paramOnStateChangedListener;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragment.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */