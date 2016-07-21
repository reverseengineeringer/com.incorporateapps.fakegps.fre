package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

class RemoteMediaPlayer$zzb$1
  implements zzo
{
  RemoteMediaPlayer$zzb$1(RemoteMediaPlayer.zzb paramzzb) {}
  
  public void zza(long paramLong, int paramInt, Object paramObject)
  {
    if ((paramObject instanceof JSONObject)) {}
    for (paramObject = (JSONObject)paramObject;; paramObject = null)
    {
      zzacn.zza(new RemoteMediaPlayer.zzc(new Status(paramInt), (JSONObject)paramObject));
      return;
    }
  }
  
  public void zzy(long paramLong)
  {
    zzacn.zza(zzacn.zzq(new Status(2103)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.RemoteMediaPlayer.zzb.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */