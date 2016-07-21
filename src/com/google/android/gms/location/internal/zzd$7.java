package com.google.android.gms.location.internal;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;

class zzd$7
  extends zzd.zza
{
  zzd$7(zzd paramzzd, GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationCallback paramLocationCallback, Looper paramLooper)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzl paramzzl)
  {
    zzd.zzb localzzb = new zzd.zzb(this);
    paramzzl.zza(LocationRequestInternal.zzb(zzaOv), zzaOy, zzaOB, localzzb);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.internal.zzd.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */