package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$QuestsLoadedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFe;
  
  public GamesClientImpl$QuestsLoadedBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFe = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzT(DataHolder paramDataHolder)
  {
    zzaFe.zzs(new GamesClientImpl.LoadQuestsResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.QuestsLoadedBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */