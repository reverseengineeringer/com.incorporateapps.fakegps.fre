package com.google.android.gms.internal;

import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionCallbacks;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;

class zzlr$1
  extends zzlu.zza
{
  zzlr$1(zzlr paramzzlr, zzlu paramzzlu) {}
  
  public void zzbp(int paramInt)
  {
    zzlr.zzoC().zzb("onRemoteDisplayEnded", new Object[0]);
    if (zzaeM != null) {
      zzaeM.zzbp(paramInt);
    }
    if (zzlr.zzb(zzaeN) != null) {
      zzlr.zzb(zzaeN).onRemoteDisplayEnded(new Status(paramInt));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlr.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */