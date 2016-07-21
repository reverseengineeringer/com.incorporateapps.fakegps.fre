package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.ParticipantResult;

class TurnBasedMultiplayerImpl$4
  extends TurnBasedMultiplayerImpl.UpdateMatchImpl
{
  TurnBasedMultiplayerImpl$4(TurnBasedMultiplayerImpl paramTurnBasedMultiplayerImpl, GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2, ParticipantResult[] paramArrayOfParticipantResult)
  {
    super(paramGoogleApiClient, null);
  }
  
  protected void zza(GamesClientImpl paramGamesClientImpl)
  {
    paramGamesClientImpl.zza(this, zzaHI, zzaHL, zzaHM, zzaHN);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */