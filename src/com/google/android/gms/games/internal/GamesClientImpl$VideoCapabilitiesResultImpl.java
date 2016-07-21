package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.games.video.Videos.VideoCapabilitiesResult;

public final class GamesClientImpl$VideoCapabilitiesResultImpl
  implements Videos.VideoCapabilitiesResult
{
  private final Status zzUX;
  private final VideoCapabilities zzaFD;
  
  GamesClientImpl$VideoCapabilitiesResultImpl(Status paramStatus, VideoCapabilities paramVideoCapabilities)
  {
    zzUX = paramStatus;
    zzaFD = paramVideoCapabilities;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.VideoCapabilitiesResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */