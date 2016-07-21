package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

class zzy$zza
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzy$zza(zza.zzb paramzzb)
  {
    zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zzamC.zzs(new zzy.zzc(paramStatus, null));
  }
  
  public void zza(OnDriveIdResponse paramOnDriveIdResponse)
  {
    zzamC.zzs(new zzy.zzc(Status.zzagC, new zzw(paramOnDriveIdResponse.getDriveId())));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzy.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */