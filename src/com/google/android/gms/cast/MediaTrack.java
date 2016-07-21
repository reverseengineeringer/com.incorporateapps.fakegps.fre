package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zznb;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack
{
  public static final int SUBTYPE_CAPTIONS = 2;
  public static final int SUBTYPE_CHAPTERS = 4;
  public static final int SUBTYPE_DESCRIPTIONS = 3;
  public static final int SUBTYPE_METADATA = 5;
  public static final int SUBTYPE_NONE = 0;
  public static final int SUBTYPE_SUBTITLES = 1;
  public static final int SUBTYPE_UNKNOWN = -1;
  public static final int TYPE_AUDIO = 2;
  public static final int TYPE_TEXT = 1;
  public static final int TYPE_UNKNOWN = 0;
  public static final int TYPE_VIDEO = 3;
  private String mName;
  private long zzUZ;
  private String zzaaL;
  private String zzaaN;
  private String zzaaP;
  private JSONObject zzaaU;
  private int zzabB;
  private int zzabC;
  
  MediaTrack(long paramLong, int paramInt)
  {
    clear();
    zzUZ = paramLong;
    if ((paramInt <= 0) || (paramInt > 3)) {
      throw new IllegalArgumentException("invalid type " + paramInt);
    }
    zzabB = paramInt;
  }
  
  MediaTrack(JSONObject paramJSONObject)
  {
    zzg(paramJSONObject);
  }
  
  private void clear()
  {
    zzUZ = 0L;
    zzabB = 0;
    zzaaN = null;
    mName = null;
    zzaaL = null;
    zzabC = -1;
    zzaaU = null;
  }
  
  private void zzg(JSONObject paramJSONObject)
  {
    clear();
    zzUZ = paramJSONObject.getLong("trackId");
    String str = paramJSONObject.getString("type");
    if ("TEXT".equals(str))
    {
      zzabB = 1;
      zzaaN = paramJSONObject.optString("trackContentId", null);
      zzaaP = paramJSONObject.optString("trackContentType", null);
      mName = paramJSONObject.optString("name", null);
      zzaaL = paramJSONObject.optString("language", null);
      if (!paramJSONObject.has("subtype")) {
        break label270;
      }
      str = paramJSONObject.getString("subtype");
      if (!"SUBTITLES".equals(str)) {
        break label178;
      }
      zzabC = 1;
    }
    for (;;)
    {
      zzaaU = paramJSONObject.optJSONObject("customData");
      return;
      if ("AUDIO".equals(str))
      {
        zzabB = 2;
        break;
      }
      if ("VIDEO".equals(str))
      {
        zzabB = 3;
        break;
      }
      throw new JSONException("invalid type: " + str);
      label178:
      if ("CAPTIONS".equals(str))
      {
        zzabC = 2;
      }
      else if ("DESCRIPTIONS".equals(str))
      {
        zzabC = 3;
      }
      else if ("CHAPTERS".equals(str))
      {
        zzabC = 4;
      }
      else if ("METADATA".equals(str))
      {
        zzabC = 5;
      }
      else
      {
        throw new JSONException("invalid subtype: " + str);
        label270:
        zzabC = 0;
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    do
    {
      return bool1;
      bool1 = bool2;
    } while (!(paramObject instanceof MediaTrack));
    paramObject = (MediaTrack)paramObject;
    int i;
    if (zzaaU == null)
    {
      i = 1;
      label39:
      if (zzaaU != null) {
        break label214;
      }
    }
    label214:
    for (int j = 1;; j = 0)
    {
      bool1 = bool2;
      if (i != j) {
        break;
      }
      if ((zzaaU != null) && (zzaaU != null))
      {
        bool1 = bool2;
        if (!zznb.zze(zzaaU, zzaaU)) {
          break;
        }
      }
      bool1 = bool2;
      if (zzUZ != zzUZ) {
        break;
      }
      bool1 = bool2;
      if (zzabB != zzabB) {
        break;
      }
      bool1 = bool2;
      if (!zzf.zza(zzaaN, zzaaN)) {
        break;
      }
      bool1 = bool2;
      if (!zzf.zza(zzaaP, zzaaP)) {
        break;
      }
      bool1 = bool2;
      if (!zzf.zza(mName, mName)) {
        break;
      }
      bool1 = bool2;
      if (!zzf.zza(zzaaL, zzaaL)) {
        break;
      }
      bool1 = bool2;
      if (zzabC != zzabC) {
        break;
      }
      return true;
      i = 0;
      break label39;
    }
  }
  
  public final String getContentId()
  {
    return zzaaN;
  }
  
  public final String getContentType()
  {
    return zzaaP;
  }
  
  public final JSONObject getCustomData()
  {
    return zzaaU;
  }
  
  public final long getId()
  {
    return zzUZ;
  }
  
  public final String getLanguage()
  {
    return zzaaL;
  }
  
  public final String getName()
  {
    return mName;
  }
  
  public final int getSubtype()
  {
    return zzabC;
  }
  
  public final int getType()
  {
    return zzabB;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Long.valueOf(zzUZ), Integer.valueOf(zzabB), zzaaN, zzaaP, mName, zzaaL, Integer.valueOf(zzabC), zzaaU });
  }
  
  public final void setContentId(String paramString)
  {
    zzaaN = paramString;
  }
  
  public final void setContentType(String paramString)
  {
    zzaaP = paramString;
  }
  
  final void setCustomData(JSONObject paramJSONObject)
  {
    zzaaU = paramJSONObject;
  }
  
  final void setLanguage(String paramString)
  {
    zzaaL = paramString;
  }
  
  final void setName(String paramString)
  {
    mName = paramString;
  }
  
  public final JSONObject toJson()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("trackId", zzUZ);
      switch (zzabB)
      {
      case 1: 
        if (zzaaN != null) {
          localJSONObject.put("trackContentId", zzaaN);
        }
        if (zzaaP != null) {
          localJSONObject.put("trackContentType", zzaaP);
        }
        if (mName != null) {
          localJSONObject.put("name", mName);
        }
        if (!TextUtils.isEmpty(zzaaL)) {
          localJSONObject.put("language", zzaaL);
        }
        switch (zzabC)
        {
        }
        break;
      }
      for (;;)
      {
        if (zzaaU == null) {
          break label282;
        }
        localJSONObject.put("customData", zzaaU);
        return localJSONObject;
        localJSONObject.put("type", "TEXT");
        break;
        localJSONObject.put("type", "AUDIO");
        break;
        localJSONObject.put("type", "VIDEO");
        break;
        localJSONObject.put("subtype", "SUBTITLES");
        continue;
        localJSONObject.put("subtype", "CAPTIONS");
        continue;
        localJSONObject.put("subtype", "DESCRIPTIONS");
        continue;
        localJSONObject.put("subtype", "CHAPTERS");
        continue;
        localJSONObject.put("subtype", "METADATA");
        continue;
        break;
      }
      label282:
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  final void zzbe(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 5)) {
      throw new IllegalArgumentException("invalid subtype " + paramInt);
    }
    if ((paramInt != 0) && (zzabB != 1)) {
      throw new IllegalArgumentException("subtypes are only valid for text tracks");
    }
    zzabC = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.MediaTrack
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */