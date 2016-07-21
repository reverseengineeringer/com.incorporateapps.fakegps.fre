package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzcc
  extends zzak
{
  private static final String ID = zzad.zzbP.toString();
  private static final String zzbjY = zzae.zzgm.toString();
  private static final String zzbjZ = zzae.zzgk.toString();
  
  public zzcc()
  {
    super(ID, new String[0]);
  }
  
  public boolean zzFW()
  {
    return false;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    Object localObject = (zzag.zza)paramMap.get(zzbjY);
    paramMap = (zzag.zza)paramMap.get(zzbjZ);
    double d2;
    double d1;
    if ((localObject != null) && (localObject != zzdf.zzHF()) && (paramMap != null) && (paramMap != zzdf.zzHF()))
    {
      localObject = zzdf.zzh((zzag.zza)localObject);
      paramMap = zzdf.zzh(paramMap);
      if ((localObject != zzdf.zzHD()) && (paramMap != zzdf.zzHD()))
      {
        d2 = ((zzde)localObject).doubleValue();
        d1 = paramMap.doubleValue();
        if (d2 > d1) {}
      }
    }
    for (;;)
    {
      return zzdf.zzR(Long.valueOf(Math.round((d1 - d2) * Math.random() + d2)));
      d1 = 2.147483647E9D;
      d2 = 0.0D;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */