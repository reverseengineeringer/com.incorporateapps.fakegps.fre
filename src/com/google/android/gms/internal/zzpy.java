package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzpy
  extends zze
{
  public String mCategory;
  public String zzaUO;
  public String zzaVa;
  public long zzaVb;
  
  public final String getLabel()
  {
    return zzaUO;
  }
  
  public final long getTimeInMillis()
  {
    return zzaVb;
  }
  
  public final void setTimeInMillis(long paramLong)
  {
    zzaVb = paramLong;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("variableName", zzaVa);
    localHashMap.put("timeInMillis", Long.valueOf(zzaVb));
    localHashMap.put("category", mCategory);
    localHashMap.put("label", zzaUO);
    return zzF(localHashMap);
  }
  
  public final String zzAZ()
  {
    return mCategory;
  }
  
  public final String zzBh()
  {
    return zzaVa;
  }
  
  public final void zza(zzpy paramzzpy)
  {
    if (!TextUtils.isEmpty(zzaVa)) {
      zzaVa = zzaVa;
    }
    if (zzaVb != 0L) {
      zzaVb = zzaVb;
    }
    if (!TextUtils.isEmpty(mCategory)) {
      mCategory = mCategory;
    }
    if (!TextUtils.isEmpty(zzaUO)) {
      zzaUO = zzaUO;
    }
  }
  
  public final void zzeE(String paramString)
  {
    mCategory = paramString;
  }
  
  public final void zzeG(String paramString)
  {
    zzaUO = paramString;
  }
  
  public final void zzeL(String paramString)
  {
    zzaVa = paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */