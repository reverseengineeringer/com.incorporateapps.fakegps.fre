package com.google.android.gms.games.video;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class VideoBuffer
  extends AbstractDataBuffer
{
  public VideoBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public final VideoRef zzgX(int paramInt)
  {
    return new VideoRef(zzahi, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.video.VideoBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */