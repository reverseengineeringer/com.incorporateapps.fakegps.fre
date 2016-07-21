package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
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

class SupportWalletFragment$zzc
  extends zza
  implements View.OnClickListener
{
  private SupportWalletFragment$zzc(SupportWalletFragment paramSupportWalletFragment) {}
  
  public void onClick(View paramView)
  {
    paramView = SupportWalletFragment.zza(zzbqi).getActivity();
    GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramView), paramView, -1);
  }
  
  protected void zza(FrameLayout paramFrameLayout)
  {
    int k = -1;
    int m = -2;
    Button localButton = new Button(SupportWalletFragment.zza(zzbqi).getActivity());
    localButton.setText(R.string.wallet_buy_button_place_holder);
    int j = m;
    int i = k;
    if (SupportWalletFragment.zze(zzbqi) != null)
    {
      WalletFragmentStyle localWalletFragmentStyle = SupportWalletFragment.zze(zzbqi).getFragmentStyle();
      j = m;
      i = k;
      if (localWalletFragmentStyle != null)
      {
        DisplayMetrics localDisplayMetrics = SupportWalletFragment.zza(zzbqi).getResources().getDisplayMetrics();
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
    Object localObject = SupportWalletFragment.zza(zzbqi).getActivity();
    if ((SupportWalletFragment.zzb(zzbqi) == null) && (SupportWalletFragment.zzc(zzbqi)) && (localObject != null)) {}
    try
    {
      localObject = zzsf.zza((Activity)localObject, SupportWalletFragment.zzd(zzbqi), SupportWalletFragment.zze(zzbqi), SupportWalletFragment.zzf(zzbqi));
      SupportWalletFragment.zza(zzbqi, new SupportWalletFragment.zzb((zzrx)localObject, null));
      SupportWalletFragment.zza(zzbqi, null);
      paramzzf.zza(SupportWalletFragment.zzb(zzbqi));
      if (SupportWalletFragment.zzg(zzbqi) != null)
      {
        SupportWalletFragment.zzb.zza(SupportWalletFragment.zzb(zzbqi), SupportWalletFragment.zzg(zzbqi));
        SupportWalletFragment.zza(zzbqi, null);
      }
      if (SupportWalletFragment.zzh(zzbqi) != null)
      {
        SupportWalletFragment.zzb.zza(SupportWalletFragment.zzb(zzbqi), SupportWalletFragment.zzh(zzbqi));
        SupportWalletFragment.zza(zzbqi, null);
      }
      if (SupportWalletFragment.zzi(zzbqi) != null)
      {
        SupportWalletFragment.zzb.zza(SupportWalletFragment.zzb(zzbqi), SupportWalletFragment.zzi(zzbqi));
        SupportWalletFragment.zza(zzbqi, null);
      }
      if (SupportWalletFragment.zzj(zzbqi) != null)
      {
        SupportWalletFragment.zzb.zza(SupportWalletFragment.zzb(zzbqi), SupportWalletFragment.zzj(zzbqi).booleanValue());
        SupportWalletFragment.zza(zzbqi, null);
      }
      return;
    }
    catch (GooglePlayServicesNotAvailableException paramzzf) {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wallet.fragment.SupportWalletFragment.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */