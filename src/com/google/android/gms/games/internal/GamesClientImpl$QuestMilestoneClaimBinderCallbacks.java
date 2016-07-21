package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$QuestMilestoneClaimBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFc;
  private final String zzaFd;
  
  public GamesClientImpl$QuestMilestoneClaimBinderCallbacks(zza.zzb paramzzb, String paramString)
  {
    zzaFc = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
    zzaFd = ((String)zzx.zzb(paramString, "MilestoneId must not be null"));
  }
  
  public final void zzP(DataHolder paramDataHolder)
  {
    zzaFc.zzs(new GamesClientImpl.ClaimMilestoneResultImpl(paramDataHolder, zzaFd));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.QuestMilestoneClaimBinderCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */