package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.zzsm;
import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzso;
import com.google.android.gms.internal.zzsq;
import com.google.android.gms.internal.zzsu;

public final class zzat
  extends zzso
{
  public int versionCode;
  public long zzarW;
  public String zzarY;
  public long zzarZ;
  public int zzasa;
  
  public zzat()
  {
    zztl();
  }
  
  public static zzat zzm(byte[] paramArrayOfByte)
  {
    return (zzat)zzsu.mergeFrom(new zzat(), paramArrayOfByte);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzat)) {
        return false;
      }
      paramObject = (zzat)paramObject;
      if (versionCode != versionCode) {
        return false;
      }
      if (zzarY == null)
      {
        if (zzarY != null) {
          return false;
        }
      }
      else if (!zzarY.equals(zzarY)) {
        return false;
      }
      if (zzarZ != zzarZ) {
        return false;
      }
      if (zzarW != zzarW) {
        return false;
      }
      if (zzasa != zzasa) {
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
    int k = 0;
    int m = getClass().getName().hashCode();
    int n = versionCode;
    int i;
    int i1;
    int i2;
    int i3;
    if (zzarY == null)
    {
      i = 0;
      i1 = (int)(zzarZ ^ zzarZ >>> 32);
      i2 = (int)(zzarW ^ zzarW >>> 32);
      i3 = zzasa;
      j = k;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label138;
        }
      }
    }
    label138:
    for (int j = k;; j = zzbuj.hashCode())
    {
      return ((((i + ((m + 527) * 31 + n) * 31) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + j;
      i = zzarY.hashCode();
      break;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    paramzzsn.zzA(1, versionCode);
    paramzzsn.zzn(2, zzarY);
    paramzzsn.zzc(3, zzarZ);
    paramzzsn.zzc(4, zzarW);
    if (zzasa != -1) {
      paramzzsn.zzA(5, zzasa);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzat zzm(zzsm paramzzsm)
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
      case 18: 
        zzarY = paramzzsm.readString();
        break;
      case 24: 
        zzarZ = paramzzsm.zzJe();
        break;
      case 32: 
        zzarW = paramzzsm.zzJe();
        break;
      case 40: 
        zzasa = paramzzsm.zzJb();
      }
    }
  }
  
  public final zzat zztl()
  {
    versionCode = 1;
    zzarY = "";
    zzarZ = -1L;
    zzarW = -1L;
    zzasa = -1;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  protected final int zzz()
  {
    int j = super.zzz() + zzsn.zzC(1, versionCode) + zzsn.zzo(2, zzarY) + zzsn.zze(3, zzarZ) + zzsn.zze(4, zzarW);
    int i = j;
    if (zzasa != -1) {
      i = j + zzsn.zzC(5, zzasa);
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */