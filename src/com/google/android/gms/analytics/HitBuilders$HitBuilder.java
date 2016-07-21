package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HitBuilders$HitBuilder
{
  private Map zzPm = new HashMap();
  ProductAction zzPn;
  Map zzPo = new HashMap();
  List zzPp = new ArrayList();
  List zzPq = new ArrayList();
  
  public HitBuilder addImpression(Product paramProduct, String paramString)
  {
    if (paramProduct == null)
    {
      zzae.zzaK("product should be non-null");
      return this;
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    if (!zzPo.containsKey(str)) {
      zzPo.put(str, new ArrayList());
    }
    ((List)zzPo.get(str)).add(paramProduct);
    return this;
  }
  
  public HitBuilder addProduct(Product paramProduct)
  {
    if (paramProduct == null)
    {
      zzae.zzaK("product should be non-null");
      return this;
    }
    zzPq.add(paramProduct);
    return this;
  }
  
  public HitBuilder addPromotion(Promotion paramPromotion)
  {
    if (paramPromotion == null)
    {
      zzae.zzaK("promotion should be non-null");
      return this;
    }
    zzPp.add(paramPromotion);
    return this;
  }
  
  public Map build()
  {
    HashMap localHashMap = new HashMap(zzPm);
    if (zzPn != null) {
      localHashMap.putAll(zzPn.build());
    }
    Iterator localIterator = zzPp.iterator();
    int i = 1;
    while (localIterator.hasNext())
    {
      localHashMap.putAll(((Promotion)localIterator.next()).zzba(zzc.zzZ(i)));
      i += 1;
    }
    localIterator = zzPq.iterator();
    i = 1;
    while (localIterator.hasNext())
    {
      localHashMap.putAll(((Product)localIterator.next()).zzba(zzc.zzX(i)));
      i += 1;
    }
    localIterator = zzPo.entrySet().iterator();
    i = 1;
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject = (List)localEntry.getValue();
      String str = zzc.zzac(i);
      localObject = ((List)localObject).iterator();
      int j = 1;
      while (((Iterator)localObject).hasNext())
      {
        localHashMap.putAll(((Product)((Iterator)localObject).next()).zzba(str + zzc.zzab(j)));
        j += 1;
      }
      if (!TextUtils.isEmpty((CharSequence)localEntry.getKey())) {
        localHashMap.put(str + "nm", localEntry.getKey());
      }
      i += 1;
    }
    return localHashMap;
  }
  
  protected String get(String paramString)
  {
    return (String)zzPm.get(paramString);
  }
  
  public final HitBuilder set(String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      zzPm.put(paramString1, paramString2);
      return this;
    }
    zzae.zzaK(" HitBuilder.set() called with a null paramName.");
    return this;
  }
  
  public final HitBuilder setAll(Map paramMap)
  {
    if (paramMap == null) {
      return this;
    }
    zzPm.putAll(new HashMap(paramMap));
    return this;
  }
  
  public HitBuilder setCampaignParamsFromUrl(String paramString)
  {
    paramString = zzam.zzbu(paramString);
    if (TextUtils.isEmpty(paramString)) {
      return this;
    }
    paramString = zzam.zzbs(paramString);
    set("&cc", (String)paramString.get("utm_content"));
    set("&cm", (String)paramString.get("utm_medium"));
    set("&cn", (String)paramString.get("utm_campaign"));
    set("&cs", (String)paramString.get("utm_source"));
    set("&ck", (String)paramString.get("utm_term"));
    set("&ci", (String)paramString.get("utm_id"));
    set("&anid", (String)paramString.get("anid"));
    set("&gclid", (String)paramString.get("gclid"));
    set("&dclid", (String)paramString.get("dclid"));
    set("&aclid", (String)paramString.get("aclid"));
    set("&gmob_t", (String)paramString.get("gmob_t"));
    return this;
  }
  
  public HitBuilder setCustomDimension(int paramInt, String paramString)
  {
    set(zzc.zzT(paramInt), paramString);
    return this;
  }
  
  public HitBuilder setCustomMetric(int paramInt, float paramFloat)
  {
    set(zzc.zzV(paramInt), Float.toString(paramFloat));
    return this;
  }
  
  protected HitBuilder setHitType(String paramString)
  {
    set("&t", paramString);
    return this;
  }
  
  public HitBuilder setNewSession()
  {
    set("&sc", "start");
    return this;
  }
  
  public HitBuilder setNonInteraction(boolean paramBoolean)
  {
    set("&ni", zzam.zzK(paramBoolean));
    return this;
  }
  
  public HitBuilder setProductAction(ProductAction paramProductAction)
  {
    zzPn = paramProductAction;
    return this;
  }
  
  public HitBuilder setPromotionAction(String paramString)
  {
    zzPm.put("&promoa", paramString);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.HitBuilders.HitBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */