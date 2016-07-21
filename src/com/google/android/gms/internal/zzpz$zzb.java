package com.google.android.gms.internal;

public final class zzpz$zzb
  extends zzsu
{
  private static volatile zzb[] zzaZu;
  public Integer zzaZv;
  public String zzaZw;
  public zzpz.zzc[] zzaZx;
  public Boolean zzaZy;
  public zzpz.zzd zzaZz;
  
  public zzpz$zzb()
  {
    zzDD();
  }
  
  public static zzb[] zzDC()
  {
    if (zzaZu == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzaZu == null) {
        zzaZu = new zzb[0];
      }
      return zzaZu;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      do
      {
        return true;
        if (!(paramObject instanceof zzb)) {
          return false;
        }
        paramObject = (zzb)paramObject;
        if (zzaZv == null)
        {
          if (zzaZv != null) {
            return false;
          }
        }
        else if (!zzaZv.equals(zzaZv)) {
          return false;
        }
        if (zzaZw == null)
        {
          if (zzaZw != null) {
            return false;
          }
        }
        else if (!zzaZw.equals(zzaZw)) {
          return false;
        }
        if (!zzss.equals(zzaZx, zzaZx)) {
          return false;
        }
        if (zzaZy == null)
        {
          if (zzaZy != null) {
            return false;
          }
        }
        else if (!zzaZy.equals(zzaZy)) {
          return false;
        }
        if (zzaZz != null) {
          break;
        }
      } while (zzaZz == null);
      return false;
    } while (zzaZz.equals(zzaZz));
    return false;
  }
  
  public final int hashCode()
  {
    int m = 0;
    int n = getClass().getName().hashCode();
    int i;
    int j;
    label33:
    int i1;
    int k;
    if (zzaZv == null)
    {
      i = 0;
      if (zzaZw != null) {
        break label103;
      }
      j = 0;
      i1 = zzss.hashCode(zzaZx);
      if (zzaZy != null) {
        break label114;
      }
      k = 0;
      label51:
      if (zzaZz != null) {
        break label125;
      }
    }
    for (;;)
    {
      return (k + ((j + (i + (n + 527) * 31) * 31) * 31 + i1) * 31) * 31 + m;
      i = zzaZv.hashCode();
      break;
      label103:
      j = zzaZw.hashCode();
      break label33;
      label114:
      k = zzaZy.hashCode();
      break label51;
      label125:
      m = zzaZz.hashCode();
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (zzaZv != null) {
      paramzzsn.zzA(1, zzaZv.intValue());
    }
    if (zzaZw != null) {
      paramzzsn.zzn(2, zzaZw);
    }
    if ((zzaZx != null) && (zzaZx.length > 0))
    {
      int i = 0;
      while (i < zzaZx.length)
      {
        zzpz.zzc localzzc = zzaZx[i];
        if (localzzc != null) {
          paramzzsn.zza(3, localzzc);
        }
        i += 1;
      }
    }
    if (zzaZy != null) {
      paramzzsn.zze(4, zzaZy.booleanValue());
    }
    if (zzaZz != null) {
      paramzzsn.zza(5, zzaZz);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzb zzDD()
  {
    zzaZv = null;
    zzaZw = null;
    zzaZx = zzpz.zzc.zzDE();
    zzaZy = null;
    zzaZz = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzb zzu(zzsm paramzzsm)
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
        zzaZv = Integer.valueOf(paramzzsm.zzJb());
        break;
      case 18: 
        zzaZw = paramzzsm.readString();
        break;
      case 26: 
        int j = zzsx.zzc(paramzzsm, 26);
        if (zzaZx == null) {}
        zzpz.zzc[] arrayOfzzc;
        for (i = 0;; i = zzaZx.length)
        {
          arrayOfzzc = new zzpz.zzc[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzaZx, 0, arrayOfzzc, 0, i);
            j = i;
          }
          while (j < arrayOfzzc.length - 1)
          {
            arrayOfzzc[j] = new zzpz.zzc();
            paramzzsm.zza(arrayOfzzc[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        arrayOfzzc[j] = new zzpz.zzc();
        paramzzsm.zza(arrayOfzzc[j]);
        zzaZx = arrayOfzzc;
        break;
      case 32: 
        zzaZy = Boolean.valueOf(paramzzsm.zzJc());
        break;
      case 42: 
        if (zzaZz == null) {
          zzaZz = new zzpz.zzd();
        }
        paramzzsm.zza(zzaZz);
      }
    }
  }
  
  protected final int zzz()
  {
    int i = super.zzz();
    int j = i;
    if (zzaZv != null) {
      j = i + zzsn.zzC(1, zzaZv.intValue());
    }
    i = j;
    if (zzaZw != null) {
      i = j + zzsn.zzo(2, zzaZw);
    }
    j = i;
    if (zzaZx != null)
    {
      j = i;
      if (zzaZx.length > 0)
      {
        j = 0;
        while (j < zzaZx.length)
        {
          zzpz.zzc localzzc = zzaZx[j];
          int k = i;
          if (localzzc != null) {
            k = i + zzsn.zzc(3, localzzc);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    i = j;
    if (zzaZy != null) {
      i = j + zzsn.zzf(4, zzaZy.booleanValue());
    }
    j = i;
    if (zzaZz != null) {
      j = i + zzsn.zzc(5, zzaZz);
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpz.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */