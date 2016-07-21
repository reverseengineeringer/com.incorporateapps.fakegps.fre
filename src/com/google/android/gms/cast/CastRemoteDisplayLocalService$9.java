package com.google.android.gms.cast;

import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

class CastRemoteDisplayLocalService$9
  implements ResultCallback
{
  CastRemoteDisplayLocalService$9(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void zza(CastRemoteDisplay.CastRemoteDisplaySessionResult paramCastRemoteDisplaySessionResult)
  {
    if (!paramCastRemoteDisplaySessionResult.getStatus().isSuccess()) {
      CastRemoteDisplayLocalService.zza(zzaaz, "Unable to stop the remote display, result unsuccessful");
    }
    for (;;)
    {
      CastRemoteDisplayLocalService.zzb(zzaaz, null);
      return;
      CastRemoteDisplayLocalService.zza(zzaaz, "remote display stopped");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplayLocalService.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */