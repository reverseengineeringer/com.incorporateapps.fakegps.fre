package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzir$zza
  extends BroadcastReceiver
{
  private zzir$zza(zzir paramzzir) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.intent.action.USER_PRESENT".equals(paramIntent.getAction())) {
      zzir.zza(zzMf, true);
    }
    while (!"android.intent.action.SCREEN_OFF".equals(paramIntent.getAction())) {
      return;
    }
    zzir.zza(zzMf, false);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzir.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */