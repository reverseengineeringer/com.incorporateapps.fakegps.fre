package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.GameRef;

public final class ExperienceEventRef
  extends zzc
  implements ExperienceEvent
{
  private final GameRef zzaIk;
  
  public ExperienceEventRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
    if (zzcB("external_game_id"))
    {
      zzaIk = null;
      return;
    }
    zzaIk = new GameRef(zzahi, zzaje);
  }
  
  public final String getIconImageUrl()
  {
    return getString("icon_url");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.experience.ExperienceEventRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */