package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestUpdateListener;

final class GamesClientImpl$QuestCompletedNotifier
  implements zzq.zzb
{
  private final Quest zzaEk;
  
  GamesClientImpl$QuestCompletedNotifier(Quest paramQuest)
  {
    zzaEk = paramQuest;
  }
  
  public final void zza(QuestUpdateListener paramQuestUpdateListener)
  {
    paramQuestUpdateListener.onQuestCompleted(zzaEk);
  }
  
  public final void zzpr() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.QuestCompletedNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */