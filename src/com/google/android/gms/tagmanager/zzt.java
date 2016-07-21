package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzt
  extends zzak
{
  private static final String ID = zzad.zzbJ.toString();
  private static final String zzbhF = zzae.zzdI.toString();
  private static final String zzbip = zzae.zzfH.toString();
  private final zzt.zza zzbiq;
  
  public zzt(zzt.zza paramzza)
  {
    super(ID, new String[] { zzbip });
    zzbiq = paramzza;
  }
  
  public boolean zzFW()
  {
    return false;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    String str = zzdf.zzg((zzag.zza)paramMap.get(zzbip));
    HashMap localHashMap = new HashMap();
    paramMap = (zzag.zza)paramMap.get(zzbhF);
    if (paramMap != null)
    {
      paramMap = zzdf.zzl(paramMap);
      if (!(paramMap instanceof Map))
      {
        zzbg.zzaK("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
        return zzdf.zzHF();
      }
      paramMap = ((Map)paramMap).entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        localHashMap.put(localEntry.getKey().toString(), localEntry.getValue());
      }
    }
    try
    {
      paramMap = zzdf.zzR(zzbiq.zzc(str, localHashMap));
      return paramMap;
    }
    catch (Exception paramMap)
    {
      zzbg.zzaK("Custom macro/tag " + str + " threw exception " + paramMap.getMessage());
    }
    return zzdf.zzHF();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */