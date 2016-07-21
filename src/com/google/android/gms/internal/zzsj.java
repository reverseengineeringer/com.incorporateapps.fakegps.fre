package com.google.android.gms.internal;

public final class zzsj
  extends zzso
{
  public zzsj.zza[] zzbtA;
  
  public zzsj()
  {
    zzIQ();
  }
  
  public static zzsj zzA(byte[] paramArrayOfByte)
  {
    return (zzsj)zzsu.mergeFrom(new zzsj(), paramArrayOfByte);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzsj)) {
        return false;
      }
      paramObject = (zzsj)paramObject;
      if (!zzss.equals(zzbtA, zzbtA)) {
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
    int k = zzss.hashCode(zzbtA);
    if ((zzbuj == null) || (zzbuj.isEmpty())) {}
    for (int i = 0;; i = zzbuj.hashCode()) {
      return i + ((j + 527) * 31 + k) * 31;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if ((zzbtA != null) && (zzbtA.length > 0))
    {
      int i = 0;
      while (i < zzbtA.length)
      {
        zzsj.zza localzza = zzbtA[i];
        if (localzza != null) {
          paramzzsn.zza(1, localzza);
        }
        i += 1;
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzsj zzIQ()
  {
    zzbtA = zzsj.zza.zzIR();
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzsj zzK(zzsm paramzzsm)
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
        if (zzbtA == null) {}
        zzsj.zza[] arrayOfzza;
        for (i = 0;; i = zzbtA.length)
        {
          arrayOfzza = new zzsj.zza[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbtA, 0, arrayOfzza, 0, i);
            j = i;
          }
          while (j < arrayOfzza.length - 1)
          {
            arrayOfzza[j] = new zzsj.zza();
            paramzzsm.zza(arrayOfzza[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        arrayOfzza[j] = new zzsj.zza();
        paramzzsm.zza(arrayOfzza[j]);
        zzbtA = arrayOfzza;
      }
    }
  }
  
  protected final int zzz()
  {
    int i = super.zzz();
    int k = i;
    if (zzbtA != null)
    {
      k = i;
      if (zzbtA.length > 0)
      {
        int j = 0;
        for (;;)
        {
          k = i;
          if (j >= zzbtA.length) {
            break;
          }
          zzsj.zza localzza = zzbtA[j];
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
 * Qualified Name:     com.google.android.gms.internal.zzsj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */