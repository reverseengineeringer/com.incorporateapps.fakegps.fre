package com.google.android.gms.internal;

public final class zzaf$zzh
  extends zzso
{
  public static final zzsp zzjh = zzsp.zza(11, zzh.class, 810L);
  private static final zzh[] zzji = new zzh[0];
  public int[] zzjj;
  public int[] zzjk;
  public int[] zzjl;
  public int zzjm;
  public int[] zzjn;
  public int zzjo;
  public int zzjp;
  
  public zzaf$zzh()
  {
    zzM();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzh)) {
        return false;
      }
      paramObject = (zzh)paramObject;
      if (!zzss.equals(zzjj, zzjj)) {
        return false;
      }
      if (!zzss.equals(zzjk, zzjk)) {
        return false;
      }
      if (!zzss.equals(zzjl, zzjl)) {
        return false;
      }
      if (zzjm != zzjm) {
        return false;
      }
      if (!zzss.equals(zzjn, zzjn)) {
        return false;
      }
      if (zzjo != zzjo) {
        return false;
      }
      if (zzjp != zzjp) {
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
    int k = zzss.hashCode(zzjj);
    int m = zzss.hashCode(zzjk);
    int n = zzss.hashCode(zzjl);
    int i1 = zzjm;
    int i2 = zzss.hashCode(zzjn);
    int i3 = zzjo;
    int i4 = zzjp;
    if ((zzbuj == null) || (zzbuj.isEmpty())) {}
    for (int i = 0;; i = zzbuj.hashCode()) {
      return i + ((((((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    int j = 0;
    int i;
    if ((zzjj != null) && (zzjj.length > 0))
    {
      i = 0;
      while (i < zzjj.length)
      {
        paramzzsn.zzA(1, zzjj[i]);
        i += 1;
      }
    }
    if ((zzjk != null) && (zzjk.length > 0))
    {
      i = 0;
      while (i < zzjk.length)
      {
        paramzzsn.zzA(2, zzjk[i]);
        i += 1;
      }
    }
    if ((zzjl != null) && (zzjl.length > 0))
    {
      i = 0;
      while (i < zzjl.length)
      {
        paramzzsn.zzA(3, zzjl[i]);
        i += 1;
      }
    }
    if (zzjm != 0) {
      paramzzsn.zzA(4, zzjm);
    }
    if ((zzjn != null) && (zzjn.length > 0))
    {
      i = j;
      while (i < zzjn.length)
      {
        paramzzsn.zzA(5, zzjn[i]);
        i += 1;
      }
    }
    if (zzjo != 0) {
      paramzzsn.zzA(6, zzjo);
    }
    if (zzjp != 0) {
      paramzzsn.zzA(7, zzjp);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzh zzM()
  {
    zzjj = zzsx.zzbuw;
    zzjk = zzsx.zzbuw;
    zzjl = zzsx.zzbuw;
    zzjm = 0;
    zzjn = zzsx.zzbuw;
    zzjo = 0;
    zzjp = 0;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzh zzh(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      int[] arrayOfInt;
      int k;
      switch (i)
      {
      default: 
        if (zza(paramzzsm, i)) {}
        break;
      case 0: 
        return this;
      case 8: 
        j = zzsx.zzc(paramzzsm, 8);
        if (zzjj == null) {}
        for (i = 0;; i = zzjj.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjj, 0, arrayOfInt, 0, i);
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
        zzjj = arrayOfInt;
        break;
      case 10: 
        k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzjj == null) {}
        for (i = 0;; i = zzjj.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjj, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzjj = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 16: 
        j = zzsx.zzc(paramzzsm, 16);
        if (zzjk == null) {}
        for (i = 0;; i = zzjk.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjk, 0, arrayOfInt, 0, i);
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
        zzjk = arrayOfInt;
        break;
      case 18: 
        k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzjk == null) {}
        for (i = 0;; i = zzjk.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjk, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzjk = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 24: 
        j = zzsx.zzc(paramzzsm, 24);
        if (zzjl == null) {}
        for (i = 0;; i = zzjl.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjl, 0, arrayOfInt, 0, i);
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
        zzjl = arrayOfInt;
        break;
      case 26: 
        k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzjl == null) {}
        for (i = 0;; i = zzjl.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjl, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzjl = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 32: 
        zzjm = paramzzsm.zzJb();
        break;
      case 40: 
        j = zzsx.zzc(paramzzsm, 40);
        if (zzjn == null) {}
        for (i = 0;; i = zzjn.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjn, 0, arrayOfInt, 0, i);
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
        zzjn = arrayOfInt;
        break;
      case 42: 
        k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzjn == null) {}
        for (i = 0;; i = zzjn.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjn, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzjn = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 48: 
        zzjo = paramzzsm.zzJb();
        break;
      case 56: 
        zzjp = paramzzsm.zzJb();
      }
    }
  }
  
  protected final int zzz()
  {
    int m = 0;
    int k = super.zzz();
    int i;
    if ((zzjj != null) && (zzjj.length > 0))
    {
      i = 0;
      j = 0;
      while (i < zzjj.length)
      {
        j += zzsn.zzmx(zzjj[i]);
        i += 1;
      }
    }
    for (int j = k + j + zzjj.length * 1;; j = k)
    {
      i = j;
      if (zzjk != null)
      {
        i = j;
        if (zzjk.length > 0)
        {
          i = 0;
          k = 0;
          while (i < zzjk.length)
          {
            k += zzsn.zzmx(zzjk[i]);
            i += 1;
          }
          i = j + k + zzjk.length * 1;
        }
      }
      j = i;
      if (zzjl != null)
      {
        j = i;
        if (zzjl.length > 0)
        {
          j = 0;
          k = 0;
          while (j < zzjl.length)
          {
            k += zzsn.zzmx(zzjl[j]);
            j += 1;
          }
          j = i + k + zzjl.length * 1;
        }
      }
      i = j;
      if (zzjm != 0) {
        i = j + zzsn.zzC(4, zzjm);
      }
      j = i;
      if (zzjn != null)
      {
        j = i;
        if (zzjn.length > 0)
        {
          k = 0;
          j = m;
          while (j < zzjn.length)
          {
            k += zzsn.zzmx(zzjn[j]);
            j += 1;
          }
          j = i + k + zzjn.length * 1;
        }
      }
      i = j;
      if (zzjo != 0) {
        i = j + zzsn.zzC(6, zzjo);
      }
      j = i;
      if (zzjp != 0) {
        j = i + zzsn.zzC(7, zzjp);
      }
      return j;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaf.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */