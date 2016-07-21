package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONObject;

class RemoteMediaPlayer$16
  extends RemoteMediaPlayer.zzb
{
  RemoteMediaPlayer$16(RemoteMediaPlayer paramRemoteMediaPlayer, GoogleApiClient paramGoogleApiClient1, int paramInt1, int paramInt2, GoogleApiClient paramGoogleApiClient2, JSONObject paramJSONObject)
  {
    super(paramGoogleApiClient1);
  }
  
  protected void zza(zze arg1)
  {
    int j = 0;
    synchronized (RemoteMediaPlayer.zze(zzabK))
    {
      i = RemoteMediaPlayer.zza(zzabK, zzacc);
      if (i == -1)
      {
        zza(zzq(new Status(0)));
        return;
      }
      if (zzacd < 0)
      {
        zza(zzq(new Status(2001, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", new Object[] { Integer.valueOf(zzacd) }))));
        return;
      }
    }
    if (i == zzacd)
    {
      zza(zzq(new Status(0)));
      return;
    }
    if (zzacd > i) {}
    for (int i = zzacd + 1;; i = zzacd)
    {
      Object localObject2 = zzabK.getMediaStatus().getQueueItem(i);
      i = j;
      if (localObject2 != null) {
        i = ((MediaQueueItem)localObject2).getItemId();
      }
      RemoteMediaPlayer.zzf(zzabK).zzc(zzabL);
      try
      {
        localObject2 = RemoteMediaPlayer.zzg(zzabK);
        zzo localzzo = zzacm;
        j = zzacc;
        JSONObject localJSONObject = zzabS;
        ((zzm)localObject2).zza(localzzo, new int[] { j }, i, localJSONObject);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          zza(zzq(new Status(2100)));
          RemoteMediaPlayer.zzf(zzabK).zzc(null);
        }
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
 * Qualified Name:     com.google.android.gms.cast.RemoteMediaPlayer.16
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */