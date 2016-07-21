package com.google.android.gms.games.internal.constants;

public final class LeaderboardCollection
{
  public static String zzgw(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Unknown leaderboard collection: " + paramInt);
    case 0: 
      return "PUBLIC";
    case 1: 
      return "SOCIAL";
    }
    return "SOCIAL_1P";
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.constants.LeaderboardCollection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */