package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

final class RemoteMediaPlayer$zzc
  implements RemoteMediaPlayer.MediaChannelResult
{
  private final Status zzUX;
  private final JSONObject zzaaU;
  
  RemoteMediaPlayer$zzc(Status paramStatus, JSONObject paramJSONObject)
  {
    zzUX = paramStatus;
    zzaaU = paramJSONObject;
  }
  
  public final JSONObject getCustomData()
  {
    return zzaaU;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.RemoteMediaPlayer.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */