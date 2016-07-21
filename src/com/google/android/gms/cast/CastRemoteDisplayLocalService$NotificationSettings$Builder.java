package com.google.android.gms.cast;

import android.app.Notification;
import android.app.PendingIntent;
import android.text.TextUtils;

public final class CastRemoteDisplayLocalService$NotificationSettings$Builder
{
  private CastRemoteDisplayLocalService.NotificationSettings zzaaI = new CastRemoteDisplayLocalService.NotificationSettings(null);
  
  public final CastRemoteDisplayLocalService.NotificationSettings build()
  {
    if (CastRemoteDisplayLocalService.NotificationSettings.zzb(zzaaI) != null)
    {
      if (!TextUtils.isEmpty(CastRemoteDisplayLocalService.NotificationSettings.zzc(zzaaI))) {
        throw new IllegalArgumentException("notificationTitle requires using the default notification");
      }
      if (!TextUtils.isEmpty(CastRemoteDisplayLocalService.NotificationSettings.zzd(zzaaI))) {
        throw new IllegalArgumentException("notificationText requires using the default notification");
      }
      if (CastRemoteDisplayLocalService.NotificationSettings.zze(zzaaI) != null) {
        throw new IllegalArgumentException("notificationPendingIntent requires using the default notification");
      }
    }
    else if ((TextUtils.isEmpty(CastRemoteDisplayLocalService.NotificationSettings.zzc(zzaaI))) && (TextUtils.isEmpty(CastRemoteDisplayLocalService.NotificationSettings.zzd(zzaaI))) && (CastRemoteDisplayLocalService.NotificationSettings.zze(zzaaI) == null))
    {
      throw new IllegalArgumentException("At least an argument must be provided");
    }
    return zzaaI;
  }
  
  public final Builder setNotification(Notification paramNotification)
  {
    CastRemoteDisplayLocalService.NotificationSettings.zza(zzaaI, paramNotification);
    return this;
  }
  
  public final Builder setNotificationPendingIntent(PendingIntent paramPendingIntent)
  {
    CastRemoteDisplayLocalService.NotificationSettings.zza(zzaaI, paramPendingIntent);
    return this;
  }
  
  public final Builder setNotificationText(String paramString)
  {
    CastRemoteDisplayLocalService.NotificationSettings.zzb(zzaaI, paramString);
    return this;
  }
  
  public final Builder setNotificationTitle(String paramString)
  {
    CastRemoteDisplayLocalService.NotificationSettings.zza(zzaaI, paramString);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplayLocalService.NotificationSettings.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */