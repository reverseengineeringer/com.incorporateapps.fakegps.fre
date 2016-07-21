package com.google.android.gms.internal;

public final class zzsz$zzb
  extends zzso
{
  public String version;
  public int zzbuM;
  public String zzbuN;
  
  public zzsz$zzb()
  {
    zzJD();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzb)) {
        return false;
      }
      paramObject = (zzb)paramObject;
      if (zzbuM != zzbuM) {
        return false;
      }
      if (zzbuN == null)
      {
        if (zzbuN != null) {
          return false;
        }
      }
      else if (!zzbuN.equals(zzbuN)) {
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
    int i1 = zzbuM;
    int i;
    int j;
    if (zzbuN == null)
    {
      i = 0;
      if (version != null) {
        break label101;
      }
      j = 0;
      label39:
      k = m;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label112;
        }
      }
    }
    label101:
    label112:
    for (int k = m;; k = zzbuj.hashCode())
    {
      return (j + (i + ((n + 527) * 31 + i1) * 31) * 31) * 31 + k;
      i = zzbuN.hashCode();
      break;
      j = version.hashCode();
      break label39;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (zzbuM != 0) {
      paramzzsn.zzA(1, zzbuM);
    }
    if (!zzbuN.equals("")) {
      paramzzsn.zzn(2, zzbuN);
    }
    if (!version.equals("")) {
      paramzzsn.zzn(3, version);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzb zzJD()
  {
    zzbuM = 0;
    zzbuN = "";
    version = "";
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzb zzT(zzsm paramzzsm)
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
        i = paramzzsm.zzJb();
        switch (i)
        {
        default: 
          break;
        case 0: 
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
        case 18: 
        case 19: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
        case 24: 
        case 25: 
        case 26: 
          zzbuM = i;
        }
        break;
      case 18: 
        zzbuN = paramzzsm.readString();
        break;
      case 26: 
        version = paramzzsm.readString();
      }
    }
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (zzbuM != 0) {
      i = j + zzsn.zzC(1, zzbuM);
    }
    j = i;
    if (!zzbuN.equals("")) {
      j = i + zzsn.zzo(2, zzbuN);
    }
    i = j;
    if (!version.equals("")) {
      i = j + zzsn.zzo(3, version);
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsz.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */