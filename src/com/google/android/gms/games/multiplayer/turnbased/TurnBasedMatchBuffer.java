package com.google.android.gms.games.multiplayer.turnbased;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class TurnBasedMatchBuffer
  extends zzf
{
  public TurnBasedMatchBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected final String zzqg()
  {
    return "external_match_id";
  }
  
  protected final TurnBasedMatch zzs(int paramInt1, int paramInt2)
  {
    return new TurnBasedMatchRef(zzahi, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */