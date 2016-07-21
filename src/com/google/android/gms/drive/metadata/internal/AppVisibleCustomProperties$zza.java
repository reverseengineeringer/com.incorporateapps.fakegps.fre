package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.HashMap;
import java.util.Map;

public class AppVisibleCustomProperties$zza
{
  private final Map zzasM = new HashMap();
  
  public zza zza(CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    zzx.zzb(paramCustomPropertyKey, "key");
    zzasM.put(paramCustomPropertyKey, new CustomProperty(paramCustomPropertyKey, paramString));
    return this;
  }
  
  public zza zza(CustomProperty paramCustomProperty)
  {
    zzx.zzb(paramCustomProperty, "property");
    zzasM.put(paramCustomProperty.zztB(), paramCustomProperty);
    return this;
  }
  
  public AppVisibleCustomProperties zztA()
  {
    return new AppVisibleCustomProperties(zzasM.values(), null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */