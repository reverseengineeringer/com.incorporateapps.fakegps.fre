package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import java.util.Locale;
import org.json.JSONObject;

public class MediaTrack$Builder
{
  private final MediaTrack zzabD;
  
  public MediaTrack$Builder(long paramLong, int paramInt)
  {
    zzabD = new MediaTrack(paramLong, paramInt);
  }
  
  public MediaTrack build()
  {
    return zzabD;
  }
  
  public Builder setContentId(String paramString)
  {
    zzabD.setContentId(paramString);
    return this;
  }
  
  public Builder setContentType(String paramString)
  {
    zzabD.setContentType(paramString);
    return this;
  }
  
  public Builder setCustomData(JSONObject paramJSONObject)
  {
    zzabD.setCustomData(paramJSONObject);
    return this;
  }
  
  public Builder setLanguage(String paramString)
  {
    zzabD.setLanguage(paramString);
    return this;
  }
  
  public Builder setLanguage(Locale paramLocale)
  {
    zzabD.setLanguage(zzf.zzb(paramLocale));
    return this;
  }
  
  public Builder setName(String paramString)
  {
    zzabD.setName(paramString);
    return this;
  }
  
  public Builder setSubtype(int paramInt)
  {
    zzabD.zzbe(paramInt);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.MediaTrack.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */