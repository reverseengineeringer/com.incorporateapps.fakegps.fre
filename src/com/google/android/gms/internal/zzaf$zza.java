package com.google.android.gms.internal;

public final class zzaf$zza
  extends zzso
{
  public int level;
  public int zziq;
  public int zzir;
  
  public zzaf$zza()
  {
    zzB();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zza)) {
        return false;
      }
      paramObject = (zza)paramObject;
      if (level != level) {
        return false;
      }
      if (zziq != zziq) {
        return false;
      }
      if (zzir != zzir) {
        return false;
      }
      if ((zzbuj != null) && (!zzbuj.isEmpty())) {
        break;
      }
    } while ((zzbuj == null) || (zzbuj.isEmpty()));
    return false;
    return zzbuj.equals(zzbuj);
  }
  
  public final int hashCode()
  {
    int j = getClass().getName().hashCode();
    int k = level;
    int m = zziq;
    int n = zzir;
    if ((zzbuj == null) || (zzbuj.isEmpty())) {}
    for (int i = 0;; i = zzbuj.hashCode()) {
      return i + ((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (level != 1) {
      paramzzsn.zzA(1, level);
    }
    if (zziq != 0) {
      paramzzsn.zzA(2, zziq);
    }
    if (zzir != 0) {
      paramzzsn.zzA(3, zzir);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zza zzB()
  {
    level = 1;
    zziq = 0;
    zzir = 0;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zza zza(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      switch (i)
      {
      default: 
        if (zza(paramzzsm, i)) {}
        break;
      case 0: 
        return this;
      case 8: 
        i = paramzzsm.zzJb();
        switch (i)
        {
        default: 
          break;
        case 1: 
        case 2: 
        case 3: 
          level = i;
        }
        break;
      case 16: 
        zziq = paramzzsm.zzJb();
        break;
      case 24: 
        zzir = paramzzsm.zzJb();
      }
    }
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (level != 1) {
      i = j + zzsn.zzC(1, level);
    }
    j = i;
    if (zziq != 0) {
      j = i + zzsn.zzC(2, zziq);
    }
    i = j;
    if (zzir != 0) {
      i = j + zzsn.zzC(3, zzir);
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaf.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */