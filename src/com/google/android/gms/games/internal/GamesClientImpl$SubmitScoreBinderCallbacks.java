package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$SubmitScoreBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  public GamesClientImpl$SubmitScoreBinderCallbacks(zza.zzb paramzzb)
  {
    zzamC = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzk(DataHolder paramDataHolder)
  {
    zzamC.zzs(new GamesClientImpl.SubmitScoreResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.SubmitScoreBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */