package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzrx;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

class WalletFragment$zzb
  implements LifecycleDelegate
{
  private final zzrx zzbqh;
  
  private WalletFragment$zzb(zzrx paramzzrx)
  {
    zzbqh = paramzzrx;
  }
  
  private int getState()
  {
    try
    {
      int i = zzbqh.getState();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }
  
  private void initialize(WalletFragmentInitParams paramWalletFragmentInitParams)
  {
    try
    {
      zzbqh.initialize(paramWalletFragmentInitParams);
      return;
    }
    catch (RemoteException paramWalletFragmentInitParams)
    {
      throw new RuntimeException(paramWalletFragmentInitParams);
    }
  }
  
  private void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    try
    {
      zzbqh.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    catch (RemoteException paramIntent)
    {
      throw new RuntimeException(paramIntent);
    }
  }
  
  private void setEnabled(boolean paramBoolean)
  {
    try
    {
      zzbqh.setEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }
  
  private void updateMaskedWallet(MaskedWallet paramMaskedWallet)
  {
    try
    {
      zzbqh.updateMaskedWallet(paramMaskedWallet);
      return;
    }
    catch (RemoteException paramMaskedWallet)
    {
      throw new RuntimeException(paramMaskedWallet);
    }
  }
  
  private void updateMaskedWalletRequest(MaskedWalletRequest paramMaskedWalletRequest)
  {
    try
    {
      zzbqh.updateMaskedWalletRequest(paramMaskedWalletRequest);
      return;
    }
    catch (RemoteException paramMaskedWalletRequest)
    {
      throw new RuntimeException(paramMaskedWalletRequest);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    try
    {
      zzbqh.onCreate(paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      throw new RuntimeException(paramBundle);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    try
    {
      paramLayoutInflater = (View)zze.zzp(zzbqh.onCreateView(zze.zzC(paramLayoutInflater), zze.zzC(paramViewGroup), paramBundle));
      return paramLayoutInflater;
    }
    catch (RemoteException paramLayoutInflater)
    {
      throw new RuntimeException(paramLayoutInflater);
    }
  }
  
  public void onDestroy() {}
  
  public void onDestroyView() {}
  
  public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    paramBundle1 = (WalletFragmentOptions)paramBundle1.getParcelable("extraWalletFragmentOptions");
    try
    {
      zzbqh.zza(zze.zzC(paramActivity), paramBundle1, paramBundle2);
      return;
    }
    catch (RemoteException paramActivity)
    {
      throw new RuntimeException(paramActivity);
    }
  }
  
  public void onLowMemory() {}
  
  public void onPause()
  {
    try
    {
      zzbqh.onPause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }
  
  public void onResume()
  {
    try
    {
      zzbqh.onResume();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      zzbqh.onSaveInstanceState(paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      throw new RuntimeException(paramBundle);
    }
  }
  
  public void onStart()
  {
    try
    {
      zzbqh.onStart();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }
  
  public void onStop()
  {
    try
    {
      zzbqh.onStop();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeException(localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragment.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */