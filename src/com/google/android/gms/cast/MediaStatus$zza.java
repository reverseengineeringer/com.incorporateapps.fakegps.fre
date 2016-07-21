package com.google.android.gms.cast;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class MediaStatus$zza
{
  private int zzabx = 0;
  private List zzaby = new ArrayList();
  private SparseArray zzabz = new SparseArray();
  
  MediaStatus$zza(MediaStatus paramMediaStatus) {}
  
  private void clear()
  {
    zzabx = 0;
    zzaby.clear();
    zzabz.clear();
  }
  
  private void zza(MediaQueueItem[] paramArrayOfMediaQueueItem)
  {
    zzaby.clear();
    zzabz.clear();
    int i = 0;
    while (i < paramArrayOfMediaQueueItem.length)
    {
      MediaQueueItem localMediaQueueItem = paramArrayOfMediaQueueItem[i];
      zzaby.add(localMediaQueueItem);
      zzabz.put(localMediaQueueItem.getItemId(), Integer.valueOf(i));
      i += 1;
    }
  }
  
  private Integer zzbd(int paramInt)
  {
    return (Integer)zzabz.get(paramInt);
  }
  
  private boolean zzh(JSONObject paramJSONObject)
  {
    int j = 2;
    boolean bool2 = true;
    Object localObject;
    int i;
    if (paramJSONObject.has("repeatMode"))
    {
      int k = zzabx;
      localObject = paramJSONObject.getString("repeatMode");
      i = -1;
      switch (((String)localObject).hashCode())
      {
      default: 
        switch (i)
        {
        default: 
          j = k;
        case 2: 
          label111:
          if (zzabx != j) {
            zzabx = j;
          }
          break;
        }
        break;
      }
    }
    for (boolean bool1 = true;; bool1 = false)
    {
      if (paramJSONObject.has("items"))
      {
        paramJSONObject = paramJSONObject.getJSONArray("items");
        j = paramJSONObject.length();
        localObject = new SparseArray();
        i = 0;
        for (;;)
        {
          if (i < j)
          {
            ((SparseArray)localObject).put(i, Integer.valueOf(paramJSONObject.getJSONObject(i).getInt("itemId")));
            i += 1;
            continue;
            if (!((String)localObject).equals("REPEAT_OFF")) {
              break;
            }
            i = 0;
            break;
            if (!((String)localObject).equals("REPEAT_ALL")) {
              break;
            }
            i = 1;
            break;
            if (!((String)localObject).equals("REPEAT_SINGLE")) {
              break;
            }
            i = 2;
            break;
            if (!((String)localObject).equals("REPEAT_ALL_AND_SHUFFLE")) {
              break;
            }
            i = 3;
            break;
            j = 0;
            break label111;
            j = 1;
            break label111;
            j = 3;
            break label111;
          }
        }
        MediaQueueItem[] arrayOfMediaQueueItem = new MediaQueueItem[j];
        i = 0;
        Integer localInteger;
        JSONObject localJSONObject;
        boolean bool3;
        if (i < j)
        {
          localInteger = (Integer)((SparseArray)localObject).get(i);
          localJSONObject = paramJSONObject.getJSONObject(i);
          MediaQueueItem localMediaQueueItem = zzbb(localInteger.intValue());
          if (localMediaQueueItem != null)
          {
            bool3 = localMediaQueueItem.zzh(localJSONObject);
            arrayOfMediaQueueItem[i] = localMediaQueueItem;
            if (i == zzbd(localInteger.intValue()).intValue()) {
              break label453;
            }
            bool1 = true;
          }
        }
        for (;;)
        {
          i += 1;
          break;
          if (localInteger.intValue() == MediaStatus.zza(zzabA))
          {
            arrayOfMediaQueueItem[i] = new MediaQueueItem.Builder(MediaStatus.zzb(zzabA)).build();
            arrayOfMediaQueueItem[i].zzh(localJSONObject);
            bool1 = true;
          }
          else
          {
            arrayOfMediaQueueItem[i] = new MediaQueueItem(localJSONObject);
            bool1 = true;
            continue;
            if (zzaby.size() != j) {
              bool1 = bool2;
            }
            for (;;)
            {
              zza(arrayOfMediaQueueItem);
              return bool1;
            }
            label453:
            bool1 |= bool3;
          }
        }
      }
      return bool1;
    }
  }
  
  public int getItemCount()
  {
    return zzaby.size();
  }
  
  public int getRepeatMode()
  {
    return zzabx;
  }
  
  public MediaQueueItem zzbb(int paramInt)
  {
    Integer localInteger = (Integer)zzabz.get(paramInt);
    if (localInteger == null) {
      return null;
    }
    return (MediaQueueItem)zzaby.get(localInteger.intValue());
  }
  
  public MediaQueueItem zzbc(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= zzaby.size())) {
      return null;
    }
    return (MediaQueueItem)zzaby.get(paramInt);
  }
  
  public List zznP()
  {
    return Collections.unmodifiableList(zzaby);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.MediaStatus.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */