package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zza;

abstract class zzlc
  extends zza.zza
{
  public zzlc(GoogleApiClient paramGoogleApiClient)
  {
    super(Auth.zzVt, paramGoogleApiClient);
  }
  
  protected abstract void zza(Context paramContext, zzlb paramzzlb);
  
  protected final void zza(zzkz paramzzkz)
  {
    zza(paramzzkz.getContext(), (zzlb)paramzzkz.zzqJ());
  }
  
  protected ProxyApi.ProxyResult zzj(Status paramStatus)
  {
    return new zzle(paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */