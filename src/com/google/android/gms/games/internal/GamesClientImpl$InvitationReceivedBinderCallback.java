package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

final class GamesClientImpl$InvitationReceivedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zzq zzari;
  
  GamesClientImpl$InvitationReceivedBinderCallback(zzq paramzzq)
  {
    zzari = paramzzq;
  }
  
  public final void onInvitationRemoved(String paramString)
  {
    zzari.zza(new GamesClientImpl.InvitationRemovedNotifier(paramString));
  }
  
  public final void zzs(DataHolder paramDataHolder)
  {
    InvitationBuffer localInvitationBuffer = new InvitationBuffer(paramDataHolder);
    paramDataHolder = null;
    try
    {
      if (localInvitationBuffer.getCount() > 0) {
        paramDataHolder = (Invitation)((Invitation)localInvitationBuffer.get(0)).freeze();
      }
      localInvitationBuffer.release();
      if (paramDataHolder != null) {
        zzari.zza(new GamesClientImpl.InvitationReceivedNotifier(paramDataHolder));
      }
      return;
    }
    finally
    {
      localInvitationBuffer.release();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.InvitationReceivedBinderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */