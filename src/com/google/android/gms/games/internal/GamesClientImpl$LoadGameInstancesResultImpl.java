package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult;
import com.google.android.gms.games.internal.game.GameInstanceBuffer;

final class GamesClientImpl$LoadGameInstancesResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements GamesMetadata.LoadGameInstancesResult
{
  private final GameInstanceBuffer zzaEC;
  
  GamesClientImpl$LoadGameInstancesResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    zzaEC = new GameInstanceBuffer(paramDataHolder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.LoadGameInstancesResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */