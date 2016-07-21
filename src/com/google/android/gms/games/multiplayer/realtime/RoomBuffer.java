package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class RoomBuffer
  extends zzf
{
  public RoomBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected final String zzqg()
  {
    return "external_match_id";
  }
  
  protected final Room zzr(int paramInt1, int paramInt2)
  {
    return new RoomRef(zzahi, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RoomBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */