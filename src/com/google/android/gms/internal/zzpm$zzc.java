package com.google.android.gms.internal;

public final class zzpm$zzc
  extends zzso
{
  public String type;
  public zzpm.zzb[] zzaMu;
  
  public zzpm$zzc()
  {
    zzyu();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zzc)) {
        return false;
      }
      paramObject = (zzc)paramObject;
      if (type == null)
      {
        if (type != null) {
          return false;
        }
      }
      else if (!type.equals(type)) {
        return false;
      }
      if (!zzss.equals(zzaMu, zzaMu)) {
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
    int i;
    int n;
    if (type == null)
    {
      i = 0;
      n = zzss.hashCode(zzaMu);
      j = k;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label87;
        }
      }
    }
    label87:
    for (int j = k;; j = zzbuj.hashCode())
    {
      return ((i + (m + 527) * 31) * 31 + n) * 31 + j;
      i = type.hashCode();
      break;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (!type.equals("")) {
      paramzzsn.zzn(1, type);
    }
    if ((zzaMu != null) && (zzaMu.length > 0))
    {
      int i = 0;
      while (i < zzaMu.length)
      {
        zzpm.zzb localzzb = zzaMu[i];
        if (localzzb != null) {
          paramzzsn.zza(2, localzzb);
        }
        i += 1;
      }
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzc zzr(zzsm paramzzsm)
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
      case 10: 
        type = paramzzsm.readString();
        break;
      case 18: 
        int j = zzsx.zzc(paramzzsm, 18);
        if (zzaMu == null) {}
        zzpm.zzb[] arrayOfzzb;
        for (i = 0;; i = zzaMu.length)
        {
          arrayOfzzb = new zzpm.zzb[j + i];
          j = i;
          if (i != 0)
          {
            System.arraycopy(zzaMu, 0, arrayOfzzb, 0, i);
            j = i;
          }
          while (j < arrayOfzzb.length - 1)
          {
            arrayOfzzb[j] = new zzpm.zzb();
            paramzzsm.zza(arrayOfzzb[j]);
            paramzzsm.zzIX();
            j += 1;
          }
        }
        arrayOfzzb[j] = new zzpm.zzb();
        paramzzsm.zza(arrayOfzzb[j]);
        zzaMu = arrayOfzzb;
      }
    }
  }
  
  public final zzc zzyu()
  {
    type = "";
    zzaMu = zzpm.zzb.zzys();
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (!type.equals("")) {
      i = j + zzsn.zzo(1, type);
    }
    j = i;
    if (zzaMu != null)
    {
      j = i;
      if (zzaMu.length > 0)
      {
        j = 0;
        while (j < zzaMu.length)
        {
          zzpm.zzb localzzb = zzaMu[j];
          int k = i;
          if (localzzb != null) {
            k = i + zzsn.zzc(2, localzzb);
          }
          j += 1;
          i = k;
        }
        j = i;
      }
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpm.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */