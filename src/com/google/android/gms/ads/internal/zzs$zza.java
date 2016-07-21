package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zziu;
import com.google.android.gms.internal.zzjc;
import com.google.android.gms.internal.zzjp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzs$zza
  extends ViewSwitcher
{
  private final zziu zzrU;
  private final zzjc zzrV;
  
  public zzs$zza(Context paramContext, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    super(paramContext);
    zzrU = new zziu(paramContext);
    if ((paramContext instanceof Activity))
    {
      zzrV = new zzjc((Activity)paramContext, paramOnGlobalLayoutListener, paramOnScrollChangedListener);
      zzrV.zzhE();
      return;
    }
    zzrV = null;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (zzrV != null) {
      zzrV.onAttachedToWindow();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (zzrV != null) {
      zzrV.onDetachedFromWindow();
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    zzrU.zze(paramMotionEvent);
    return false;
  }
  
  public void removeAllViews()
  {
    Object localObject = new ArrayList();
    int i = 0;
    while (i < getChildCount())
    {
      View localView = getChildAt(i);
      if ((localView != null) && ((localView instanceof zzjp))) {
        ((List)localObject).add((zzjp)localView);
      }
      i += 1;
    }
    super.removeAllViews();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((zzjp)((Iterator)localObject).next()).destroy();
    }
  }
  
  public void zzbY()
  {
    zzin.v("Disable position monitoring on adFrame.");
    if (zzrV != null) {
      zzrV.zzhF();
    }
  }
  
  public zziu zzcc()
  {
    return zzrU;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzs.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */