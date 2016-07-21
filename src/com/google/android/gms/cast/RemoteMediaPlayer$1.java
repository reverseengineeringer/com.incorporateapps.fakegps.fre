package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzm;

class RemoteMediaPlayer$1
  extends zzm
{
  RemoteMediaPlayer$1(RemoteMediaPlayer paramRemoteMediaPlayer, String paramString)
  {
    super(paramString);
  }
  
  protected void onMetadataUpdated()
  {
    RemoteMediaPlayer.zzb(zzabK);
  }
  
  protected void onPreloadStatusUpdated()
  {
    RemoteMediaPlayer.zzd(zzabK);
  }
  
  protected void onQueueStatusUpdated()
  {
    RemoteMediaPlayer.zzc(zzabK);
  }
  
  protected void onStatusUpdated()
  {
    RemoteMediaPlayer.zza(zzabK);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.RemoteMediaPlayer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */