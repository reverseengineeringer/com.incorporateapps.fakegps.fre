package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;

final class GamesClientImpl$StartRecordingBinderCallback
  extends AbstractGamesCallbacks
{
  private final Games.BaseGamesApiMethodImpl zzaFt;
  
  GamesClientImpl$StartRecordingBinderCallback(Games.BaseGamesApiMethodImpl paramBaseGamesApiMethodImpl)
  {
    zzaFt = ((Games.BaseGamesApiMethodImpl)zzx.zzb(paramBaseGamesApiMethodImpl, "Holder must not be null"));
  }
  
  public final void zzgq(int paramInt)
  {
    zzaFt.zza(new Status(paramInt));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.StartRecordingBinderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */