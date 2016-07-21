package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

class zzy$zzb
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzy$zzb(zza.zzb paramzzb)
  {
    zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zzamC.zzs(new zzy.zze(paramStatus, null));
  }
  
  public void zza(OnDriveIdResponse paramOnDriveIdResponse)
  {
    zzamC.zzs(new zzy.zze(Status.zzagC, new zzy(paramOnDriveIdResponse.getDriveId())));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzy.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */