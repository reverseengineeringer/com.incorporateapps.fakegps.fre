package com.google.android.gms.internal;

public final class zzsj$zza
  extends zzso
{
  private static volatile zza[] zzbtB;
  public String name;
  public zzsj.zza.zza zzbtC;
  
  public zzsj$zza()
  {
    zzIS();
  }
  
  public static zza[] zzIR()
  {
    if (zzbtB == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzbtB == null) {
        zzbtB = new zza[0];
      }
      return zzbtB;
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
      if (name == null)
      {
        if (name != null) {
          return false;
        }
      }
      else if (!name.equals(name)) {
        return false;
      }
      if (zzbtC == null)
      {
        if (zzbtC != null) {
          return false;
        }
      }
      else if (!zzbtC.equals(zzbtC)) {
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
    int i;
    int j;
    if (name == null)
    {
      i = 0;
      if (zzbtC != null) {
        break label89;
      }
      j = 0;
      label33:
      k = m;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label100;
        }
      }
    }
    label89:
    label100:
    for (int k = m;; k = zzbuj.hashCode())
    {
      return (j + (i + (n + 527) * 31) * 31) * 31 + k;
      i = name.hashCode();
      break;
      j = zzbtC.hashCode();
      break label33;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    paramzzsn.zzn(1, name);
    if (zzbtC != null) {
      paramzzsn.zza(2, zzbtC);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zza zzIS()
  {
    name = "";
    zzbtC = null;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zza zzL(zzsm paramzzsm)
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
        name = paramzzsm.readString();
        break;
      case 18: 
        if (zzbtC == null) {
          zzbtC = new zzsj.zza.zza();
        }
        paramzzsm.zza(zzbtC);
      }
    }
  }
  
  protected final int zzz()
  {
    int j = super.zzz() + zzsn.zzo(1, name);
    int i = j;
    if (zzbtC != null) {
      i = j + zzsn.zzc(2, zzbtC);
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsj.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */