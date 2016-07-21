package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;

final class GamesClientImpl$MessageReceivedNotifier
  implements zzq.zzb
{
  private final RealTimeMessage zzaET;
  
  GamesClientImpl$MessageReceivedNotifier(RealTimeMessage paramRealTimeMessage)
  {
    zzaET = paramRealTimeMessage;
  }
  
  public final void zza(RealTimeMessageReceivedListener paramRealTimeMessageReceivedListener)
  {
    paramRealTimeMessageReceivedListener.onRealTimeMessageReceived(zzaET);
  }
  
  public final void zzpr() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.MessageReceivedNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */