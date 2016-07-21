package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.AbstractDataBuffer;

public final class MilestoneBuffer
  extends AbstractDataBuffer
{
  public final Milestone get(int paramInt)
  {
    return new MilestoneRef(zzahi, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.quest.MilestoneBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */