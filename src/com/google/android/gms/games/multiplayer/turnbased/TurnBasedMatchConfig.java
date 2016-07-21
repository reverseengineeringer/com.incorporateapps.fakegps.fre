package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;

public abstract class TurnBasedMatchConfig
{
  public static TurnBasedMatchConfig.Builder builder()
  {
    return new TurnBasedMatchConfig.Builder(null);
  }
  
  public static Bundle createAutoMatchCriteria(int paramInt1, int paramInt2, long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("min_automatch_players", paramInt1);
    localBundle.putInt("max_automatch_players", paramInt2);
    localBundle.putLong("exclusive_bit_mask", paramLong);
    return localBundle;
  }
  
  public abstract Bundle getAutoMatchCriteria();
  
  public abstract String[] getInvitedPlayerIds();
  
  public abstract int getVariant();
  
  public abstract int zzxP();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */