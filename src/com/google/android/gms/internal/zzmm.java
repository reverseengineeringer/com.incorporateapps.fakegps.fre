package com.google.android.gms.internal;

import android.support.v4.util.ArrayMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class zzmm
  extends AbstractSet
{
  private final ArrayMap zzanZ;
  
  public zzmm()
  {
    zzanZ = new ArrayMap();
  }
  
  public zzmm(int paramInt)
  {
    zzanZ = new ArrayMap(paramInt);
  }
  
  public zzmm(Collection paramCollection)
  {
    this(paramCollection.size());
    addAll(paramCollection);
  }
  
  public boolean add(Object paramObject)
  {
    if (zzanZ.containsKey(paramObject)) {
      return false;
    }
    zzanZ.put(paramObject, paramObject);
    return true;
  }
  
  public boolean addAll(Collection paramCollection)
  {
    if ((paramCollection instanceof zzmm)) {
      return zza((zzmm)paramCollection);
    }
    return super.addAll(paramCollection);
  }
  
  public void clear()
  {
    zzanZ.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    return zzanZ.containsKey(paramObject);
  }
  
  public Iterator iterator()
  {
    return zzanZ.keySet().iterator();
  }
  
  public boolean remove(Object paramObject)
  {
    if (!zzanZ.containsKey(paramObject)) {
      return false;
    }
    zzanZ.remove(paramObject);
    return true;
  }
  
  public int size()
  {
    return zzanZ.size();
  }
  
  public boolean zza(zzmm paramzzmm)
  {
    int i = size();
    zzanZ.putAll(zzanZ);
    return size() > i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzmm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */