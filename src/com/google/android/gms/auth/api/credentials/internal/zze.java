package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zza.zza;

abstract class zze
  extends zza.zza
{
  zze(GoogleApiClient paramGoogleApiClient)
  {
    super(Auth.zzVu, paramGoogleApiClient);
  }
  
  protected abstract void zza(Context paramContext, zzj paramzzj);
  
  protected final void zza(zzf paramzzf)
  {
    zza(paramzzf.getContext(), (zzj)paramzzf.zzqJ());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.internal.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */