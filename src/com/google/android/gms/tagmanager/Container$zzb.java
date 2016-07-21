package com.google.android.gms.tagmanager;

import java.util.Map;

class Container$zzb
  implements zzt.zza
{
  private Container$zzb(Container paramContainer) {}
  
  public Object zzc(String paramString, Map paramMap)
  {
    Container.FunctionCallTagCallback localFunctionCallTagCallback = zzbhT.zzfQ(paramString);
    if (localFunctionCallTagCallback != null) {
      localFunctionCallTagCallback.execute(paramString, paramMap);
    }
    return zzdf.zzHE();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.Container.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */