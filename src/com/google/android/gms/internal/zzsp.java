package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class zzsp
{
  public final int tag;
  protected final int type;
  protected final Class zzbuk;
  protected final boolean zzbul;
  
  private zzsp(int paramInt1, Class paramClass, int paramInt2, boolean paramBoolean)
  {
    type = paramInt1;
    zzbuk = paramClass;
    tag = paramInt2;
    zzbul = paramBoolean;
  }
  
  private Object zzK(List paramList)
  {
    int j = 0;
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramList.size())
    {
      localObject = (zzsw)paramList.get(i);
      if (zzbuv.length != 0) {
        zza((zzsw)localObject, localArrayList);
      }
      i += 1;
    }
    int k = localArrayList.size();
    if (k == 0)
    {
      paramList = null;
      return paramList;
    }
    Object localObject = zzbuk.cast(Array.newInstance(zzbuk.getComponentType(), k));
    i = j;
    for (;;)
    {
      paramList = (List)localObject;
      if (i >= k) {
        break;
      }
      Array.set(localObject, i, localArrayList.get(i));
      i += 1;
    }
  }
  
  private Object zzL(List paramList)
  {
    if (paramList.isEmpty()) {
      return null;
    }
    paramList = (zzsw)paramList.get(paramList.size() - 1);
    return zzbuk.cast(zzP(zzsm.zzD(zzbuv)));
  }
  
  public static zzsp zza(int paramInt, Class paramClass, long paramLong)
  {
    return new zzsp(paramInt, paramClass, (int)paramLong, false);
  }
  
  final Object zzJ(List paramList)
  {
    if (paramList == null) {
      return null;
    }
    if (zzbul) {
      return zzK(paramList);
    }
    return zzL(paramList);
  }
  
  protected Object zzP(zzsm paramzzsm)
  {
    Class localClass;
    if (zzbul) {
      localClass = zzbuk.getComponentType();
    }
    for (;;)
    {
      try
      {
        switch (type)
        {
        case 10: 
          throw new IllegalArgumentException("Unknown type " + type);
        }
      }
      catch (InstantiationException paramzzsm)
      {
        throw new IllegalArgumentException("Error creating instance of class " + localClass, paramzzsm);
        localClass = zzbuk;
        continue;
        zzsu localzzsu = (zzsu)localClass.newInstance();
        paramzzsm.zza(localzzsu, zzsx.zzmJ(tag));
        return localzzsu;
        localzzsu = (zzsu)localClass.newInstance();
        paramzzsm.zza(localzzsu);
        return localzzsu;
      }
      catch (IllegalAccessException paramzzsm)
      {
        throw new IllegalArgumentException("Error creating instance of class " + localClass, paramzzsm);
      }
      catch (IOException paramzzsm)
      {
        throw new IllegalArgumentException("Error reading extension field", paramzzsm);
      }
    }
  }
  
  int zzY(Object paramObject)
  {
    if (zzbul) {
      return zzZ(paramObject);
    }
    return zzaa(paramObject);
  }
  
  protected int zzZ(Object paramObject)
  {
    int j = 0;
    int m = Array.getLength(paramObject);
    int i = 0;
    while (i < m)
    {
      int k = j;
      if (Array.get(paramObject, i) != null) {
        k = j + zzaa(Array.get(paramObject, i));
      }
      i += 1;
      j = k;
    }
    return j;
  }
  
  protected void zza(zzsw paramzzsw, List paramList)
  {
    paramList.add(zzP(zzsm.zzD(zzbuv)));
  }
  
  void zza(Object paramObject, zzsn paramzzsn)
  {
    if (zzbul)
    {
      zzc(paramObject, paramzzsn);
      return;
    }
    zzb(paramObject, paramzzsn);
  }
  
  protected int zzaa(Object paramObject)
  {
    int i = zzsx.zzmJ(tag);
    switch (type)
    {
    default: 
      throw new IllegalArgumentException("Unknown type " + type);
    case 10: 
      return zzsn.zzb(i, (zzsu)paramObject);
    }
    return zzsn.zzc(i, (zzsu)paramObject);
  }
  
  protected void zzb(Object paramObject, zzsn paramzzsn)
  {
    for (;;)
    {
      try
      {
        paramzzsn.zzmB(tag);
        switch (type)
        {
        case 10: 
          throw new IllegalArgumentException("Unknown type " + type);
        }
      }
      catch (IOException paramObject)
      {
        throw new IllegalStateException((Throwable)paramObject);
      }
      paramObject = (zzsu)paramObject;
      int i = zzsx.zzmJ(tag);
      paramzzsn.zzb((zzsu)paramObject);
      paramzzsn.zzE(i, 4);
      return;
      paramzzsn.zzc((zzsu)paramObject);
      return;
    }
  }
  
  protected void zzc(Object paramObject, zzsn paramzzsn)
  {
    int j = Array.getLength(paramObject);
    int i = 0;
    while (i < j)
    {
      Object localObject = Array.get(paramObject, i);
      if (localObject != null) {
        zzb(localObject, paramzzsn);
      }
      i += 1;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */