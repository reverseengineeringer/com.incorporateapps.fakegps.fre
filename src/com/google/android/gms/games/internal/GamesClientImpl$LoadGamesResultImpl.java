package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GamesMetadata.LoadGamesResult;

final class GamesClientImpl$LoadGamesResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements GamesMetadata.LoadGamesResult
{
  private final GameBuffer zzaEE;
  
  GamesClientImpl$LoadGamesResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    zzaEE = new GameBuffer(paramDataHolder);
  }
  
  public final GameBuffer getGames()
  {
    return zzaEE;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.LoadGamesResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */