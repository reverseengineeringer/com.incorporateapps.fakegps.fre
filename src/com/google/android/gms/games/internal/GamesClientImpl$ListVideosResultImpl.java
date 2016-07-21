package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.video.VideoBuffer;
import com.google.android.gms.games.video.Videos.ListVideosResult;

public final class GamesClientImpl$ListVideosResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Videos.ListVideosResult
{
  private final VideoBuffer zzaEx;
  
  public GamesClientImpl$ListVideosResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    zzaEx = new VideoBuffer(paramDataHolder);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.ListVideosResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */