package com.google.android.gms.cast;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

final class CastRemoteDisplayLocalService$4
  implements ServiceConnection
{
  CastRemoteDisplayLocalService$4(String paramString, CastDevice paramCastDevice, CastRemoteDisplayLocalService.NotificationSettings paramNotificationSettings, Context paramContext, CastRemoteDisplayLocalService.Callbacks paramCallbacks) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = ((CastRemoteDisplayLocalService.zza)paramIBinder).zznM();
    if ((paramComponentName == null) || (!CastRemoteDisplayLocalService.zza(paramComponentName, zzZI, zzaaA, zzaaB, zzaaC, this, zzaaD)))
    {
      CastRemoteDisplayLocalService.zznI().zzc("Connected but unable to get the service instance", new Object[0]);
      zzaaD.onRemoteDisplaySessionError(new Status(2200));
      CastRemoteDisplayLocalService.zznJ().set(false);
    }
    try
    {
      zzaaC.unbindService(this);
      return;
    }
    catch (IllegalArgumentException paramComponentName)
    {
      CastRemoteDisplayLocalService.zznI().zzb("No need to unbind service, already unbound", new Object[0]);
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    CastRemoteDisplayLocalService.zznI().zzb("onServiceDisconnected", new Object[0]);
    zzaaD.onRemoteDisplaySessionError(new Status(2201, "Service Disconnected"));
    CastRemoteDisplayLocalService.zznJ().set(false);
    try
    {
      zzaaC.unbindService(this);
      return;
    }
    catch (IllegalArgumentException paramComponentName)
    {
      CastRemoteDisplayLocalService.zznI().zzb("No need to unbind service, already unbound", new Object[0]);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplayLocalService.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */