package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult;
import com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer;

final class GamesClientImpl$LoadGameSearchSuggestionsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements GamesMetadata.LoadGameSearchSuggestionsResult
{
  private final GameSearchSuggestionBuffer zzaED;
  
  GamesClientImpl$LoadGameSearchSuggestionsResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    zzaED = new GameSearchSuggestionBuffer(paramDataHolder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.LoadGameSearchSuggestionsResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */