package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

abstract class zzcz
  extends zzca
{
  public zzcz(String paramString)
  {
    super(paramString);
  }
  
  protected boolean zza(zzag.zza paramzza1, zzag.zza paramzza2, Map paramMap)
  {
    paramzza1 = zzdf.zzg(paramzza1);
    paramzza2 = zzdf.zzg(paramzza2);
    if ((paramzza1 == zzdf.zzHE()) || (paramzza2 == zzdf.zzHE())) {
      return false;
    }
    return zza(paramzza1, paramzza2, paramMap);
  }
  
  protected abstract boolean zza(String paramString1, String paramString2, Map paramMap);
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */