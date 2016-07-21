package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.Quests.LoadQuestsResult;

final class GamesClientImpl$LoadQuestsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Quests.LoadQuestsResult
{
  private final DataHolder zzahi;
  
  GamesClientImpl$LoadQuestsResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    zzahi = paramDataHolder;
  }
  
  public final QuestBuffer getQuests()
  {
    return new QuestBuffer(zzahi);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.LoadQuestsResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */