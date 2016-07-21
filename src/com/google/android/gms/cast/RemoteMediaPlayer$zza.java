package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzn;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.io.IOException;

class RemoteMediaPlayer$zza
  implements zzn
{
  private GoogleApiClient zzaci;
  private long zzacj = 0L;
  
  public RemoteMediaPlayer$zza(RemoteMediaPlayer paramRemoteMediaPlayer) {}
  
  public void zza(String paramString1, String paramString2, long paramLong, String paramString3)
  {
    if (zzaci == null) {
      throw new IOException("No GoogleApiClient available");
    }
    Cast.CastApi.sendMessage(zzaci, paramString1, paramString2).setResultCallback(new RemoteMediaPlayer.zza.zza(this, paramLong));
  }
  
  public void zzc(GoogleApiClient paramGoogleApiClient)
  {
    zzaci = paramGoogleApiClient;
  }
  
  public long zznQ()
  {
    long l = zzacj + 1L;
    zzacj = l;
    return l;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.RemoteMediaPlayer.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */