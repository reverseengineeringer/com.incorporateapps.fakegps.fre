package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.quest.Quests.LoadQuestsResult;

abstract class QuestsImpl$LoadsImpl
  extends Games.BaseGamesApiMethodImpl
{
  private QuestsImpl$LoadsImpl(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public Quests.LoadQuestsResult zzay(Status paramStatus)
  {
    return new QuestsImpl.LoadsImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.QuestsImpl.LoadsImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */