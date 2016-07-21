package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzke
  extends zze
{
  private String zzPN;
  private String zzPO;
  private String zzPP;
  private boolean zzPQ;
  private String zzPR;
  private boolean zzPS;
  private double zzPT;
  private String zzrG;
  
  public final String getClientId()
  {
    return zzPO;
  }
  
  public final String getUserId()
  {
    return zzrG;
  }
  
  public final void setClientId(String paramString)
  {
    zzPO = paramString;
  }
  
  public final void setSampleRate(double paramDouble)
  {
    if ((paramDouble >= 0.0D) && (paramDouble <= 100.0D)) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Sample rate must be between 0% and 100%");
      zzPT = paramDouble;
      return;
    }
  }
  
  public final void setUserId(String paramString)
  {
    zzrG = paramString;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("hitType", zzPN);
    localHashMap.put("clientId", zzPO);
    localHashMap.put("userId", zzrG);
    localHashMap.put("androidAdId", zzPP);
    localHashMap.put("AdTargetingEnabled", Boolean.valueOf(zzPQ));
    localHashMap.put("sessionControl", zzPR);
    localHashMap.put("nonInteraction", Boolean.valueOf(zzPS));
    localHashMap.put("sampleRate", Double.valueOf(zzPT));
    return zzF(localHashMap);
  }
  
  public final void zzH(boolean paramBoolean)
  {
    zzPQ = paramBoolean;
  }
  
  public final void zzI(boolean paramBoolean)
  {
    zzPS = paramBoolean;
  }
  
  public final void zza(zzke paramzzke)
  {
    if (!TextUtils.isEmpty(zzPN)) {
      zzPN = zzPN;
    }
    if (!TextUtils.isEmpty(zzPO)) {
      zzPO = zzPO;
    }
    if (!TextUtils.isEmpty(zzrG)) {
      zzrG = zzrG;
    }
    if (!TextUtils.isEmpty(zzPP)) {
      zzPP = zzPP;
    }
    if (zzPQ) {
      zzPQ = true;
    }
    if (!TextUtils.isEmpty(zzPR)) {
      zzPR = zzPR;
    }
    if (zzPS) {
      zzPS = zzPS;
    }
    if (zzPT != 0.0D) {
      paramzzke.setSampleRate(zzPT);
    }
  }
  
  public final void zzaX(String paramString)
  {
    zzPN = paramString;
  }
  
  public final void zzaY(String paramString)
  {
    zzPP = paramString;
  }
  
  public final void zzaZ(String paramString)
  {
    zzPR = paramString;
  }
  
  public final String zziS()
  {
    return zzPN;
  }
  
  public final String zziT()
  {
    return zzPP;
  }
  
  public final boolean zziU()
  {
    return zzPQ;
  }
  
  public final String zziV()
  {
    return zzPR;
  }
  
  public final boolean zziW()
  {
    return zzPS;
  }
  
  public final double zziX()
  {
    return zzPT;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzke
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */