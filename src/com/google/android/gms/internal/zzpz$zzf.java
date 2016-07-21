package com.google.android.gms.internal;

public final class zzpz$zzf
  extends zzsu
{
  public Integer zzaZN;
  public String zzaZO;
  public Boolean zzaZP;
  public String[] zzaZQ;
  
  public zzpz$zzf()
  {
    zzDJ();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzf)) {
        return false;
      }
      paramObject = (zzf)paramObject;
      if (zzaZN == null)
      {
        if (zzaZN != null) {
          return false;
        }
      }
      else if (!zzaZN.equals(zzaZN)) {
        return false;
      }
      if (zzaZO == null)
      {
        if (zzaZO != null) {
          return false;
        }
      }
      else if (!zzaZO.equals(zzaZO)) {
        return false;
      }
      if (zzaZP == null)
      {
        if (zzaZP != null) {
          return false;
        }
      }
      else if (!zzaZP.equals(zzaZP)) {
        return false;
      }
    } while (zzss.equals(zzaZQ, zzaZQ));
    return false;
  }
  
  public final int hashCode()
  {
    int k = 0;
    int m = getClass().getName().hashCode();
    int i;
    int j;
    if (zzaZN == null)
    {
      i = 0;
      if (zzaZO != null) {
        break label83;
      }
      j = 0;
      label32:
      if (zzaZP != null) {
        break label94;
      }
    }
    for (;;)
    {
      return ((j + (i + (m + 527) * 31) * 31) * 31 + k) * 31 + zzss.hashCode(zzaZQ);
      i = zzaZN.intValue();
      break;
      label83:
      j = zzaZO.hashCode();
      break label32;
      label94:
      k = zzaZP.hashCode();
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (zzaZN != null) {
      paramzzsn.zzA(1, zzaZN.intValue());
    }
    if (zzaZO != null) {
      paramzzsn.zzn(2, zzaZO);
    }
    if (zzaZP != null) {
      paramzzsn.zze(3, zzaZP.booleanValue());
    }
    if ((zzaZQ != null) && (zzaZQ.length > 0))
    {
      int i = 0;
      while (i < zzaZQ.length)
      {
        String str = zzaZQ[i];
        if (str != null) {
          paramzzsn.zzn(4, str);
        }
        i += 1;
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzf zzDJ()
  {
    zzaZN = null;
    zzaZO = null;
    zzaZP = null;
    zzaZQ = zzsx.zzbuB;
    zzbuu = -1;
    return this;
  }
  
  public final zzf zzy(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      switch (i)
      {
      default: 
        if (zzsx.zzb(paramzzsm, i)) {}
        break;
      case 0: 
        return this;
      case 8: 
        i = paramzzsm.zzJb();
        switch (i)
        {
        default: 
          break;
        case 0: 
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
          zzaZN = Integer.valueOf(i);
        }
        break;
      case 18: 
        zzaZO = paramzzsm.readString();
        break;
      case 24: 
        zzaZP = Boolean.valueOf(paramzzsm.zzJc());
        break;
      case 34: 
        int j = zzsx.zzc(paramzzsm, 34);
        if (zzaZQ == null) {}
        String[] arrayOfString;
        for (i = 0;; i = zzaZQ.length)
        {
          arrayOfString = new String[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzaZQ, 0, arrayOfString, 0, i);
            j = i;
          }
          while (j < arrayOfString.length - 1)
          {
            arrayOfString[j] = paramzzsm.readString();
            paramzzsm.zzIX();
            j += 1;
          }
        }
        arrayOfString[j] = paramzzsm.readString();
        zzaZQ = arrayOfString;
      }
    }
  }
  
  protected final int zzz()
  {
    int n = 0;
    int j = super.zzz();
    int i = j;
    if (zzaZN != null) {
      i = j + zzsn.zzC(1, zzaZN.intValue());
    }
    j = i;
    if (zzaZO != null) {
      j = i + zzsn.zzo(2, zzaZO);
    }
    i = j;
    if (zzaZP != null) {
      i = j + zzsn.zzf(3, zzaZP.booleanValue());
    }
    j = i;
    if (zzaZQ != null)
    {
      j = i;
      if (zzaZQ.length > 0)
      {
        int k = 0;
        int m = 0;
        j = n;
        while (j < zzaZQ.length)
        {
          String str = zzaZQ[j];
          int i1 = k;
          n = m;
          if (str != null)
          {
            n = m + 1;
            i1 = k + zzsn.zzgO(str);
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

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpz.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */