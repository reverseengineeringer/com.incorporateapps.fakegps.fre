package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.internal.constants.TimeSpan;
import java.util.HashMap;

public final class ScoreSubmissionData
{
  private static final String[] zzaIX = { "leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag" };
  private String zzaIZ;
  private HashMap zzaJD;
  private String zzacX;
  private int zzade;
  
  public ScoreSubmissionData(DataHolder paramDataHolder)
  {
    zzade = paramDataHolder.getStatusCode();
    zzaJD = new HashMap();
    int j = paramDataHolder.getCount();
    if (j == 3) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzac(bool);
      int i = 0;
      while (i < j)
      {
        int k = paramDataHolder.zzbH(i);
        if (i == 0)
        {
          zzaIZ = paramDataHolder.zzd("leaderboardId", i, k);
          zzacX = paramDataHolder.zzd("playerId", i, k);
        }
        if (paramDataHolder.zze("hasResult", i, k)) {
          zza(new ScoreSubmissionData.Result(paramDataHolder.zzb("rawScore", i, k), paramDataHolder.zzd("formattedScore", i, k), paramDataHolder.zzd("scoreTag", i, k), paramDataHolder.zze("newBest", i, k)), paramDataHolder.zzc("timeSpan", i, k));
        }
        i += 1;
      }
    }
  }
  
  private void zza(ScoreSubmissionData.Result paramResult, int paramInt)
  {
    zzaJD.put(Integer.valueOf(paramInt), paramResult);
  }
  
  public final String getLeaderboardId()
  {
    return zzaIZ;
  }
  
  public final String getPlayerId()
  {
    return zzacX;
  }
  
  public final ScoreSubmissionData.Result getScoreResult(int paramInt)
  {
    return (ScoreSubmissionData.Result)zzaJD.get(Integer.valueOf(paramInt));
  }
  
  public final String toString()
  {
    zzw.zza localzza = zzw.zzy(this).zzg("PlayerId", zzacX).zzg("StatusCode", Integer.valueOf(zzade));
    int i = 0;
    if (i < 3)
    {
      Object localObject = (ScoreSubmissionData.Result)zzaJD.get(Integer.valueOf(i));
      localzza.zzg("TimesSpan", TimeSpan.zzgw(i));
      if (localObject == null) {}
      for (localObject = "null";; localObject = ((ScoreSubmissionData.Result)localObject).toString())
      {
        localzza.zzg("Result", localObject);
        i += 1;
        break;
      }
    }
    return localzza.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.leaderboard.ScoreSubmissionData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */