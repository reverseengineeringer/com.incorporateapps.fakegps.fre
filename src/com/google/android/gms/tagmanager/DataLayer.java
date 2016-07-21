package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataLayer
{
  public static final String EVENT_KEY = "event";
  public static final Object OBJECT_NOT_PRESENT = new Object();
  static final String[] zzbir = "gtm.lifetime".toString().split("\\.");
  private static final Pattern zzbis = Pattern.compile("(\\d+)\\s*([smhd]?)");
  private final ConcurrentHashMap zzbit;
  private final Map zzbiu;
  private final ReentrantLock zzbiv;
  private final LinkedList zzbiw;
  private final DataLayer.zzc zzbix;
  private final CountDownLatch zzbiy;
  
  DataLayer()
  {
    this(new DataLayer.1());
  }
  
  DataLayer(DataLayer.zzc paramzzc)
  {
    zzbix = paramzzc;
    zzbit = new ConcurrentHashMap();
    zzbiu = new HashMap();
    zzbiv = new ReentrantLock();
    zzbiw = new LinkedList();
    zzbiy = new CountDownLatch(1);
    zzGn();
  }
  
  public static List listOf(Object... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramVarArgs.length)
    {
      localArrayList.add(paramVarArgs[i]);
      i += 1;
    }
    return localArrayList;
  }
  
  public static Map mapOf(Object... paramVarArgs)
  {
    if (paramVarArgs.length % 2 != 0) {
      throw new IllegalArgumentException("expected even number of key-value pairs");
    }
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < paramVarArgs.length)
    {
      if (!(paramVarArgs[i] instanceof String)) {
        throw new IllegalArgumentException("key is not a string: " + paramVarArgs[i]);
      }
      localHashMap.put((String)paramVarArgs[i], paramVarArgs[(i + 1)]);
      i += 2;
    }
    return localHashMap;
  }
  
  private void zzGn()
  {
    zzbix.zza(new DataLayer.2(this));
  }
  
  private void zzGo()
  {
    int i = 0;
    for (;;)
    {
      Map localMap = (Map)zzbiw.poll();
      if (localMap != null)
      {
        zzX(localMap);
        i += 1;
        if (i > 500)
        {
          zzbiw.clear();
          throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
        }
      }
      else
      {
        return;
      }
    }
  }
  
  private void zzS(Map paramMap)
  {
    zzbiv.lock();
    try
    {
      zzbiw.offer(paramMap);
      if (zzbiv.getHoldCount() == 1) {
        zzGo();
      }
      zzT(paramMap);
      return;
    }
    finally
    {
      zzbiv.unlock();
    }
  }
  
  private void zzT(Map paramMap)
  {
    Long localLong = zzU(paramMap);
    if (localLong == null) {
      return;
    }
    paramMap = zzW(paramMap);
    paramMap.remove("gtm.lifetime");
    zzbix.zza(paramMap, localLong.longValue());
  }
  
  private Long zzU(Map paramMap)
  {
    paramMap = zzV(paramMap);
    if (paramMap == null) {
      return null;
    }
    return zzfY(paramMap.toString());
  }
  
  private Object zzV(Map paramMap)
  {
    String[] arrayOfString = zzbir;
    int j = arrayOfString.length;
    int i = 0;
    for (;;)
    {
      Object localObject = paramMap;
      if (i < j)
      {
        localObject = arrayOfString[i];
        if (!(paramMap instanceof Map)) {
          localObject = null;
        }
      }
      else
      {
        return localObject;
      }
      paramMap = ((Map)paramMap).get(localObject);
      i += 1;
    }
  }
  
  private List zzW(Map paramMap)
  {
    ArrayList localArrayList = new ArrayList();
    zza(paramMap, "", localArrayList);
    return localArrayList;
  }
  
  private void zzX(Map paramMap)
  {
    synchronized (zzbiu)
    {
      Iterator localIterator = paramMap.keySet().iterator();
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        zzd(zzn(str, paramMap.get(str)), zzbiu);
      }
    }
    zzY(paramMap);
  }
  
  private void zzY(Map paramMap)
  {
    Iterator localIterator = zzbit.keySet().iterator();
    while (localIterator.hasNext()) {
      ((DataLayer.zzb)localIterator.next()).zzQ(paramMap);
    }
  }
  
  private void zza(Map paramMap, String paramString, Collection paramCollection)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      StringBuilder localStringBuilder = new StringBuilder().append(paramString);
      if (paramString.length() == 0) {}
      for (paramMap = "";; paramMap = ".")
      {
        paramMap = paramMap + (String)localEntry.getKey();
        if (!(localEntry.getValue() instanceof Map)) {
          break label120;
        }
        zza((Map)localEntry.getValue(), paramMap, paramCollection);
        break;
      }
      label120:
      if (!paramMap.equals("gtm.lifetime")) {
        paramCollection.add(new DataLayer.zza(paramMap, localEntry.getValue()));
      }
    }
  }
  
  static Long zzfY(String paramString)
  {
    Object localObject = zzbis.matcher(paramString);
    if (!((Matcher)localObject).matches())
    {
      zzbg.zzaJ("unknown _lifetime: " + paramString);
      return null;
    }
    long l;
    try
    {
      l = Long.parseLong(((Matcher)localObject).group(1));
      if (l <= 0L)
      {
        zzbg.zzaJ("non-positive _lifetime: " + paramString);
        return null;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        zzbg.zzaK("illegal number in _lifetime value: " + paramString);
        l = 0L;
      }
      localObject = ((Matcher)localObject).group(2);
      if (((String)localObject).length() == 0) {
        return Long.valueOf(l);
      }
      switch (((String)localObject).charAt(0))
      {
      default: 
        zzbg.zzaK("unknown units in _lifetime: " + paramString);
        return null;
      }
    }
    return Long.valueOf(l * 1000L);
    return Long.valueOf(l * 1000L * 60L);
    return Long.valueOf(l * 1000L * 60L * 60L);
    return Long.valueOf(l * 1000L * 60L * 60L * 24L);
  }
  
  public Object get(String paramString)
  {
    synchronized (zzbiu)
    {
      Map localMap1 = zzbiu;
      String[] arrayOfString = paramString.split("\\.");
      int j = arrayOfString.length;
      paramString = localMap1;
      int i = 0;
      while (i < j)
      {
        localMap1 = arrayOfString[i];
        if (!(paramString instanceof Map)) {
          return null;
        }
        paramString = ((Map)paramString).get(localMap1);
        if (paramString == null) {
          return null;
        }
        i += 1;
      }
      return paramString;
    }
  }
  
  public void push(String paramString, Object paramObject)
  {
    push(zzn(paramString, paramObject));
  }
  
  public void push(Map paramMap)
  {
    try
    {
      zzbiy.await();
      zzS(paramMap);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        zzbg.zzaK("DataLayer.push: unexpected InterruptedException");
      }
    }
  }
  
  public void pushEvent(String paramString, Map paramMap)
  {
    paramMap = new HashMap(paramMap);
    paramMap.put("event", paramString);
    push(paramMap);
  }
  
  public String toString()
  {
    synchronized (zzbiu)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = zzbiu.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localStringBuilder.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[] { localEntry.getKey(), localEntry.getValue() }));
      }
    }
    String str = ((StringBuilder)localObject).toString();
    return str;
  }
  
  void zza(DataLayer.zzb paramzzb)
  {
    zzbit.put(paramzzb, Integer.valueOf(0));
  }
  
  void zzb(List paramList1, List paramList2)
  {
    while (paramList2.size() < paramList1.size()) {
      paramList2.add(null);
    }
    int i = 0;
    if (i < paramList1.size())
    {
      Object localObject = paramList1.get(i);
      if ((localObject instanceof List))
      {
        if (!(paramList2.get(i) instanceof List)) {
          paramList2.set(i, new ArrayList());
        }
        zzb((List)localObject, (List)paramList2.get(i));
      }
      for (;;)
      {
        i += 1;
        break;
        if ((localObject instanceof Map))
        {
          if (!(paramList2.get(i) instanceof Map)) {
            paramList2.set(i, new HashMap());
          }
          zzd((Map)localObject, (Map)paramList2.get(i));
        }
        else if (localObject != OBJECT_NOT_PRESENT)
        {
          paramList2.set(i, localObject);
        }
      }
    }
  }
  
  void zzd(Map paramMap1, Map paramMap2)
  {
    Iterator localIterator = paramMap1.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap1.get(str);
      if ((localObject instanceof List))
      {
        if (!(paramMap2.get(str) instanceof List)) {
          paramMap2.put(str, new ArrayList());
        }
        zzb((List)localObject, (List)paramMap2.get(str));
      }
      else if ((localObject instanceof Map))
      {
        if (!(paramMap2.get(str) instanceof Map)) {
          paramMap2.put(str, new HashMap());
        }
        zzd((Map)localObject, (Map)paramMap2.get(str));
      }
      else
      {
        paramMap2.put(str, localObject);
      }
    }
  }
  
  void zzfX(String paramString)
  {
    push(paramString, null);
    zzbix.zzfZ(paramString);
  }
  
  Map zzn(String paramString, Object paramObject)
  {
    HashMap localHashMap1 = new HashMap();
    String[] arrayOfString = paramString.toString().split("\\.");
    int i = 0;
    HashMap localHashMap2;
    for (paramString = localHashMap1; i < arrayOfString.length - 1; paramString = localHashMap2)
    {
      localHashMap2 = new HashMap();
      paramString.put(arrayOfString[i], localHashMap2);
      i += 1;
    }
    paramString.put(arrayOfString[(arrayOfString.length - 1)], paramObject);
    return localHashMap1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.DataLayer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */