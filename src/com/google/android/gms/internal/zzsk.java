package com.google.android.gms.internal;

public final class zzsk
  extends zzso
{
  public String[] zzbtT;
  public int[] zzbtU;
  public byte[][] zzbtV;
  
  public zzsk()
  {
    zzIW();
  }
  
  public static zzsk zzB(byte[] paramArrayOfByte)
  {
    return (zzsk)zzsu.mergeFrom(new zzsk(), paramArrayOfByte);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzsk)) {
        return false;
      }
      paramObject = (zzsk)paramObject;
      if (!zzss.equals(zzbtT, zzbtT)) {
        return false;
      }
      if (!zzss.equals(zzbtU, zzbtU)) {
        return false;
      }
      if (!zzss.zza(zzbtV, zzbtV)) {
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
    int k = zzss.hashCode(zzbtT);
    int m = zzss.hashCode(zzbtU);
    int n = zzss.zza(zzbtV);
    if ((zzbuj == null) || (zzbuj.isEmpty())) {}
    for (int i = 0;; i = zzbuj.hashCode()) {
      return i + ((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    int j = 0;
    int i;
    Object localObject;
    if ((zzbtT != null) && (zzbtT.length > 0))
    {
      i = 0;
      while (i < zzbtT.length)
      {
        localObject = zzbtT[i];
        if (localObject != null) {
          paramzzsn.zzn(1, (String)localObject);
        }
        i += 1;
      }
    }
    if ((zzbtU != null) && (zzbtU.length > 0))
    {
      i = 0;
      while (i < zzbtU.length)
      {
        paramzzsn.zzA(2, zzbtU[i]);
        i += 1;
      }
    }
    if ((zzbtV != null) && (zzbtV.length > 0))
    {
      i = j;
      while (i < zzbtV.length)
      {
        localObject = zzbtV[i];
        if (localObject != null) {
          paramzzsn.zza(3, (byte[])localObject);
        }
        i += 1;
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzsk zzIW()
  {
    zzbtT = zzsx.zzbuB;
    zzbtU = zzsx.zzbuw;
    zzbtV = zzsx.zzbuC;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzsk zzO(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      Object localObject;
      switch (i)
      {
      default: 
        if (zza(paramzzsm, i)) {}
        break;
      case 0: 
        return this;
      case 10: 
        j = zzsx.zzc(paramzzsm, 10);
        if (zzbtT == null) {}
        for (i = 0;; i = zzbtT.length)
        {
          localObject = new String[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbtT, 0, localObject, 0, i);
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
        zzbtT = ((String[])localObject);
        break;
      case 16: 
        j = zzsx.zzc(paramzzsm, 16);
        if (zzbtU == null) {}
        for (i = 0;; i = zzbtU.length)
        {
          localObject = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbtU, 0, localObject, 0, i);
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
        zzbtU = ((int[])localObject);
        break;
      case 18: 
        int k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzbtU == null) {}
        for (i = 0;; i = zzbtU.length)
        {
          localObject = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbtU, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length)
          {
            localObject[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzbtU = ((int[])localObject);
        paramzzsm.zzmr(k);
        break;
      case 26: 
        j = zzsx.zzc(paramzzsm, 26);
        if (zzbtV == null) {}
        for (i = 0;; i = zzbtV.length)
        {
          localObject = new byte[j + i][];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbtV, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = paramzzsm.readBytes();
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = paramzzsm.readBytes();
        zzbtV = ((byte[][])localObject);
      }
    }
  }
  
  protected final int zzz()
  {
    int i1 = 0;
    int i2 = super.zzz();
    int i;
    int k;
    Object localObject;
    int n;
    int m;
    if ((zzbtT != null) && (zzbtT.length > 0))
    {
      i = 0;
      j = 0;
      for (k = 0; i < zzbtT.length; k = m)
      {
        localObject = zzbtT[i];
        n = j;
        m = k;
        if (localObject != null)
        {
          m = k + 1;
          n = j + zzsn.zzgO((String)localObject);
        }
        i += 1;
        j = n;
      }
    }
    for (int j = i2 + j + k * 1;; j = i2)
    {
      i = j;
      if (zzbtU != null)
      {
        i = j;
        if (zzbtU.length > 0)
        {
          i = 0;
          k = 0;
          while (i < zzbtU.length)
          {
            k += zzsn.zzmx(zzbtU[i]);
            i += 1;
          }
          i = j + k + zzbtU.length * 1;
        }
      }
      j = i;
      if (zzbtV != null)
      {
        j = i;
        if (zzbtV.length > 0)
        {
          k = 0;
          m = 0;
          j = i1;
          while (j < zzbtV.length)
          {
            localObject = zzbtV[j];
            i1 = k;
            n = m;
            if (localObject != null)
            {
              n = m + 1;
              i1 = k + zzsn.zzG((byte[])localObject);
            }
            j += 1;
            k = i1;
            m = n;
          }
          j = i + k + m * 1;
        }
      }
      return j;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */