package com.google.android.gms.internal;

import com.google.android.gms.cast.games.GameManagerClient.GameManagerResult;
import com.google.android.gms.common.api.Status;

public abstract class zzli$zza
  extends zzli.zzb
{
  public zzli$zza(zzli paramzzli)
  {
    super(paramzzli);
    zzacm = new zzli.zza.1(this, paramzzli);
  }
  
  public GameManagerClient.GameManagerResult zzr(Status paramStatus)
  {
    return new zzli.zze(paramStatus, null, -1L, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzli.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */