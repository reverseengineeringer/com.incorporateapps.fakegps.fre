package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.games.GameManagerClient.GameManagerInstanceResult;
import com.google.android.gms.common.api.Status;

final class zzli$zzd
  implements GameManagerClient.GameManagerInstanceResult
{
  private final Status zzUX;
  private final GameManagerClient zzacV;
  
  zzli$zzd(Status paramStatus, GameManagerClient paramGameManagerClient)
  {
    zzUX = paramStatus;
    zzacV = paramGameManagerClient;
  }
  
  public final GameManagerClient getGameManagerClient()
  {
    return zzacV;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzli.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */