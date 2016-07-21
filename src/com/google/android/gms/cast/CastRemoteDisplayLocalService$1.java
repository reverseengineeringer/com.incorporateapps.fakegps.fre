package com.google.android.gms.cast;

import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.RouteInfo;

class CastRemoteDisplayLocalService$1
  extends MediaRouter.Callback
{
  CastRemoteDisplayLocalService$1(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void onRouteUnselected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    CastRemoteDisplayLocalService.zza(zzaaz, "onRouteUnselected");
    if (CastRemoteDisplayLocalService.zza(zzaaz) == null)
    {
      CastRemoteDisplayLocalService.zza(zzaaz, "onRouteUnselected, no device was selected");
      return;
    }
    if (!CastDevice.getFromBundle(paramRouteInfo.getExtras()).getDeviceId().equals(CastRemoteDisplayLocalService.zza(zzaaz).getDeviceId()))
    {
      CastRemoteDisplayLocalService.zza(zzaaz, "onRouteUnselected, device does not match");
      return;
    }
    CastRemoteDisplayLocalService.stopService();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplayLocalService.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */