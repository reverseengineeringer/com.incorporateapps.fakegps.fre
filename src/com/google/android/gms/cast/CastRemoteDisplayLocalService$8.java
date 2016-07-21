package com.google.android.gms.cast;

import android.content.Context;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

class CastRemoteDisplayLocalService$8
  implements ResultCallback
{
  CastRemoteDisplayLocalService$8(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void zza(CastRemoteDisplay.CastRemoteDisplaySessionResult paramCastRemoteDisplaySessionResult)
  {
    if (!paramCastRemoteDisplaySessionResult.getStatus().isSuccess())
    {
      CastRemoteDisplayLocalService.zznI().zzc("Connection was not successful", new Object[0]);
      CastRemoteDisplayLocalService.zzc(zzaaz);
      return;
    }
    CastRemoteDisplayLocalService.zznI().zzb("startRemoteDisplay successful", new Object[0]);
    synchronized (CastRemoteDisplayLocalService.zznK())
    {
      if (CastRemoteDisplayLocalService.zznL() == null)
      {
        CastRemoteDisplayLocalService.zznI().zzb("Remote Display started but session already cancelled", new Object[0]);
        CastRemoteDisplayLocalService.zzc(zzaaz);
        return;
      }
    }
    paramCastRemoteDisplaySessionResult = paramCastRemoteDisplaySessionResult.getPresentationDisplay();
    if (paramCastRemoteDisplaySessionResult != null) {
      CastRemoteDisplayLocalService.zza(zzaaz, paramCastRemoteDisplaySessionResult);
    }
    for (;;)
    {
      CastRemoteDisplayLocalService.zznJ().set(false);
      if ((CastRemoteDisplayLocalService.zzd(zzaaz) == null) || (CastRemoteDisplayLocalService.zze(zzaaz) == null)) {
        break;
      }
      try
      {
        CastRemoteDisplayLocalService.zzd(zzaaz).unbindService(CastRemoteDisplayLocalService.zze(zzaaz));
        CastRemoteDisplayLocalService.zza(zzaaz, null);
        CastRemoteDisplayLocalService.zza(zzaaz, null);
        return;
        CastRemoteDisplayLocalService.zznI().zzc("Cast Remote Display session created without display", new Object[0]);
      }
      catch (IllegalArgumentException paramCastRemoteDisplaySessionResult)
      {
        for (;;)
        {
          CastRemoteDisplayLocalService.zznI().zzb("No need to unbind service, already unbound", new Object[0]);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplayLocalService.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */