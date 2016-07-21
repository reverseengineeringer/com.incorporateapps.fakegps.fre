package com.google.android.gms.internal;

public final class zzaf$zzd
  extends zzso
{
  public zzag.zza[] zziC;
  public zzag.zza[] zziD;
  public zzaf.zzc[] zziE;
  
  public zzaf$zzd()
  {
    zzG();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzd)) {
        return false;
      }
      paramObject = (zzd)paramObject;
      if (!zzss.equals(zziC, zziC)) {
        return false;
      }
      if (!zzss.equals(zziD, zziD)) {
        return false;
      }
      if (!zzss.equals(zziE, zziE)) {
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
    int k = zzss.hashCode(zziC);
    int m = zzss.hashCode(zziD);
    int n = zzss.hashCode(zziE);
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
    if ((zziC != null) && (zziC.length > 0))
    {
      i = 0;
      while (i < zziC.length)
      {
        localObject = zziC[i];
        if (localObject != null) {
          paramzzsn.zza(1, (zzsu)localObject);
        }
        i += 1;
      }
    }
    if ((zziD != null) && (zziD.length > 0))
    {
      i = 0;
      while (i < zziD.length)
      {
        localObject = zziD[i];
        if (localObject != null) {
          paramzzsn.zza(2, (zzsu)localObject);
        }
        i += 1;
      }
    }
    if ((zziE != null) && (zziE.length > 0))
    {
      i = j;
      while (i < zziE.length)
      {
        localObject = zziE[i];
        if (localObject != null) {
          paramzzsn.zza(3, (zzsu)localObject);
        }
        i += 1;
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzd zzG()
  {
    zziC = zzag.zza.zzQ();
    zziD = zzag.zza.zzQ();
    zziE = zzaf.zzc.zzE();
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzd zzd(zzsm paramzzsm)
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
        if (zziC == null) {}
        for (i = 0;; i = zziC.length)
        {
          localObject = new zzag.zza[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziC, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzag.zza();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzag.zza();
        paramzzsm.zza(localObject[j]);
        zziC = ((zzag.zza[])localObject);
        break;
      case 18: 
        j = zzsx.zzc(paramzzsm, 18);
        if (zziD == null) {}
        for (i = 0;; i = zziD.length)
        {
          localObject = new zzag.zza[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziD, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzag.zza();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzag.zza();
        paramzzsm.zza(localObject[j]);
        zziD = ((zzag.zza[])localObject);
        break;
      case 26: 
        j = zzsx.zzc(paramzzsm, 26);
        if (zziE == null) {}
        for (i = 0;; i = zziE.length)
        {
          localObject = new zzaf.zzc[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziE, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzaf.zzc();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzaf.zzc();
        paramzzsm.zza(localObject[j]);
        zziE = ((zzaf.zzc[])localObject);
      }
    }
  }
  
  protected final int zzz()
  {
    int m = 0;
    int i = super.zzz();
    int j = i;
    Object localObject;
    if (zziC != null)
    {
      j = i;
      if (zziC.length > 0)
      {
        j = 0;
        while (j < zziC.length)
        {
          localObject = zziC[j];
          k = i;
          if (localObject != null) {
            k = i + zzsn.zzc(1, (zzsu)localObject);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    i = j;
    if (zziD != null)
    {
      i = j;
      if (zziD.length > 0)
      {
        i = j;
        j = 0;
        while (j < zziD.length)
        {
          localObject = zziD[j];
          k = i;
          if (localObject != null) {
            k = i + zzsn.zzc(2, (zzsu)localObject);
          }
          j += 1;
          i = k;
        }
      }
    }
    int k = i;
    if (zziE != null)
    {
      k = i;
      if (zziE.length > 0)
      {
        j = m;
        for (;;)
        {
          k = i;
          if (j >= zziE.length) {
            break;
          }
          localObject = zziE[j];
          k = i;
          if (localObject != null) {
            k = i + zzsn.zzc(3, (zzsu)localObject);
          }
          j += 1;
          i = k;
        }
      }
    }
    return k;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaf.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */