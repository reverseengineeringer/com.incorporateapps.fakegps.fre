package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zze$zzf
  extends zza
{
  private final zza.zzb zzaON;
  
  public zze$zzf(zza.zzb paramzzb)
  {
    zzaON = paramzzb;
  }
  
  public final void zzi(int paramInt, Bundle paramBundle)
  {
    if (paramBundle != null) {}
    for (paramBundle = (PendingIntent)paramBundle.getParcelable("pendingIntent");; paramBundle = null)
    {
      paramBundle = new Status(paramInt, null, paramBundle);
      zzaON.zzs(paramBundle);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.zze.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */