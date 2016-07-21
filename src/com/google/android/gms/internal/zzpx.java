package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzpx
  extends zze
{
  public String zzSU;
  public String zzaUY;
  public String zzaUZ;
  
  public final String getAction()
  {
    return zzSU;
  }
  
  public final String getTarget()
  {
    return zzaUZ;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("network", zzaUY);
    localHashMap.put("action", zzSU);
    localHashMap.put("target", zzaUZ);
    return zzF(localHashMap);
  }
  
  public final String zzBg()
  {
    return zzaUY;
  }
  
  public final void zza(zzpx paramzzpx)
  {
    if (!TextUtils.isEmpty(zzaUY)) {
      zzaUY = zzaUY;
    }
    if (!TextUtils.isEmpty(zzSU)) {
      zzSU = zzSU;
    }
    if (!TextUtils.isEmpty(zzaUZ)) {
      zzaUZ = zzaUZ;
    }
  }
  
  public final void zzeF(String paramString)
  {
    zzSU = paramString;
  }
  
  public final void zzeJ(String paramString)
  {
    zzaUY = paramString;
  }
  
  public final void zzeK(String paramString)
  {
    zzaUZ = paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */