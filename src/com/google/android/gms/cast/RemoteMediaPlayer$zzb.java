package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzb;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

abstract class RemoteMediaPlayer$zzb
  extends zzb
{
  zzo zzacm = new RemoteMediaPlayer.zzb.1(this);
  
  RemoteMediaPlayer$zzb(GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  public RemoteMediaPlayer.MediaChannelResult zzq(Status paramStatus)
  {
    return new RemoteMediaPlayer.zzb.2(this, paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.RemoteMediaPlayer.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */