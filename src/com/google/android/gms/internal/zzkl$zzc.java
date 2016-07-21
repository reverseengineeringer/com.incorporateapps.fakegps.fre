package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class zzkl$zzc
  extends zzkl.zzb
{
  private final String zzUO;
  
  public zzkl$zzc(zzkl paramzzkl, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient);
    zzUO = paramString;
  }
  
  protected final void zza(zzkm paramzzkm)
  {
    paramzzkm.zzb(new zzkl.zzc.1(this), zzUO);
  }
  
  protected final Status zzb(Status paramStatus)
  {
    return paramStatus;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkl.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */