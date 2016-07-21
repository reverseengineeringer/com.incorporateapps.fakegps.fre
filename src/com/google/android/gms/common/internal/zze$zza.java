package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class zze$zza
  extends zze
{
  List zzala;
  
  zze$zza(List paramList)
  {
    zzala = paramList;
  }
  
  public zze zza(zze paramzze)
  {
    ArrayList localArrayList = new ArrayList(zzala);
    localArrayList.add(zzx.zzz(paramzze));
    return new zza(localArrayList);
  }
  
  public boolean zzd(char paramChar)
  {
    Iterator localIterator = zzala.iterator();
    while (localIterator.hasNext()) {
      if (((zze)localIterator.next()).zzd(paramChar)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zze.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */