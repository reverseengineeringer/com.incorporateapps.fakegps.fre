package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$RequestSentBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFj;
  
  public GamesClientImpl$RequestSentBinderCallbacks(zza.zzb paramzzb)
  {
    zzaFj = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzL(DataHolder paramDataHolder)
  {
    zzaFj.zzs(new GamesClientImpl.SendRequestResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.RequestSentBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */