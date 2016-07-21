package com.google.android.gms.auth.api.signin.internal;

import android.app.Activity;
import com.google.android.gms.auth.api.signin.zzd;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlf;
import com.google.android.gms.internal.zzlh;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class zzk
{
  private final Map zzXD;
  
  public zzk(Activity paramActivity, List paramList, Map paramMap)
  {
    zzx.zzz(paramActivity);
    zzx.zzz(paramList);
    zzx.zzz(paramMap);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      zzd localzzd = (zzd)localIterator.next();
      List localList = (List)paramMap.get(localzzd);
      paramList = localList;
      if (localList == null) {
        paramList = Collections.emptyList();
      }
      paramList = zza(localzzd, paramActivity, paramList);
      if (paramList != null) {
        localHashMap.put(localzzd, paramList);
      }
    }
    zzXD = Collections.unmodifiableMap(localHashMap);
  }
  
  private zzlf zza(zzd paramzzd, Activity paramActivity, List paramList)
  {
    if (zzd.zzXi.equals(paramzzd)) {
      return new zzlh(paramActivity, paramList);
    }
    return null;
  }
  
  public zzlf zza(zzd paramzzd)
  {
    zzx.zzz(paramzzd);
    return (zzlf)zzXD.get(paramzzd);
  }
  
  public Collection zznh()
  {
    return zzXD.values();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */