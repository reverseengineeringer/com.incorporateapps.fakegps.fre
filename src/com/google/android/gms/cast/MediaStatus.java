package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class MediaStatus
{
  public static final long COMMAND_PAUSE = 1L;
  public static final long COMMAND_SEEK = 2L;
  public static final long COMMAND_SET_VOLUME = 4L;
  public static final long COMMAND_SKIP_BACKWARD = 32L;
  public static final long COMMAND_SKIP_FORWARD = 16L;
  public static final long COMMAND_TOGGLE_MUTE = 8L;
  public static final int IDLE_REASON_CANCELED = 2;
  public static final int IDLE_REASON_ERROR = 4;
  public static final int IDLE_REASON_FINISHED = 1;
  public static final int IDLE_REASON_INTERRUPTED = 3;
  public static final int IDLE_REASON_NONE = 0;
  public static final int PLAYER_STATE_BUFFERING = 4;
  public static final int PLAYER_STATE_IDLE = 1;
  public static final int PLAYER_STATE_PAUSED = 3;
  public static final int PLAYER_STATE_PLAYING = 2;
  public static final int PLAYER_STATE_UNKNOWN = 0;
  public static final int REPEAT_MODE_REPEAT_ALL = 1;
  public static final int REPEAT_MODE_REPEAT_ALL_AND_SHUFFLE = 3;
  public static final int REPEAT_MODE_REPEAT_OFF = 0;
  public static final int REPEAT_MODE_REPEAT_SINGLE = 2;
  private JSONObject zzaaU;
  private MediaInfo zzaaV;
  private long[] zzabj;
  private int zzabl = 0;
  private long zzabm;
  private double zzabn;
  private int zzabo;
  private int zzabp;
  private long zzabq;
  private long zzabr;
  private double zzabs;
  private boolean zzabt;
  private int zzabu = 0;
  private int zzabv = 0;
  private final MediaStatus.zza zzabw = new MediaStatus.zza(this);
  
  public MediaStatus(JSONObject paramJSONObject)
  {
    zza(paramJSONObject, 0);
  }
  
  private boolean zzi(int paramInt1, int paramInt2)
  {
    return (paramInt1 == 1) && (paramInt2 == 0);
  }
  
  public final long[] getActiveTrackIds()
  {
    return zzabj;
  }
  
  public final int getCurrentItemId()
  {
    return zzabl;
  }
  
  public final JSONObject getCustomData()
  {
    return zzaaU;
  }
  
  public final int getIdleReason()
  {
    return zzabp;
  }
  
  public final int getLoadingItemId()
  {
    return zzabu;
  }
  
  public final MediaInfo getMediaInfo()
  {
    return zzaaV;
  }
  
  public final double getPlaybackRate()
  {
    return zzabn;
  }
  
  public final int getPlayerState()
  {
    return zzabo;
  }
  
  public final int getPreloadedItemId()
  {
    return zzabv;
  }
  
  public final MediaQueueItem getQueueItem(int paramInt)
  {
    return zzabw.zzbc(paramInt);
  }
  
  public final MediaQueueItem getQueueItemById(int paramInt)
  {
    return zzabw.zzbb(paramInt);
  }
  
  public final int getQueueItemCount()
  {
    return zzabw.getItemCount();
  }
  
  public final List getQueueItems()
  {
    return zzabw.zznP();
  }
  
  public final int getQueueRepeatMode()
  {
    return zzabw.getRepeatMode();
  }
  
  public final long getStreamPosition()
  {
    return zzabq;
  }
  
  public final double getStreamVolume()
  {
    return zzabs;
  }
  
  public final boolean isMediaCommandSupported(long paramLong)
  {
    return (zzabr & paramLong) != 0L;
  }
  
  public final boolean isMute()
  {
    return zzabt;
  }
  
  public final int zza(JSONObject paramJSONObject, int paramInt)
  {
    int i1 = 2;
    int n = 1;
    long l = paramJSONObject.getLong("mediaSessionId");
    if (l != zzabm) {
      zzabm = l;
    }
    for (int j = 1;; j = 0)
    {
      int k = j;
      Object localObject;
      int i;
      if (paramJSONObject.has("playerState"))
      {
        localObject = paramJSONObject.getString("playerState");
        if (!((String)localObject).equals("IDLE")) {
          break label461;
        }
        i = 1;
      }
      for (;;)
      {
        int m = j;
        if (i != zzabo)
        {
          zzabo = i;
          m = j | 0x2;
        }
        k = m;
        if (i == 1)
        {
          k = m;
          if (paramJSONObject.has("idleReason"))
          {
            localObject = paramJSONObject.getString("idleReason");
            if (!((String)localObject).equals("CANCELLED")) {
              break label509;
            }
            i = i1;
          }
        }
        for (;;)
        {
          label137:
          k = m;
          if (i != zzabp)
          {
            zzabp = i;
            k = m | 0x2;
          }
          i = k;
          double d;
          if (paramJSONObject.has("playbackRate"))
          {
            d = paramJSONObject.getDouble("playbackRate");
            i = k;
            if (zzabn != d)
            {
              zzabn = d;
              i = k | 0x2;
            }
          }
          k = i;
          if (paramJSONObject.has("currentTime"))
          {
            k = i;
            if ((paramInt & 0x2) == 0)
            {
              l = zzf.zzg(paramJSONObject.getDouble("currentTime"));
              k = i;
              if (l != zzabq)
              {
                zzabq = l;
                k = i | 0x2;
              }
            }
          }
          j = k;
          if (paramJSONObject.has("supportedMediaCommands"))
          {
            l = paramJSONObject.getLong("supportedMediaCommands");
            j = k;
            if (l != zzabr)
            {
              zzabr = l;
              j = k | 0x2;
            }
          }
          i = j;
          if (paramJSONObject.has("volume"))
          {
            i = j;
            if ((paramInt & 0x1) == 0)
            {
              localObject = paramJSONObject.getJSONObject("volume");
              d = ((JSONObject)localObject).getDouble("level");
              paramInt = j;
              if (d != zzabs)
              {
                zzabs = d;
                paramInt = j | 0x2;
              }
              boolean bool = ((JSONObject)localObject).getBoolean("muted");
              i = paramInt;
              if (bool != zzabt)
              {
                zzabt = bool;
                i = paramInt | 0x2;
              }
            }
          }
          if (paramJSONObject.has("activeTrackIds"))
          {
            JSONArray localJSONArray = paramJSONObject.getJSONArray("activeTrackIds");
            k = localJSONArray.length();
            localObject = new long[k];
            paramInt = 0;
            for (;;)
            {
              if (paramInt < k)
              {
                localObject[paramInt] = localJSONArray.getLong(paramInt);
                paramInt += 1;
                continue;
                label461:
                if (((String)localObject).equals("PLAYING"))
                {
                  i = 2;
                  break;
                }
                if (((String)localObject).equals("PAUSED"))
                {
                  i = 3;
                  break;
                }
                if (!((String)localObject).equals("BUFFERING")) {
                  break label958;
                }
                i = 4;
                break;
                label509:
                if (((String)localObject).equals("INTERRUPTED"))
                {
                  i = 3;
                  break label137;
                }
                if (((String)localObject).equals("FINISHED"))
                {
                  i = 1;
                  break label137;
                }
                if (!((String)localObject).equals("ERROR")) {
                  break label952;
                }
                i = 4;
                break label137;
              }
            }
            if (zzabj == null) {
              paramInt = n;
            }
          }
          for (;;)
          {
            if (paramInt != 0) {
              zzabj = ((long[])localObject);
            }
            j = paramInt;
            for (;;)
            {
              label580:
              paramInt = i;
              if (j != 0)
              {
                zzabj = ((long[])localObject);
                paramInt = i | 0x2;
              }
              i = paramInt;
              if (paramJSONObject.has("customData"))
              {
                zzaaU = paramJSONObject.getJSONObject("customData");
                i = paramInt | 0x2;
              }
              paramInt = i;
              if (paramJSONObject.has("media"))
              {
                localObject = paramJSONObject.getJSONObject("media");
                zzaaV = new MediaInfo((JSONObject)localObject);
                i |= 0x2;
                paramInt = i;
                if (((JSONObject)localObject).has("metadata")) {
                  paramInt = i | 0x4;
                }
              }
              i = paramInt;
              if (paramJSONObject.has("currentItemId"))
              {
                j = paramJSONObject.getInt("currentItemId");
                i = paramInt;
                if (zzabl != j)
                {
                  zzabl = j;
                  i = paramInt | 0x2;
                }
              }
              j = paramJSONObject.optInt("preloadedItemId", 0);
              paramInt = i;
              if (zzabv != j)
              {
                zzabv = j;
                paramInt = i | 0x10;
              }
              j = paramJSONObject.optInt("loadingItemId", 0);
              i = paramInt;
              if (zzabu != j)
              {
                zzabu = j;
                i = paramInt | 0x2;
              }
              if (!zzi(zzabo, zzabu))
              {
                paramInt = i;
                if (MediaStatus.zza.zza(zzabw, paramJSONObject)) {
                  paramInt = i | 0x8;
                }
              }
              do
              {
                return paramInt;
                paramInt = n;
                if (zzabj.length != k) {
                  break;
                }
                j = 0;
                for (;;)
                {
                  if (j >= k) {
                    break label947;
                  }
                  paramInt = n;
                  if (zzabj[j] != localObject[j]) {
                    break;
                  }
                  j += 1;
                }
                if (zzabj == null) {
                  break label938;
                }
                j = 1;
                localObject = null;
                break label580;
                zzabl = 0;
                zzabu = 0;
                zzabv = 0;
                paramInt = i;
              } while (zzabw.getItemCount() <= 0);
              MediaStatus.zza.zza(zzabw);
              return i | 0x8;
              label938:
              localObject = null;
              j = 0;
            }
            label947:
            paramInt = 0;
          }
          label952:
          i = 0;
        }
        label958:
        i = 0;
      }
    }
  }
  
  public final long zznO()
  {
    return zzabm;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.MediaStatus
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */