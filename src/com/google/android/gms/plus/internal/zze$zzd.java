package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;

final class zze$zzd
  extends zza
{
  private final zza.zzb zzaON;
  
  public zze$zzd(zza.zzb paramzzb)
  {
    zzaON = paramzzb;
  }
  
  public final void zza(DataHolder paramDataHolder, String paramString1, String paramString2)
  {
    if (paramDataHolder.zzpZ() != null) {}
    for (Object localObject = (PendingIntent)paramDataHolder.zzpZ().getParcelable("pendingIntent");; localObject = null)
    {
      Status localStatus = new Status(paramDataHolder.getStatusCode(), null, (PendingIntent)localObject);
      localObject = paramDataHolder;
      if (!localStatus.isSuccess())
      {
        localObject = paramDataHolder;
        if (paramDataHolder != null)
        {
          if (!paramDataHolder.isClosed()) {
            paramDataHolder.close();
          }
          localObject = null;
        }
      }
      zzaON.zzs(new zze.zza(localStatus, (DataHolder)localObject, paramString1, paramString2));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.zze.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */