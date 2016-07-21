package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class QuestBuffer
  extends zzf
{
  public QuestBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected final String zzqg()
  {
    return "external_quest_id";
  }
  
  protected final Quest zzt(int paramInt1, int paramInt2)
  {
    return new QuestRef(zzahi, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.quest.QuestBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */