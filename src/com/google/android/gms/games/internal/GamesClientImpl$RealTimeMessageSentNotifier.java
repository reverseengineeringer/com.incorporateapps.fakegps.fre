package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback;

final class GamesClientImpl$RealTimeMessageSentNotifier
  implements zzq.zzb
{
  private final String zzaFf;
  private final int zzaFg;
  private final int zzade;
  
  GamesClientImpl$RealTimeMessageSentNotifier(int paramInt1, int paramInt2, String paramString)
  {
    zzade = paramInt1;
    zzaFg = paramInt2;
    zzaFf = paramString;
  }
  
  public final void zza(RealTimeMultiplayer.ReliableMessageSentCallback paramReliableMessageSentCallback)
  {
    if (paramReliableMessageSentCallback != null) {
      paramReliableMessageSentCallback.onRealTimeMessageSent(zzade, zzaFg, zzaFf);
    }
  }
  
  public final void zzpr() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.RealTimeMessageSentNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */