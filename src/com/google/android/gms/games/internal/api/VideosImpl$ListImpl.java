package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.video.Videos.ListVideosResult;

abstract class VideosImpl$ListImpl
  extends Games.BaseGamesApiMethodImpl
{
  public Videos.ListVideosResult zzaQ(Status paramStatus)
  {
    return new VideosImpl.ListImpl.1(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.api.VideosImpl.ListImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */