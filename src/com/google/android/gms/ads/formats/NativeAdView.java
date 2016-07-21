package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzcv;

public abstract class NativeAdView
  extends FrameLayout
{
  private final FrameLayout zzoQ = zzn(paramContext);
  private final zzcj zzoR = zzaI();
  
  public NativeAdView(Context paramContext)
  {
    super(paramContext);
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  private zzcj zzaI()
  {
    zzx.zzb(zzoQ, "createDelegate must be called after mOverlayFrame has been created");
    return zzn.zzcW().zza(zzoQ.getContext(), this, zzoQ);
  }
  
  private FrameLayout zzn(Context paramContext)
  {
    paramContext = zzo(paramContext);
    paramContext.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    addView(paramContext);
    return paramContext;
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    super.bringChildToFront(zzoQ);
  }
  
  public void bringChildToFront(View paramView)
  {
    super.bringChildToFront(paramView);
    if (zzoQ != paramView) {
      super.bringChildToFront(zzoQ);
    }
  }
  
  public void destroy()
  {
    try
    {
      zzoR.destroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzb("Unable to destroy native ad view", localRemoteException);
    }
  }
  
  public void removeAllViews()
  {
    super.removeAllViews();
    super.addView(zzoQ);
  }
  
  public void removeView(View paramView)
  {
    if (zzoQ == paramView) {
      return;
    }
    super.removeView(paramView);
  }
  
  public void setNativeAd(NativeAd paramNativeAd)
  {
    try
    {
      zzoR.zza((zzd)paramNativeAd.zzaH());
      return;
    }
    catch (RemoteException paramNativeAd)
    {
      zzb.zzb("Unable to call setNativeAd on delegate", paramNativeAd);
    }
  }
  
  protected void zza(String paramString, View paramView)
  {
    try
    {
      zzoR.zza(paramString, zze.zzC(paramView));
      return;
    }
    catch (RemoteException paramString)
    {
      zzb.zzb("Unable to call setAssetView on delegate", paramString);
    }
  }
  
  protected View zzn(String paramString)
  {
    try
    {
      paramString = zzoR.zzK(paramString);
      if (paramString != null)
      {
        paramString = (View)zze.zzp(paramString);
        return paramString;
      }
    }
    catch (RemoteException paramString)
    {
      zzb.zzb("Unable to call getAssetView on delegate", paramString);
    }
    return null;
  }
  
  FrameLayout zzo(Context paramContext)
  {
    return new FrameLayout(paramContext);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.formats.NativeAdView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */