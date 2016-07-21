package com.google.android.gms.games.internal;

import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.games.stats.Stats.LoadPlayerStatsResult;

final class GamesClientImpl$LoadPlayerStatsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Stats.LoadPlayerStatsResult
{
  private final PlayerStats zzaEI;
  
  /* Error */
  GamesClientImpl$LoadPlayerStatsResultImpl(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 12	com/google/android/gms/games/internal/GamesClientImpl$GamesDataHolderResult:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   5: new 14	com/google/android/gms/games/stats/PlayerStatsBuffer
    //   8: dup
    //   9: aload_1
    //   10: invokespecial 15	com/google/android/gms/games/stats/PlayerStatsBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   13: astore_1
    //   14: aload_1
    //   15: invokevirtual 19	com/google/android/gms/games/stats/PlayerStatsBuffer:getCount	()I
    //   18: ifle +24 -> 42
    //   21: aload_0
    //   22: new 21	com/google/android/gms/games/stats/PlayerStatsEntity
    //   25: dup
    //   26: aload_1
    //   27: iconst_0
    //   28: invokevirtual 25	com/google/android/gms/games/stats/PlayerStatsBuffer:zzgV	(I)Lcom/google/android/gms/games/stats/PlayerStats;
    //   31: invokespecial 28	com/google/android/gms/games/stats/PlayerStatsEntity:<init>	(Lcom/google/android/gms/games/stats/PlayerStats;)V
    //   34: putfield 30	com/google/android/gms/games/internal/GamesClientImpl$LoadPlayerStatsResultImpl:zzaEI	Lcom/google/android/gms/games/stats/PlayerStats;
    //   37: aload_1
    //   38: invokevirtual 34	com/google/android/gms/games/stats/PlayerStatsBuffer:release	()V
    //   41: return
    //   42: aload_0
    //   43: aconst_null
    //   44: putfield 30	com/google/android/gms/games/internal/GamesClientImpl$LoadPlayerStatsResultImpl:zzaEI	Lcom/google/android/gms/games/stats/PlayerStats;
    //   47: goto -10 -> 37
    //   50: astore_2
    //   51: aload_1
    //   52: invokevirtual 34	com/google/android/gms/games/stats/PlayerStatsBuffer:release	()V
    //   55: aload_2
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	LoadPlayerStatsResultImpl
    //   0	57	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   50	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	37	50	finally
    //   42	47	50	finally
  }
  
  public final PlayerStats getPlayerStats()
  {
    return zzaEI;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.LoadPlayerStatsResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */