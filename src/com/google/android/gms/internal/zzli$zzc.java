package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerClient;
import com.google.android.gms.cast.games.GameManagerClient.GameManagerInstanceResult;
import com.google.android.gms.common.api.Status;

public abstract class zzli$zzc
  extends zzli.zzb
{
  private GameManagerClient zzacV;
  
  public zzli$zzc(zzli paramzzli, GameManagerClient paramGameManagerClient)
  {
    super(paramzzli);
    zzacV = paramGameManagerClient;
    zzacm = new zzli.zzc.1(this, paramzzli);
  }
  
  public GameManagerClient.GameManagerInstanceResult zzs(Status paramStatus)
  {
    return new zzli.zzd(paramStatus, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzli.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */