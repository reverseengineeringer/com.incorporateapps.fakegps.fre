package com.google.android.gms.games.quest;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Quests
{
  public static final String EXTRA_QUEST = "quest";
  public static final int SELECT_ACCEPTED = 3;
  public static final int[] SELECT_ALL_QUESTS = { 1, 2, 3, 4, 101, 5, 102, 6, 103 };
  public static final int SELECT_COMPLETED = 4;
  public static final int SELECT_COMPLETED_UNCLAIMED = 101;
  public static final int SELECT_ENDING_SOON = 102;
  public static final int SELECT_EXPIRED = 5;
  public static final int SELECT_FAILED = 6;
  public static final int SELECT_OPEN = 2;
  public static final int SELECT_RECENTLY_FAILED = 103;
  public static final int SELECT_UPCOMING = 1;
  public static final int SORT_ORDER_ENDING_SOON_FIRST = 1;
  public static final int SORT_ORDER_RECENTLY_UPDATED_FIRST = 0;
  
  public abstract PendingResult accept(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult claim(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2);
  
  public abstract Intent getQuestIntent(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract Intent getQuestsIntent(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt);
  
  public abstract PendingResult load(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt, int paramInt, boolean paramBoolean);
  
  public abstract PendingResult loadByIds(GoogleApiClient paramGoogleApiClient, boolean paramBoolean, String... paramVarArgs);
  
  public abstract void registerQuestUpdateListener(GoogleApiClient paramGoogleApiClient, QuestUpdateListener paramQuestUpdateListener);
  
  public abstract void showStateChangedPopup(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract void unregisterQuestUpdateListener(GoogleApiClient paramGoogleApiClient);
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.quest.Quests
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */