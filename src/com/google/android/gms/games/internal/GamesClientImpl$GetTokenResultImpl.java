package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.GetTokenResult;

final class GamesClientImpl$GetTokenResultImpl
  implements Games.GetTokenResult
{
  private final Status zzUX;
  private final String zzVo;
  
  GamesClientImpl$GetTokenResultImpl(Status paramStatus, String paramString)
  {
    zzUX = paramStatus;
    zzVo = paramString;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.GetTokenResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */