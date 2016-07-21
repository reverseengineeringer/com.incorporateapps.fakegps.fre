package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

final class RemoteMediaPlayer$zza$zza
  implements ResultCallback
{
  private final long zzack;
  
  RemoteMediaPlayer$zza$zza(RemoteMediaPlayer.zza paramzza, long paramLong)
  {
    zzack = paramLong;
  }
  
  public final void zzp(Status paramStatus)
  {
    if (!paramStatus.isSuccess()) {
      RemoteMediaPlayer.zzg(zzacl.zzabK).zzb(zzack, paramStatus.getStatusCode());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.RemoteMediaPlayer.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */