package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.GetServerAuthCodeResult;

final class GamesClientImpl$GetServerAuthCodeResultImpl
  implements Games.GetServerAuthCodeResult
{
  private final Status zzUX;
  private final String zzaEs;
  
  GamesClientImpl$GetServerAuthCodeResultImpl(Status paramStatus, String paramString)
  {
    zzUX = paramStatus;
    zzaEs = paramString;
  }
  
  public final String getCode()
  {
    return zzaEs;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.GetServerAuthCodeResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */