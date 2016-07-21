package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;

final class GamesClientImpl$RequestReceivedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zzq zzari;
  
  GamesClientImpl$RequestReceivedBinderCallback(zzq paramzzq)
  {
    zzari = paramzzq;
  }
  
  public final void onRequestRemoved(String paramString)
  {
    zzari.zza(new GamesClientImpl.RequestRemovedNotifier(paramString));
  }
  
  public final void zzt(DataHolder paramDataHolder)
  {
    GameRequestBuffer localGameRequestBuffer = new GameRequestBuffer(paramDataHolder);
    paramDataHolder = null;
    try
    {
      if (localGameRequestBuffer.getCount() > 0) {
        paramDataHolder = (GameRequest)((GameRequest)localGameRequestBuffer.get(0)).freeze();
      }
      localGameRequestBuffer.release();
      if (paramDataHolder != null) {
        zzari.zza(new GamesClientImpl.RequestReceivedNotifier(paramDataHolder));
      }
      return;
    }
    finally
    {
      localGameRequestBuffer.release();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.RequestReceivedBinderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */