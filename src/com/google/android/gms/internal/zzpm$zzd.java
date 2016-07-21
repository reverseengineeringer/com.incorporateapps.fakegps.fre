package com.google.android.gms.internal;

public final class zzpm$zzd
  extends zzso
{
  public boolean zzaMv;
  public long zzaMw;
  public double zzaMx;
  public zzpm.zzc zzaMy;
  public String zzamJ;
  
  public zzpm$zzd()
  {
    zzyv();
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
      if (zzaMv != zzaMv) {
        return false;
      }
      if (zzamJ == null)
      {
        if (zzamJ != null) {
          return false;
        }
      }
      else if (!zzamJ.equals(zzamJ)) {
        return false;
      }
      if (zzaMw != zzaMw) {
        return false;
      }
      if (Double.doubleToLongBits(zzaMx) != Double.doubleToLongBits(zzaMx)) {
        return false;
      }
      if (zzaMy == null)
      {
        if (zzaMy != null) {
          return false;
        }
      }
      else if (!zzaMy.equals(zzaMy)) {
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
    int n = 0;
    int i1 = getClass().getName().hashCode();
    int i;
    int j;
    label35:
    int i2;
    int i3;
    int k;
    if (zzaMv)
    {
      i = 1231;
      if (zzamJ != null) {
        break label151;
      }
      j = 0;
      i2 = (int)(zzaMw ^ zzaMw >>> 32);
      long l = Double.doubleToLongBits(zzaMx);
      i3 = (int)(l ^ l >>> 32);
      if (zzaMy != null) {
        break label162;
      }
      k = 0;
      label79:
      m = n;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label173;
        }
      }
    }
    label151:
    label162:
    label173:
    for (int m = n;; m = zzbuj.hashCode())
    {
      return (k + (((j + (i + (i1 + 527) * 31) * 31) * 31 + i2) * 31 + i3) * 31) * 31 + m;
      i = 1237;
      break;
      j = zzamJ.hashCode();
      break label35;
      k = zzaMy.hashCode();
      break label79;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (zzaMv) {
      paramzzsn.zze(1, zzaMv);
    }
    if (!zzamJ.equals("")) {
      paramzzsn.zzn(2, zzamJ);
    }
    if (zzaMw != 0L) {
      paramzzsn.zzb(3, zzaMw);
    }
    if (Double.doubleToLongBits(zzaMx) != Double.doubleToLongBits(0.0D)) {
      paramzzsn.zza(4, zzaMx);
    }
    if (zzaMy != null) {
      paramzzsn.zza(5, zzaMy);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzd zzs(zzsm paramzzsm)
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
        zzaMv = paramzzsm.zzJc();
        break;
      case 18: 
        zzamJ = paramzzsm.readString();
        break;
      case 24: 
        zzaMw = paramzzsm.zzJa();
        break;
      case 33: 
        zzaMx = paramzzsm.readDouble();
        break;
      case 42: 
        if (zzaMy == null) {
          zzaMy = new zzpm.zzc();
        }
        paramzzsm.zza(zzaMy);
      }
    }
  }
  
  public final zzd zzyv()
  {
    zzaMv = false;
    zzamJ = "";
    zzaMw = 0L;
    zzaMx = 0.0D;
    zzaMy = null;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (zzaMv) {
      i = j + zzsn.zzf(1, zzaMv);
    }
    j = i;
    if (!zzamJ.equals("")) {
      j = i + zzsn.zzo(2, zzamJ);
    }
    i = j;
    if (zzaMw != 0L) {
      i = j + zzsn.zzd(3, zzaMw);
    }
    j = i;
    if (Double.doubleToLongBits(zzaMx) != Double.doubleToLongBits(0.0D)) {
      j = i + zzsn.zzb(4, zzaMx);
    }
    i = j;
    if (zzaMy != null) {
      i = j + zzsn.zzc(5, zzaMy);
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpm.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */