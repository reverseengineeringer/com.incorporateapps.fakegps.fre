package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class zzak
{
  private final Set zzbiU;
  private final String zzbiV;
  
  public zzak(String paramString, String... paramVarArgs)
  {
    zzbiV = paramString;
    zzbiU = new HashSet(paramVarArgs.length);
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      paramString = paramVarArgs[i];
      zzbiU.add(paramString);
      i += 1;
    }
  }
  
  public abstract boolean zzFW();
  
  public String zzGB()
  {
    return zzbiV;
  }
  
  public Set zzGC()
  {
    return zzbiU;
  }
  
  public abstract zzag.zza zzP(Map paramMap);
  
  boolean zze(Set paramSet)
  {
    return paramSet.containsAll(zzbiU);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */