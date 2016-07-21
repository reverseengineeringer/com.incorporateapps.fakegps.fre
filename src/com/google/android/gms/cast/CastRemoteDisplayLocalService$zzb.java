package com.google.android.gms.cast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cast.internal.zzl;

final class CastRemoteDisplayLocalService$zzb
  extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"))
    {
      CastRemoteDisplayLocalService.zznI().zzb("disconnecting", new Object[0]);
      CastRemoteDisplayLocalService.stopService();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastRemoteDisplayLocalService.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */