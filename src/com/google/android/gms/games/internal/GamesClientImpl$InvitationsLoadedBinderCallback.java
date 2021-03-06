package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$InvitationsLoadedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$InvitationsLoadedBinderCallback(zza.zzb paramzzb)
  {
    zzamC = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzr(DataHolder paramDataHolder)
  {
    zzamC.zzs(new GamesClientImpl.LoadInvitationsResultImpl(paramDataHolder));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.InvitationsLoadedBinderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */