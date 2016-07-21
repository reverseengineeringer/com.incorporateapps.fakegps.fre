package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.video.VideoCapabilities;

final class GamesClientImpl$VideoRecordingCapabilitiesBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$VideoRecordingCapabilitiesBinderCallback(zza.zzb paramzzb)
  {
    zzamC = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zza(int paramInt, VideoCapabilities paramVideoCapabilities)
  {
    zzamC.zzs(new GamesClientImpl.VideoCapabilitiesResultImpl(new Status(paramInt), paramVideoCapabilities));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.VideoRecordingCapabilitiesBinderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */