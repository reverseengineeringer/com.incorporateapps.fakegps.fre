package com.google.android.gms.internal;

public final class zzaf$zzb
  extends zzso
{
  private static volatile zzb[] zzis;
  public int name;
  public int[] zzit;
  public int zziu;
  public boolean zziv;
  public boolean zziw;
  
  public zzaf$zzb()
  {
    zzD();
  }
  
  public static zzb[] zzC()
  {
    if (zzis == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzis == null) {
        zzis = new zzb[0];
      }
      return zzis;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzb)) {
        return false;
      }
      paramObject = (zzb)paramObject;
      if (!zzss.equals(zzit, zzit)) {
        return false;
      }
      if (zziu != zziu) {
        return false;
      }
      if (name != name) {
        return false;
      }
      if (zziv != zziv) {
        return false;
      }
      if (zziw != zziw) {
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
    int j = 1231;
    int m = getClass().getName().hashCode();
    int n = zzss.hashCode(zzit);
    int i1 = zziu;
    int i2 = name;
    int i;
    if (zziv)
    {
      i = 1231;
      if (!zziw) {
        break label121;
      }
      label55:
      if ((zzbuj != null) && (!zzbuj.isEmpty())) {
        break label128;
      }
    }
    label121:
    label128:
    for (int k = 0;; k = zzbuj.hashCode())
    {
      return k + ((i + ((((m + 527) * 31 + n) * 31 + i1) * 31 + i2) * 31) * 31 + j) * 31;
      i = 1237;
      break;
      j = 1237;
      break label55;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (zziw) {
      paramzzsn.zze(1, zziw);
    }
    paramzzsn.zzA(2, zziu);
    if ((zzit != null) && (zzit.length > 0))
    {
      int i = 0;
      while (i < zzit.length)
      {
        paramzzsn.zzA(3, zzit[i]);
        i += 1;
      }
    }
    if (name != 0) {
      paramzzsn.zzA(4, name);
    }
    if (zziv) {
      paramzzsn.zze(6, zziv);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzb zzD()
  {
    zzit = zzsx.zzbuw;
    zziu = 0;
    name = 0;
    zziv = false;
    zziw = false;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzb zzb(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      int[] arrayOfInt;
      switch (i)
      {
      default: 
        if (zza(paramzzsm, i)) {}
        break;
      case 0: 
        return this;
      case 8: 
        zziw = paramzzsm.zzJc();
        break;
      case 16: 
        zziu = paramzzsm.zzJb();
        break;
      case 24: 
        j = zzsx.zzc(paramzzsm, 24);
        if (zzit == null) {}
        for (i = 0;; i = zzit.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzit, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length - 1)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            paramzzsm.zzIX();
            j += 1;
          }
        }
        arrayOfInt[j] = paramzzsm.zzJb();
        zzit = arrayOfInt;
        break;
      case 26: 
        int k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzit == null) {}
        for (i = 0;; i = zzit.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzit, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzit = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 32: 
        name = paramzzsm.zzJb();
        break;
      case 48: 
        zziv = paramzzsm.zzJc();
      }
    }
  }
  
  protected final int zzz()
  {
    int j = 0;
    int k = super.zzz();
    int i = k;
    if (zziw) {
      i = k + zzsn.zzf(1, zziw);
    }
    k = zzsn.zzC(2, zziu) + i;
    if ((zzit != null) && (zzit.length > 0))
    {
      i = 0;
      while (i < zzit.length)
      {
        j += zzsn.zzmx(zzit[i]);
        i += 1;
      }
    }
    for (j = k + j + zzit.length * 1;; j = k)
    {
      i = j;
      if (name != 0) {
        i = j + zzsn.zzC(4, name);
      }
      j = i;
      if (zziv) {
        j = i + zzsn.zzf(6, zziv);
      }
      return j;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaf.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */