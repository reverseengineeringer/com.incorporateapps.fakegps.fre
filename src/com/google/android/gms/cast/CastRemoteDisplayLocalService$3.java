package com.google.android.gms.cast;

class CastRemoteDisplayLocalService$3
  implements Runnable
{
  CastRemoteDisplayLocalService$3(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void run()
  {
    CastRemoteDisplayLocalService.zza(zzaaz, "onCreate after delay. The local service been started: " + CastRemoteDisplayLocalService.zzb(zzaaz));
    if (!CastRemoteDisplayLocalService.zzb(zzaaz))
    {
      CastRemoteDisplayLocalService.zzb(zzaaz, "The local service has not been been started, stopping it");
      zzaaz.stopSelf();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplayLocalService.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */