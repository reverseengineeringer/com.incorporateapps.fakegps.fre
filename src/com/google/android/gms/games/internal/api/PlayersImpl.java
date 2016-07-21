package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class PlayersImpl
  implements Players
{
  public final Intent getCompareProfileIntent(GoogleApiClient paramGoogleApiClient, Player paramPlayer)
  {
    return Games.zzh(paramGoogleApiClient).zza(new PlayerEntity(paramPlayer));
  }
  
  public final Player getCurrentPlayer(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwx();
  }
  
  public final String getCurrentPlayerId(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzah(true);
  }
  
  public final Intent getPlayerSearchIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzh(paramGoogleApiClient).zzwH();
  }
  
  public final PendingResult loadConnectedPlayers(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new PlayersImpl.8(this, paramGoogleApiClient, paramBoolean));
  }
  
  public final PendingResult loadInvitablePlayers(GoogleApiClient paramGoogleApiClient, int paramInt, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new PlayersImpl.4(this, paramGoogleApiClient, paramInt, paramBoolean));
  }
  
  public final PendingResult loadMoreInvitablePlayers(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    return paramGoogleApiClient.zza(new PlayersImpl.5(this, paramGoogleApiClient, paramInt));
  }
  
  public final PendingResult loadMoreRecentlyPlayedWithPlayers(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    return paramGoogleApiClient.zza(new PlayersImpl.7(this, paramGoogleApiClient, paramInt));
  }
  
  public final PendingResult loadPlayer(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zza(new PlayersImpl.1(this, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult loadPlayer(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new PlayersImpl.2(this, paramGoogleApiClient, paramString, paramBoolean));
  }
  
  public final PendingResult loadRecentlyPlayedWithPlayers(GoogleApiClient paramGoogleApiClient, int paramInt, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new PlayersImpl.6(this, paramGoogleApiClient, paramInt, paramBoolean));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.PlayersImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */