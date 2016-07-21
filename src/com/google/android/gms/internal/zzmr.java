package com.google.android.gms.internal;

import android.support.v4.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzmr
{
  public static Set zzA(Object paramObject)
  {
    return Collections.singleton(paramObject);
  }
  
  public static Map zza(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5, Object paramObject6, Object paramObject7, Object paramObject8, Object paramObject9, Object paramObject10, Object paramObject11, Object paramObject12)
  {
    ArrayMap localArrayMap = new ArrayMap(6);
    localArrayMap.put(paramObject1, paramObject2);
    localArrayMap.put(paramObject3, paramObject4);
    localArrayMap.put(paramObject5, paramObject6);
    localArrayMap.put(paramObject7, paramObject8);
    localArrayMap.put(paramObject9, paramObject10);
    localArrayMap.put(paramObject11, paramObject12);
    return Collections.unmodifiableMap(localArrayMap);
  }
  
  public static Set zza(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    zzmm localzzmm = new zzmm(3);
    localzzmm.add(paramObject1);
    localzzmm.add(paramObject2);
    localzzmm.add(paramObject3);
    return Collections.unmodifiableSet(localzzmm);
  }
  
  public static Set zza(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    zzmm localzzmm = new zzmm(4);
    localzzmm.add(paramObject1);
    localzzmm.add(paramObject2);
    localzzmm.add(paramObject3);
    localzzmm.add(paramObject4);
    return Collections.unmodifiableSet(localzzmm);
  }
  
  public static List zzc(Object paramObject1, Object paramObject2)
  {
    ArrayList localArrayList = new ArrayList(2);
    localArrayList.add(paramObject1);
    localArrayList.add(paramObject2);
    return Collections.unmodifiableList(localArrayList);
  }
  
  public static Set zzc(Object... paramVarArgs)
  {
    switch (paramVarArgs.length)
    {
    default: 
      if (paramVarArgs.length > 32) {
        break;
      }
    }
    for (paramVarArgs = new zzmm(Arrays.asList(paramVarArgs));; paramVarArgs = new HashSet(Arrays.asList(paramVarArgs)))
    {
      return Collections.unmodifiableSet(paramVarArgs);
      return zzsb();
      return zzA(paramVarArgs[0]);
      return zzd(paramVarArgs[0], paramVarArgs[1]);
      return zza(paramVarArgs[0], paramVarArgs[1], paramVarArgs[2]);
      return zza(paramVarArgs[0], paramVarArgs[1], paramVarArgs[2], paramVarArgs[3]);
    }
  }
  
  public static Set zzd(Object paramObject1, Object paramObject2)
  {
    zzmm localzzmm = new zzmm(2);
    localzzmm.add(paramObject1);
    localzzmm.add(paramObject2);
    return Collections.unmodifiableSet(localzzmm);
  }
  
  public static Set zzsb()
  {
    return Collections.emptySet();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzmr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */