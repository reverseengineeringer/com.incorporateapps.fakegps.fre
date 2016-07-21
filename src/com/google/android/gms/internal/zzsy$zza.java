package com.google.android.gms.internal;

public final class zzsy$zza
  extends zzsu
{
  public String name;
  public zzsy.zzb[] zzbuE;
  
  public zzsy$zza()
  {
    zzJz();
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
      if (name == null)
      {
        if (name != null) {
          return false;
        }
      }
      else if (!name.equals(name)) {
        return false;
      }
    } while (zzss.equals(zzbuE, zzbuE));
    return false;
  }
  
  public final int hashCode()
  {
    int j = getClass().getName().hashCode();
    if (name == null) {}
    for (int i = 0;; i = name.hashCode()) {
      return (i + (j + 527) * 31) * 31 + zzss.hashCode(zzbuE);
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (name != null) {
      paramzzsn.zzn(1, name);
    }
    if ((zzbuE != null) && (zzbuE.length > 0))
    {
      int i = 0;
      while (i < zzbuE.length)
      {
        zzsy.zzb localzzb = zzbuE[i];
        if (localzzb != null) {
          paramzzsn.zza(2, localzzb);
        }
        i += 1;
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public final zza zzJz()
  {
    name = null;
    zzbuE = zzsy.zzb.zzJA();
    zzbuu = -1;
    return this;
  }
  
  public final zza zzQ(zzsm paramzzsm)
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
      case 10: 
        name = paramzzsm.readString();
        break;
      case 18: 
        int j = zzsx.zzc(paramzzsm, 18);
        if (zzbuE == null) {}
        zzsy.zzb[] arrayOfzzb;
        for (i = 0;; i = zzbuE.length)
        {
          arrayOfzzb = new zzsy.zzb[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbuE, 0, arrayOfzzb, 0, i);
            j = i;
          }
          while (j < arrayOfzzb.length - 1)
          {
            arrayOfzzb[j] = new zzsy.zzb();
            paramzzsm.zza(arrayOfzzb[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        arrayOfzzb[j] = new zzsy.zzb();
        paramzzsm.zza(arrayOfzzb[j]);
        zzbuE = arrayOfzzb;
      }
    }
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (name != null) {
      i = j + zzsn.zzo(1, name);
    }
    j = i;
    if (zzbuE != null)
    {
      j = i;
      if (zzbuE.length > 0)
      {
        j = 0;
        while (j < zzbuE.length)
        {
          zzsy.zzb localzzb = zzbuE[j];
          int k = i;
          if (localzzb != null) {
            k = i + zzsn.zzc(2, localzzb);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsy.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */