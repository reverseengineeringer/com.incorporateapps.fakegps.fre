package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.TurnBasedMatchTurnStatus;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

public final class LoadMatchesResponse
{
  private final InvitationBuffer zzaKe;
  private final TurnBasedMatchBuffer zzaKf;
  private final TurnBasedMatchBuffer zzaKg;
  private final TurnBasedMatchBuffer zzaKh;
  
  public LoadMatchesResponse(Bundle paramBundle)
  {
    DataHolder localDataHolder = zza(paramBundle, 0);
    if (localDataHolder != null)
    {
      zzaKe = new InvitationBuffer(localDataHolder);
      localDataHolder = zza(paramBundle, 1);
      if (localDataHolder == null) {
        break label101;
      }
      zzaKf = new TurnBasedMatchBuffer(localDataHolder);
      label48:
      localDataHolder = zza(paramBundle, 2);
      if (localDataHolder == null) {
        break label109;
      }
    }
    label101:
    label109:
    for (zzaKg = new TurnBasedMatchBuffer(localDataHolder);; zzaKg = null)
    {
      paramBundle = zza(paramBundle, 3);
      if (paramBundle == null) {
        break label117;
      }
      zzaKh = new TurnBasedMatchBuffer(paramBundle);
      return;
      zzaKe = null;
      break;
      zzaKf = null;
      break label48;
    }
    label117:
    zzaKh = null;
  }
  
  private static DataHolder zza(Bundle paramBundle, int paramInt)
  {
    String str = TurnBasedMatchTurnStatus.zzgw(paramInt);
    if (!paramBundle.containsKey(str)) {
      return null;
    }
    return (DataHolder)paramBundle.getParcelable(str);
  }
  
  public final void close()
  {
    release();
  }
  
  public final TurnBasedMatchBuffer getCompletedMatches()
  {
    return zzaKh;
  }
  
  public final InvitationBuffer getInvitations()
  {
    return zzaKe;
  }
  
  public final TurnBasedMatchBuffer getMyTurnMatches()
  {
    return zzaKf;
  }
  
  public final TurnBasedMatchBuffer getTheirTurnMatches()
  {
    return zzaKg;
  }
  
  public final boolean hasData()
  {
    if ((zzaKe != null) && (zzaKe.getCount() > 0)) {}
    while (((zzaKf != null) && (zzaKf.getCount() > 0)) || ((zzaKg != null) && (zzaKg.getCount() > 0)) || ((zzaKh != null) && (zzaKh.getCount() > 0))) {
      return true;
    }
    return false;
  }
  
  public final void release()
  {
    if (zzaKe != null) {
      zzaKe.release();
    }
    if (zzaKf != null) {
      zzaKf.release();
    }
    if (zzaKg != null) {
      zzaKg.release();
    }
    if (zzaKh != null) {
      zzaKh.release();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */