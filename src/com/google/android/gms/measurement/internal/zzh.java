package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.Iterator;
import java.util.Set;

public class zzh
{
  final String mName;
  final String zzaUa;
  final String zzaVM;
  final long zzaVN;
  final EventParams zzaVO;
  final long zzaez;
  
  zzh(zzw paramzzw, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, Bundle paramBundle)
  {
    zzx.zzcM(paramString2);
    zzx.zzcM(paramString3);
    zzaUa = paramString2;
    mName = paramString3;
    paramString2 = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      paramString2 = null;
    }
    zzaVM = paramString2;
    zzaez = paramLong1;
    zzaVN = paramLong2;
    if ((zzaVN != 0L) && (zzaVN > zzaez)) {
      paramzzw.zzAo().zzCF().zzfg("Event created with reverse previous/current timestamps");
    }
    zzaVO = zza(paramzzw, paramBundle);
  }
  
  private zzh(zzw paramzzw, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, EventParams paramEventParams)
  {
    zzx.zzcM(paramString2);
    zzx.zzcM(paramString3);
    zzx.zzz(paramEventParams);
    zzaUa = paramString2;
    mName = paramString3;
    paramString2 = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      paramString2 = null;
    }
    zzaVM = paramString2;
    zzaez = paramLong1;
    zzaVN = paramLong2;
    if ((zzaVN != 0L) && (zzaVN > zzaez)) {
      paramzzw.zzAo().zzCF().zzfg("Event created with reverse previous/current timestamps");
    }
    zzaVO = paramEventParams;
  }
  
  private EventParams zza(zzw paramzzw, Bundle paramBundle)
  {
    if ((paramBundle != null) && (!paramBundle.isEmpty()))
    {
      paramBundle = new Bundle(paramBundle);
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (str == null)
        {
          localIterator.remove();
        }
        else
        {
          Object localObject = paramzzw.zzCk().zzk(str, paramBundle.get(str));
          if (localObject == null) {
            localIterator.remove();
          } else {
            paramzzw.zzCk().zza(paramBundle, str, localObject);
          }
        }
      }
      return new EventParams(paramBundle);
    }
    return new EventParams(new Bundle());
  }
  
  public String toString()
  {
    return "Event{appId='" + zzaUa + '\'' + ", name='" + mName + '\'' + ", params=" + zzaVO + '}';
  }
  
  zzh zza(zzw paramzzw, long paramLong)
  {
    return new zzh(paramzzw, zzaVM, zzaUa, mName, zzaez, paramLong, zzaVO);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */