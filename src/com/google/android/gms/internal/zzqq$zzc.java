package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.panorama.Panorama;

abstract class zzqq$zzc
  extends zza.zza
{
  protected zzqq$zzc(GoogleApiClient paramGoogleApiClient)
  {
    super(Panorama.zzUI, paramGoogleApiClient);
  }
  
  protected abstract void zza(Context paramContext, zzqp paramzzqp);
  
  protected final void zza(zzqr paramzzqr)
  {
    zza(paramzzqr.getContext(), (zzqp)paramzzqr.zzqJ());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqq.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */