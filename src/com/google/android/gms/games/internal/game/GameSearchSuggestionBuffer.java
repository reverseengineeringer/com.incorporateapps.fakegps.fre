package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class GameSearchSuggestionBuffer
  extends AbstractDataBuffer
{
  public GameSearchSuggestionBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public final GameSearchSuggestion zzgB(int paramInt)
  {
    return new GameSearchSuggestionRef(zzahi, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */