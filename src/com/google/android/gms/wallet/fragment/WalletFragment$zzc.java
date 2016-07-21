package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.R.string;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.internal.zzrx;
import com.google.android.gms.internal.zzsf;

class WalletFragment$zzc
  extends zza
  implements View.OnClickListener
{
  private WalletFragment$zzc(WalletFragment paramWalletFragment) {}
  
  public void onClick(View paramView)
  {
    paramView = WalletFragment.zza(zzbqp).getActivity();
    GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramView), paramView, -1);
  }
  
  protected void zza(FrameLayout paramFrameLayout)
  {
    int k = -1;
    int m = -2;
    Button localButton = new Button(WalletFragment.zza(zzbqp).getActivity());
    localButton.setText(R.string.wallet_buy_button_place_holder);
    int j = m;
    int i = k;
    if (WalletFragment.zze(zzbqp) != null)
    {
      WalletFragmentStyle localWalletFragmentStyle = WalletFragment.zze(zzbqp).getFragmentStyle();
      j = m;
      i = k;
      if (localWalletFragmentStyle != null)
      {
        DisplayMetrics localDisplayMetrics = WalletFragment.zza(zzbqp).getResources().getDisplayMetrics();
        i = localWalletFragmentStyle.zza("buyButtonWidth", localDisplayMetrics, -1);
        j = localWalletFragmentStyle.zza("buyButtonHeight", localDisplayMetrics, -2);
      }
    }
    localButton.setLayoutParams(new ViewGroup.LayoutParams(i, j));
    localButton.setOnClickListener(this);
    paramFrameLayout.addView(localButton);
  }
  
  protected void zza(zzf paramzzf)
  {
    Object localObject = WalletFragment.zza(zzbqp).getActivity();
    if ((WalletFragment.zzb(zzbqp) == null) && (WalletFragment.zzc(zzbqp)) && (localObject != null)) {}
    try
    {
      localObject = zzsf.zza((Activity)localObject, WalletFragment.zzd(zzbqp), WalletFragment.zze(zzbqp), WalletFragment.zzf(zzbqp));
      WalletFragment.zza(zzbqp, new WalletFragment.zzb((zzrx)localObject, null));
      WalletFragment.zza(zzbqp, null);
      paramzzf.zza(WalletFragment.zzb(zzbqp));
      if (WalletFragment.zzg(zzbqp) != null)
      {
        WalletFragment.zzb.zza(WalletFragment.zzb(zzbqp), WalletFragment.zzg(zzbqp));
        WalletFragment.zza(zzbqp, null);
      }
      if (WalletFragment.zzh(zzbqp) != null)
      {
        WalletFragment.zzb.zza(WalletFragment.zzb(zzbqp), WalletFragment.zzh(zzbqp));
        WalletFragment.zza(zzbqp, null);
      }
      if (WalletFragment.zzi(zzbqp) != null)
      {
        WalletFragment.zzb.zza(WalletFragment.zzb(zzbqp), WalletFragment.zzi(zzbqp));
        WalletFragment.zza(zzbqp, null);
      }
      if (WalletFragment.zzj(zzbqp) != null)
      {
        WalletFragment.zzb.zza(WalletFragment.zzb(zzbqp), WalletFragment.zzj(zzbqp).booleanValue());
        WalletFragment.zza(zzbqp, null);
      }
      return;
    }
    catch (GooglePlayServicesNotAvailableException paramzzf) {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragment.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */