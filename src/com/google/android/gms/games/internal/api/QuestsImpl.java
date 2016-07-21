package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests;

public final class QuestsImpl
  implements Quests
{
  public final PendingResult accept(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zzb(new QuestsImpl.1(this, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult claim(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    return paramGoogleApiClient.zzb(new QuestsImpl.2(this, paramGoogleApiClient, paramString1, paramString2));
  }
  
  public final Intent getQuestIntent(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return Games.zzh(paramGoogleApiClient).zzdI(paramString);
  }
  
  public final Intent getQuestsIntent(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt)
  {
    return Games.zzh(paramGoogleApiClient).zzb(paramArrayOfInt);
  }
  
  public final PendingResult load(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new QuestsImpl.3(this, paramGoogleApiClient, paramArrayOfInt, paramInt, paramBoolean));
  }
  
  public final PendingResult loadByIds(GoogleApiClient paramGoogleApiClient, boolean paramBoolean, String... paramVarArgs)
  {
    return paramGoogleApiClient.zza(new QuestsImpl.4(this, paramGoogleApiClient, paramBoolean, paramVarArgs));
  }
  
  public final void registerQuestUpdateListener(GoogleApiClient paramGoogleApiClient, QuestUpdateListener paramQuestUpdateListener)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zzc(paramGoogleApiClient.zzr(paramQuestUpdateListener));
    }
  }
  
  public final void showStateChangedPopup(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    paramGoogleApiClient = Games.zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzdJ(paramString);
    }
  }
  
  public final void unregisterQuestUpdateListener(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = Games.zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzwF();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.QuestsImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */