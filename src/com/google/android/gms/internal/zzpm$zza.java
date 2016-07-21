package com.google.android.gms.internal;

public final class zzpm$zza
  extends zzso
{
  public zzpm.zza.zza[] zzaMo;
  
  public zzpm$zza()
  {
    zzyp();
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
      if (!zzss.equals(zzaMo, zzaMo)) {
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
    int k = zzss.hashCode(zzaMo);
    if ((zzbuj == null) || (zzbuj.isEmpty())) {}
    for (int i = 0;; i = zzbuj.hashCode()) {
      return i + ((j + 527) * 31 + k) * 31;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if ((zzaMo != null) && (zzaMo.length > 0))
    {
      int i = 0;
      while (i < zzaMo.length)
      {
        zzpm.zza.zza localzza = zzaMo[i];
        if (localzza != null) {
          paramzzsn.zza(1, localzza);
        }
        i += 1;
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public final zza zzo(zzsm paramzzsm)
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
        int j = zzsx.zzc(paramzzsm, 10);
        if (zzaMo == null) {}
        zzpm.zza.zza[] arrayOfzza;
        for (i = 0;; i = zzaMo.length)
        {
          arrayOfzza = new zzpm.zza.zza[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzaMo, 0, arrayOfzza, 0, i);
            j = i;
          }
          while (j < arrayOfzza.length - 1)
          {
            arrayOfzza[j] = new zzpm.zza.zza();
            paramzzsm.zza(arrayOfzza[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        arrayOfzza[j] = new zzpm.zza.zza();
        paramzzsm.zza(arrayOfzza[j]);
        zzaMo = arrayOfzza;
      }
    }
  }
  
  public final zza zzyp()
  {
    zzaMo = zzpm.zza.zza.zzyq();
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  protected final int zzz()
  {
    int i = super.zzz();
    int k = i;
    if (zzaMo != null)
    {
      k = i;
      if (zzaMo.length > 0)
      {
        int j = 0;
        for (;;)
        {
          k = i;
          if (j >= zzaMo.length) {
            break;
          }
          zzpm.zza.zza localzza = zzaMo[j];
          k = i;
          if (localzza != null) {
            k = i + zzsn.zzc(1, localzza);
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
 * Qualified Name:     com.google.android.gms.internal.zzpm.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */