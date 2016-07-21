package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzrs.zze;
import java.util.List;
import java.util.Map;
import java.util.Set;

class zzcp$3
  implements zzcp.zza
{
  zzcp$3(zzcp paramzzcp, Map paramMap1, Map paramMap2, Map paramMap3, Map paramMap4) {}
  
  public void zza(zzrs.zze paramzze, Set paramSet1, Set paramSet2, zzck paramzzck)
  {
    List localList1 = (List)zzbkD.get(paramzze);
    List localList2 = (List)zzbkE.get(paramzze);
    if (localList1 != null)
    {
      paramSet1.addAll(localList1);
      paramzzck.zzGJ().zzc(localList1, localList2);
    }
    paramSet1 = (List)zzbkF.get(paramzze);
    paramzze = (List)zzbkG.get(paramzze);
    if (paramSet1 != null)
    {
      paramSet2.addAll(paramSet1);
      paramzzck.zzGK().zzc(paramSet1, paramzze);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcp.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */