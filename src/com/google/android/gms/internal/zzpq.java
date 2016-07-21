package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzpq
  extends zze
{
  private String zzSE;
  private String zzSF;
  private String zzaUE;
  private String zzaUa;
  
  public final void setAppId(String paramString)
  {
    zzaUa = paramString;
  }
  
  public final void setAppInstallerId(String paramString)
  {
    zzaUE = paramString;
  }
  
  public final void setAppName(String paramString)
  {
    zzSE = paramString;
  }
  
  public final void setAppVersion(String paramString)
  {
    zzSF = paramString;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("appName", zzSE);
    localHashMap.put("appVersion", zzSF);
    localHashMap.put("appId", zzaUa);
    localHashMap.put("appInstallerId", zzaUE);
    return zzF(localHashMap);
  }
  
  public final String zzAJ()
  {
    return zzaUE;
  }
  
  public final void zza(zzpq paramzzpq)
  {
    if (!TextUtils.isEmpty(zzSE)) {
      zzSE = zzSE;
    }
    if (!TextUtils.isEmpty(zzSF)) {
      zzSF = zzSF;
    }
    if (!TextUtils.isEmpty(zzaUa)) {
      zzaUa = zzaUa;
    }
    if (!TextUtils.isEmpty(zzaUE)) {
      zzaUE = zzaUE;
    }
  }
  
  public final String zzlg()
  {
    return zzSE;
  }
  
  public final String zzli()
  {
    return zzSF;
  }
  
  public final String zzwK()
  {
    return zzaUa;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */