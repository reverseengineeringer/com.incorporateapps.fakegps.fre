package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;

public final class TurnBasedMatchConfig$Builder
{
  int zzaJJ = -1;
  ArrayList zzaJY = new ArrayList();
  Bundle zzaJZ = null;
  int zzaKi = 2;
  
  public final Builder addInvitedPlayer(String paramString)
  {
    zzx.zzz(paramString);
    zzaJY.add(paramString);
    return this;
  }
  
  public final Builder addInvitedPlayers(ArrayList paramArrayList)
  {
    zzx.zzz(paramArrayList);
    zzaJY.addAll(paramArrayList);
    return this;
  }
  
  public final TurnBasedMatchConfig build()
  {
    return new TurnBasedMatchConfigImpl(this);
  }
  
  public final Builder setAutoMatchCriteria(Bundle paramBundle)
  {
    zzaJZ = paramBundle;
    return this;
  }
  
  public final Builder setVariant(int paramInt)
  {
    if ((paramInt == -1) || (paramInt > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
      zzaJJ = paramInt;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */