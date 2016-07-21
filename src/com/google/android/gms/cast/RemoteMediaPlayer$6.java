package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import org.json.JSONObject;

class RemoteMediaPlayer$6
  extends RemoteMediaPlayer.zzb
{
  RemoteMediaPlayer$6(RemoteMediaPlayer paramRemoteMediaPlayer, GoogleApiClient paramGoogleApiClient1, GoogleApiClient paramGoogleApiClient2, MediaQueueItem paramMediaQueueItem, int paramInt, long paramLong, JSONObject paramJSONObject)
  {
    super(paramGoogleApiClient1);
  }
  
  protected void zza(zze arg1)
  {
    synchronized (RemoteMediaPlayer.zze(zzabK))
    {
      RemoteMediaPlayer.zzf(zzabK).zzc(zzabL);
      try
      {
        zzm localzzm = RemoteMediaPlayer.zzg(zzabK);
        zzo localzzo = zzacm;
        MediaQueueItem localMediaQueueItem = zzabV;
        int i = zzabU;
        long l = zzabR;
        JSONObject localJSONObject = zzabS;
        localzzm.zza(localzzo, new MediaQueueItem[] { localMediaQueueItem }, i, 0, 0, l, localJSONObject);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          zza(zzq(new Status(2100)));
          RemoteMediaPlayer.zzf(zzabK).zzc(null);
        }
        localObject1 = finally;
        throw ((Throwable)localObject1);
      }
      finally
      {
        RemoteMediaPlayer.zzf(zzabK).zzc(null);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.RemoteMediaPlayer.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */