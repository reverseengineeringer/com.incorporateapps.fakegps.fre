package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class ScoreSubmissionData$Result
{
  public final String formattedScore;
  public final boolean newBest;
  public final long rawScore;
  public final String scoreTag;
  
  public ScoreSubmissionData$Result(long paramLong, String paramString1, String paramString2, boolean paramBoolean)
  {
    rawScore = paramLong;
    formattedScore = paramString1;
    scoreTag = paramString2;
    newBest = paramBoolean;
  }
  
  public final String toString()
  {
    return zzw.zzy(this).zzg("RawScore", Long.valueOf(rawScore)).zzg("FormattedScore", formattedScore).zzg("ScoreTag", scoreTag).zzg("NewBest", Boolean.valueOf(newBest)).toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.leaderboard.ScoreSubmissionData.Result
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */