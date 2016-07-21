package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import org.json.JSONObject;

class RemoteMediaPlayer$14
  extends RemoteMediaPlayer.zzb
{
  RemoteMediaPlayer$14(RemoteMediaPlayer paramRemoteMediaPlayer, GoogleApiClient paramGoogleApiClient1, int paramInt, GoogleApiClient paramGoogleApiClient2, JSONObject paramJSONObject)
  {
    super(paramGoogleApiClient1);
  }
  
  protected void zza(zze arg1)
  {
    synchronized (RemoteMediaPlayer.zze(zzabK))
    {
      if (RemoteMediaPlayer.zza(zzabK, zzacc) == -1)
      {
        zza(zzq(new Status(0)));
        return;
      }
      RemoteMediaPlayer.zzf(zzabK).zzc(zzabL);
      try
      {
        zzm localzzm = RemoteMediaPlayer.zzg(zzabK);
        zzo localzzo = zzacm;
        int i = zzacc;
        JSONObject localJSONObject = zzabS;
        localzzm.zza(localzzo, new int[] { i }, localJSONObject);
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
 * Qualified Name:     com.google.android.gms.cast.RemoteMediaPlayer.14
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */