package com.google.android.gms.ads.internal.request;

import java.lang.ref.WeakReference;

public final class zzg
  extends zzk.zza
{
  private final WeakReference zzHR;
  
  public zzg(zzc.zza paramzza)
  {
    zzHR = new WeakReference(paramzza);
  }
  
  public final void zzb(AdResponseParcel paramAdResponseParcel)
  {
    zzc.zza localzza = (zzc.zza)zzHR.get();
    if (localzza != null) {
      localzza.zzb(paramAdResponseParcel);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */