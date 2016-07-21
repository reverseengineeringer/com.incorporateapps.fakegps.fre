package com.google.android.gms.internal;

public final class zzaf$zzf
  extends zzso
{
  public String version;
  public String[] zziG;
  public String[] zziH;
  public zzag.zza[] zziI;
  public zzaf.zze[] zziJ;
  public zzaf.zzb[] zziK;
  public zzaf.zzb[] zziL;
  public zzaf.zzb[] zziM;
  public zzaf.zzg[] zziN;
  public String zziO;
  public String zziP;
  public String zziQ;
  public zzaf.zza zziR;
  public float zziS;
  public boolean zziT;
  public String[] zziU;
  public int zziV;
  
  public zzaf$zzf()
  {
    zzJ();
  }
  
  public static zzf zzc(byte[] paramArrayOfByte)
  {
    return (zzf)zzsu.mergeFrom(new zzf(), paramArrayOfByte);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzf)) {
        return false;
      }
      paramObject = (zzf)paramObject;
      if (!zzss.equals(zziG, zziG)) {
        return false;
      }
      if (!zzss.equals(zziH, zziH)) {
        return false;
      }
      if (!zzss.equals(zziI, zziI)) {
        return false;
      }
      if (!zzss.equals(zziJ, zziJ)) {
        return false;
      }
      if (!zzss.equals(zziK, zziK)) {
        return false;
      }
      if (!zzss.equals(zziL, zziL)) {
        return false;
      }
      if (!zzss.equals(zziM, zziM)) {
        return false;
      }
      if (!zzss.equals(zziN, zziN)) {
        return false;
      }
      if (zziO == null)
      {
        if (zziO != null) {
          return false;
        }
      }
      else if (!zziO.equals(zziO)) {
        return false;
      }
      if (zziP == null)
      {
        if (zziP != null) {
          return false;
        }
      }
      else if (!zziP.equals(zziP)) {
        return false;
      }
      if (zziQ == null)
      {
        if (zziQ != null) {
          return false;
        }
      }
      else if (!zziQ.equals(zziQ)) {
        return false;
      }
      if (version == null)
      {
        if (version != null) {
          return false;
        }
      }
      else if (!version.equals(version)) {
        return false;
      }
      if (zziR == null)
      {
        if (zziR != null) {
          return false;
        }
      }
      else if (!zziR.equals(zziR)) {
        return false;
      }
      if (Float.floatToIntBits(zziS) != Float.floatToIntBits(zziS)) {
        return false;
      }
      if (zziT != zziT) {
        return false;
      }
      if (!zzss.equals(zziU, zziU)) {
        return false;
      }
      if (zziV != zziV) {
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
    int i5 = zzss.hashCode(zziG);
    int i6 = zzss.hashCode(zziH);
    int i7 = zzss.hashCode(zziI);
    int i8 = zzss.hashCode(zziJ);
    int i9 = zzss.hashCode(zziK);
    int i10 = zzss.hashCode(zziL);
    int i11 = zzss.hashCode(zziM);
    int i12 = zzss.hashCode(zziN);
    int i;
    int j;
    label105:
    int k;
    label114:
    int m;
    label124:
    int n;
    label134:
    int i13;
    int i1;
    label155:
    int i14;
    int i15;
    if (zziO == null)
    {
      i = 0;
      if (zziP != null) {
        break label318;
      }
      j = 0;
      if (zziQ != null) {
        break label329;
      }
      k = 0;
      if (version != null) {
        break label340;
      }
      m = 0;
      if (zziR != null) {
        break label352;
      }
      n = 0;
      i13 = Float.floatToIntBits(zziS);
      if (!zziT) {
        break label364;
      }
      i1 = 1231;
      i14 = zzss.hashCode(zziU);
      i15 = zziV;
      i2 = i3;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label372;
        }
      }
    }
    label318:
    label329:
    label340:
    label352:
    label364:
    label372:
    for (int i2 = i3;; i2 = zzbuj.hashCode())
    {
      return (((i1 + ((n + (m + (k + (j + (i + (((((((((i4 + 527) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31 + i11) * 31 + i12) * 31) * 31) * 31) * 31) * 31) * 31 + i13) * 31) * 31 + i14) * 31 + i15) * 31 + i2;
      i = zziO.hashCode();
      break;
      j = zziP.hashCode();
      break label105;
      k = zziQ.hashCode();
      break label114;
      m = version.hashCode();
      break label124;
      n = zziR.hashCode();
      break label134;
      i1 = 1237;
      break label155;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    int j = 0;
    int i;
    Object localObject;
    if ((zziH != null) && (zziH.length > 0))
    {
      i = 0;
      while (i < zziH.length)
      {
        localObject = zziH[i];
        if (localObject != null) {
          paramzzsn.zzn(1, (String)localObject);
        }
        i += 1;
      }
    }
    if ((zziI != null) && (zziI.length > 0))
    {
      i = 0;
      while (i < zziI.length)
      {
        localObject = zziI[i];
        if (localObject != null) {
          paramzzsn.zza(2, (zzsu)localObject);
        }
        i += 1;
      }
    }
    if ((zziJ != null) && (zziJ.length > 0))
    {
      i = 0;
      while (i < zziJ.length)
      {
        localObject = zziJ[i];
        if (localObject != null) {
          paramzzsn.zza(3, (zzsu)localObject);
        }
        i += 1;
      }
    }
    if ((zziK != null) && (zziK.length > 0))
    {
      i = 0;
      while (i < zziK.length)
      {
        localObject = zziK[i];
        if (localObject != null) {
          paramzzsn.zza(4, (zzsu)localObject);
        }
        i += 1;
      }
    }
    if ((zziL != null) && (zziL.length > 0))
    {
      i = 0;
      while (i < zziL.length)
      {
        localObject = zziL[i];
        if (localObject != null) {
          paramzzsn.zza(5, (zzsu)localObject);
        }
        i += 1;
      }
    }
    if ((zziM != null) && (zziM.length > 0))
    {
      i = 0;
      while (i < zziM.length)
      {
        localObject = zziM[i];
        if (localObject != null) {
          paramzzsn.zza(6, (zzsu)localObject);
        }
        i += 1;
      }
    }
    if ((zziN != null) && (zziN.length > 0))
    {
      i = 0;
      while (i < zziN.length)
      {
        localObject = zziN[i];
        if (localObject != null) {
          paramzzsn.zza(7, (zzsu)localObject);
        }
        i += 1;
      }
    }
    if (!zziO.equals("")) {
      paramzzsn.zzn(9, zziO);
    }
    if (!zziP.equals("")) {
      paramzzsn.zzn(10, zziP);
    }
    if (!zziQ.equals("0")) {
      paramzzsn.zzn(12, zziQ);
    }
    if (!version.equals("")) {
      paramzzsn.zzn(13, version);
    }
    if (zziR != null) {
      paramzzsn.zza(14, zziR);
    }
    if (Float.floatToIntBits(zziS) != Float.floatToIntBits(0.0F)) {
      paramzzsn.zzb(15, zziS);
    }
    if ((zziU != null) && (zziU.length > 0))
    {
      i = 0;
      while (i < zziU.length)
      {
        localObject = zziU[i];
        if (localObject != null) {
          paramzzsn.zzn(16, (String)localObject);
        }
        i += 1;
      }
    }
    if (zziV != 0) {
      paramzzsn.zzA(17, zziV);
    }
    if (zziT) {
      paramzzsn.zze(18, zziT);
    }
    if ((zziG != null) && (zziG.length > 0))
    {
      i = j;
      while (i < zziG.length)
      {
        localObject = zziG[i];
        if (localObject != null) {
          paramzzsn.zzn(19, (String)localObject);
        }
        i += 1;
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzf zzJ()
  {
    zziG = zzsx.zzbuB;
    zziH = zzsx.zzbuB;
    zziI = zzag.zza.zzQ();
    zziJ = zzaf.zze.zzH();
    zziK = zzaf.zzb.zzC();
    zziL = zzaf.zzb.zzC();
    zziM = zzaf.zzb.zzC();
    zziN = zzaf.zzg.zzK();
    zziO = "";
    zziP = "";
    zziQ = "0";
    version = "";
    zziR = null;
    zziS = 0.0F;
    zziT = false;
    zziU = zzsx.zzbuB;
    zziV = 0;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzf zzf(zzsm paramzzsm)
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
      case 10: 
        j = zzsx.zzc(paramzzsm, 10);
        if (zziH == null) {}
        for (i = 0;; i = zziH.length)
        {
          localObject = new String[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziH, 0, localObject, 0, i);
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
        zziH = ((String[])localObject);
        break;
      case 18: 
        j = zzsx.zzc(paramzzsm, 18);
        if (zziI == null) {}
        for (i = 0;; i = zziI.length)
        {
          localObject = new zzag.zza[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziI, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzag.zza();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzag.zza();
        paramzzsm.zza(localObject[j]);
        zziI = ((zzag.zza[])localObject);
        break;
      case 26: 
        j = zzsx.zzc(paramzzsm, 26);
        if (zziJ == null) {}
        for (i = 0;; i = zziJ.length)
        {
          localObject = new zzaf.zze[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziJ, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzaf.zze();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzaf.zze();
        paramzzsm.zza(localObject[j]);
        zziJ = ((zzaf.zze[])localObject);
        break;
      case 34: 
        j = zzsx.zzc(paramzzsm, 34);
        if (zziK == null) {}
        for (i = 0;; i = zziK.length)
        {
          localObject = new zzaf.zzb[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziK, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzaf.zzb();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzaf.zzb();
        paramzzsm.zza(localObject[j]);
        zziK = ((zzaf.zzb[])localObject);
        break;
      case 42: 
        j = zzsx.zzc(paramzzsm, 42);
        if (zziL == null) {}
        for (i = 0;; i = zziL.length)
        {
          localObject = new zzaf.zzb[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziL, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzaf.zzb();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzaf.zzb();
        paramzzsm.zza(localObject[j]);
        zziL = ((zzaf.zzb[])localObject);
        break;
      case 50: 
        j = zzsx.zzc(paramzzsm, 50);
        if (zziM == null) {}
        for (i = 0;; i = zziM.length)
        {
          localObject = new zzaf.zzb[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziM, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzaf.zzb();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzaf.zzb();
        paramzzsm.zza(localObject[j]);
        zziM = ((zzaf.zzb[])localObject);
        break;
      case 58: 
        j = zzsx.zzc(paramzzsm, 58);
        if (zziN == null) {}
        for (i = 0;; i = zziN.length)
        {
          localObject = new zzaf.zzg[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziN, 0, localObject, 0, i);
            j = i;
          }
          while (j < localObject.length - 1)
          {
            localObject[j] = new zzaf.zzg();
            paramzzsm.zza(localObject[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        localObject[j] = new zzaf.zzg();
        paramzzsm.zza(localObject[j]);
        zziN = ((zzaf.zzg[])localObject);
        break;
      case 74: 
        zziO = paramzzsm.readString();
        break;
      case 82: 
        zziP = paramzzsm.readString();
        break;
      case 98: 
        zziQ = paramzzsm.readString();
        break;
      case 106: 
        version = paramzzsm.readString();
        break;
      case 114: 
        if (zziR == null) {
          zziR = new zzaf.zza();
        }
        paramzzsm.zza(zziR);
        break;
      case 125: 
        zziS = paramzzsm.readFloat();
        break;
      case 130: 
        j = zzsx.zzc(paramzzsm, 130);
        if (zziU == null) {}
        for (i = 0;; i = zziU.length)
        {
          localObject = new String[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziU, 0, localObject, 0, i);
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
        zziU = ((String[])localObject);
        break;
      case 136: 
        zziV = paramzzsm.zzJb();
        break;
      case 144: 
        zziT = paramzzsm.zzJc();
        break;
      case 154: 
        j = zzsx.zzc(paramzzsm, 154);
        if (zziG == null) {}
        for (i = 0;; i = zziG.length)
        {
          localObject = new String[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zziG, 0, localObject, 0, i);
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
        zziG = ((String[])localObject);
      }
    }
  }
  
  protected final int zzz()
  {
    int i2 = 0;
    int i1 = super.zzz();
    int i;
    int k;
    Object localObject;
    int n;
    int m;
    if ((zziH != null) && (zziH.length > 0))
    {
      i = 0;
      j = 0;
      for (k = 0; i < zziH.length; k = m)
      {
        localObject = zziH[i];
        n = j;
        m = k;
        if (localObject != null)
        {
          m = k + 1;
          n = j + zzsn.zzgO((String)localObject);
        }
        i += 1;
        j = n;
      }
    }
    for (int j = i1 + j + k * 1;; j = i1)
    {
      i = j;
      if (zziI != null)
      {
        i = j;
        if (zziI.length > 0)
        {
          i = j;
          j = 0;
          while (j < zziI.length)
          {
            localObject = zziI[j];
            k = i;
            if (localObject != null) {
              k = i + zzsn.zzc(2, (zzsu)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (zziJ != null)
      {
        j = i;
        if (zziJ.length > 0)
        {
          j = 0;
          while (j < zziJ.length)
          {
            localObject = zziJ[j];
            k = i;
            if (localObject != null) {
              k = i + zzsn.zzc(3, (zzsu)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (zziK != null)
      {
        i = j;
        if (zziK.length > 0)
        {
          i = j;
          j = 0;
          while (j < zziK.length)
          {
            localObject = zziK[j];
            k = i;
            if (localObject != null) {
              k = i + zzsn.zzc(4, (zzsu)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (zziL != null)
      {
        j = i;
        if (zziL.length > 0)
        {
          j = 0;
          while (j < zziL.length)
          {
            localObject = zziL[j];
            k = i;
            if (localObject != null) {
              k = i + zzsn.zzc(5, (zzsu)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (zziM != null)
      {
        i = j;
        if (zziM.length > 0)
        {
          i = j;
          j = 0;
          while (j < zziM.length)
          {
            localObject = zziM[j];
            k = i;
            if (localObject != null) {
              k = i + zzsn.zzc(6, (zzsu)localObject);
            }
            j += 1;
            i = k;
          }
        }
      }
      j = i;
      if (zziN != null)
      {
        j = i;
        if (zziN.length > 0)
        {
          j = 0;
          while (j < zziN.length)
          {
            localObject = zziN[j];
            k = i;
            if (localObject != null) {
              k = i + zzsn.zzc(7, (zzsu)localObject);
            }
            j += 1;
            i = k;
          }
          j = i;
        }
      }
      i = j;
      if (!zziO.equals("")) {
        i = j + zzsn.zzo(9, zziO);
      }
      j = i;
      if (!zziP.equals("")) {
        j = i + zzsn.zzo(10, zziP);
      }
      i = j;
      if (!zziQ.equals("0")) {
        i = j + zzsn.zzo(12, zziQ);
      }
      j = i;
      if (!version.equals("")) {
        j = i + zzsn.zzo(13, version);
      }
      k = j;
      if (zziR != null) {
        k = j + zzsn.zzc(14, zziR);
      }
      i = k;
      if (Float.floatToIntBits(zziS) != Float.floatToIntBits(0.0F)) {
        i = k + zzsn.zzc(15, zziS);
      }
      j = i;
      if (zziU != null)
      {
        j = i;
        if (zziU.length > 0)
        {
          j = 0;
          k = 0;
          for (m = 0; j < zziU.length; m = n)
          {
            localObject = zziU[j];
            i1 = k;
            n = m;
            if (localObject != null)
            {
              n = m + 1;
              i1 = k + zzsn.zzgO((String)localObject);
            }
            j += 1;
            k = i1;
          }
          j = i + k + m * 2;
        }
      }
      k = j;
      if (zziV != 0) {
        k = j + zzsn.zzC(17, zziV);
      }
      i = k;
      if (zziT) {
        i = k + zzsn.zzf(18, zziT);
      }
      j = i;
      if (zziG != null)
      {
        j = i;
        if (zziG.length > 0)
        {
          k = 0;
          m = 0;
          j = i2;
          while (j < zziG.length)
          {
            localObject = zziG[j];
            i1 = k;
            n = m;
            if (localObject != null)
            {
              n = m + 1;
              i1 = k + zzsn.zzgO((String)localObject);
            }
            j += 1;
            k = i1;
            m = n;
          }
          j = i + k + m * 2;
        }
      }
      return j;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaf.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */