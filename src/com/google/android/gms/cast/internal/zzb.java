package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zza;

public abstract class zzb
  extends zza.zza
{
  public zzb(GoogleApiClient paramGoogleApiClient)
  {
    super(zzk.zzUI, paramGoogleApiClient);
  }
  
  public void zzbj(int paramInt)
  {
    zza(zzc(new Status(paramInt)));
  }
  
  public void zze(int paramInt, String paramString)
  {
    zza(zzc(new Status(paramInt, paramString, null)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.internal.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */