package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.zzh;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public final class SupportWalletFragment
  extends Fragment
{
  private boolean mCreated = false;
  private final Fragment zzalg = this;
  private SupportWalletFragment.zzb zzbpW;
  private final zzh zzbpX = zzh.zza(this);
  private final SupportWalletFragment.zzc zzbpY = new SupportWalletFragment.zzc(this, null);
  private SupportWalletFragment.zza zzbpZ = new SupportWalletFragment.zza(this);
  private WalletFragmentOptions zzbqa;
  private WalletFragmentInitParams zzbqb;
  private MaskedWalletRequest zzbqc;
  private MaskedWallet zzbqd;
  private Boolean zzbqe;
  
  public static SupportWalletFragment newInstance(WalletFragmentOptions paramWalletFragmentOptions)
  {
    SupportWalletFragment localSupportWalletFragment = new SupportWalletFragment();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("extraWalletFragmentOptions", paramWalletFragmentOptions);
    zzalg.setArguments(localBundle);
    return localSupportWalletFragment;
  }
  
  public final int getState()
  {
    if (zzbpW != null) {
      return SupportWalletFragment.zzb.zza(zzbpW);
    }
    return 0;
  }
  
  public final void initialize(WalletFragmentInitParams paramWalletFragmentInitParams)
  {
    if (zzbpW != null)
    {
      SupportWalletFragment.zzb.zza(zzbpW, paramWalletFragmentInitParams);
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
        Log.w("SupportWalletFragment", "updateMaskedWalletRequest() was called before initialize()");
      }
    } while (zzbqd == null);
    Log.w("SupportWalletFragment", "updateMaskedWallet() was called before initialize()");
    return;
    Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (zzbpW != null) {
      SupportWalletFragment.zzb.zza(zzbpW, paramInt1, paramInt2, paramIntent);
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
          Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
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
      zzbpY.onCreate(paramBundle);
      return;
      if (zzalg.getArguments() != null)
      {
        localObject = (WalletFragmentOptions)zzalg.getArguments().getParcelable("extraWalletFragmentOptions");
        if (localObject != null)
        {
          ((WalletFragmentOptions)localObject).zzbc(zzalg.getActivity());
          zzbqa = ((WalletFragmentOptions)localObject);
        }
      }
    }
  }
  
  public final View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return zzbpY.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
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
    zzbpY.onInflate(paramActivity, paramAttributeSet, paramBundle);
  }
  
  public final void onPause()
  {
    super.onPause();
    zzbpY.onPause();
  }
  
  public final void onResume()
  {
    super.onResume();
    zzbpY.onResume();
    FragmentManager localFragmentManager = zzalg.getActivity().getSupportFragmentManager();
    Fragment localFragment = localFragmentManager.findFragmentByTag("GooglePlayServicesErrorDialog");
    if (localFragment != null)
    {
      localFragmentManager.beginTransaction().remove(localFragment).commit();
      GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(zzalg.getActivity()), zzalg.getActivity(), -1);
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
    zzbpY.onSaveInstanceState(paramBundle);
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
    zzbpY.onStart();
  }
  
  public final void onStop()
  {
    super.onStop();
    zzbpY.onStop();
  }
  
  public final void setEnabled(boolean paramBoolean)
  {
    if (zzbpW != null)
    {
      SupportWalletFragment.zzb.zza(zzbpW, paramBoolean);
      zzbqe = null;
      return;
    }
    zzbqe = Boolean.valueOf(paramBoolean);
  }
  
  public final void setOnStateChangedListener(SupportWalletFragment.OnStateChangedListener paramOnStateChangedListener)
  {
    zzbpZ.zza(paramOnStateChangedListener);
  }
  
  public final void updateMaskedWallet(MaskedWallet paramMaskedWallet)
  {
    if (zzbpW != null)
    {
      SupportWalletFragment.zzb.zza(zzbpW, paramMaskedWallet);
      zzbqd = null;
      return;
    }
    zzbqd = paramMaskedWallet;
  }
  
  public final void updateMaskedWalletRequest(MaskedWalletRequest paramMaskedWalletRequest)
  {
    if (zzbpW != null)
    {
      SupportWalletFragment.zzb.zza(zzbpW, paramMaskedWalletRequest);
      zzbqc = null;
      return;
    }
    zzbqc = paramMaskedWalletRequest;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.fragment.SupportWalletFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */