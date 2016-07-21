package com.google.android.gms.internal;

import java.util.Map;

public class zzdi
  implements zzdf
{
  private final zzdj zzzy;
  
  public zzdi(zzdj paramzzdj)
  {
    zzzy = paramzzdj;
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    boolean bool1 = "1".equals(paramMap.get("transparentBackground"));
    boolean bool2 = "1".equals(paramMap.get("blur"));
    try
    {
      if (paramMap.get("blurRadius") != null)
      {
        f = Float.parseFloat((String)paramMap.get("blurRadius"));
        zzzy.zzd(bool1);
        zzzy.zza(bool2, f);
        return;
      }
    }
    catch (NumberFormatException paramzzjp)
    {
      for (;;)
      {
        zzin.zzb("Fail to parse float", paramzzjp);
        float f = 0.0F;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */