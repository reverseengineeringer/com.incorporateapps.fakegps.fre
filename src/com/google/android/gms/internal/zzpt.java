package com.google.android.gms.internal;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.measurement.zze;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzpt
  extends zze
{
  private ProductAction zzPn;
  private final Map zzPo = new HashMap();
  private final List zzPp = new ArrayList();
  private final List zzPq = new ArrayList();
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    if (!zzPq.isEmpty()) {
      localHashMap.put("products", zzPq);
    }
    if (!zzPp.isEmpty()) {
      localHashMap.put("promotions", zzPp);
    }
    if (!zzPo.isEmpty()) {
      localHashMap.put("impressions", zzPo);
    }
    localHashMap.put("productAction", zzPn);
    return zzF(localHashMap);
  }
  
  public final ProductAction zzAV()
  {
    return zzPn;
  }
  
  public final List zzAW()
  {
    return Collections.unmodifiableList(zzPq);
  }
  
  public final Map zzAX()
  {
    return zzPo;
  }
  
  public final List zzAY()
  {
    return Collections.unmodifiableList(zzPp);
  }
  
  public final void zza(Product paramProduct, String paramString)
  {
    if (paramProduct == null) {
      return;
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    if (!zzPo.containsKey(str)) {
      zzPo.put(str, new ArrayList());
    }
    ((List)zzPo.get(str)).add(paramProduct);
  }
  
  public final void zza(zzpt paramzzpt)
  {
    zzPq.addAll(zzPq);
    zzPp.addAll(zzPp);
    Iterator localIterator = zzPo.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = ((List)((Map.Entry)localObject).getValue()).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramzzpt.zza((Product)((Iterator)localObject).next(), str);
      }
    }
    if (zzPn != null) {
      zzPn = zzPn;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */