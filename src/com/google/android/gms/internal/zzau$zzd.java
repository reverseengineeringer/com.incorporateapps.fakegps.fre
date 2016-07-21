package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;

public class zzau$zzd
  implements zzbb
{
  private final WeakReference zzst;
  private final WeakReference zzsu;
  
  public zzau$zzd(View paramView, zzif paramzzif)
  {
    zzst = new WeakReference(paramView);
    zzsu = new WeakReference(paramzzif);
  }
  
  public View zzco()
  {
    return (View)zzst.get();
  }
  
  public boolean zzcp()
  {
    return (zzst.get() == null) || (zzsu.get() == null);
  }
  
  public zzbb zzcq()
  {
    return new zzau.zzc((View)zzst.get(), (zzif)zzsu.get());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzau.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */