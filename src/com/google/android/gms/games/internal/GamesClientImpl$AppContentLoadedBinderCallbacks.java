package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$AppContentLoadedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaEl;
  
  public GamesClientImpl$AppContentLoadedBinderCallbacks(zza.zzb paramzzb)
  {
    zzaEl = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zza(DataHolder[] paramArrayOfDataHolder)
  {
    zzaEl.zzs(new GamesClientImpl.LoadAppContentsResultImpl(paramArrayOfDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.AppContentLoadedBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */