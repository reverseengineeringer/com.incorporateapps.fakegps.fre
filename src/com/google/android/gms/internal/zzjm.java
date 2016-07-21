package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

class zzjm
  extends zzjn
  implements ViewTreeObserver.OnScrollChangedListener
{
  private final WeakReference zzNv;
  
  public zzjm(View paramView, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    super(paramView);
    zzNv = new WeakReference(paramOnScrollChangedListener);
  }
  
  public void onScrollChanged()
  {
    ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener)zzNv.get();
    if (localOnScrollChangedListener != null)
    {
      localOnScrollChangedListener.onScrollChanged();
      return;
    }
    detach();
  }
  
  protected void zza(ViewTreeObserver paramViewTreeObserver)
  {
    paramViewTreeObserver.addOnScrollChangedListener(this);
  }
  
  protected void zzb(ViewTreeObserver paramViewTreeObserver)
  {
    paramViewTreeObserver.removeOnScrollChangedListener(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzjm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */