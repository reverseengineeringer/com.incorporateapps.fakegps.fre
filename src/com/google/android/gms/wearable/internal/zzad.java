package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzad
  implements DataItem
{
  private Uri mUri;
  private byte[] zzaKm;
  private Map zzbsy;
  
  public zzad(DataItem paramDataItem)
  {
    mUri = paramDataItem.getUri();
    zzaKm = paramDataItem.getData();
    HashMap localHashMap = new HashMap();
    paramDataItem = paramDataItem.getAssets().entrySet().iterator();
    while (paramDataItem.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramDataItem.next();
      if (localEntry.getKey() != null) {
        localHashMap.put(localEntry.getKey(), ((DataItemAsset)localEntry.getValue()).freeze());
      }
    }
    zzbsy = Collections.unmodifiableMap(localHashMap);
  }
  
  public Map getAssets()
  {
    return zzbsy;
  }
  
  public byte[] getData()
  {
    return zzaKm;
  }
  
  public Uri getUri()
  {
    return mUri;
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public DataItem setData(byte[] paramArrayOfByte)
  {
    throw new UnsupportedOperationException();
  }
  
  public String toString()
  {
    return toString(Log.isLoggable("DataItem", 3));
  }
  
  public String toString(boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder("DataItemEntity{ ");
    localStringBuilder.append("uri=" + mUri);
    Object localObject2 = new StringBuilder(", dataSz=");
    if (zzaKm == null) {}
    for (Object localObject1 = "null";; localObject1 = Integer.valueOf(zzaKm.length))
    {
      localStringBuilder.append(localObject1);
      localStringBuilder.append(", numAssets=" + zzbsy.size());
      if ((!paramBoolean) || (zzbsy.isEmpty())) {
        break label242;
      }
      localStringBuilder.append(", assets=[");
      localObject2 = zzbsy.entrySet().iterator();
      for (localObject1 = ""; ((Iterator)localObject2).hasNext(); localObject1 = ", ")
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
        localStringBuilder.append((String)localObject1 + (String)localEntry.getKey() + ": " + ((DataItemAsset)localEntry.getValue()).getId());
      }
    }
    localStringBuilder.append("]");
    label242:
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public DataItem zzIM()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */