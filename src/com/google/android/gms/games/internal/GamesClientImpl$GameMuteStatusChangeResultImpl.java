package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.Notifications.GameMuteStatusChangeResult;

final class GamesClientImpl$GameMuteStatusChangeResultImpl
  implements Notifications.GameMuteStatusChangeResult
{
  private final Status zzUX;
  private final String zzaEq;
  private final boolean zzaEr;
  
  public GamesClientImpl$GameMuteStatusChangeResultImpl(int paramInt, String paramString, boolean paramBoolean)
  {
    zzUX = GamesStatusCodes.zzgc(paramInt);
    zzaEq = paramString;
    zzaEr = paramBoolean;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.GameMuteStatusChangeResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */