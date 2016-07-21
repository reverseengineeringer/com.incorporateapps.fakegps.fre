package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult;

final class GamesClientImpl$LoadInvitationsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Invitations.LoadInvitationsResult
{
  private final InvitationBuffer zzaEF;
  
  GamesClientImpl$LoadInvitationsResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    zzaEF = new InvitationBuffer(paramDataHolder);
  }
  
  public final InvitationBuffer getInvitations()
  {
    return zzaEF;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.LoadInvitationsResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */