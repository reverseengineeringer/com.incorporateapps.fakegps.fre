package com.google.android.gms.internal;

public final class zzrq$zza
  extends zzso
{
  public long zzbmd;
  public zzaf.zzj zzbme;
  public zzaf.zzf zzju;
  
  public zzrq$zza()
  {
    zzHG();
  }
  
  public static zza zzy(byte[] paramArrayOfByte)
  {
    return (zza)zzsu.mergeFrom(new zza(), paramArrayOfByte);
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
      if (zzbmd != zzbmd) {
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
      if (zzbme == null)
      {
        if (zzbme != null) {
          return false;
        }
      }
      else if (!zzbme.equals(zzbme)) {
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
    int i1 = (int)(zzbmd ^ zzbmd >>> 32);
    int i;
    int j;
    if (zzju == null)
    {
      i = 0;
      if (zzbme != null) {
        break label110;
      }
      j = 0;
      label48:
      k = m;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label121;
        }
      }
    }
    label110:
    label121:
    for (int k = m;; k = zzbuj.hashCode())
    {
      return (j + (i + ((n + 527) * 31 + i1) * 31) * 31) * 31 + k;
      i = zzju.hashCode();
      break;
      j = zzbme.hashCode();
      break label48;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    paramzzsn.zzb(1, zzbmd);
    if (zzju != null) {
      paramzzsn.zza(2, zzju);
    }
    if (zzbme != null) {
      paramzzsn.zza(3, zzbme);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zza zzHG()
  {
    zzbmd = 0L;
    zzju = null;
    zzbme = null;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zza zzJ(zzsm paramzzsm)
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
      case 8: 
        zzbmd = paramzzsm.zzJa();
        break;
      case 18: 
        if (zzju == null) {
          zzju = new zzaf.zzf();
        }
        paramzzsm.zza(zzju);
        break;
      case 26: 
        if (zzbme == null) {
          zzbme = new zzaf.zzj();
        }
        paramzzsm.zza(zzbme);
      }
    }
  }
  
  protected final int zzz()
  {
    int j = super.zzz() + zzsn.zzd(1, zzbmd);
    int i = j;
    if (zzju != null) {
      i = j + zzsn.zzc(2, zzju);
    }
    j = i;
    if (zzbme != null) {
      j = i + zzsn.zzc(3, zzbme);
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzrq.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */