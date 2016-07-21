package com.google.android.gms.internal;

public final class zzsj$zza$zza
  extends zzso
{
  private static volatile zza[] zzbtD;
  public int type;
  public zzsj.zza.zza.zza zzbtE;
  
  public zzsj$zza$zza()
  {
    zzIU();
  }
  
  public static zza[] zzIT()
  {
    if (zzbtD == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzbtD == null) {
        zzbtD = new zza[0];
      }
      return zzbtD;
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
      if (zzbtE == null)
      {
        if (zzbtE != null) {
          return false;
        }
      }
      else if (!zzbtE.equals(zzbtE)) {
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
    int n = type;
    int i;
    if (zzbtE == null)
    {
      i = 0;
      j = k;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label84;
        }
      }
    }
    label84:
    for (int j = k;; j = zzbuj.hashCode())
    {
      return (i + ((m + 527) * 31 + n) * 31) * 31 + j;
      i = zzbtE.hashCode();
      break;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    paramzzsn.zzA(1, type);
    if (zzbtE != null) {
      paramzzsn.zza(2, zzbtE);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zza zzIU()
  {
    type = 1;
    zzbtE = null;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zza zzM(zzsm paramzzsm)
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
          type = i;
        }
        break;
      case 18: 
        if (zzbtE == null) {
          zzbtE = new zzsj.zza.zza.zza();
        }
        paramzzsm.zza(zzbtE);
      }
    }
  }
  
  protected final int zzz()
  {
    int j = super.zzz() + zzsn.zzC(1, type);
    int i = j;
    if (zzbtE != null) {
      i = j + zzsn.zzc(2, zzbtE);
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsj.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */