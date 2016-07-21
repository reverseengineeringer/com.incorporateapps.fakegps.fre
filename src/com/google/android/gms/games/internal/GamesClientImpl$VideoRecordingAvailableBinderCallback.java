package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$VideoRecordingAvailableBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$VideoRecordingAvailableBinderCallback(zza.zzb paramzzb)
  {
    zzamC = ((zza.zzb)zzx.zzb(paramzzb, "Holder must not be null"));
  }
  
  public final void zzd(int paramInt, boolean paramBoolean)
  {
    zzamC.zzs(new GamesClientImpl.VideoAvailableResultImpl(new Status(paramInt), paramBoolean));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.VideoRecordingAvailableBinderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */