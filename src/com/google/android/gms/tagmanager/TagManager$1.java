package com.google.android.gms.tagmanager;

import java.util.Map;

class TagManager$1
  implements DataLayer.zzb
{
  TagManager$1(TagManager paramTagManager) {}
  
  public void zzQ(Map paramMap)
  {
    paramMap = paramMap.get("event");
    if (paramMap != null) {
      TagManager.zza(zzbln, paramMap.toString());
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.TagManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */