package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class zzpw
  extends zze
{
  private String zzaUQ;
  private int zzaUR;
  private int zzaUS;
  private String zzaUT;
  private String zzaUU;
  private boolean zzaUV;
  private boolean zzaUW;
  private boolean zzaUX;
  
  public zzpw()
  {
    this(false);
  }
  
  public zzpw(boolean paramBoolean)
  {
    this(paramBoolean, zzBb());
  }
  
  public zzpw(boolean paramBoolean, int paramInt)
  {
    zzx.zzbV(paramInt);
    zzaUR = paramInt;
    zzaUW = paramBoolean;
  }
  
  static int zzBb()
  {
    UUID localUUID = UUID.randomUUID();
    int i = (int)(localUUID.getLeastSignificantBits() & 0x7FFFFFFF);
    if (i != 0) {}
    int j;
    do
    {
      return i;
      j = (int)(localUUID.getMostSignificantBits() & 0x7FFFFFFF);
      i = j;
    } while (j != 0);
    Log.e("GAv4", "UUID.randomUUID() returned 0.");
    return Integer.MAX_VALUE;
  }
  
  private void zzBf()
  {
    if (zzaUX) {
      throw new IllegalStateException("ScreenViewInfo is immutable");
    }
  }
  
  public final void setScreenName(String paramString)
  {
    zzBf();
    zzaUQ = paramString;
  }
  
  public final String toString()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("screenName", zzaUQ);
    localHashMap.put("interstitial", Boolean.valueOf(zzaUV));
    localHashMap.put("automatic", Boolean.valueOf(zzaUW));
    localHashMap.put("screenId", Integer.valueOf(zzaUR));
    localHashMap.put("referrerScreenId", Integer.valueOf(zzaUS));
    localHashMap.put("referrerScreenName", zzaUT);
    localHashMap.put("referrerUri", zzaUU);
    return zzF(localHashMap);
  }
  
  public final String zzBc()
  {
    return zzaUQ;
  }
  
  public final int zzBd()
  {
    return zzaUR;
  }
  
  public final String zzBe()
  {
    return zzaUU;
  }
  
  public final void zza(zzpw paramzzpw)
  {
    if (!TextUtils.isEmpty(zzaUQ)) {
      paramzzpw.setScreenName(zzaUQ);
    }
    if (zzaUR != 0) {
      paramzzpw.zziF(zzaUR);
    }
    if (zzaUS != 0) {
      paramzzpw.zziG(zzaUS);
    }
    if (!TextUtils.isEmpty(zzaUT)) {
      paramzzpw.zzeH(zzaUT);
    }
    if (!TextUtils.isEmpty(zzaUU)) {
      paramzzpw.zzeI(zzaUU);
    }
    if (zzaUV) {
      paramzzpw.zzaq(zzaUV);
    }
    if (zzaUW) {
      paramzzpw.zzap(zzaUW);
    }
  }
  
  public final void zzap(boolean paramBoolean)
  {
    zzBf();
    zzaUW = paramBoolean;
  }
  
  public final void zzaq(boolean paramBoolean)
  {
    zzBf();
    zzaUV = paramBoolean;
  }
  
  public final void zzeH(String paramString)
  {
    zzBf();
    zzaUT = paramString;
  }
  
  public final void zzeI(String paramString)
  {
    zzBf();
    if (TextUtils.isEmpty(paramString))
    {
      zzaUU = null;
      return;
    }
    zzaUU = paramString;
  }
  
  public final void zziF(int paramInt)
  {
    zzBf();
    zzaUR = paramInt;
  }
  
  public final void zziG(int paramInt)
  {
    zzBf();
    zzaUS = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */