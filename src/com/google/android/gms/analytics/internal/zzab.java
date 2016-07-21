package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzab
{
  private final List zzSJ;
  private final long zzSK;
  private final long zzSL;
  private final int zzSM;
  private final boolean zzSN;
  private final String zzSO;
  private final Map zzxA;
  
  public zzab(zzc paramzzc, Map paramMap, long paramLong, boolean paramBoolean)
  {
    this(paramzzc, paramMap, paramLong, paramBoolean, 0L, 0, null);
  }
  
  public zzab(zzc paramzzc, Map paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt)
  {
    this(paramzzc, paramMap, paramLong1, paramBoolean, paramLong2, paramInt, null);
  }
  
  public zzab(zzc paramzzc, Map paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt, List paramList)
  {
    zzx.zzz(paramzzc);
    zzx.zzz(paramMap);
    zzSL = paramLong1;
    zzSN = paramBoolean;
    zzSK = paramLong2;
    zzSM = paramInt;
    if (paramList != null) {}
    Object localObject2;
    for (Object localObject1 = paramList;; localObject1 = Collections.EMPTY_LIST)
    {
      zzSJ = ((List)localObject1);
      zzSO = zzp(paramList);
      paramList = new HashMap();
      localObject1 = paramMap.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        if (zzk(((Map.Entry)localObject2).getKey()))
        {
          String str = zza(paramzzc, ((Map.Entry)localObject2).getKey());
          if (str != null) {
            paramList.put(str, zzb(paramzzc, ((Map.Entry)localObject2).getValue()));
          }
        }
      }
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      localObject1 = (Map.Entry)paramMap.next();
      if (!zzk(((Map.Entry)localObject1).getKey()))
      {
        localObject2 = zza(paramzzc, ((Map.Entry)localObject1).getKey());
        if (localObject2 != null) {
          paramList.put(localObject2, zzb(paramzzc, ((Map.Entry)localObject1).getValue()));
        }
      }
    }
    if (!TextUtils.isEmpty(zzSO))
    {
      zzam.zzc(paramList, "_v", zzSO);
      if ((zzSO.equals("ma4.0.0")) || (zzSO.equals("ma4.0.1"))) {
        paramList.remove("adid");
      }
    }
    zzxA = Collections.unmodifiableMap(paramList);
  }
  
  public static zzab zza(zzc paramzzc, zzab paramzzab, Map paramMap)
  {
    return new zzab(paramzzc, paramMap, paramzzab.zzlr(), paramzzab.zzlt(), paramzzab.zzlq(), paramzzab.zzlp(), paramzzab.zzls());
  }
  
  private static String zza(zzc paramzzc, Object paramObject)
  {
    if (paramObject == null) {
      paramzzc = null;
    }
    Object localObject;
    do
    {
      return paramzzc;
      localObject = paramObject.toString();
      paramObject = localObject;
      if (((String)localObject).startsWith("&")) {
        paramObject = ((String)localObject).substring(1);
      }
      int i = ((String)paramObject).length();
      localObject = paramObject;
      if (i > 256)
      {
        localObject = ((String)paramObject).substring(0, 256);
        paramzzc.zzc("Hit param name is too long and will be trimmed", Integer.valueOf(i), localObject);
      }
      paramzzc = (zzc)localObject;
    } while (!TextUtils.isEmpty((CharSequence)localObject));
    return null;
  }
  
  private static String zzb(zzc paramzzc, Object paramObject)
  {
    if (paramObject == null) {}
    for (paramObject = "";; paramObject = paramObject.toString())
    {
      int i = ((String)paramObject).length();
      Object localObject = paramObject;
      if (i > 8192)
      {
        localObject = ((String)paramObject).substring(0, 8192);
        paramzzc.zzc("Hit param value is too long and will be trimmed", Integer.valueOf(i), localObject);
      }
      return (String)localObject;
    }
  }
  
  private static boolean zzk(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    return paramObject.toString().startsWith("&");
  }
  
  private String zzm(String paramString1, String paramString2)
  {
    zzx.zzcM(paramString1);
    if (!paramString1.startsWith("&")) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Short param name required");
      paramString1 = (String)zzxA.get(paramString1);
      if (paramString1 == null) {
        break;
      }
      return paramString1;
    }
    return paramString2;
  }
  
  private static String zzp(List paramList)
  {
    Command localCommand;
    if (paramList != null)
    {
      paramList = paramList.iterator();
      do
      {
        if (!paramList.hasNext()) {
          break;
        }
        localCommand = (Command)paramList.next();
      } while (!"appendVersion".equals(localCommand.getId()));
    }
    for (paramList = localCommand.getValue();; paramList = null)
    {
      if (TextUtils.isEmpty(paramList)) {
        return null;
      }
      return paramList;
    }
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("ht=").append(zzSL);
    if (zzSK != 0L) {
      localStringBuffer.append(", dbId=").append(zzSK);
    }
    if (zzSM != 0L) {
      localStringBuffer.append(", appUID=").append(zzSM);
    }
    Object localObject = new ArrayList(zzxA.keySet());
    Collections.sort((List)localObject);
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      localStringBuffer.append(", ");
      localStringBuffer.append(str);
      localStringBuffer.append("=");
      localStringBuffer.append((String)zzxA.get(str));
    }
    return localStringBuffer.toString();
  }
  
  public int zzlp()
  {
    return zzSM;
  }
  
  public long zzlq()
  {
    return zzSK;
  }
  
  public long zzlr()
  {
    return zzSL;
  }
  
  public List zzls()
  {
    return zzSJ;
  }
  
  public boolean zzlt()
  {
    return zzSN;
  }
  
  public long zzlu()
  {
    return zzam.zzbt(zzm("_s", "0"));
  }
  
  public String zzlv()
  {
    return zzm("_m", "");
  }
  
  public Map zzn()
  {
    return zzxA;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.internal.zzab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */