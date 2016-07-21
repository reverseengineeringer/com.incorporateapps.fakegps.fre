package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.video.Videos.VideoAvailableResult;

public final class GamesClientImpl$VideoAvailableResultImpl
  implements Videos.VideoAvailableResult
{
  private final Status zzUX;
  private final boolean zzaFC;
  
  GamesClientImpl$VideoAvailableResultImpl(Status paramStatus, boolean paramBoolean)
  {
    zzUX = paramStatus;
    zzaFC = paramBoolean;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.VideoAvailableResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */