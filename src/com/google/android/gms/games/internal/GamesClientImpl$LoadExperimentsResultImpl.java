package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.LoadExperimentsResult;
import java.util.HashSet;
import java.util.Set;

final class GamesClientImpl$LoadExperimentsResultImpl
  implements Games.LoadExperimentsResult
{
  private final Status zzUX;
  private final Set zzaEB;
  
  GamesClientImpl$LoadExperimentsResultImpl(int paramInt, long[] paramArrayOfLong)
  {
    zzUX = new Status(paramInt);
    zzaEB = new HashSet();
    paramInt = 0;
    while (paramInt < paramArrayOfLong.length)
    {
      zzaEB.add(Long.valueOf(paramArrayOfLong[paramInt]));
      paramInt += 1;
    }
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.LoadExperimentsResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */