package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzpr
  extends zze
{
  private String mName;
  private String zzaPI;
  private String zzaUF;
  private String zzaUG;
  private String zzaUH;
  private String zzaUI;
  private String zzaUJ;
  private String zzaUK;
  private String zzxG;
  private String zzyv;
  
  public final String getContent()
  {
    return zzxG;
  }
  
  public final String getId()
  {
    return zzyv;
  }
  
  public final String getName()
  {
    return mName;
  }
  
  public final String getSource()
  {
    return zzaPI;
  }
  
  public final void setName(String paramString)
  {
    mName = paramString;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("name", mName);
    localHashMap.put("source", zzaPI);
    localHashMap.put("medium", zzaUF);
    localHashMap.put("keyword", zzaUG);
    localHashMap.put("content", zzxG);
    localHashMap.put("id", zzyv);
    localHashMap.put("adNetworkId", zzaUH);
    localHashMap.put("gclid", zzaUI);
    localHashMap.put("dclid", zzaUJ);
    localHashMap.put("aclid", zzaUK);
    return zzF(localHashMap);
  }
  
  public final String zzAK()
  {
    return zzaUF;
  }
  
  public final String zzAL()
  {
    return zzaUG;
  }
  
  public final String zzAM()
  {
    return zzaUH;
  }
  
  public final String zzAN()
  {
    return zzaUI;
  }
  
  public final String zzAO()
  {
    return zzaUJ;
  }
  
  public final String zzAP()
  {
    return zzaUK;
  }
  
  public final void zza(zzpr paramzzpr)
  {
    if (!TextUtils.isEmpty(mName)) {
      mName = mName;
    }
    if (!TextUtils.isEmpty(zzaPI)) {
      zzaPI = zzaPI;
    }
    if (!TextUtils.isEmpty(zzaUF)) {
      zzaUF = zzaUF;
    }
    if (!TextUtils.isEmpty(zzaUG)) {
      zzaUG = zzaUG;
    }
    if (!TextUtils.isEmpty(zzxG)) {
      zzxG = zzxG;
    }
    if (!TextUtils.isEmpty(zzyv)) {
      zzyv = zzyv;
    }
    if (!TextUtils.isEmpty(zzaUH)) {
      zzaUH = zzaUH;
    }
    if (!TextUtils.isEmpty(zzaUI)) {
      zzaUI = zzaUI;
    }
    if (!TextUtils.isEmpty(zzaUJ)) {
      zzaUJ = zzaUJ;
    }
    if (!TextUtils.isEmpty(zzaUK)) {
      zzaUK = zzaUK;
    }
  }
  
  public final void zzeA(String paramString)
  {
    zzaUH = paramString;
  }
  
  public final void zzeB(String paramString)
  {
    zzaUI = paramString;
  }
  
  public final void zzeC(String paramString)
  {
    zzaUJ = paramString;
  }
  
  public final void zzeD(String paramString)
  {
    zzaUK = paramString;
  }
  
  public final void zzev(String paramString)
  {
    zzaPI = paramString;
  }
  
  public final void zzew(String paramString)
  {
    zzaUF = paramString;
  }
  
  public final void zzex(String paramString)
  {
    zzaUG = paramString;
  }
  
  public final void zzey(String paramString)
  {
    zzxG = paramString;
  }
  
  public final void zzez(String paramString)
  {
    zzyv = paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */