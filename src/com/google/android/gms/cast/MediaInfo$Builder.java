package com.google.android.gms.cast;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

public class MediaInfo$Builder
{
  private final MediaInfo zzaaV;
  
  public MediaInfo$Builder(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("Content ID cannot be empty");
    }
    zzaaV = new MediaInfo(paramString);
  }
  
  public MediaInfo build()
  {
    zzaaV.zznN();
    return zzaaV;
  }
  
  public Builder setContentType(String paramString)
  {
    zzaaV.setContentType(paramString);
    return this;
  }
  
  public Builder setCustomData(JSONObject paramJSONObject)
  {
    zzaaV.setCustomData(paramJSONObject);
    return this;
  }
  
  public Builder setMediaTracks(List paramList)
  {
    zzaaV.zzu(paramList);
    return this;
  }
  
  public Builder setMetadata(MediaMetadata paramMediaMetadata)
  {
    zzaaV.zza(paramMediaMetadata);
    return this;
  }
  
  public Builder setStreamDuration(long paramLong)
  {
    zzaaV.zzx(paramLong);
    return this;
  }
  
  public Builder setStreamType(int paramInt)
  {
    zzaaV.setStreamType(paramInt);
    return this;
  }
  
  public Builder setTextTrackStyle(TextTrackStyle paramTextTrackStyle)
  {
    zzaaV.setTextTrackStyle(paramTextTrackStyle);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.MediaInfo.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */