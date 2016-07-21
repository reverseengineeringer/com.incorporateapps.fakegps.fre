package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzso;
import com.google.android.gms.internal.zzsq;

public final class zzau
  extends zzso
{
  public long zzarW;
  public long zzarZ;
  
  public zzau()
  {
    zztm();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzau)) {
        return false;
      }
      paramObject = (zzau)paramObject;
      if (zzarZ != zzarZ) {
        return false;
      }
      if (zzarW != zzarW) {
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
    int k = (int)(zzarZ ^ zzarZ >>> 32);
    int m = (int)(zzarW ^ zzarW >>> 32);
    if ((zzbuj == null) || (zzbuj.isEmpty())) {}
    for (int i = 0;; i = zzbuj.hashCode()) {
      return i + (((j + 527) * 31 + k) * 31 + m) * 31;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    paramzzsn.zzc(1, zzarZ);
    paramzzsn.zzc(2, zzarW);
    super.writeTo(paramzzsn);
  }
  
  public final zzau zzn(zzsm paramzzsm)
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
        zzarZ = paramzzsm.zzJe();
        break;
      case 16: 
        zzarW = paramzzsm.zzJe();
      }
    }
  }
  
  public final zzau zztm()
  {
    zzarZ = -1L;
    zzarW = -1L;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  protected final int zzz()
  {
    return super.zzz() + zzsn.zze(1, zzarZ) + zzsn.zze(2, zzarW);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzau
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */