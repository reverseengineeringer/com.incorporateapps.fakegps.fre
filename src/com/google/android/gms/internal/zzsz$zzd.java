package com.google.android.gms.internal;

import java.util.Arrays;

public final class zzsz$zzd
  extends zzso
{
  public String tag;
  public long zzbuR;
  public long zzbuS;
  public long zzbuT;
  public int zzbuU;
  public boolean zzbuV;
  public zzsz.zze[] zzbuW;
  public zzsz.zzb zzbuX;
  public byte[] zzbuY;
  public byte[] zzbuZ;
  public byte[] zzbva;
  public zzsz.zza zzbvb;
  public String zzbvc;
  public long zzbvd;
  public zzsz.zzc zzbve;
  public byte[] zzbvf;
  public int zzbvg;
  public int[] zzbvh;
  public long zzbvi;
  public int zzob;
  
  public zzsz$zzd()
  {
    zzJF();
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
      if (zzbuR != zzbuR) {
        return false;
      }
      if (zzbuS != zzbuS) {
        return false;
      }
      if (zzbuT != zzbuT) {
        return false;
      }
      if (tag == null)
      {
        if (tag != null) {
          return false;
        }
      }
      else if (!tag.equals(tag)) {
        return false;
      }
      if (zzbuU != zzbuU) {
        return false;
      }
      if (zzob != zzob) {
        return false;
      }
      if (zzbuV != zzbuV) {
        return false;
      }
      if (!zzss.equals(zzbuW, zzbuW)) {
        return false;
      }
      if (zzbuX == null)
      {
        if (zzbuX != null) {
          return false;
        }
      }
      else if (!zzbuX.equals(zzbuX)) {
        return false;
      }
      if (!Arrays.equals(zzbuY, zzbuY)) {
        return false;
      }
      if (!Arrays.equals(zzbuZ, zzbuZ)) {
        return false;
      }
      if (!Arrays.equals(zzbva, zzbva)) {
        return false;
      }
      if (zzbvb == null)
      {
        if (zzbvb != null) {
          return false;
        }
      }
      else if (!zzbvb.equals(zzbvb)) {
        return false;
      }
      if (zzbvc == null)
      {
        if (zzbvc != null) {
          return false;
        }
      }
      else if (!zzbvc.equals(zzbvc)) {
        return false;
      }
      if (zzbvd != zzbvd) {
        return false;
      }
      if (zzbve == null)
      {
        if (zzbve != null) {
          return false;
        }
      }
      else if (!zzbve.equals(zzbve)) {
        return false;
      }
      if (!Arrays.equals(zzbvf, zzbvf)) {
        return false;
      }
      if (zzbvg != zzbvg) {
        return false;
      }
      if (!zzss.equals(zzbvh, zzbvh)) {
        return false;
      }
      if (zzbvi != zzbvi) {
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
    int i3 = 0;
    int i4 = getClass().getName().hashCode();
    int i5 = (int)(zzbuR ^ zzbuR >>> 32);
    int i6 = (int)(zzbuS ^ zzbuS >>> 32);
    int i7 = (int)(zzbuT ^ zzbuT >>> 32);
    int i;
    int i8;
    int i9;
    int j;
    label92:
    int i10;
    int k;
    label110:
    int i11;
    int i12;
    int i13;
    int m;
    label147:
    int n;
    label157:
    int i14;
    int i1;
    label182:
    int i15;
    int i16;
    int i17;
    int i18;
    if (tag == null)
    {
      i = 0;
      i8 = zzbuU;
      i9 = zzob;
      if (!zzbuV) {
        break label387;
      }
      j = 1231;
      i10 = zzss.hashCode(zzbuW);
      if (zzbuX != null) {
        break label394;
      }
      k = 0;
      i11 = Arrays.hashCode(zzbuY);
      i12 = Arrays.hashCode(zzbuZ);
      i13 = Arrays.hashCode(zzbva);
      if (zzbvb != null) {
        break label405;
      }
      m = 0;
      if (zzbvc != null) {
        break label417;
      }
      n = 0;
      i14 = (int)(zzbvd ^ zzbvd >>> 32);
      if (zzbve != null) {
        break label429;
      }
      i1 = 0;
      i15 = Arrays.hashCode(zzbvf);
      i16 = zzbvg;
      i17 = zzss.hashCode(zzbvh);
      i18 = (int)(zzbvi ^ zzbvi >>> 32);
      i2 = i3;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label441;
        }
      }
    }
    label387:
    label394:
    label405:
    label417:
    label429:
    label441:
    for (int i2 = i3;; i2 = zzbuj.hashCode())
    {
      return (((((i1 + ((n + (m + ((((k + ((j + (((i + ((((i4 + 527) * 31 + i5) * 31 + i6) * 31 + i7) * 31) * 31 + i8) * 31 + i9) * 31) * 31 + i10) * 31) * 31 + i11) * 31 + i12) * 31 + i13) * 31) * 31) * 31 + i14) * 31) * 31 + i15) * 31 + i16) * 31 + i17) * 31 + i18) * 31 + i2;
      i = tag.hashCode();
      break;
      j = 1237;
      break label92;
      k = zzbuX.hashCode();
      break label110;
      m = zzbvb.hashCode();
      break label147;
      n = zzbvc.hashCode();
      break label157;
      i1 = zzbve.hashCode();
      break label182;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    int j = 0;
    if (zzbuR != 0L) {
      paramzzsn.zzb(1, zzbuR);
    }
    if (!tag.equals("")) {
      paramzzsn.zzn(2, tag);
    }
    int i;
    if ((zzbuW != null) && (zzbuW.length > 0))
    {
      i = 0;
      while (i < zzbuW.length)
      {
        zzsz.zze localzze = zzbuW[i];
        if (localzze != null) {
          paramzzsn.zza(3, localzze);
        }
        i += 1;
      }
    }
    if (!Arrays.equals(zzbuY, zzsx.zzbuD)) {
      paramzzsn.zza(6, zzbuY);
    }
    if (zzbvb != null) {
      paramzzsn.zza(7, zzbvb);
    }
    if (!Arrays.equals(zzbuZ, zzsx.zzbuD)) {
      paramzzsn.zza(8, zzbuZ);
    }
    if (zzbuX != null) {
      paramzzsn.zza(9, zzbuX);
    }
    if (zzbuV) {
      paramzzsn.zze(10, zzbuV);
    }
    if (zzbuU != 0) {
      paramzzsn.zzA(11, zzbuU);
    }
    if (zzob != 0) {
      paramzzsn.zzA(12, zzob);
    }
    if (!Arrays.equals(zzbva, zzsx.zzbuD)) {
      paramzzsn.zza(13, zzbva);
    }
    if (!zzbvc.equals("")) {
      paramzzsn.zzn(14, zzbvc);
    }
    if (zzbvd != 180000L) {
      paramzzsn.zzc(15, zzbvd);
    }
    if (zzbve != null) {
      paramzzsn.zza(16, zzbve);
    }
    if (zzbuS != 0L) {
      paramzzsn.zzb(17, zzbuS);
    }
    if (!Arrays.equals(zzbvf, zzsx.zzbuD)) {
      paramzzsn.zza(18, zzbvf);
    }
    if (zzbvg != 0) {
      paramzzsn.zzA(19, zzbvg);
    }
    if ((zzbvh != null) && (zzbvh.length > 0))
    {
      i = j;
      while (i < zzbvh.length)
      {
        paramzzsn.zzA(20, zzbvh[i]);
        i += 1;
      }
    }
    if (zzbuT != 0L) {
      paramzzsn.zzb(21, zzbuT);
    }
    if (zzbvi != 0L) {
      paramzzsn.zzb(22, zzbvi);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzd zzJF()
  {
    zzbuR = 0L;
    zzbuS = 0L;
    zzbuT = 0L;
    tag = "";
    zzbuU = 0;
    zzob = 0;
    zzbuV = false;
    zzbuW = zzsz.zze.zzJG();
    zzbuX = null;
    zzbuY = zzsx.zzbuD;
    zzbuZ = zzsx.zzbuD;
    zzbva = zzsx.zzbuD;
    zzbvb = null;
    zzbvc = "";
    zzbvd = 180000L;
    zzbve = null;
    zzbvf = zzsx.zzbuD;
    zzbvg = 0;
    zzbvh = zzsx.zzbuw;
    zzbvi = 0L;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzd zzV(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      Object localObject;
      switch (i)
      {
      default: 
        if (zza(paramzzsm, i)) {}
        break;
      case 0: 
        return this;
      case 8: 
        zzbuR = paramzzsm.zzJa();
        break;
      case 18: 
        tag = paramzzsm.readString();
        break;
      case 26: 
        j = zzsx.zzc(paramzzsm, 26);
        if (zzbuW == null) {}
        for (i = 0;; i = zzbuW.length)
        {
          localObject = new zzsz.zze[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbuW, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzsz.zze();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzsz.zze();
        paramzzsm.zza(localObject[j]);
        zzbuW = ((zzsz.zze[])localObject);
        break;
      case 50: 
        zzbuY = paramzzsm.readBytes();
        break;
      case 58: 
        if (zzbvb == null) {
          zzbvb = new zzsz.zza();
        }
        paramzzsm.zza(zzbvb);
        break;
      case 66: 
        zzbuZ = paramzzsm.readBytes();
        break;
      case 74: 
        if (zzbuX == null) {
          zzbuX = new zzsz.zzb();
        }
        paramzzsm.zza(zzbuX);
        break;
      case 80: 
        zzbuV = paramzzsm.zzJc();
        break;
      case 88: 
        zzbuU = paramzzsm.zzJb();
        break;
      case 96: 
        zzob = paramzzsm.zzJb();
        break;
      case 106: 
        zzbva = paramzzsm.readBytes();
        break;
      case 114: 
        zzbvc = paramzzsm.readString();
        break;
      case 120: 
        zzbvd = paramzzsm.zzJe();
        break;
      case 130: 
        if (zzbve == null) {
          zzbve = new zzsz.zzc();
        }
        paramzzsm.zza(zzbve);
        break;
      case 136: 
        zzbuS = paramzzsm.zzJa();
        break;
      case 146: 
        zzbvf = paramzzsm.readBytes();
        break;
      case 152: 
        i = paramzzsm.zzJb();
        switch (i)
        {
        default: 
          break;
        case 0: 
        case 1: 
        case 2: 
          zzbvg = i;
        }
        break;
      case 160: 
        j = zzsx.zzc(paramzzsm, 160);
        if (zzbvh == null) {}
        for (i = 0;; i = zzbvh.length)
        {
          localObject = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbvh, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = paramzzsm.zzJb();
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = paramzzsm.zzJb();
        zzbvh = ((int[])localObject);
        break;
      case 162: 
        int k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJb();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzbvh == null) {}
        for (i = 0;; i = zzbvh.length)
        {
          localObject = new int[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbvh, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length)
          {
            localObject[j] = paramzzsm.zzJb();
            j += 1;
          }
        }
        zzbvh = ((int[])localObject);
        paramzzsm.zzmr(k);
        break;
      case 168: 
        zzbuT = paramzzsm.zzJa();
        break;
      case 176: 
        zzbvi = paramzzsm.zzJa();
      }
    }
  }
  
  protected final int zzz()
  {
    int m = 0;
    int i = super.zzz();
    int j = i;
    if (zzbuR != 0L) {
      j = i + zzsn.zzd(1, zzbuR);
    }
    i = j;
    if (!tag.equals("")) {
      i = j + zzsn.zzo(2, tag);
    }
    j = i;
    if (zzbuW != null)
    {
      j = i;
      if (zzbuW.length > 0)
      {
        j = 0;
        while (j < zzbuW.length)
        {
          zzsz.zze localzze = zzbuW[j];
          k = i;
          if (localzze != null) {
            k = i + zzsn.zzc(3, localzze);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    i = j;
    if (!Arrays.equals(zzbuY, zzsx.zzbuD)) {
      i = j + zzsn.zzb(6, zzbuY);
    }
    j = i;
    if (zzbvb != null) {
      j = i + zzsn.zzc(7, zzbvb);
    }
    i = j;
    if (!Arrays.equals(zzbuZ, zzsx.zzbuD)) {
      i = j + zzsn.zzb(8, zzbuZ);
    }
    j = i;
    if (zzbuX != null) {
      j = i + zzsn.zzc(9, zzbuX);
    }
    i = j;
    if (zzbuV) {
      i = j + zzsn.zzf(10, zzbuV);
    }
    j = i;
    if (zzbuU != 0) {
      j = i + zzsn.zzC(11, zzbuU);
    }
    i = j;
    if (zzob != 0) {
      i = j + zzsn.zzC(12, zzob);
    }
    j = i;
    if (!Arrays.equals(zzbva, zzsx.zzbuD)) {
      j = i + zzsn.zzb(13, zzbva);
    }
    i = j;
    if (!zzbvc.equals("")) {
      i = j + zzsn.zzo(14, zzbvc);
    }
    j = i;
    if (zzbvd != 180000L) {
      j = i + zzsn.zze(15, zzbvd);
    }
    i = j;
    if (zzbve != null) {
      i = j + zzsn.zzc(16, zzbve);
    }
    j = i;
    if (zzbuS != 0L) {
      j = i + zzsn.zzd(17, zzbuS);
    }
    int k = j;
    if (!Arrays.equals(zzbvf, zzsx.zzbuD)) {
      k = j + zzsn.zzb(18, zzbvf);
    }
    i = k;
    if (zzbvg != 0) {
      i = k + zzsn.zzC(19, zzbvg);
    }
    j = i;
    if (zzbvh != null)
    {
      j = i;
      if (zzbvh.length > 0)
      {
        k = 0;
        j = m;
        while (j < zzbvh.length)
        {
          k += zzsn.zzmx(zzbvh[j]);
          j += 1;
        }
        j = i + k + zzbvh.length * 2;
      }
    }
    i = j;
    if (zzbuT != 0L) {
      i = j + zzsn.zzd(21, zzbuT);
    }
    j = i;
    if (zzbvi != 0L) {
      j = i + zzsn.zzd(22, zzbvi);
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsz.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */