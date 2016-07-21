package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Players.LoadXpForGameCategoriesResult;
import java.util.List;

final class GamesClientImpl$LoadXpForGameCategoriesResultImpl
  implements Players.LoadXpForGameCategoriesResult
{
  private final Status zzUX;
  private final List zzaEO;
  private final Bundle zzaEP;
  
  GamesClientImpl$LoadXpForGameCategoriesResultImpl(Status paramStatus, Bundle paramBundle)
  {
    zzUX = paramStatus;
    zzaEO = paramBundle.getStringArrayList("game_category_list");
    zzaEP = paramBundle;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.LoadXpForGameCategoriesResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */