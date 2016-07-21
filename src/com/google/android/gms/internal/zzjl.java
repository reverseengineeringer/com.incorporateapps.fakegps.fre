package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.zzr;
import java.lang.ref.WeakReference;

class zzjl
  extends zzjn
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private final WeakReference zzNv;
  
  public zzjl(View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    super(paramView);
    zzNv = new WeakReference(paramOnGlobalLayoutListener);
  }
  
  public void onGlobalLayout()
  {
    ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener)zzNv.get();
    if (localOnGlobalLayoutListener != null)
    {
      localOnGlobalLayoutListener.onGlobalLayout();
      return;
    }
    detach();
  }
  
  protected void zza(ViewTreeObserver paramViewTreeObserver)
  {
    paramViewTreeObserver.addOnGlobalLayoutListener(this);
  }
  
  protected void zzb(ViewTreeObserver paramViewTreeObserver)
  {
    zzr.zzbE().zza(paramViewTreeObserver, this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */