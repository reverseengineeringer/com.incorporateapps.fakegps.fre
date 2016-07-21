package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.zzb;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class WalletFragment
  extends Fragment
{
  private boolean mCreated = false;
  private final Fragment zzavH = this;
  private WalletFragmentOptions zzbqa;
  private WalletFragmentInitParams zzbqb;
  private MaskedWalletRequest zzbqc;
  private MaskedWallet zzbqd;
  private Boolean zzbqe;
  private WalletFragment.zzb zzbqj;
  private final zzb zzbqk = zzb.zza(this);
  private final WalletFragment.zzc zzbql = new WalletFragment.zzc(this, null);
  private WalletFragment.zza zzbqm = new WalletFragment.zza(this);
  
  public static WalletFragment newInstance(WalletFragmentOptions paramWalletFragmentOptions)
  {
    WalletFragment localWalletFragment = new WalletFragment();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("extraWalletFragmentOptions", paramWalletFragmentOptions);
    zzavH.setArguments(localBundle);
    return localWalletFragment;
  }
  
  public final int getState()
  {
    if (zzbqj != null) {
      return WalletFragment.zzb.zza(zzbqj);
    }
    return 0;
  }
  
  public final void initialize(WalletFragmentInitParams paramWalletFragmentInitParams)
  {
    if (zzbqj != null)
    {
      WalletFragment.zzb.zza(zzbqj, paramWalletFragmentInitParams);
      zzbqb = null;
    }
    do
    {
      return;
      if (zzbqb != null) {
        break;
      }
      zzbqb = paramWalletFragmentInitParams;
      if (zzbqc != null) {
        Log.w("WalletFragment", "updateMaskedWalletRequest() was called before initialize()");
      }
    } while (zzbqd == null);
    Log.w("WalletFragment", "updateMaskedWallet() was called before initialize()");
    return;
    Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (zzbqj != null) {
      WalletFragment.zzb.zza(zzbqj, paramInt1, paramInt2, paramIntent);
    }
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject;
    if (paramBundle != null)
    {
      paramBundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
      localObject = (WalletFragmentInitParams)paramBundle.getParcelable("walletFragmentInitParams");
      if (localObject != null)
      {
        if (zzbqb != null) {
          Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
        }
        zzbqb = ((WalletFragmentInitParams)localObject);
      }
      if (zzbqc == null) {
        zzbqc = ((MaskedWalletRequest)paramBundle.getParcelable("maskedWalletRequest"));
      }
      if (zzbqd == null) {
        zzbqd = ((MaskedWallet)paramBundle.getParcelable("maskedWallet"));
      }
      if (paramBundle.containsKey("walletFragmentOptions")) {
        zzbqa = ((WalletFragmentOptions)paramBundle.getParcelable("walletFragmentOptions"));
      }
      if (paramBundle.containsKey("enabled")) {
        zzbqe = Boolean.valueOf(paramBundle.getBoolean("enabled"));
      }
    }
    for (;;)
    {
      mCreated = true;
      zzbql.onCreate(paramBundle);
      return;
      if (zzavH.getArguments() != null)
      {
        localObject = (WalletFragmentOptions)zzavH.getArguments().getParcelable("extraWalletFragmentOptions");
        if (localObject != null)
        {
          ((WalletFragmentOptions)localObject).zzbc(zzavH.getActivity());
          zzbqa = ((WalletFragmentOptions)localObject);
        }
      }
    }
  }
  
  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return zzbql.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    mCreated = false;
  }
  
  public final void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    if (zzbqa == null) {
      zzbqa = WalletFragmentOptions.zzb(paramActivity, paramAttributeSet);
    }
    paramAttributeSet = new Bundle();
    paramAttributeSet.putParcelable("attrKeyWalletFragmentOptions", zzbqa);
    zzbql.onInflate(paramActivity, paramAttributeSet, paramBundle);
  }
  
  public final void onPause()
  {
    super.onPause();
    zzbql.onPause();
  }
  
  public final void onResume()
  {
    super.onResume();
    zzbql.onResume();
    FragmentManager localFragmentManager = zzavH.getActivity().getFragmentManager();
    Fragment localFragment = localFragmentManager.findFragmentByTag("GooglePlayServicesErrorDialog");
    if (localFragment != null)
    {
      localFragmentManager.beginTransaction().remove(localFragment).commit();
      GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(zzavH.getActivity()), zzavH.getActivity(), -1);
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
    zzbql.onSaveInstanceState(paramBundle);
    if (zzbqb != null)
    {
      paramBundle.putParcelable("walletFragmentInitParams", zzbqb);
      zzbqb = null;
    }
    if (zzbqc != null)
    {
      paramBundle.putParcelable("maskedWalletRequest", zzbqc);
      zzbqc = null;
    }
    if (zzbqd != null)
    {
      paramBundle.putParcelable("maskedWallet", zzbqd);
      zzbqd = null;
    }
    if (zzbqa != null)
    {
      paramBundle.putParcelable("walletFragmentOptions", zzbqa);
      zzbqa = null;
    }
    if (zzbqe != null)
    {
      paramBundle.putBoolean("enabled", zzbqe.booleanValue());
      zzbqe = null;
    }
  }
  
  public final void onStart()
  {
    super.onStart();
    zzbql.onStart();
  }
  
  public final void onStop()
  {
    super.onStop();
    zzbql.onStop();
  }
  
  public final void setEnabled(boolean paramBoolean)
  {
    if (zzbqj != null)
    {
      WalletFragment.zzb.zza(zzbqj, paramBoolean);
      zzbqe = null;
      return;
    }
    zzbqe = Boolean.valueOf(paramBoolean);
  }
  
  public final void setOnStateChangedListener(WalletFragment.OnStateChangedListener paramOnStateChangedListener)
  {
    zzbqm.zza(paramOnStateChangedListener);
  }
  
  public final void updateMaskedWallet(MaskedWallet paramMaskedWallet)
  {
    if (zzbqj != null)
    {
      WalletFragment.zzb.zza(zzbqj, paramMaskedWallet);
      zzbqd = null;
      return;
    }
    zzbqd = paramMaskedWallet;
  }
  
  public final void updateMaskedWalletRequest(MaskedWalletRequest paramMaskedWalletRequest)
  {
    if (zzbqj != null)
    {
      WalletFragment.zzb.zza(zzbqj, paramMaskedWalletRequest);
      zzbqc = null;
      return;
    }
    zzbqc = paramMaskedWalletRequest;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */