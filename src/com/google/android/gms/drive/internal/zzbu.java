package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

public class zzbu
  extends zzd
{
  private final zza.zzb zzamC;
  
  public zzbu(zza.zzb paramzzb)
  {
    zzamC = paramzzb;
  }
  
  public void onError(Status paramStatus)
  {
    zzamC.zzs(paramStatus);
  }
  
  public void onSuccess()
  {
    zzamC.zzs(Status.zzagC);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzbu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */