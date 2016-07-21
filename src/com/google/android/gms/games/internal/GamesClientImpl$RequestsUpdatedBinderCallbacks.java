package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$RequestsUpdatedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFm;
  
  public GamesClientImpl$RequestsUpdatedBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFm = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzK(DataHolder paramDataHolder)
  {
    zzaFm.zzs(new GamesClientImpl.UpdateRequestsResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.RequestsUpdatedBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */