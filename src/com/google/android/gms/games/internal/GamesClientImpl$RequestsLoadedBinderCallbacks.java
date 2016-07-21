package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.GamesStatusCodes;

final class GamesClientImpl$RequestsLoadedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFl;
  
  public GamesClientImpl$RequestsLoadedBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFl = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzd(int paramInt, Bundle paramBundle)
  {
    paramBundle.setClassLoader(getClass().getClassLoader());
    Status localStatus = GamesStatusCodes.zzgc(paramInt);
    zzaFl.zzs(new GamesClientImpl.LoadRequestsResultImpl(localStatus, paramBundle));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.RequestsLoadedBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */