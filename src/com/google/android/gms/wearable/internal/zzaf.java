package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzaf
  extends zzc
  implements DataItem
{
  private final int zzaDQ;
  
  public zzaf(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    zzaDQ = paramInt2;
  }
  
  public final Map getAssets()
  {
    HashMap localHashMap = new HashMap(zzaDQ);
    int i = 0;
    while (i < zzaDQ)
    {
      zzac localzzac = new zzac(zzahi, zzaje + i);
      if (localzzac.getDataItemKey() != null) {
        localHashMap.put(localzzac.getDataItemKey(), localzzac);
      }
      i += 1;
    }
    return localHashMap;
  }
  
  public final byte[] getData()
  {
    return getByteArray("data");
  }
  
  public final Uri getUri()
  {
    return Uri.parse(getString("path"));
  }
  
  public final DataItem setData(byte[] paramArrayOfByte)
  {
    throw new UnsupportedOperationException();
  }
  
  public final String toString()
  {
    return toString(Log.isLoggable("DataItem", 3));
  }
  
  public final String toString(boolean paramBoolean)
  {
    Object localObject1 = getData();
    Object localObject2 = getAssets();
    StringBuilder localStringBuilder = new StringBuilder("DataItemInternal{ ");
    localStringBuilder.append("uri=" + getUri());
    Object localObject3 = new StringBuilder(", dataSz=");
    if (localObject1 == null) {}
    for (localObject1 = "null";; localObject1 = Integer.valueOf(localObject1.length))
    {
      localStringBuilder.append(localObject1);
      localStringBuilder.append(", numAssets=" + ((Map)localObject2).size());
      if ((!paramBoolean) || (((Map)localObject2).isEmpty())) {
        break label241;
      }
      localStringBuilder.append(", assets=[");
      localObject2 = ((Map)localObject2).entrySet().iterator();
      for (localObject1 = ""; ((Iterator)localObject2).hasNext(); localObject1 = ", ")
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        localStringBuilder.append((String)localObject1 + (String)((Map.Entry)localObject3).getKey() + ": " + ((DataItemAsset)((Map.Entry)localObject3).getValue()).getId());
      }
    }
    localStringBuilder.append("]");
    label241:
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public final DataItem zzIM()
  {
    return new zzad(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.zzaf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */