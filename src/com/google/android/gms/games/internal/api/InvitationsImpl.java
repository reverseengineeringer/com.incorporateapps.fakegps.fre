package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

public final class InvitationsImpl
  implements Invitations
{
  public final Intent getInvitationInboxIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwC();
  }
  
  public final PendingResult loadInvitations(GoogleApiClient paramGoogleApiClient)
  {
    return loadInvitations(paramGoogleApiClient, 0);
  }
  
  public final PendingResult loadInvitations(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    return paramGoogleApiClient.zza(new InvitationsImpl.1(this, paramGoogleApiClient, paramInt));
  }
  
  public final void registerInvitationListener(GoogleApiClient paramGoogleApiClient, OnInvitationReceivedListener paramOnInvitationReceivedListener)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zza(paramGoogleApiClient.zzr(paramOnInvitationReceivedListener));
    }
  }
  
  public final void unregisterInvitationListener(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = Games.zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzwD();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.InvitationsImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */