package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzaf.zzc;
import com.google.android.gms.internal.zzaf.zzd;
import com.google.android.gms.internal.zzaf.zzi;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzaj
{
  private static void zza(DataLayer paramDataLayer, zzaf.zzd paramzzd)
  {
    paramzzd = zziD;
    int j = paramzzd.length;
    int i = 0;
    while (i < j)
    {
      paramDataLayer.zzfX(zzdf.zzg(paramzzd[i]));
      i += 1;
    }
  }
  
  public static void zza(DataLayer paramDataLayer, zzaf.zzi paramzzi)
  {
    if (zzjs == null)
    {
      zzbg.zzaK("supplemental missing experimentSupplemental");
      return;
    }
    zza(paramDataLayer, zzjs);
    zzb(paramDataLayer, zzjs);
    zzc(paramDataLayer, zzjs);
  }
  
  private static void zzb(DataLayer paramDataLayer, zzaf.zzd paramzzd)
  {
    paramzzd = zziC;
    int j = paramzzd.length;
    int i = 0;
    while (i < j)
    {
      Map localMap = zzc(paramzzd[i]);
      if (localMap != null) {
        paramDataLayer.push(localMap);
      }
      i += 1;
    }
  }
  
  private static Map zzc(zzag.zza paramzza)
  {
    paramzza = zzdf.zzl(paramzza);
    if (!(paramzza instanceof Map))
    {
      zzbg.zzaK("value: " + paramzza + " is not a map value, ignored.");
      return null;
    }
    return (Map)paramzza;
  }
  
  private static void zzc(DataLayer paramDataLayer, zzaf.zzd paramzzd)
  {
    zzaf.zzc[] arrayOfzzc = zziE;
    int j = arrayOfzzc.length;
    int i = 0;
    while (i < j)
    {
      zzaf.zzc localzzc = arrayOfzzc[i];
      if (key == null)
      {
        zzbg.zzaK("GaExperimentRandom: No key");
        i += 1;
      }
      else
      {
        Object localObject = paramDataLayer.get(key);
        if (!(localObject instanceof Number))
        {
          paramzzd = null;
          label64:
          long l1 = zziy;
          long l2 = zziz;
          if ((!zziA) || (paramzzd == null) || (paramzzd.longValue() < l1) || (paramzzd.longValue() > l2))
          {
            if (l1 > l2) {
              break label237;
            }
            localObject = Long.valueOf(Math.round(Math.random() * (l2 - l1) + l1));
          }
          paramDataLayer.zzfX(key);
          paramzzd = paramDataLayer.zzn(key, localObject);
          if (zziB > 0L)
          {
            if (paramzzd.containsKey("gtm")) {
              break label245;
            }
            paramzzd.put("gtm", DataLayer.mapOf(new Object[] { "lifetime", Long.valueOf(zziB) }));
          }
        }
        for (;;)
        {
          paramDataLayer.push(paramzzd);
          break;
          paramzzd = Long.valueOf(((Number)localObject).longValue());
          break label64;
          label237:
          zzbg.zzaK("GaExperimentRandom: random range invalid");
          break;
          label245:
          localObject = paramzzd.get("gtm");
          if ((localObject instanceof Map)) {
            ((Map)localObject).put("lifetime", Long.valueOf(zziB));
          } else {
            zzbg.zzaK("GaExperimentRandom: gtm not a map");
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzaj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */