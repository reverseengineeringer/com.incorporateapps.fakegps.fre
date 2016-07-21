package com.google.android.gms.internal;

import java.util.Arrays;

public final class zzsz$zzc
  extends zzso
{
  public byte[] zzbuO;
  public byte[][] zzbuP;
  public boolean zzbuQ;
  
  public zzsz$zzc()
  {
    zzJE();
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
      if (!Arrays.equals(zzbuO, zzbuO)) {
        return false;
      }
      if (!zzss.zza(zzbuP, zzbuP)) {
        return false;
      }
      if (zzbuQ != zzbuQ) {
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
    int k = getClass().getName().hashCode();
    int m = Arrays.hashCode(zzbuO);
    int n = zzss.zza(zzbuP);
    int i;
    if (zzbuQ)
    {
      i = 1231;
      if ((zzbuj != null) && (!zzbuj.isEmpty())) {
        break label94;
      }
    }
    label94:
    for (int j = 0;; j = zzbuj.hashCode())
    {
      return j + (i + (((k + 527) * 31 + m) * 31 + n) * 31) * 31;
      i = 1237;
      break;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (!Arrays.equals(zzbuO, zzsx.zzbuD)) {
      paramzzsn.zza(1, zzbuO);
    }
    if ((zzbuP != null) && (zzbuP.length > 0))
    {
      int i = 0;
      while (i < zzbuP.length)
      {
        byte[] arrayOfByte = zzbuP[i];
        if (arrayOfByte != null) {
          paramzzsn.zza(2, arrayOfByte);
        }
        i += 1;
      }
    }
    if (zzbuQ) {
      paramzzsn.zze(3, zzbuQ);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzc zzJE()
  {
    zzbuO = zzsx.zzbuD;
    zzbuP = zzsx.zzbuC;
    zzbuQ = false;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzc zzU(zzsm paramzzsm)
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
        zzbuO = paramzzsm.readBytes();
        break;
      case 18: 
        int j = zzsx.zzc(paramzzsm, 18);
        if (zzbuP == null) {}
        byte[][] arrayOfByte;
        for (i = 0;; i = zzbuP.length)
        {
          arrayOfByte = new byte[j + i][];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbuP, 0, arrayOfByte, 0, i);
            j = i;
          }
          while (j < arrayOfByte.length - 1)
          {
            arrayOfByte[j] = paramzzsm.readBytes();
            paramzzsm.zzIX();
            j += 1;
          }
        }
        arrayOfByte[j] = paramzzsm.readBytes();
        zzbuP = arrayOfByte;
        break;
      case 24: 
        zzbuQ = paramzzsm.zzJc();
      }
    }
  }
  
  protected final int zzz()
  {
    int n = 0;
    int j = super.zzz();
    int i = j;
    if (!Arrays.equals(zzbuO, zzsx.zzbuD)) {
      i = j + zzsn.zzb(1, zzbuO);
    }
    j = i;
    if (zzbuP != null)
    {
      j = i;
      if (zzbuP.length > 0)
      {
        int k = 0;
        int m = 0;
        j = n;
        while (j < zzbuP.length)
        {
          byte[] arrayOfByte = zzbuP[j];
          int i1 = k;
          n = m;
          if (arrayOfByte != null)
          {
            n = m + 1;
            i1 = k + zzsn.zzG(arrayOfByte);
          }
          j += 1;
          k = i1;
          m = n;
        }
        j = i + k + m * 1;
      }
    }
    i = j;
    if (zzbuQ) {
      i = j + zzsn.zzf(3, zzbuQ);
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsz.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */