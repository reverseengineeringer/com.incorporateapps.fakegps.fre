package com.google.android.gms.analytics.internal;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

public class zzal
  implements zzp
{
  public String zzOV;
  public double zzTo = -1.0D;
  public int zzTp = -1;
  public int zzTq = -1;
  public int zzTr = -1;
  public int zzTs = -1;
  public Map zzTt = new HashMap();
  
  public int getSessionTimeout()
  {
    return zzTp;
  }
  
  public String getTrackingId()
  {
    return zzOV;
  }
  
  public String zzbr(String paramString)
  {
    String str = (String)zzTt.get(paramString);
    if (str != null) {
      return str;
    }
    return paramString;
  }
  
  public boolean zzlT()
  {
    return zzOV != null;
  }
  
  public boolean zzlU()
  {
    return zzTo >= 0.0D;
  }
  
  public double zzlV()
  {
    return zzTo;
  }
  
  public boolean zzlW()
  {
    return zzTp >= 0;
  }
  
  public boolean zzlX()
  {
    return zzTq != -1;
  }
  
  public boolean zzlY()
  {
    return zzTq == 1;
  }
  
  public boolean zzlZ()
  {
    return zzTr != -1;
  }
  
  public boolean zzma()
  {
    return zzTr == 1;
  }
  
  public boolean zzmb()
  {
    return zzTs == 1;
  }
  
  public String zzo(Activity paramActivity)
  {
    return zzbr(paramActivity.getClass().getCanonicalName());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */