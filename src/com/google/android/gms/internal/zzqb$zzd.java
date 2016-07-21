package com.google.android.gms.internal;

public final class zzqb$zzd
  extends zzsu
{
  public zzqb.zze[] zzbaj;
  
  public zzqb$zzd()
  {
    zzDV();
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
    } while (zzss.equals(zzbaj, zzbaj));
    return false;
  }
  
  public final int hashCode()
  {
    return (getClass().getName().hashCode() + 527) * 31 + zzss.hashCode(zzbaj);
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if ((zzbaj != null) && (zzbaj.length > 0))
    {
      int i = 0;
      while (i < zzbaj.length)
      {
        zzqb.zze localzze = zzbaj[i];
        if (localzze != null) {
          paramzzsn.zza(1, localzze);
        }
        i += 1;
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzd zzDV()
  {
    zzbaj = zzqb.zze.zzDW();
    zzbuu = -1;
    return this;
  }
  
  public final zzd zzF(zzsm paramzzsm)
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
        int j = zzsx.zzc(paramzzsm, 10);
        if (zzbaj == null) {}
        zzqb.zze[] arrayOfzze;
        for (i = 0;; i = zzbaj.length)
        {
          arrayOfzze = new zzqb.zze[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbaj, 0, arrayOfzze, 0, i);
            j = i;
          }
          while (j < arrayOfzze.length - 1)
          {
            arrayOfzze[j] = new zzqb.zze();
            paramzzsm.zza(arrayOfzze[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        arrayOfzze[j] = new zzqb.zze();
        paramzzsm.zza(arrayOfzze[j]);
        zzbaj = arrayOfzze;
      }
    }
  }
  
  protected final int zzz()
  {
    int i = super.zzz();
    int k = i;
    if (zzbaj != null)
    {
      k = i;
      if (zzbaj.length > 0)
      {
        int j = 0;
        for (;;)
        {
          k = i;
          if (j >= zzbaj.length) {
            break;
          }
          zzqb.zze localzze = zzbaj[j];
          k = i;
          if (localzze != null) {
            k = i + zzsn.zzc(1, localzze);
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
 * Qualified Name:     com.google.android.gms.internal.zzqb.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */