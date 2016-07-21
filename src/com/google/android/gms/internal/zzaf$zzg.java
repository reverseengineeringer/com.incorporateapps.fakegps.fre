package com.google.android.gms.internal;

public final class zzaf$zzg
  extends zzso
{
  private static volatile zzg[] zziW;
  public int[] zziX;
  public int[] zziY;
  public int[] zziZ;
  public int[] zzja;
  public int[] zzjb;
  public int[] zzjc;
  public int[] zzjd;
  public int[] zzje;
  public int[] zzjf;
  public int[] zzjg;
  
  public zzaf$zzg()
  {
    zzL();
  }
  
  public static zzg[] zzK()
  {
    if (zziW == null) {}
    synchronized (zzss.zzbut)
    {
      if (zziW == null) {
        zziW = new zzg[0];
      }
      return zziW;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzg)) {
        return false;
      }
      paramObject = (zzg)paramObject;
      if (!zzss.equals(zziX, zziX)) {
        return false;
      }
      if (!zzss.equals(zziY, zziY)) {
        return false;
      }
      if (!zzss.equals(zziZ, zziZ)) {
        return false;
      }
      if (!zzss.equals(zzja, zzja)) {
        return false;
      }
      if (!zzss.equals(zzjb, zzjb)) {
        return false;
      }
      if (!zzss.equals(zzjc, zzjc)) {
        return false;
      }
      if (!zzss.equals(zzjd, zzjd)) {
        return false;
      }
      if (!zzss.equals(zzje, zzje)) {
        return false;
      }
      if (!zzss.equals(zzjf, zzjf)) {
        return false;
      }
      if (!zzss.equals(zzjg, zzjg)) {
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
    int k = zzss.hashCode(zziX);
    int m = zzss.hashCode(zziY);
    int n = zzss.hashCode(zziZ);
    int i1 = zzss.hashCode(zzja);
    int i2 = zzss.hashCode(zzjb);
    int i3 = zzss.hashCode(zzjc);
    int i4 = zzss.hashCode(zzjd);
    int i5 = zzss.hashCode(zzje);
    int i6 = zzss.hashCode(zzjf);
    int i7 = zzss.hashCode(zzjg);
    if ((zzbuj == null) || (zzbuj.isEmpty())) {}
    for (int i = 0;; i = zzbuj.hashCode()) {
      return i + (((((((((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    int j = 0;
    int i;
    if ((zziX != null) && (zziX.length > 0))
    {
      i = 0;
      while (i < zziX.length)
      {
        paramzzsn.zzA(1, zziX[i]);
        i += 1;
      }
    }
    if ((zziY != null) && (zziY.length > 0))
    {
      i = 0;
      while (i < zziY.length)
      {
        paramzzsn.zzA(2, zziY[i]);
        i += 1;
      }
    }
    if ((zziZ != null) && (zziZ.length > 0))
    {
      i = 0;
      while (i < zziZ.length)
      {
        paramzzsn.zzA(3, zziZ[i]);
        i += 1;
      }
    }
    if ((zzja != null) && (zzja.length > 0))
    {
      i = 0;
      while (i < zzja.length)
      {
        paramzzsn.zzA(4, zzja[i]);
        i += 1;
      }
    }
    if ((zzjb != null) && (zzjb.length > 0))
    {
      i = 0;
      while (i < zzjb.length)
      {
        paramzzsn.zzA(5, zzjb[i]);
        i += 1;
      }
    }
    if ((zzjc != null) && (zzjc.length > 0))
    {
      i = 0;
      while (i < zzjc.length)
      {
        paramzzsn.zzA(6, zzjc[i]);
        i += 1;
      }
    }
    if ((zzjd != null) && (zzjd.length > 0))
    {
      i = 0;
      while (i < zzjd.length)
      {
        paramzzsn.zzA(7, zzjd[i]);
        i += 1;
      }
    }
    if ((zzje != null) && (zzje.length > 0))
    {
      i = 0;
      while (i < zzje.length)
      {
        paramzzsn.zzA(8, zzje[i]);
        i += 1;
      }
    }
    if ((zzjf != null) && (zzjf.length > 0))
    {
      i = 0;
      while (i < zzjf.length)
      {
        paramzzsn.zzA(9, zzjf[i]);
        i += 1;
      }
    }
    if ((zzjg != null) && (zzjg.length > 0))
    {
      i = j;
      while (i < zzjg.length)
      {
        paramzzsn.zzA(10, zzjg[i]);
        i += 1;
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzg zzL()
  {
    zziX = zzsx.zzbuw;
    zziY = zzsx.zzbuw;
    zziZ = zzsx.zzbuw;
    zzja = zzsx.zzbuw;
    zzjb = zzsx.zzbuw;
    zzjc = zzsx.zzbuw;
    zzjd = zzsx.zzbuw;
    zzje = zzsx.zzbuw;
    zzjf = zzsx.zzbuw;
    zzjg = zzsx.zzbuw;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzg zzg(zzsm paramzzsm)
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
        if (zziX == null) {}
        for (i = 0;; i = zziX.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziX, 0, arrayOfInt, 0, i);
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
        zziX = arrayOfInt;
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
        if (zziX == null) {}
        for (i = 0;; i = zziX.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziX, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zziX = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 16: 
        j = zzsx.zzc(paramzzsm, 16);
        if (zziY == null) {}
        for (i = 0;; i = zziY.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziY, 0, arrayOfInt, 0, i);
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
        zziY = arrayOfInt;
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
        if (zziY == null) {}
        for (i = 0;; i = zziY.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziY, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zziY = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 24: 
        j = zzsx.zzc(paramzzsm, 24);
        if (zziZ == null) {}
        for (i = 0;; i = zziZ.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziZ, 0, arrayOfInt, 0, i);
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
        zziZ = arrayOfInt;
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
        if (zziZ == null) {}
        for (i = 0;; i = zziZ.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziZ, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zziZ = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 32: 
        j = zzsx.zzc(paramzzsm, 32);
        if (zzja == null) {}
        for (i = 0;; i = zzja.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzja, 0, arrayOfInt, 0, i);
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
        zzja = arrayOfInt;
        break;
      case 34: 
        k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzja == null) {}
        for (i = 0;; i = zzja.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzja, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzja = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 40: 
        j = zzsx.zzc(paramzzsm, 40);
        if (zzjb == null) {}
        for (i = 0;; i = zzjb.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjb, 0, arrayOfInt, 0, i);
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
        zzjb = arrayOfInt;
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
        if (zzjb == null) {}
        for (i = 0;; i = zzjb.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjb, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzjb = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 48: 
        j = zzsx.zzc(paramzzsm, 48);
        if (zzjc == null) {}
        for (i = 0;; i = zzjc.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjc, 0, arrayOfInt, 0, i);
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
        zzjc = arrayOfInt;
        break;
      case 50: 
        k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzjc == null) {}
        for (i = 0;; i = zzjc.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjc, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzjc = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 56: 
        j = zzsx.zzc(paramzzsm, 56);
        if (zzjd == null) {}
        for (i = 0;; i = zzjd.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjd, 0, arrayOfInt, 0, i);
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
        zzjd = arrayOfInt;
        break;
      case 58: 
        k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzjd == null) {}
        for (i = 0;; i = zzjd.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjd, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzjd = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 64: 
        j = zzsx.zzc(paramzzsm, 64);
        if (zzje == null) {}
        for (i = 0;; i = zzje.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzje, 0, arrayOfInt, 0, i);
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
        zzje = arrayOfInt;
        break;
      case 66: 
        k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzje == null) {}
        for (i = 0;; i = zzje.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzje, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzje = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 72: 
        j = zzsx.zzc(paramzzsm, 72);
        if (zzjf == null) {}
        for (i = 0;; i = zzjf.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjf, 0, arrayOfInt, 0, i);
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
        zzjf = arrayOfInt;
        break;
      case 74: 
        k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzjf == null) {}
        for (i = 0;; i = zzjf.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjf, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzjf = arrayOfInt;
        paramzzsm.zzmr(k);
        break;
      case 80: 
        j = zzsx.zzc(paramzzsm, 80);
        if (zzjg == null) {}
        for (i = 0;; i = zzjg.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjg, 0, arrayOfInt, 0, i);
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
        zzjg = arrayOfInt;
        break;
      case 82: 
        k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzjg == null) {}
        for (i = 0;; i = zzjg.length)
        {
          arrayOfInt = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjg, 0, arrayOfInt, 0, i);
            j = i;
          }
          while (j < arrayOfInt.length)
          {
            arrayOfInt[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzjg = arrayOfInt;
        paramzzsm.zzmr(k);
      }
    }
  }
  
  protected final int zzz()
  {
    int m = 0;
    int k = super.zzz();
    int i;
    if ((zziX != null) && (zziX.length > 0))
    {
      i = 0;
      j = 0;
      while (i < zziX.length)
      {
        j += zzsn.zzmx(zziX[i]);
        i += 1;
      }
    }
    for (int j = k + j + zziX.length * 1;; j = k)
    {
      i = j;
      if (zziY != null)
      {
        i = j;
        if (zziY.length > 0)
        {
          i = 0;
          k = 0;
          while (i < zziY.length)
          {
            k += zzsn.zzmx(zziY[i]);
            i += 1;
          }
          i = j + k + zziY.length * 1;
        }
      }
      j = i;
      if (zziZ != null)
      {
        j = i;
        if (zziZ.length > 0)
        {
          j = 0;
          k = 0;
          while (j < zziZ.length)
          {
            k += zzsn.zzmx(zziZ[j]);
            j += 1;
          }
          j = i + k + zziZ.length * 1;
        }
      }
      i = j;
      if (zzja != null)
      {
        i = j;
        if (zzja.length > 0)
        {
          i = 0;
          k = 0;
          while (i < zzja.length)
          {
            k += zzsn.zzmx(zzja[i]);
            i += 1;
          }
          i = j + k + zzja.length * 1;
        }
      }
      j = i;
      if (zzjb != null)
      {
        j = i;
        if (zzjb.length > 0)
        {
          j = 0;
          k = 0;
          while (j < zzjb.length)
          {
            k += zzsn.zzmx(zzjb[j]);
            j += 1;
          }
          j = i + k + zzjb.length * 1;
        }
      }
      i = j;
      if (zzjc != null)
      {
        i = j;
        if (zzjc.length > 0)
        {
          i = 0;
          k = 0;
          while (i < zzjc.length)
          {
            k += zzsn.zzmx(zzjc[i]);
            i += 1;
          }
          i = j + k + zzjc.length * 1;
        }
      }
      j = i;
      if (zzjd != null)
      {
        j = i;
        if (zzjd.length > 0)
        {
          j = 0;
          k = 0;
          while (j < zzjd.length)
          {
            k += zzsn.zzmx(zzjd[j]);
            j += 1;
          }
          j = i + k + zzjd.length * 1;
        }
      }
      i = j;
      if (zzje != null)
      {
        i = j;
        if (zzje.length > 0)
        {
          i = 0;
          k = 0;
          while (i < zzje.length)
          {
            k += zzsn.zzmx(zzje[i]);
            i += 1;
          }
          i = j + k + zzje.length * 1;
        }
      }
      j = i;
      if (zzjf != null)
      {
        j = i;
        if (zzjf.length > 0)
        {
          j = 0;
          k = 0;
          while (j < zzjf.length)
          {
            k += zzsn.zzmx(zzjf[j]);
            j += 1;
          }
          j = i + k + zzjf.length * 1;
        }
      }
      i = j;
      if (zzjg != null)
      {
        i = j;
        if (zzjg.length > 0)
        {
          k = 0;
          i = m;
          while (i < zzjg.length)
          {
            k += zzsn.zzmx(zzjg[i]);
            i += 1;
          }
          i = j + k + zzjg.length * 1;
        }
      }
      return i;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaf.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */