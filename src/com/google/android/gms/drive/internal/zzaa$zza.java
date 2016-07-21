package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

class zzaa$zza
  extends zzd
{
  private final zza.zzb zzamC;
  
  private zzaa$zza(zzaa paramzzaa, zza.zzb paramzzb)
  {
    zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zzamC.zzs(new zzaa.zzb(zzaru, paramStatus, null, null));
  }
  
  public void zza(OnDeviceUsagePreferenceResponse paramOnDeviceUsagePreferenceResponse)
  {
    zzamC.zzs(new zzaa.zzb(zzaru, Status.zzagC, paramOnDeviceUsagePreferenceResponse.zztp(), null));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzaa.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */