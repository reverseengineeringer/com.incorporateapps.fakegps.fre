package com.google.android.gms.internal;

public final class zzaf$zze
  extends zzso
{
  private static volatile zze[] zziF;
  public int key;
  public int value;
  
  public zzaf$zze()
  {
    zzI();
  }
  
  public static zze[] zzH()
  {
    if (zziF == null) {}
    synchronized (zzss.zzbut)
    {
      if (zziF == null) {
        zziF = new zze[0];
      }
      return zziF;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zze)) {
        return false;
      }
      paramObject = (zze)paramObject;
      if (key != key) {
        return false;
      }
      if (value != value) {
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
    int k = key;
    int m = value;
    if ((zzbuj == null) || (zzbuj.isEmpty())) {}
    for (int i = 0;; i = zzbuj.hashCode()) {
      return i + (((j + 527) * 31 + k) * 31 + m) * 31;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    paramzzsn.zzA(1, key);
    paramzzsn.zzA(2, value);
    super.writeTo(paramzzsn);
  }
  
  public final zze zzI()
  {
    key = 0;
    value = 0;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zze zze(zzsm paramzzsm)
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
        key = paramzzsm.zzJb();
        break;
      case 16: 
        value = paramzzsm.zzJb();
      }
    }
  }
  
  protected final int zzz()
  {
    return super.zzz() + zzsn.zzC(1, key) + zzsn.zzC(2, value);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaf.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */