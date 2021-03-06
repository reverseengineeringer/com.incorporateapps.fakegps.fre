package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$GamesLoadedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$GamesLoadedBinderCallback(zza.zzb paramzzb)
  {
    zzamC = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzn(DataHolder paramDataHolder)
  {
    zzamC.zzs(new GamesClientImpl.LoadGamesResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.GamesLoadedBinderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */