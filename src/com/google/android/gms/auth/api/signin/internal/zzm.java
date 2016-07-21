package com.google.android.gms.auth.api.signin.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class zzm
{
  private static final WeakHashMap zzXE = new WeakHashMap();
  private static final Lock zzXF = new ReentrantLock();
  private final Lock zzXG = new ReentrantLock();
  private final Map zzXH;
  
  private zzm(Map paramMap)
  {
    zzXH = paramMap;
  }
  
  public static zzm zzbN(String paramString)
  {
    zzx.zzcM(paramString);
    zzXF.lock();
    try
    {
      zzm localzzm2 = (zzm)zzXE.get(paramString);
      zzm localzzm1 = localzzm2;
      if (localzzm2 == null)
      {
        localzzm1 = new zzm(new zzm.zzb(20));
        zzXE.put(paramString, localzzm1);
      }
      return localzzm1;
    }
    finally
    {
      zzXF.unlock();
    }
  }
  
  public boolean zza(Set paramSet, zzm.zza paramzza)
  {
    zzx.zzz(paramSet);
    zzx.zzz(paramzza);
    if ((paramSet.size() == 0) || (paramzza.zzb())) {
      return false;
    }
    paramSet = new ArrayList(paramSet);
    Collections.sort(paramSet);
    zzXG.lock();
    try
    {
      paramSet = TextUtils.join(" ", paramSet);
      zzXH.put(paramSet, paramzza);
      return true;
    }
    finally
    {
      zzXG.unlock();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */