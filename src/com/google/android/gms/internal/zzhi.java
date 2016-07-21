package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class zzhi
{
  private final String zzEY;
  private String zzF;
  private int zzGu;
  private final List zzJI;
  private final List zzJJ;
  private final String zzJK;
  private final String zzJL;
  private final String zzJM;
  private final String zzJN;
  private final boolean zzJO;
  private final boolean zzJP;
  
  public zzhi(int paramInt, Map paramMap)
  {
    zzF = ((String)paramMap.get("url"));
    zzJL = ((String)paramMap.get("base_uri"));
    zzJM = ((String)paramMap.get("post_parameters"));
    zzJO = parseBoolean((String)paramMap.get("drt_include"));
    zzJP = parseBoolean((String)paramMap.get("pan_include"));
    zzJK = ((String)paramMap.get("activation_overlay_url"));
    zzJJ = zzav((String)paramMap.get("check_packages"));
    zzEY = ((String)paramMap.get("request_id"));
    zzJN = ((String)paramMap.get("type"));
    zzJI = zzav((String)paramMap.get("errors"));
    zzGu = paramInt;
  }
  
  private static boolean parseBoolean(String paramString)
  {
    return (paramString != null) && ((paramString.equals("1")) || (paramString.equals("true")));
  }
  
  private List zzav(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return Arrays.asList(paramString.split(","));
  }
  
  public int getErrorCode()
  {
    return zzGu;
  }
  
  public String getRequestId()
  {
    return zzEY;
  }
  
  public String getType()
  {
    return zzJN;
  }
  
  public String getUrl()
  {
    return zzF;
  }
  
  public void setUrl(String paramString)
  {
    zzF = paramString;
  }
  
  public List zzgE()
  {
    return zzJI;
  }
  
  public String zzgF()
  {
    return zzJM;
  }
  
  public boolean zzgG()
  {
    return zzJO;
  }
  
  public boolean zzgH()
  {
    return zzJP;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */