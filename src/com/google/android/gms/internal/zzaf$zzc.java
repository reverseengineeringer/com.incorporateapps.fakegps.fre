package com.google.android.gms.internal;

public final class zzaf$zzc
  extends zzso
{
  private static volatile zzc[] zzix;
  public String key;
  public boolean zziA;
  public long zziB;
  public long zziy;
  public long zziz;
  
  public zzaf$zzc()
  {
    zzF();
  }
  
  public static zzc[] zzE()
  {
    if (zzix == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzix == null) {
        zzix = new zzc[0];
      }
      return zzix;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzc)) {
        return false;
      }
      paramObject = (zzc)paramObject;
      if (key == null)
      {
        if (key != null) {
          return false;
        }
      }
      else if (!key.equals(key)) {
        return false;
      }
      if (zziy != zziy) {
        return false;
      }
      if (zziz != zziz) {
        return false;
      }
      if (zziA != zziA) {
        return false;
      }
      if (zziB != zziB) {
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
    int m = 0;
    int n = getClass().getName().hashCode();
    int i;
    int i1;
    int i2;
    int j;
    label65:
    int i3;
    if (key == null)
    {
      i = 0;
      i1 = (int)(zziy ^ zziy >>> 32);
      i2 = (int)(zziz ^ zziz >>> 32);
      if (!zziA) {
        break label154;
      }
      j = 1231;
      i3 = (int)(zziB ^ zziB >>> 32);
      k = m;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label161;
        }
      }
    }
    label154:
    label161:
    for (int k = m;; k = zzbuj.hashCode())
    {
      return ((j + (((i + (n + 527) * 31) * 31 + i1) * 31 + i2) * 31) * 31 + i3) * 31 + k;
      i = key.hashCode();
      break;
      j = 1237;
      break label65;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (!key.equals("")) {
      paramzzsn.zzn(1, key);
    }
    if (zziy != 0L) {
      paramzzsn.zzb(2, zziy);
    }
    if (zziz != 2147483647L) {
      paramzzsn.zzb(3, zziz);
    }
    if (zziA) {
      paramzzsn.zze(4, zziA);
    }
    if (zziB != 0L) {
      paramzzsn.zzb(5, zziB);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzc zzF()
  {
    key = "";
    zziy = 0L;
    zziz = 2147483647L;
    zziA = false;
    zziB = 0L;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzc zzc(zzsm paramzzsm)
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
        key = paramzzsm.readString();
        break;
      case 16: 
        zziy = paramzzsm.zzJa();
        break;
      case 24: 
        zziz = paramzzsm.zzJa();
        break;
      case 32: 
        zziA = paramzzsm.zzJc();
        break;
      case 40: 
        zziB = paramzzsm.zzJa();
      }
    }
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (!key.equals("")) {
      i = j + zzsn.zzo(1, key);
    }
    j = i;
    if (zziy != 0L) {
      j = i + zzsn.zzd(2, zziy);
    }
    i = j;
    if (zziz != 2147483647L) {
      i = j + zzsn.zzd(3, zziz);
    }
    j = i;
    if (zziA) {
      j = i + zzsn.zzf(4, zziA);
    }
    i = j;
    if (zziB != 0L) {
      i = j + zzsn.zzd(5, zziB);
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaf.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */