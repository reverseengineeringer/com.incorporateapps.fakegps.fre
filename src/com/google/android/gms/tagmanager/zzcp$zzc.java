package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzrs.zza;
import com.google.android.gms.internal.zzrs.zze;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class zzcp$zzc
{
  private final Map zzbkJ = new HashMap();
  private final Map zzbkK = new HashMap();
  private final Map zzbkL = new HashMap();
  private final Map zzbkM = new HashMap();
  private zzrs.zza zzbkN;
  private final Set zzbky = new HashSet();
  
  public Set zzHi()
  {
    return zzbky;
  }
  
  public Map zzHj()
  {
    return zzbkJ;
  }
  
  public Map zzHk()
  {
    return zzbkL;
  }
  
  public Map zzHl()
  {
    return zzbkM;
  }
  
  public Map zzHm()
  {
    return zzbkK;
  }
  
  public zzrs.zza zzHn()
  {
    return zzbkN;
  }
  
  public void zza(zzrs.zze paramzze)
  {
    zzbky.add(paramzze);
  }
  
  public void zza(zzrs.zze paramzze, zzrs.zza paramzza)
  {
    List localList = (List)zzbkJ.get(paramzze);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new ArrayList();
      zzbkJ.put(paramzze, localObject);
    }
    ((List)localObject).add(paramzza);
  }
  
  public void zza(zzrs.zze paramzze, String paramString)
  {
    List localList = (List)zzbkL.get(paramzze);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new ArrayList();
      zzbkL.put(paramzze, localObject);
    }
    ((List)localObject).add(paramString);
  }
  
  public void zzb(zzrs.zza paramzza)
  {
    zzbkN = paramzza;
  }
  
  public void zzb(zzrs.zze paramzze, zzrs.zza paramzza)
  {
    List localList = (List)zzbkK.get(paramzze);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new ArrayList();
      zzbkK.put(paramzze, localObject);
    }
    ((List)localObject).add(paramzza);
  }
  
  public void zzb(zzrs.zze paramzze, String paramString)
  {
    List localList = (List)zzbkM.get(paramzze);
    Object localObject = localList;
    if (localList == null)
    {
      localObject = new ArrayList();
      zzbkM.put(paramzze, localObject);
    }
    ((List)localObject).add(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcp.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */