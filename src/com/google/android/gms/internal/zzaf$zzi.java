package com.google.android.gms.internal;

public final class zzaf$zzi
  extends zzso
{
  private static volatile zzi[] zzjq;
  public String name;
  public zzag.zza zzjr;
  public zzaf.zzd zzjs;
  
  public zzaf$zzi()
  {
    zzO();
  }
  
  public static zzi[] zzN()
  {
    if (zzjq == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzjq == null) {
        zzjq = new zzi[0];
      }
      return zzjq;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzi)) {
        return false;
      }
      paramObject = (zzi)paramObject;
      if (name == null)
      {
        if (name != null) {
          return false;
        }
      }
      else if (!name.equals(name)) {
        return false;
      }
      if (zzjr == null)
      {
        if (zzjr != null) {
          return false;
        }
      }
      else if (!zzjr.equals(zzjr)) {
        return false;
      }
      if (zzjs == null)
      {
        if (zzjs != null) {
          return false;
        }
      }
      else if (!zzjs.equals(zzjs)) {
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
    int n = 0;
    int i1 = getClass().getName().hashCode();
    int i;
    int j;
    label33:
    int k;
    if (name == null)
    {
      i = 0;
      if (zzjr != null) {
        break label106;
      }
      j = 0;
      if (zzjs != null) {
        break label117;
      }
      k = 0;
      label42:
      m = n;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label128;
        }
      }
    }
    label106:
    label117:
    label128:
    for (int m = n;; m = zzbuj.hashCode())
    {
      return (k + (j + (i + (i1 + 527) * 31) * 31) * 31) * 31 + m;
      i = name.hashCode();
      break;
      j = zzjr.hashCode();
      break label33;
      k = zzjs.hashCode();
      break label42;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (!name.equals("")) {
      paramzzsn.zzn(1, name);
    }
    if (zzjr != null) {
      paramzzsn.zza(2, zzjr);
    }
    if (zzjs != null) {
      paramzzsn.zza(3, zzjs);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzi zzO()
  {
    name = "";
    zzjr = null;
    zzjs = null;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzi zzi(zzsm paramzzsm)
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
      case 10: 
        name = paramzzsm.readString();
        break;
      case 18: 
        if (zzjr == null) {
          zzjr = new zzag.zza();
        }
        paramzzsm.zza(zzjr);
        break;
      case 26: 
        if (zzjs == null) {
          zzjs = new zzaf.zzd();
        }
        paramzzsm.zza(zzjs);
      }
    }
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (!name.equals("")) {
      i = j + zzsn.zzo(1, name);
    }
    j = i;
    if (zzjr != null) {
      j = i + zzsn.zzc(2, zzjr);
    }
    i = j;
    if (zzjs != null) {
      i = j + zzsn.zzc(3, zzjs);
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaf.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */