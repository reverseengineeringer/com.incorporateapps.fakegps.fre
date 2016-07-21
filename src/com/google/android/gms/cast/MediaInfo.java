package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zznb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaInfo
{
  public static final int STREAM_TYPE_BUFFERED = 1;
  public static final int STREAM_TYPE_INVALID = -1;
  public static final int STREAM_TYPE_LIVE = 2;
  public static final int STREAM_TYPE_NONE = 0;
  public static final long UNKNOWN_DURATION = -1L;
  private final String zzaaN;
  private int zzaaO;
  private String zzaaP;
  private MediaMetadata zzaaQ;
  private long zzaaR;
  private List zzaaS;
  private TextTrackStyle zzaaT;
  private JSONObject zzaaU;
  
  MediaInfo(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("content ID cannot be null or empty");
    }
    zzaaN = paramString;
    zzaaO = -1;
    zzaaR = -1L;
  }
  
  MediaInfo(JSONObject paramJSONObject)
  {
    zzaaN = paramJSONObject.getString("contentId");
    Object localObject1 = paramJSONObject.getString("streamType");
    if ("NONE".equals(localObject1)) {
      zzaaO = 0;
    }
    Object localObject2;
    for (;;)
    {
      zzaaP = paramJSONObject.getString("contentType");
      if (paramJSONObject.has("metadata"))
      {
        localObject1 = paramJSONObject.getJSONObject("metadata");
        zzaaQ = new MediaMetadata(((JSONObject)localObject1).getInt("metadataType"));
        zzaaQ.zzg((JSONObject)localObject1);
      }
      zzaaR = -1L;
      if ((paramJSONObject.has("duration")) && (!paramJSONObject.isNull("duration")))
      {
        double d = paramJSONObject.optDouble("duration", 0.0D);
        if ((!Double.isNaN(d)) && (!Double.isInfinite(d))) {
          zzaaR = zzf.zzg(d);
        }
      }
      if (!paramJSONObject.has("tracks")) {
        break;
      }
      zzaaS = new ArrayList();
      localObject1 = paramJSONObject.getJSONArray("tracks");
      while (i < ((JSONArray)localObject1).length())
      {
        localObject2 = new MediaTrack(((JSONArray)localObject1).getJSONObject(i));
        zzaaS.add(localObject2);
        i += 1;
      }
      if ("BUFFERED".equals(localObject1)) {
        zzaaO = 1;
      } else if ("LIVE".equals(localObject1)) {
        zzaaO = 2;
      } else {
        zzaaO = -1;
      }
    }
    zzaaS = null;
    if (paramJSONObject.has("textTrackStyle"))
    {
      localObject1 = paramJSONObject.getJSONObject("textTrackStyle");
      localObject2 = new TextTrackStyle();
      ((TextTrackStyle)localObject2).zzg((JSONObject)localObject1);
    }
    for (zzaaT = ((TextTrackStyle)localObject2);; zzaaT = null)
    {
      zzaaU = paramJSONObject.optJSONObject("customData");
      return;
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
    } while (!(paramObject instanceof MediaInfo));
    paramObject = (MediaInfo)paramObject;
    int i;
    if (zzaaU == null)
    {
      i = 1;
      label39:
      if (zzaaU != null) {
        break label181;
      }
    }
    label181:
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
      if (!zzf.zza(zzaaN, zzaaN)) {
        break;
      }
      bool1 = bool2;
      if (zzaaO != zzaaO) {
        break;
      }
      bool1 = bool2;
      if (!zzf.zza(zzaaP, zzaaP)) {
        break;
      }
      bool1 = bool2;
      if (!zzf.zza(zzaaQ, zzaaQ)) {
        break;
      }
      bool1 = bool2;
      if (zzaaR != zzaaR) {
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
  
  public final List getMediaTracks()
  {
    return zzaaS;
  }
  
  public final MediaMetadata getMetadata()
  {
    return zzaaQ;
  }
  
  public final long getStreamDuration()
  {
    return zzaaR;
  }
  
  public final int getStreamType()
  {
    return zzaaO;
  }
  
  public final TextTrackStyle getTextTrackStyle()
  {
    return zzaaT;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { zzaaN, Integer.valueOf(zzaaO), zzaaP, zzaaQ, Long.valueOf(zzaaR), String.valueOf(zzaaU) });
  }
  
  final void setContentType(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("content type cannot be null or empty");
    }
    zzaaP = paramString;
  }
  
  final void setCustomData(JSONObject paramJSONObject)
  {
    zzaaU = paramJSONObject;
  }
  
  final void setStreamType(int paramInt)
  {
    if ((paramInt < -1) || (paramInt > 2)) {
      throw new IllegalArgumentException("invalid stream type");
    }
    zzaaO = paramInt;
  }
  
  public final void setTextTrackStyle(TextTrackStyle paramTextTrackStyle)
  {
    zzaaT = paramTextTrackStyle;
  }
  
  public final JSONObject toJson()
  {
    JSONObject localJSONObject = new JSONObject();
    for (;;)
    {
      try
      {
        localJSONObject.put("contentId", zzaaN);
        switch (zzaaO)
        {
        default: 
          localJSONObject.put("streamType", localObject);
          if (zzaaP != null) {
            localJSONObject.put("contentType", zzaaP);
          }
          if (zzaaQ != null) {
            localJSONObject.put("metadata", zzaaQ.toJson());
          }
          if (zzaaR <= -1L)
          {
            localJSONObject.put("duration", JSONObject.NULL);
            if (zzaaS == null) {
              continue;
            }
            localObject = new JSONArray();
            Iterator localIterator = zzaaS.iterator();
            if (localIterator.hasNext())
            {
              ((JSONArray)localObject).put(((MediaTrack)localIterator.next()).toJson());
              continue;
            }
          }
          else
          {
            localJSONObject.put("duration", zzf.zzA(zzaaR));
            continue;
          }
          localJSONObject.put("tracks", localObject);
          if (zzaaT != null) {
            localJSONObject.put("textTrackStyle", zzaaT.toJson());
          }
          if (zzaaU == null) {
            break label239;
          }
          localJSONObject.put("customData", zzaaU);
          return localJSONObject;
        }
      }
      catch (JSONException localJSONException) {}
      Object localObject = "NONE";
      continue;
      label239:
      return localJSONObject;
      String str = "BUFFERED";
      continue;
      str = "LIVE";
    }
  }
  
  final void zza(MediaMetadata paramMediaMetadata)
  {
    zzaaQ = paramMediaMetadata;
  }
  
  final void zznN()
  {
    if (TextUtils.isEmpty(zzaaN)) {
      throw new IllegalArgumentException("content ID cannot be null or empty");
    }
    if (TextUtils.isEmpty(zzaaP)) {
      throw new IllegalArgumentException("content type cannot be null or empty");
    }
    if (zzaaO == -1) {
      throw new IllegalArgumentException("a valid stream type must be specified");
    }
  }
  
  final void zzu(List paramList)
  {
    zzaaS = paramList;
  }
  
  final void zzx(long paramLong)
  {
    if ((paramLong < 0L) && (paramLong != -1L)) {
      throw new IllegalArgumentException("Invalid stream duration");
    }
    zzaaR = paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.MediaInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */