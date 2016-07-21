package com.google.android.gms.internal;

public final class zzsz$zza
  extends zzso
{
  public String[] zzbuI;
  public String[] zzbuJ;
  public int[] zzbuK;
  public long[] zzbuL;
  
  public zzsz$zza()
  {
    zzJC();
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
      if (!zzss.equals(zzbuI, zzbuI)) {
        return false;
      }
      if (!zzss.equals(zzbuJ, zzbuJ)) {
        return false;
      }
      if (!zzss.equals(zzbuK, zzbuK)) {
        return false;
      }
      if (!zzss.equals(zzbuL, zzbuL)) {
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
    int k = zzss.hashCode(zzbuI);
    int m = zzss.hashCode(zzbuJ);
    int n = zzss.hashCode(zzbuK);
    int i1 = zzss.hashCode(zzbuL);
    if ((zzbuj == null) || (zzbuj.isEmpty())) {}
    for (int i = 0;; i = zzbuj.hashCode()) {
      return i + (((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    int j = 0;
    int i;
    String str;
    if ((zzbuI != null) && (zzbuI.length > 0))
    {
      i = 0;
      while (i < zzbuI.length)
      {
        str = zzbuI[i];
        if (str != null) {
          paramzzsn.zzn(1, str);
        }
        i += 1;
      }
    }
    if ((zzbuJ != null) && (zzbuJ.length > 0))
    {
      i = 0;
      while (i < zzbuJ.length)
      {
        str = zzbuJ[i];
        if (str != null) {
          paramzzsn.zzn(2, str);
        }
        i += 1;
      }
    }
    if ((zzbuK != null) && (zzbuK.length > 0))
    {
      i = 0;
      while (i < zzbuK.length)
      {
        paramzzsn.zzA(3, zzbuK[i]);
        i += 1;
      }
    }
    if ((zzbuL != null) && (zzbuL.length > 0))
    {
      i = j;
      while (i < zzbuL.length)
      {
        paramzzsn.zzb(4, zzbuL[i]);
        i += 1;
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public final zza zzJC()
  {
    zzbuI = zzsx.zzbuB;
    zzbuJ = zzsx.zzbuB;
    zzbuK = zzsx.zzbuw;
    zzbuL = zzsx.zzbux;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zza zzS(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      Object localObject;
      int k;
      switch (i)
      {
      default: 
        if (zza(paramzzsm, i)) {}
        break;
      case 0: 
        return this;
      case 10: 
        j = zzsx.zzc(paramzzsm, 10);
        if (zzbuI == null) {}
        for (i = 0;; i = zzbuI.length)
        {
          localObject = new String[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbuI, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = paramzzsm.readString();
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = paramzzsm.readString();
        zzbuI = ((String[])localObject);
        break;
      case 18: 
        j = zzsx.zzc(paramzzsm, 18);
        if (zzbuJ == null) {}
        for (i = 0;; i = zzbuJ.length)
        {
          localObject = new String[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbuJ, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = paramzzsm.readString();
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = paramzzsm.readString();
        zzbuJ = ((String[])localObject);
        break;
      case 24: 
        j = zzsx.zzc(paramzzsm, 24);
        if (zzbuK == null) {}
        for (i = 0;; i = zzbuK.length)
        {
          localObject = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbuK, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = paramzzsm.zzJb();
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = paramzzsm.zzJb();
        zzbuK = ((int[])localObject);
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
        if (zzbuK == null) {}
        for (i = 0;; i = zzbuK.length)
        {
          localObject = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbuK, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length)
          {
            localObject[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzbuK = ((int[])localObject);
        paramzzsm.zzmr(k);
        break;
      case 32: 
        j = zzsx.zzc(paramzzsm, 32);
        if (zzbuL == null) {}
        for (i = 0;; i = zzbuL.length)
        {
          localObject = new long[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbuL, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = paramzzsm.zzJa();
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = paramzzsm.zzJa();
        zzbuL = ((long[])localObject);
        break;
      case 34: 
        k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJa();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzbuL == null) {}
        for (i = 0;; i = zzbuL.length)
        {
          localObject = new long[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbuL, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length)
          {
            localObject[j] = paramzzsm.zzJa();
            j += 1;
          }
        }
        zzbuL = ((long[])localObject);
        paramzzsm.zzmr(k);
      }
    }
  }
  
  protected final int zzz()
  {
    int i2 = 0;
    int i1 = super.zzz();
    int j;
    int k;
    String str;
    int n;
    int m;
    if ((zzbuI != null) && (zzbuI.length > 0))
    {
      i = 0;
      j = 0;
      for (k = 0; i < zzbuI.length; k = m)
      {
        str = zzbuI[i];
        n = j;
        m = k;
        if (str != null)
        {
          m = k + 1;
          n = j + zzsn.zzgO(str);
        }
        i += 1;
        j = n;
      }
    }
    for (int i = i1 + j + k * 1;; i = i1)
    {
      j = i;
      if (zzbuJ != null)
      {
        j = i;
        if (zzbuJ.length > 0)
        {
          j = 0;
          k = 0;
          for (m = 0; j < zzbuJ.length; m = n)
          {
            str = zzbuJ[j];
            i1 = k;
            n = m;
            if (str != null)
            {
              n = m + 1;
              i1 = k + zzsn.zzgO(str);
            }
            j += 1;
            k = i1;
          }
          j = i + k + m * 1;
        }
      }
      i = j;
      if (zzbuK != null)
      {
        i = j;
        if (zzbuK.length > 0)
        {
          i = 0;
          k = 0;
          while (i < zzbuK.length)
          {
            k += zzsn.zzmx(zzbuK[i]);
            i += 1;
          }
          i = j + k + zzbuK.length * 1;
        }
      }
      j = i;
      if (zzbuL != null)
      {
        j = i;
        if (zzbuL.length > 0)
        {
          k = 0;
          j = i2;
          while (j < zzbuL.length)
          {
            k += zzsn.zzas(zzbuL[j]);
            j += 1;
          }
          j = i + k + zzbuL.length * 1;
        }
      }
      return j;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsz.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */