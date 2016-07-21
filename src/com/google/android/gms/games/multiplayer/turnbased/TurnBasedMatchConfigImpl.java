package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import java.util.ArrayList;

public final class TurnBasedMatchConfigImpl
  extends TurnBasedMatchConfig
{
  private final int zzaJJ;
  private final Bundle zzaJZ;
  private final String[] zzaKa;
  private final int zzaKi;
  
  TurnBasedMatchConfigImpl(TurnBasedMatchConfig.Builder paramBuilder)
  {
    zzaJJ = zzaJJ;
    zzaKi = zzaKi;
    zzaJZ = zzaJZ;
    int i = zzaJY.size();
    zzaKa = ((String[])zzaJY.toArray(new String[i]));
  }
  
  public final Bundle getAutoMatchCriteria()
  {
    return zzaJZ;
  }
  
  public final String[] getInvitedPlayerIds()
  {
    return zzaKa;
  }
  
  public final int getVariant()
  {
    return zzaJJ;
  }
  
  public final int zzxP()
  {
    return zzaKi;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfigImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */