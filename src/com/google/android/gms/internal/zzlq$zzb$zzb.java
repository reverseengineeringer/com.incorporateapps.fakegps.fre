package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;

public final class zzlq$zzb$zzb
  extends zzlq.zza
{
  protected zzlq$zzb$zzb(zzlq.zzb paramzzb)
  {
    super(zzaeH, null);
  }
  
  public final void onDisconnected()
  {
    zzlq.zzoC().zzb("onDisconnected", new Object[0]);
    zzlq.zza(zzaeK.zzaeH);
    zzaeK.zza(new zzlq.zzc(Status.zzagC));
  }
  
  public final void onError(int paramInt)
  {
    zzlq.zzoC().zzb("onError: %d", new Object[] { Integer.valueOf(paramInt) });
    zzlq.zza(zzaeK.zzaeH);
    zzaeK.zza(new zzlq.zzc(Status.zzagE));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlq.zzb.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */