package com.google.android.gms.games.achievement;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class AchievementBuffer
  extends AbstractDataBuffer
{
  public AchievementBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public final Achievement get(int paramInt)
  {
    return new AchievementRef(zzahi, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.achievement.AchievementBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */