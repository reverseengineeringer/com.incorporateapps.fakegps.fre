package com.google.android.gms.games.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class GameRequestBuffer
  extends zzf
{
  public GameRequestBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  protected final String zzqg()
  {
    return "external_request_id";
  }
  
  protected final GameRequest zzu(int paramInt1, int paramInt2)
  {
    return new GameRequestRef(zzahi, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.request.GameRequestBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */