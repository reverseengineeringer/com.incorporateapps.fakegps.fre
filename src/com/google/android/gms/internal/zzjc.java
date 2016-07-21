package com.google.android.gms.internal;

import android.app.Activity;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.zzr;

public final class zzjc
{
  private Activity zzMM;
  private boolean zzMN;
  private boolean zzMO;
  private boolean zzMP;
  private ViewTreeObserver.OnGlobalLayoutListener zzMQ;
  private ViewTreeObserver.OnScrollChangedListener zzMR;
  
  public zzjc(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    zzMM = paramActivity;
    zzMQ = paramOnGlobalLayoutListener;
    zzMR = paramOnScrollChangedListener;
  }
  
  private void zzhG()
  {
    if (zzMM == null) {}
    while (zzMN) {
      return;
    }
    if (zzMQ != null) {
      zzr.zzbC().zza(zzMM, zzMQ);
    }
    if (zzMR != null) {
      zzr.zzbC().zza(zzMM, zzMR);
    }
    zzMN = true;
  }
  
  private void zzhH()
  {
    if (zzMM == null) {}
    while (!zzMN) {
      return;
    }
    if (zzMQ != null) {
      zzr.zzbE().zzb(zzMM, zzMQ);
    }
    if (zzMR != null) {
      zzr.zzbC().zzb(zzMM, zzMR);
    }
    zzMN = false;
  }
  
  public final void onAttachedToWindow()
  {
    zzMO = true;
    if (zzMP) {
      zzhG();
    }
  }
  
  public final void onDetachedFromWindow()
  {
    zzMO = false;
    zzhH();
  }
  
  public final void zzhE()
  {
    zzMP = true;
    if (zzMO) {
      zzhG();
    }
  }
  
  public final void zzhF()
  {
    zzMP = false;
    zzhH();
  }
  
  public final void zzi(Activity paramActivity)
  {
    zzMM = paramActivity;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */