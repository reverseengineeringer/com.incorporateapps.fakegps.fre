package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;

final class GamesClientImpl$QuestUpdateBinderCallback
  extends AbstractGamesCallbacks
{
  private final zzq zzari;
  
  GamesClientImpl$QuestUpdateBinderCallback(zzq paramzzq)
  {
    zzari = paramzzq;
  }
  
  private Quest zzaa(DataHolder paramDataHolder)
  {
    QuestBuffer localQuestBuffer = new QuestBuffer(paramDataHolder);
    paramDataHolder = null;
    try
    {
      if (localQuestBuffer.getCount() > 0) {
        paramDataHolder = (Quest)((Quest)localQuestBuffer.get(0)).freeze();
      }
      return paramDataHolder;
    }
    finally
    {
      localQuestBuffer.release();
    }
  }
  
  public final void zzR(DataHolder paramDataHolder)
  {
    paramDataHolder = zzaa(paramDataHolder);
    if (paramDataHolder != null) {
      zzari.zza(new GamesClientImpl.QuestCompletedNotifier(paramDataHolder));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.QuestUpdateBinderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */