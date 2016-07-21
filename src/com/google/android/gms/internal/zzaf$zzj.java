package com.google.android.gms.internal;

public final class zzaf$zzj
  extends zzso
{
  public zzaf.zzi[] zzjt;
  public zzaf.zzf zzju;
  public String zzjv;
  
  public zzaf$zzj()
  {
    zzP();
  }
  
  public static zzj zzd(byte[] paramArrayOfByte)
  {
    return (zzj)zzsu.mergeFrom(new zzj(), paramArrayOfByte);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzj)) {
        return false;
      }
      paramObject = (zzj)paramObject;
      if (!zzss.equals(zzjt, zzjt)) {
        return false;
      }
      if (zzju == null)
      {
        if (zzju != null) {
          return false;
        }
      }
      else if (!zzju.equals(zzju)) {
        return false;
      }
      if (zzjv == null)
      {
        if (zzjv != null) {
          return false;
        }
      }
      else if (!zzjv.equals(zzjv)) {
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
    int m = 0;
    int n = getClass().getName().hashCode();
    int i1 = zzss.hashCode(zzjt);
    int i;
    int j;
    if (zzju == null)
    {
      i = 0;
      if (zzjv != null) {
        break label104;
      }
      j = 0;
      label42:
      k = m;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label115;
        }
      }
    }
    label104:
    label115:
    for (int k = m;; k = zzbuj.hashCode())
    {
      return (j + (i + ((n + 527) * 31 + i1) * 31) * 31) * 31 + k;
      i = zzju.hashCode();
      break;
      j = zzjv.hashCode();
      break label42;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if ((zzjt != null) && (zzjt.length > 0))
    {
      int i = 0;
      while (i < zzjt.length)
      {
        zzaf.zzi localzzi = zzjt[i];
        if (localzzi != null) {
          paramzzsn.zza(1, localzzi);
        }
        i += 1;
      }
    }
    if (zzju != null) {
      paramzzsn.zza(2, zzju);
    }
    if (!zzjv.equals("")) {
      paramzzsn.zzn(3, zzjv);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzj zzP()
  {
    zzjt = zzaf.zzi.zzN();
    zzju = null;
    zzjv = "";
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzj zzj(zzsm paramzzsm)
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
        if (zzjt == null) {}
        zzaf.zzi[] arrayOfzzi;
        for (i = 0;; i = zzjt.length)
        {
          arrayOfzzi = new zzaf.zzi[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjt, 0, arrayOfzzi, 0, i);
            j = i;
          }
          while (j < arrayOfzzi.length - 1)
          {
            arrayOfzzi[j] = new zzaf.zzi();
            paramzzsm.zza(arrayOfzzi[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        arrayOfzzi[j] = new zzaf.zzi();
        paramzzsm.zza(arrayOfzzi[j]);
        zzjt = arrayOfzzi;
        break;
      case 18: 
        if (zzju == null) {
          zzju = new zzaf.zzf();
        }
        paramzzsm.zza(zzju);
        break;
      case 26: 
        zzjv = paramzzsm.readString();
      }
    }
  }
  
  protected final int zzz()
  {
    int i = super.zzz();
    int j = i;
    if (zzjt != null)
    {
      j = i;
      if (zzjt.length > 0)
      {
        int k = 0;
        for (;;)
        {
          j = i;
          if (k >= zzjt.length) {
            break;
          }
          zzaf.zzi localzzi = zzjt[k];
          j = i;
          if (localzzi != null) {
            j = i + zzsn.zzc(1, localzzi);
          }
          k += 1;
          i = j;
        }
      }
    }
    i = j;
    if (zzju != null) {
      i = j + zzsn.zzc(2, zzju);
    }
    j = i;
    if (!zzjv.equals("")) {
      j = i + zzsn.zzo(3, zzjv);
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaf.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */