package com.google.android.gms.cast;

import org.json.JSONObject;

public class MediaQueueItem$Builder
{
  private final MediaQueueItem zzabk;
  
  public MediaQueueItem$Builder(MediaInfo paramMediaInfo)
  {
    zzabk = new MediaQueueItem(paramMediaInfo, null);
  }
  
  public MediaQueueItem$Builder(MediaQueueItem paramMediaQueueItem)
  {
    zzabk = new MediaQueueItem(paramMediaQueueItem, null);
  }
  
  public MediaQueueItem$Builder(JSONObject paramJSONObject)
  {
    zzabk = new MediaQueueItem(paramJSONObject);
  }
  
  public MediaQueueItem build()
  {
    zzabk.zznN();
    return zzabk;
  }
  
  public Builder clearItemId()
  {
    zzabk.zzba(0);
    return this;
  }
  
  public Builder setActiveTrackIds(long[] paramArrayOfLong)
  {
    zzabk.zza(paramArrayOfLong);
    return this;
  }
  
  public Builder setAutoplay(boolean paramBoolean)
  {
    zzabk.zzV(paramBoolean);
    return this;
  }
  
  public Builder setCustomData(JSONObject paramJSONObject)
  {
    zzabk.setCustomData(paramJSONObject);
    return this;
  }
  
  public Builder setPlaybackDuration(double paramDouble)
  {
    zzabk.zzd(paramDouble);
    return this;
  }
  
  public Builder setPreloadTime(double paramDouble)
  {
    zzabk.zze(paramDouble);
    return this;
  }
  
  public Builder setStartTime(double paramDouble)
  {
    zzabk.zzc(paramDouble);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.MediaQueueItem.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */