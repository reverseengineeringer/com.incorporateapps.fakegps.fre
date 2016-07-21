package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

final class GamesClientImpl$InvitationReceivedNotifier
  implements zzq.zzb
{
  private final Invitation zzaEu;
  
  GamesClientImpl$InvitationReceivedNotifier(Invitation paramInvitation)
  {
    zzaEu = paramInvitation;
  }
  
  public final void zza(OnInvitationReceivedListener paramOnInvitationReceivedListener)
  {
    paramOnInvitationReceivedListener.onInvitationReceived(zzaEu);
  }
  
  public final void zzpr() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.InvitationReceivedNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */