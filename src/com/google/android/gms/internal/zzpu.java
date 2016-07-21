package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzpu
  extends zze
{
  private String mCategory;
  private String zzSU;
  private long zzaDV;
  private String zzaUO;
  
  public final String getAction()
  {
    return zzSU;
  }
  
  public final String getLabel()
  {
    return zzaUO;
  }
  
  public final long getValue()
  {
    return zzaDV;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("category", mCategory);
    localHashMap.put("action", zzSU);
    localHashMap.put("label", zzaUO);
    localHashMap.put("value", Long.valueOf(zzaDV));
    return zzF(localHashMap);
  }
  
  public final String zzAZ()
  {
    return mCategory;
  }
  
  public final void zzN(long paramLong)
  {
    zzaDV = paramLong;
  }
  
  public final void zza(zzpu paramzzpu)
  {
    if (!TextUtils.isEmpty(mCategory)) {
      mCategory = mCategory;
    }
    if (!TextUtils.isEmpty(zzSU)) {
      zzSU = zzSU;
    }
    if (!TextUtils.isEmpty(zzaUO)) {
      zzaUO = zzaUO;
    }
    if (zzaDV != 0L) {
      zzaDV = zzaDV;
    }
  }
  
  public final void zzeE(String paramString)
  {
    mCategory = paramString;
  }
  
  public final void zzeF(String paramString)
  {
    zzSU = paramString;
  }
  
  public final void zzeG(String paramString)
  {
    zzaUO = paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */