package com.google.android.gms.internal;

public final class zzag$zza
  extends zzso
{
  private static volatile zza[] zzjw;
  public int type;
  public zza[] zzjA;
  public String zzjB;
  public String zzjC;
  public long zzjD;
  public boolean zzjE;
  public zza[] zzjF;
  public int[] zzjG;
  public boolean zzjH;
  public String zzjx;
  public zza[] zzjy;
  public zza[] zzjz;
  
  public zzag$zza()
  {
    zzR();
  }
  
  public static zza[] zzQ()
  {
    if (zzjw == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzjw == null) {
        zzjw = new zza[0];
      }
      return zzjw;
    }
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
      if (type != type) {
        return false;
      }
      if (zzjx == null)
      {
        if (zzjx != null) {
          return false;
        }
      }
      else if (!zzjx.equals(zzjx)) {
        return false;
      }
      if (!zzss.equals(zzjy, zzjy)) {
        return false;
      }
      if (!zzss.equals(zzjz, zzjz)) {
        return false;
      }
      if (!zzss.equals(zzjA, zzjA)) {
        return false;
      }
      if (zzjB == null)
      {
        if (zzjB != null) {
          return false;
        }
      }
      else if (!zzjB.equals(zzjB)) {
        return false;
      }
      if (zzjC == null)
      {
        if (zzjC != null) {
          return false;
        }
      }
      else if (!zzjC.equals(zzjC)) {
        return false;
      }
      if (zzjD != zzjD) {
        return false;
      }
      if (zzjE != zzjE) {
        return false;
      }
      if (!zzss.equals(zzjF, zzjF)) {
        return false;
      }
      if (!zzss.equals(zzjG, zzjG)) {
        return false;
      }
      if (zzjH != zzjH) {
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
    int n = 1231;
    int i2 = 0;
    int i3 = getClass().getName().hashCode();
    int i4 = type;
    int i;
    int i5;
    int i6;
    int i7;
    int j;
    label71:
    int k;
    label80:
    int i8;
    int m;
    label107:
    int i9;
    int i10;
    if (zzjx == null)
    {
      i = 0;
      i5 = zzss.hashCode(zzjy);
      i6 = zzss.hashCode(zzjz);
      i7 = zzss.hashCode(zzjA);
      if (zzjB != null) {
        break label250;
      }
      j = 0;
      if (zzjC != null) {
        break label261;
      }
      k = 0;
      i8 = (int)(zzjD ^ zzjD >>> 32);
      if (!zzjE) {
        break label272;
      }
      m = 1231;
      i9 = zzss.hashCode(zzjF);
      i10 = zzss.hashCode(zzjG);
      if (!zzjH) {
        break label280;
      }
      label132:
      i1 = i2;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label288;
        }
      }
    }
    label250:
    label261:
    label272:
    label280:
    label288:
    for (int i1 = i2;; i1 = zzbuj.hashCode())
    {
      return ((((m + ((k + (j + ((((i + ((i3 + 527) * 31 + i4) * 31) * 31 + i5) * 31 + i6) * 31 + i7) * 31) * 31) * 31 + i8) * 31) * 31 + i9) * 31 + i10) * 31 + n) * 31 + i1;
      i = zzjx.hashCode();
      break;
      j = zzjB.hashCode();
      break label71;
      k = zzjC.hashCode();
      break label80;
      m = 1237;
      break label107;
      n = 1237;
      break label132;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    int j = 0;
    paramzzsn.zzA(1, type);
    if (!zzjx.equals("")) {
      paramzzsn.zzn(2, zzjx);
    }
    int i;
    zza localzza;
    if ((zzjy != null) && (zzjy.length > 0))
    {
      i = 0;
      while (i < zzjy.length)
      {
        localzza = zzjy[i];
        if (localzza != null) {
          paramzzsn.zza(3, localzza);
        }
        i += 1;
      }
    }
    if ((zzjz != null) && (zzjz.length > 0))
    {
      i = 0;
      while (i < zzjz.length)
      {
        localzza = zzjz[i];
        if (localzza != null) {
          paramzzsn.zza(4, localzza);
        }
        i += 1;
      }
    }
    if ((zzjA != null) && (zzjA.length > 0))
    {
      i = 0;
      while (i < zzjA.length)
      {
        localzza = zzjA[i];
        if (localzza != null) {
          paramzzsn.zza(5, localzza);
        }
        i += 1;
      }
    }
    if (!zzjB.equals("")) {
      paramzzsn.zzn(6, zzjB);
    }
    if (!zzjC.equals("")) {
      paramzzsn.zzn(7, zzjC);
    }
    if (zzjD != 0L) {
      paramzzsn.zzb(8, zzjD);
    }
    if (zzjH) {
      paramzzsn.zze(9, zzjH);
    }
    if ((zzjG != null) && (zzjG.length > 0))
    {
      i = 0;
      while (i < zzjG.length)
      {
        paramzzsn.zzA(10, zzjG[i]);
        i += 1;
      }
    }
    if ((zzjF != null) && (zzjF.length > 0))
    {
      i = j;
      while (i < zzjF.length)
      {
        localzza = zzjF[i];
        if (localzza != null) {
          paramzzsn.zza(11, localzza);
        }
        i += 1;
      }
    }
    if (zzjE) {
      paramzzsn.zze(12, zzjE);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zza zzR()
  {
    type = 1;
    zzjx = "";
    zzjy = zzQ();
    zzjz = zzQ();
    zzjA = zzQ();
    zzjB = "";
    zzjC = "";
    zzjD = 0L;
    zzjE = false;
    zzjF = zzQ();
    zzjG = zzsx.zzbuw;
    zzjH = false;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zza zzk(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      int j;
      Object localObject;
      int k;
      switch (i)
      {
      default: 
        if (zza(paramzzsm, i)) {}
        break;
      case 0: 
        return this;
      case 8: 
        i = paramzzsm.zzJb();
        switch (i)
        {
        default: 
          break;
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
        case 7: 
        case 8: 
          type = i;
        }
        break;
      case 18: 
        zzjx = paramzzsm.readString();
        break;
      case 26: 
        j = zzsx.zzc(paramzzsm, 26);
        if (zzjy == null) {}
        for (i = 0;; i = zzjy.length)
        {
          localObject = new zza[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjy, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zza();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zza();
        paramzzsm.zza(localObject[j]);
        zzjy = ((zza[])localObject);
        break;
      case 34: 
        j = zzsx.zzc(paramzzsm, 34);
        if (zzjz == null) {}
        for (i = 0;; i = zzjz.length)
        {
          localObject = new zza[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjz, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zza();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zza();
        paramzzsm.zza(localObject[j]);
        zzjz = ((zza[])localObject);
        break;
      case 42: 
        j = zzsx.zzc(paramzzsm, 42);
        if (zzjA == null) {}
        for (i = 0;; i = zzjA.length)
        {
          localObject = new zza[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjA, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zza();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zza();
        paramzzsm.zza(localObject[j]);
        zzjA = ((zza[])localObject);
        break;
      case 50: 
        zzjB = paramzzsm.readString();
        break;
      case 58: 
        zzjC = paramzzsm.readString();
        break;
      case 64: 
        zzjD = paramzzsm.zzJa();
        break;
      case 72: 
        zzjH = paramzzsm.zzJc();
        break;
      case 80: 
        int m = zzsx.zzc(paramzzsm, 80);
        localObject = new int[m];
        j = 0;
        i = 0;
        if (j < m)
        {
          if (j != 0) {
            paramzzsm.zzIX();
          }
          int n = paramzzsm.zzJb();
          switch (n)
          {
          }
          for (;;)
          {
            j += 1;
            break;
            k = i + 1;
            localObject[i] = n;
            i = k;
          }
        }
        if (i != 0)
        {
          if (zzjG == null) {}
          for (j = 0;; j = zzjG.length)
          {
            if ((j != 0) || (i != localObject.length)) {
              break label810;
            }
            zzjG = ((int[])localObject);
            break;
          }
          int[] arrayOfInt = new int[j + i];
          if (j != 0) {
            System.arraycopy(zzjG, 0, arrayOfInt, 0, j);
          }
          System.arraycopy(localObject, 0, arrayOfInt, j, i);
          zzjG = arrayOfInt;
        }
        break;
      case 82: 
        k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0) {
          switch (paramzzsm.zzJb())
          {
          default: 
            break;
          case 1: 
          case 2: 
          case 3: 
          case 4: 
          case 5: 
          case 6: 
          case 7: 
          case 8: 
          case 9: 
          case 10: 
          case 11: 
          case 12: 
          case 13: 
          case 14: 
          case 15: 
          case 16: 
          case 17: 
            j += 1;
          }
        }
        if (j != 0)
        {
          paramzzsm.zzms(i);
          if (zzjG == null) {}
          for (i = 0;; i = zzjG.length)
          {
            localObject = new int[j + i];
            j = i;
            if (i != 0)
            {
              System.arraycopy(zzjG, 0, localObject, 0, i);
              j = i;
            }
            while (paramzzsm.zzJk() > 0)
            {
              i = paramzzsm.zzJb();
              switch (i)
              {
              default: 
                break;
              case 1: 
              case 2: 
              case 3: 
              case 4: 
              case 5: 
              case 6: 
              case 7: 
              case 8: 
              case 9: 
              case 10: 
              case 11: 
              case 12: 
              case 13: 
              case 14: 
              case 15: 
              case 16: 
              case 17: 
                localObject[j] = i;
                j += 1;
              }
            }
          }
          zzjG = ((int[])localObject);
        }
        paramzzsm.zzmr(k);
        break;
      case 90: 
        j = zzsx.zzc(paramzzsm, 90);
        if (zzjF == null) {}
        for (i = 0;; i = zzjF.length)
        {
          localObject = new zza[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzjF, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zza();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zza();
        paramzzsm.zza(localObject[j]);
        zzjF = ((zza[])localObject);
        break;
      case 96: 
        label810:
        zzjE = paramzzsm.zzJc();
      }
    }
  }
  
  protected final int zzz()
  {
    int m = 0;
    int j = super.zzz() + zzsn.zzC(1, type);
    int i = j;
    if (!zzjx.equals("")) {
      i = j + zzsn.zzo(2, zzjx);
    }
    j = i;
    zza localzza;
    int k;
    if (zzjy != null)
    {
      j = i;
      if (zzjy.length > 0)
      {
        j = 0;
        while (j < zzjy.length)
        {
          localzza = zzjy[j];
          k = i;
          if (localzza != null) {
            k = i + zzsn.zzc(3, localzza);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    i = j;
    if (zzjz != null)
    {
      i = j;
      if (zzjz.length > 0)
      {
        i = j;
        j = 0;
        while (j < zzjz.length)
        {
          localzza = zzjz[j];
          k = i;
          if (localzza != null) {
            k = i + zzsn.zzc(4, localzza);
          }
          j += 1;
          i = k;
        }
      }
    }
    j = i;
    if (zzjA != null)
    {
      j = i;
      if (zzjA.length > 0)
      {
        j = 0;
        while (j < zzjA.length)
        {
          localzza = zzjA[j];
          k = i;
          if (localzza != null) {
            k = i + zzsn.zzc(5, localzza);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    i = j;
    if (!zzjB.equals("")) {
      i = j + zzsn.zzo(6, zzjB);
    }
    j = i;
    if (!zzjC.equals("")) {
      j = i + zzsn.zzo(7, zzjC);
    }
    i = j;
    if (zzjD != 0L) {
      i = j + zzsn.zzd(8, zzjD);
    }
    j = i;
    if (zzjH) {
      j = i + zzsn.zzf(9, zzjH);
    }
    i = j;
    if (zzjG != null)
    {
      i = j;
      if (zzjG.length > 0)
      {
        i = 0;
        k = 0;
        while (i < zzjG.length)
        {
          k += zzsn.zzmx(zzjG[i]);
          i += 1;
        }
        i = j + k + zzjG.length * 1;
      }
    }
    j = i;
    if (zzjF != null)
    {
      j = i;
      if (zzjF.length > 0)
      {
        k = m;
        for (;;)
        {
          j = i;
          if (k >= zzjF.length) {
            break;
          }
          localzza = zzjF[k];
          j = i;
          if (localzza != null) {
            j = i + zzsn.zzc(11, localzza);
          }
          k += 1;
          i = j;
        }
      }
    }
    i = j;
    if (zzjE) {
      i = j + zzsn.zzf(12, zzjE);
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzag.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */