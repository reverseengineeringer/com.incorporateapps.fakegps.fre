package com.google.android.gms.internal;

public final class zzpz$zza
  extends zzsu
{
  private static volatile zza[] zzaZq;
  public Integer zzaZr;
  public zzpz.zze[] zzaZs;
  public zzpz.zzb[] zzaZt;
  
  public zzpz$zza()
  {
    zzDB();
  }
  
  public static zza[] zzDA()
  {
    if (zzaZq == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzaZq == null) {
        zzaZq = new zza[0];
      }
      return zzaZq;
    }
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
      if (zzaZr == null)
      {
        if (zzaZr != null) {
          return false;
        }
      }
      else if (!zzaZr.equals(zzaZr)) {
        return false;
      }
      if (!zzss.equals(zzaZs, zzaZs)) {
        return false;
      }
    } while (zzss.equals(zzaZt, zzaZt));
    return false;
  }
  
  public final int hashCode()
  {
    int j = getClass().getName().hashCode();
    if (zzaZr == null) {}
    for (int i = 0;; i = zzaZr.hashCode()) {
      return ((i + (j + 527) * 31) * 31 + zzss.hashCode(zzaZs)) * 31 + zzss.hashCode(zzaZt);
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    int j = 0;
    if (zzaZr != null) {
      paramzzsn.zzA(1, zzaZr.intValue());
    }
    int i;
    Object localObject;
    if ((zzaZs != null) && (zzaZs.length > 0))
    {
      i = 0;
      while (i < zzaZs.length)
      {
        localObject = zzaZs[i];
        if (localObject != null) {
          paramzzsn.zza(2, (zzsu)localObject);
        }
        i += 1;
      }
    }
    if ((zzaZt != null) && (zzaZt.length > 0))
    {
      i = j;
      while (i < zzaZt.length)
      {
        localObject = zzaZt[i];
        if (localObject != null) {
          paramzzsn.zza(3, (zzsu)localObject);
        }
        i += 1;
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public final zza zzDB()
  {
    zzaZr = null;
    zzaZs = zzpz.zze.zzDH();
    zzaZt = zzpz.zzb.zzDC();
    zzbuu = -1;
    return this;
  }
  
  public final zza zzt(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      Object localObject;
      switch (i)
      {
      default: 
        if (zzsx.zzb(paramzzsm, i)) {}
        break;
      case 0: 
        return this;
      case 8: 
        zzaZr = Integer.valueOf(paramzzsm.zzJb());
        break;
      case 18: 
        j = zzsx.zzc(paramzzsm, 18);
        if (zzaZs == null) {}
        for (i = 0;; i = zzaZs.length)
        {
          localObject = new zzpz.zze[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzaZs, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzpz.zze();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzpz.zze();
        paramzzsm.zza(localObject[j]);
        zzaZs = ((zzpz.zze[])localObject);
        break;
      case 26: 
        j = zzsx.zzc(paramzzsm, 26);
        if (zzaZt == null) {}
        for (i = 0;; i = zzaZt.length)
        {
          localObject = new zzpz.zzb[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzaZt, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzpz.zzb();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzpz.zzb();
        paramzzsm.zza(localObject[j]);
        zzaZt = ((zzpz.zzb[])localObject);
      }
    }
  }
  
  protected final int zzz()
  {
    int m = 0;
    int i = super.zzz();
    int j = i;
    if (zzaZr != null) {
      j = i + zzsn.zzC(1, zzaZr.intValue());
    }
    i = j;
    Object localObject;
    if (zzaZs != null)
    {
      i = j;
      if (zzaZs.length > 0)
      {
        i = j;
        j = 0;
        while (j < zzaZs.length)
        {
          localObject = zzaZs[j];
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
    if (zzaZt != null)
    {
      k = i;
      if (zzaZt.length > 0)
      {
        j = m;
        for (;;)
        {
          k = i;
          if (j >= zzaZt.length) {
            break;
          }
          localObject = zzaZt[j];
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
 * Qualified Name:     com.google.android.gms.internal.zzpz.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */