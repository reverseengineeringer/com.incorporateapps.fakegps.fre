package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.formats.zzh;
import java.lang.ref.WeakReference;

public class zzau$zza
  implements zzbb
{
  private WeakReference zzsq;
  
  public zzau$zza(zzh paramzzh)
  {
    zzsq = new WeakReference(paramzzh);
  }
  
  public View zzco()
  {
    zzh localzzh = (zzh)zzsq.get();
    if (localzzh != null) {
      return localzzh.zzdS();
    }
    return null;
  }
  
  public boolean zzcp()
  {
    return zzsq.get() == null;
  }
  
  public zzbb zzcq()
  {
    return new zzau.zzb((zzh)zzsq.get());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzau.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */