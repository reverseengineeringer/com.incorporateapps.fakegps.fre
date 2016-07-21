package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzpv
  extends zze
{
  public boolean zzaUP;
  public String zzaxl;
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final void setDescription(String paramString)
  {
    zzaxl = paramString;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("description", zzaxl);
    localHashMap.put("fatal", Boolean.valueOf(zzaUP));
    return zzF(localHashMap);
  }
  
  public final boolean zzBa()
  {
    return zzaUP;
  }
  
  public final void zza(zzpv paramzzpv)
  {
    if (!TextUtils.isEmpty(zzaxl)) {
      zzaxl = zzaxl;
    }
    if (zzaUP) {
      zzaUP = zzaUP;
    }
  }
  
  public final void zzao(boolean paramBoolean)
  {
    zzaUP = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */