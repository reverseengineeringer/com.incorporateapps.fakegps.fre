package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq;

final class GamesClientImpl$RealTimeReliableMessageBinderCallbacks
  extends AbstractGamesCallbacks
{
  final zzq zzaFh;
  
  public GamesClientImpl$RealTimeReliableMessageBinderCallbacks(zzq paramzzq)
  {
    zzaFh = paramzzq;
  }
  
  public final void zzb(int paramInt1, int paramInt2, String paramString)
  {
    if (zzaFh != null) {
      zzaFh.zza(new GamesClientImpl.RealTimeMessageSentNotifier(paramInt1, paramInt2, paramString));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.RealTimeReliableMessageBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */