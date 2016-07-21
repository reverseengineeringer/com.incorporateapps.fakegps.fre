package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zznb;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaQueueItem
{
  public static final double DEFAULT_PLAYBACK_DURATION = Double.POSITIVE_INFINITY;
  public static final int INVALID_ITEM_ID = 0;
  private JSONObject zzaaU;
  private MediaInfo zzabd;
  private int zzabe = 0;
  private boolean zzabf = true;
  private double zzabg;
  private double zzabh = Double.POSITIVE_INFINITY;
  private double zzabi;
  private long[] zzabj;
  
  private MediaQueueItem(MediaInfo paramMediaInfo)
  {
    if (paramMediaInfo == null) {
      throw new IllegalArgumentException("media cannot be null.");
    }
    zzabd = paramMediaInfo;
  }
  
  private MediaQueueItem(MediaQueueItem paramMediaQueueItem)
  {
    zzabd = paramMediaQueueItem.getMedia();
    if (zzabd == null) {
      throw new IllegalArgumentException("media cannot be null.");
    }
    zzabe = paramMediaQueueItem.getItemId();
    zzabf = paramMediaQueueItem.getAutoplay();
    zzabg = paramMediaQueueItem.getStartTime();
    zzabh = paramMediaQueueItem.getPlaybackDuration();
    zzabi = paramMediaQueueItem.getPreloadTime();
    zzabj = paramMediaQueueItem.getActiveTrackIds();
    zzaaU = paramMediaQueueItem.getCustomData();
  }
  
  MediaQueueItem(JSONObject paramJSONObject)
  {
    zzh(paramJSONObject);
  }
  
  public boolean equals(Object paramObject)
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
    } while (!(paramObject instanceof MediaQueueItem));
    paramObject = (MediaQueueItem)paramObject;
    int i;
    if (zzaaU == null)
    {
      i = 1;
      label39:
      if (zzaaU != null) {
        break label210;
      }
    }
    label210:
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
      if (!zzf.zza(zzabd, zzabd)) {
        break;
      }
      bool1 = bool2;
      if (zzabe != zzabe) {
        break;
      }
      bool1 = bool2;
      if (zzabf != zzabf) {
        break;
      }
      bool1 = bool2;
      if (zzabg != zzabg) {
        break;
      }
      bool1 = bool2;
      if (zzabh != zzabh) {
        break;
      }
      bool1 = bool2;
      if (zzabi != zzabi) {
        break;
      }
      bool1 = bool2;
      if (!zzf.zza(zzabj, zzabj)) {
        break;
      }
      return true;
      i = 0;
      break label39;
    }
  }
  
  public long[] getActiveTrackIds()
  {
    return zzabj;
  }
  
  public boolean getAutoplay()
  {
    return zzabf;
  }
  
  public JSONObject getCustomData()
  {
    return zzaaU;
  }
  
  public int getItemId()
  {
    return zzabe;
  }
  
  public MediaInfo getMedia()
  {
    return zzabd;
  }
  
  public double getPlaybackDuration()
  {
    return zzabh;
  }
  
  public double getPreloadTime()
  {
    return zzabi;
  }
  
  public double getStartTime()
  {
    return zzabg;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzabd, Integer.valueOf(zzabe), Boolean.valueOf(zzabf), Double.valueOf(zzabg), Double.valueOf(zzabh), Double.valueOf(zzabi), zzabj, String.valueOf(zzaaU) });
  }
  
  void setCustomData(JSONObject paramJSONObject)
  {
    zzaaU = paramJSONObject;
  }
  
  public JSONObject toJson()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("media", zzabd.toJson());
      if (zzabe != 0) {
        localJSONObject.put("itemId", zzabe);
      }
      localJSONObject.put("autoplay", zzabf);
      localJSONObject.put("startTime", zzabg);
      if (zzabh != Double.POSITIVE_INFINITY) {
        localJSONObject.put("playbackDuration", zzabh);
      }
      localJSONObject.put("preloadTime", zzabi);
      if (zzabj != null)
      {
        JSONArray localJSONArray = new JSONArray();
        long[] arrayOfLong = zzabj;
        int j = arrayOfLong.length;
        int i = 0;
        while (i < j)
        {
          localJSONArray.put(arrayOfLong[i]);
          i += 1;
        }
        localJSONObject.put("activeTrackIds", localJSONArray);
      }
      if (zzaaU != null) {
        localJSONObject.put("customData", zzaaU);
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  void zzV(boolean paramBoolean)
  {
    zzabf = paramBoolean;
  }
  
  void zza(long[] paramArrayOfLong)
  {
    zzabj = paramArrayOfLong;
  }
  
  void zzba(int paramInt)
  {
    zzabe = paramInt;
  }
  
  void zzc(double paramDouble)
  {
    if ((Double.isNaN(paramDouble)) || (paramDouble < 0.0D)) {
      throw new IllegalArgumentException("startTime cannot be negative or NaN.");
    }
    zzabg = paramDouble;
  }
  
  void zzd(double paramDouble)
  {
    if (Double.isNaN(paramDouble)) {
      throw new IllegalArgumentException("playbackDuration cannot be NaN.");
    }
    zzabh = paramDouble;
  }
  
  void zze(double paramDouble)
  {
    if ((Double.isNaN(paramDouble)) || (paramDouble < 0.0D)) {
      throw new IllegalArgumentException("preloadTime cannot be negative or NaN.");
    }
    zzabi = paramDouble;
  }
  
  public boolean zzh(JSONObject paramJSONObject)
  {
    if (paramJSONObject.has("media")) {
      zzabd = new MediaInfo(paramJSONObject.getJSONObject("media"));
    }
    for (boolean bool2 = true;; bool2 = false)
    {
      boolean bool1 = bool2;
      int i;
      if (paramJSONObject.has("itemId"))
      {
        i = paramJSONObject.getInt("itemId");
        bool1 = bool2;
        if (zzabe != i)
        {
          zzabe = i;
          bool1 = true;
        }
      }
      bool2 = bool1;
      if (paramJSONObject.has("autoplay"))
      {
        boolean bool3 = paramJSONObject.getBoolean("autoplay");
        bool2 = bool1;
        if (zzabf != bool3)
        {
          zzabf = bool3;
          bool2 = true;
        }
      }
      bool1 = bool2;
      double d;
      if (paramJSONObject.has("startTime"))
      {
        d = paramJSONObject.getDouble("startTime");
        bool1 = bool2;
        if (Math.abs(d - zzabg) > 1.0E-7D)
        {
          zzabg = d;
          bool1 = true;
        }
      }
      bool2 = bool1;
      if (paramJSONObject.has("playbackDuration"))
      {
        d = paramJSONObject.getDouble("playbackDuration");
        bool2 = bool1;
        if (Math.abs(d - zzabh) > 1.0E-7D)
        {
          zzabh = d;
          bool2 = true;
        }
      }
      bool1 = bool2;
      if (paramJSONObject.has("preloadTime"))
      {
        d = paramJSONObject.getDouble("preloadTime");
        bool1 = bool2;
        if (Math.abs(d - zzabi) > 1.0E-7D)
        {
          zzabi = d;
          bool1 = true;
        }
      }
      int j;
      long[] arrayOfLong;
      if (paramJSONObject.has("activeTrackIds"))
      {
        JSONArray localJSONArray = paramJSONObject.getJSONArray("activeTrackIds");
        j = localJSONArray.length();
        arrayOfLong = new long[j];
        i = 0;
        while (i < j)
        {
          arrayOfLong[i] = localJSONArray.getLong(i);
          i += 1;
        }
        if (zzabj == null) {
          i = 1;
        }
      }
      for (;;)
      {
        if (i != 0)
        {
          zzabj = arrayOfLong;
          bool1 = true;
        }
        if (paramJSONObject.has("customData"))
        {
          zzaaU = paramJSONObject.getJSONObject("customData");
          return true;
          if (zzabj.length != j)
          {
            i = 1;
          }
          else
          {
            i = 0;
            for (;;)
            {
              if (i >= j) {
                break label425;
              }
              if (zzabj[i] != arrayOfLong[i])
              {
                i = 1;
                break;
              }
              i += 1;
            }
          }
        }
        else
        {
          return bool1;
          label425:
          i = 0;
          continue;
          i = 0;
          arrayOfLong = null;
        }
      }
    }
  }
  
  void zznN()
  {
    if (zzabd == null) {
      throw new IllegalArgumentException("media cannot be null.");
    }
    if ((Double.isNaN(zzabg)) || (zzabg < 0.0D)) {
      throw new IllegalArgumentException("startTime cannot be negative or NaN.");
    }
    if (Double.isNaN(zzabh)) {
      throw new IllegalArgumentException("playbackDuration cannot be NaN.");
    }
    if ((Double.isNaN(zzabi)) || (zzabi < 0.0D)) {
      throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.MediaQueueItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */