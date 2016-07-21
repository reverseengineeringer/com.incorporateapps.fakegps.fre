package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

final class GamesClientImpl$InvitationRemovedNotifier
  implements zzq.zzb
{
  private final String zzUO;
  
  GamesClientImpl$InvitationRemovedNotifier(String paramString)
  {
    zzUO = paramString;
  }
  
  public final void zza(OnInvitationReceivedListener paramOnInvitationReceivedListener)
  {
    paramOnInvitationReceivedListener.onInvitationRemoved(zzUO);
  }
  
  public final void zzpr() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.InvitationRemovedNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */