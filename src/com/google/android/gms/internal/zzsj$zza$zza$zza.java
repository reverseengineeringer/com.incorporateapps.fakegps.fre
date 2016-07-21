package com.google.android.gms.internal;

import java.util.Arrays;

public final class zzsj$zza$zza$zza
  extends zzso
{
  public byte[] zzbtF;
  public String zzbtG;
  public double zzbtH;
  public float zzbtI;
  public long zzbtJ;
  public int zzbtK;
  public int zzbtL;
  public boolean zzbtM;
  public zzsj.zza[] zzbtN;
  public zzsj.zza.zza[] zzbtO;
  public String[] zzbtP;
  public long[] zzbtQ;
  public float[] zzbtR;
  public long zzbtS;
  
  public zzsj$zza$zza$zza()
  {
    zzIV();
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
      if (!Arrays.equals(zzbtF, zzbtF)) {
        return false;
      }
      if (zzbtG == null)
      {
        if (zzbtG != null) {
          return false;
        }
      }
      else if (!zzbtG.equals(zzbtG)) {
        return false;
      }
      if (Double.doubleToLongBits(zzbtH) != Double.doubleToLongBits(zzbtH)) {
        return false;
      }
      if (Float.floatToIntBits(zzbtI) != Float.floatToIntBits(zzbtI)) {
        return false;
      }
      if (zzbtJ != zzbtJ) {
        return false;
      }
      if (zzbtK != zzbtK) {
        return false;
      }
      if (zzbtL != zzbtL) {
        return false;
      }
      if (zzbtM != zzbtM) {
        return false;
      }
      if (!zzss.equals(zzbtN, zzbtN)) {
        return false;
      }
      if (!zzss.equals(zzbtO, zzbtO)) {
        return false;
      }
      if (!zzss.equals(zzbtP, zzbtP)) {
        return false;
      }
      if (!zzss.equals(zzbtQ, zzbtQ)) {
        return false;
      }
      if (!zzss.equals(zzbtR, zzbtR)) {
        return false;
      }
      if (zzbtS != zzbtS) {
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
    int i1 = Arrays.hashCode(zzbtF);
    int i;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    int j;
    label100:
    int i7;
    int i8;
    int i9;
    int i10;
    int i11;
    int i12;
    if (zzbtG == null)
    {
      i = 0;
      long l = Double.doubleToLongBits(zzbtH);
      i2 = (int)(l ^ l >>> 32);
      i3 = Float.floatToIntBits(zzbtI);
      i4 = (int)(zzbtJ ^ zzbtJ >>> 32);
      i5 = zzbtK;
      i6 = zzbtL;
      if (!zzbtM) {
        break label288;
      }
      j = 1231;
      i7 = zzss.hashCode(zzbtN);
      i8 = zzss.hashCode(zzbtO);
      i9 = zzss.hashCode(zzbtP);
      i10 = zzss.hashCode(zzbtQ);
      i11 = zzss.hashCode(zzbtR);
      i12 = (int)(zzbtS ^ zzbtS >>> 32);
      k = m;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label295;
        }
      }
    }
    label288:
    label295:
    for (int k = m;; k = zzbuj.hashCode())
    {
      return (((((((j + ((((((i + ((n + 527) * 31 + i1) * 31) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31 + i11) * 31 + i12) * 31 + k;
      i = zzbtG.hashCode();
      break;
      j = 1237;
      break label100;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    int j = 0;
    if (!Arrays.equals(zzbtF, zzsx.zzbuD)) {
      paramzzsn.zza(1, zzbtF);
    }
    if (!zzbtG.equals("")) {
      paramzzsn.zzn(2, zzbtG);
    }
    if (Double.doubleToLongBits(zzbtH) != Double.doubleToLongBits(0.0D)) {
      paramzzsn.zza(3, zzbtH);
    }
    if (Float.floatToIntBits(zzbtI) != Float.floatToIntBits(0.0F)) {
      paramzzsn.zzb(4, zzbtI);
    }
    if (zzbtJ != 0L) {
      paramzzsn.zzb(5, zzbtJ);
    }
    if (zzbtK != 0) {
      paramzzsn.zzA(6, zzbtK);
    }
    if (zzbtL != 0) {
      paramzzsn.zzB(7, zzbtL);
    }
    if (zzbtM) {
      paramzzsn.zze(8, zzbtM);
    }
    int i;
    Object localObject;
    if ((zzbtN != null) && (zzbtN.length > 0))
    {
      i = 0;
      while (i < zzbtN.length)
      {
        localObject = zzbtN[i];
        if (localObject != null) {
          paramzzsn.zza(9, (zzsu)localObject);
        }
        i += 1;
      }
    }
    if ((zzbtO != null) && (zzbtO.length > 0))
    {
      i = 0;
      while (i < zzbtO.length)
      {
        localObject = zzbtO[i];
        if (localObject != null) {
          paramzzsn.zza(10, (zzsu)localObject);
        }
        i += 1;
      }
    }
    if ((zzbtP != null) && (zzbtP.length > 0))
    {
      i = 0;
      while (i < zzbtP.length)
      {
        localObject = zzbtP[i];
        if (localObject != null) {
          paramzzsn.zzn(11, (String)localObject);
        }
        i += 1;
      }
    }
    if ((zzbtQ != null) && (zzbtQ.length > 0))
    {
      i = 0;
      while (i < zzbtQ.length)
      {
        paramzzsn.zzb(12, zzbtQ[i]);
        i += 1;
      }
    }
    if (zzbtS != 0L) {
      paramzzsn.zzb(13, zzbtS);
    }
    if ((zzbtR != null) && (zzbtR.length > 0))
    {
      i = j;
      while (i < zzbtR.length)
      {
        paramzzsn.zzb(14, zzbtR[i]);
        i += 1;
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public final zza zzIV()
  {
    zzbtF = zzsx.zzbuD;
    zzbtG = "";
    zzbtH = 0.0D;
    zzbtI = 0.0F;
    zzbtJ = 0L;
    zzbtK = 0;
    zzbtL = 0;
    zzbtM = false;
    zzbtN = zzsj.zza.zzIR();
    zzbtO = zzsj.zza.zza.zzIT();
    zzbtP = zzsx.zzbuB;
    zzbtQ = zzsx.zzbux;
    zzbtR = zzsx.zzbuy;
    zzbtS = 0L;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zza zzN(zzsm paramzzsm)
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
      case 10: 
        zzbtF = paramzzsm.readBytes();
        break;
      case 18: 
        zzbtG = paramzzsm.readString();
        break;
      case 25: 
        zzbtH = paramzzsm.readDouble();
        break;
      case 37: 
        zzbtI = paramzzsm.readFloat();
        break;
      case 40: 
        zzbtJ = paramzzsm.zzJa();
        break;
      case 48: 
        zzbtK = paramzzsm.zzJb();
        break;
      case 56: 
        zzbtL = paramzzsm.zzJd();
        break;
      case 64: 
        zzbtM = paramzzsm.zzJc();
        break;
      case 74: 
        j = zzsx.zzc(paramzzsm, 74);
        if (zzbtN == null) {}
        for (i = 0;; i = zzbtN.length)
        {
          localObject = new zzsj.zza[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbtN, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzsj.zza();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzsj.zza();
        paramzzsm.zza(localObject[j]);
        zzbtN = ((zzsj.zza[])localObject);
        break;
      case 82: 
        j = zzsx.zzc(paramzzsm, 82);
        if (zzbtO == null) {}
        for (i = 0;; i = zzbtO.length)
        {
          localObject = new zzsj.zza.zza[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbtO, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzsj.zza.zza();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzsj.zza.zza();
        paramzzsm.zza(localObject[j]);
        zzbtO = ((zzsj.zza.zza[])localObject);
        break;
      case 90: 
        j = zzsx.zzc(paramzzsm, 90);
        if (zzbtP == null) {}
        for (i = 0;; i = zzbtP.length)
        {
          localObject = new String[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbtP, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = paramzzsm.readString();
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = paramzzsm.readString();
        zzbtP = ((String[])localObject);
        break;
      case 96: 
        j = zzsx.zzc(paramzzsm, 96);
        if (zzbtQ == null) {}
        for (i = 0;; i = zzbtQ.length)
        {
          localObject = new long[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbtQ, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = paramzzsm.zzJa();
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = paramzzsm.zzJa();
        zzbtQ = ((long[])localObject);
        break;
      case 98: 
        k = paramzzsm.zzmq(paramzzsm.zzJf());
        i = paramzzsm.getPosition();
        j = 0;
        while (paramzzsm.zzJk() > 0)
        {
          paramzzsm.zzJa();
          j += 1;
        }
        paramzzsm.zzms(i);
        if (zzbtQ == null) {}
        for (i = 0;; i = zzbtQ.length)
        {
          localObject = new long[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbtQ, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length)
          {
            localObject[j] = paramzzsm.zzJa();
            j += 1;
          }
        }
        zzbtQ = ((long[])localObject);
        paramzzsm.zzmr(k);
        break;
      case 104: 
        zzbtS = paramzzsm.zzJa();
        break;
      case 117: 
        j = zzsx.zzc(paramzzsm, 117);
        if (zzbtR == null) {}
        for (i = 0;; i = zzbtR.length)
        {
          localObject = new float[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbtR, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = paramzzsm.readFloat();
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = paramzzsm.readFloat();
        zzbtR = ((float[])localObject);
        break;
      case 114: 
        i = paramzzsm.zzJf();
        k = paramzzsm.zzmq(i);
        j = i / 4;
        if (zzbtR == null) {}
        for (i = 0;; i = zzbtR.length)
        {
          localObject = new float[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzbtR, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length)
          {
            localObject[j] = paramzzsm.readFloat();
            j += 1;
          }
        }
        zzbtR = ((float[])localObject);
        paramzzsm.zzmr(k);
      }
    }
  }
  
  protected final int zzz()
  {
    int i2 = 0;
    int j = super.zzz();
    int i = j;
    if (!Arrays.equals(zzbtF, zzsx.zzbuD)) {
      i = j + zzsn.zzb(1, zzbtF);
    }
    j = i;
    if (!zzbtG.equals("")) {
      j = i + zzsn.zzo(2, zzbtG);
    }
    i = j;
    if (Double.doubleToLongBits(zzbtH) != Double.doubleToLongBits(0.0D)) {
      i = j + zzsn.zzb(3, zzbtH);
    }
    j = i;
    if (Float.floatToIntBits(zzbtI) != Float.floatToIntBits(0.0F)) {
      j = i + zzsn.zzc(4, zzbtI);
    }
    i = j;
    if (zzbtJ != 0L) {
      i = j + zzsn.zzd(5, zzbtJ);
    }
    j = i;
    if (zzbtK != 0) {
      j = i + zzsn.zzC(6, zzbtK);
    }
    int k = j;
    if (zzbtL != 0) {
      k = j + zzsn.zzD(7, zzbtL);
    }
    i = k;
    if (zzbtM) {
      i = k + zzsn.zzf(8, zzbtM);
    }
    j = i;
    Object localObject;
    if (zzbtN != null)
    {
      j = i;
      if (zzbtN.length > 0)
      {
        j = 0;
        while (j < zzbtN.length)
        {
          localObject = zzbtN[j];
          k = i;
          if (localObject != null) {
            k = i + zzsn.zzc(9, (zzsu)localObject);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    i = j;
    if (zzbtO != null)
    {
      i = j;
      if (zzbtO.length > 0)
      {
        i = j;
        j = 0;
        while (j < zzbtO.length)
        {
          localObject = zzbtO[j];
          k = i;
          if (localObject != null) {
            k = i + zzsn.zzc(10, (zzsu)localObject);
          }
          j += 1;
          i = k;
        }
      }
    }
    j = i;
    if (zzbtP != null)
    {
      j = i;
      if (zzbtP.length > 0)
      {
        j = 0;
        k = 0;
        int n;
        for (int m = 0; j < zzbtP.length; m = n)
        {
          localObject = zzbtP[j];
          int i1 = k;
          n = m;
          if (localObject != null)
          {
            n = m + 1;
            i1 = k + zzsn.zzgO((String)localObject);
          }
          j += 1;
          k = i1;
        }
        j = i + k + m * 1;
      }
    }
    i = j;
    if (zzbtQ != null)
    {
      i = j;
      if (zzbtQ.length > 0)
      {
        k = 0;
        i = i2;
        while (i < zzbtQ.length)
        {
          k += zzsn.zzas(zzbtQ[i]);
          i += 1;
        }
        i = j + k + zzbtQ.length * 1;
      }
    }
    j = i;
    if (zzbtS != 0L) {
      j = i + zzsn.zzd(13, zzbtS);
    }
    i = j;
    if (zzbtR != null)
    {
      i = j;
      if (zzbtR.length > 0) {
        i = j + zzbtR.length * 4 + zzbtR.length * 1;
      }
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsj.zza.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */