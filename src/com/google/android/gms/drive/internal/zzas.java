package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzso;
import com.google.android.gms.internal.zzsq;

public final class zzas
  extends zzso
{
  public int versionCode;
  public long zzarV;
  public long zzarW;
  public long zzarX;
  
  public zzas()
  {
    zztk();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzas)) {
        return false;
      }
      paramObject = (zzas)paramObject;
      if (versionCode != versionCode) {
        return false;
      }
      if (zzarV != zzarV) {
        return false;
      }
      if (zzarW != zzarW) {
        return false;
      }
      if (zzarX != zzarX) {
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
    int k = versionCode;
    int m = (int)(zzarV ^ zzarV >>> 32);
    int n = (int)(zzarW ^ zzarW >>> 32);
    int i1 = (int)(zzarX ^ zzarX >>> 32);
    if ((zzbuj == null) || (zzbuj.isEmpty())) {}
    for (int i = 0;; i = zzbuj.hashCode()) {
      return i + (((((j + 527) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    paramzzsn.zzA(1, versionCode);
    paramzzsn.zzc(2, zzarV);
    paramzzsn.zzc(3, zzarW);
    paramzzsn.zzc(4, zzarX);
    super.writeTo(paramzzsn);
  }
  
  public final zzas zzl(zzsm paramzzsm)
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
        versionCode = paramzzsm.zzJb();
        break;
      case 16: 
        zzarV = paramzzsm.zzJe();
        break;
      case 24: 
        zzarW = paramzzsm.zzJe();
        break;
      case 32: 
        zzarX = paramzzsm.zzJe();
      }
    }
  }
  
  public final zzas zztk()
  {
    versionCode = 1;
    zzarV = -1L;
    zzarW = -1L;
    zzarX = -1L;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  protected final int zzz()
  {
    return super.zzz() + zzsn.zzC(1, versionCode) + zzsn.zze(2, zzarV) + zzsn.zze(3, zzarW) + zzsn.zze(4, zzarX);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzas
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */