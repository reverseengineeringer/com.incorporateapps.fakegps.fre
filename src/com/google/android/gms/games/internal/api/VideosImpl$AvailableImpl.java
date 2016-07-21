package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.video.Videos.VideoAvailableResult;

abstract class VideosImpl$AvailableImpl
  extends Games.BaseGamesApiMethodImpl
{
  public Videos.VideoAvailableResult zzaO(Status paramStatus)
  {
    return new VideosImpl.AvailableImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.VideosImpl.AvailableImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */