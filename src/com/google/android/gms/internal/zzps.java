package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;

public final class zzps
  extends zze
{
  public int zzDC;
  public int zzDD;
  public int zzaUL;
  public int zzaUM;
  public int zzaUN;
  private String zzaaL;
  
  public final String getLanguage()
  {
    return zzaaL;
  }
  
  public final void setLanguage(String paramString)
  {
    zzaaL = paramString;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("language", zzaaL);
    localHashMap.put("screenColors", Integer.valueOf(zzaUL));
    localHashMap.put("screenWidth", Integer.valueOf(zzDC));
    localHashMap.put("screenHeight", Integer.valueOf(zzDD));
    localHashMap.put("viewportWidth", Integer.valueOf(zzaUM));
    localHashMap.put("viewportHeight", Integer.valueOf(zzaUN));
    return zzF(localHashMap);
  }
  
  public final int zzAQ()
  {
    return zzaUL;
  }
  
  public final int zzAR()
  {
    return zzDC;
  }
  
  public final int zzAS()
  {
    return zzDD;
  }
  
  public final int zzAT()
  {
    return zzaUM;
  }
  
  public final int zzAU()
  {
    return zzaUN;
  }
  
  public final void zza(zzps paramzzps)
  {
    if (zzaUL != 0) {
      zzaUL = zzaUL;
    }
    if (zzDC != 0) {
      zzDC = zzDC;
    }
    if (zzDD != 0) {
      zzDD = zzDD;
    }
    if (zzaUM != 0) {
      zzaUM = zzaUM;
    }
    if (zzaUN != 0) {
      zzaUN = zzaUN;
    }
    if (!TextUtils.isEmpty(zzaaL)) {
      zzaaL = zzaaL;
    }
  }
  
  public final void zziA(int paramInt)
  {
    zzaUL = paramInt;
  }
  
  public final void zziB(int paramInt)
  {
    zzDC = paramInt;
  }
  
  public final void zziC(int paramInt)
  {
    zzDD = paramInt;
  }
  
  public final void zziD(int paramInt)
  {
    zzaUM = paramInt;
  }
  
  public final void zziE(int paramInt)
  {
    zzaUN = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzps
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */