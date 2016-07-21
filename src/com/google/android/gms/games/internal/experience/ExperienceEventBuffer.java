package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class ExperienceEventBuffer
  extends AbstractDataBuffer
{
  public ExperienceEventBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public final ExperienceEvent zzgx(int paramInt)
  {
    return new ExperienceEventRef(zzahi, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.experience.ExperienceEventBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */