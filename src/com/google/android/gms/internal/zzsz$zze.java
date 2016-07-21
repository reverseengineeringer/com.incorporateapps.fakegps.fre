package com.google.android.gms.internal;

public final class zzsz$zze
  extends zzso
{
  private static volatile zze[] zzbvj;
  public String key;
  public String value;
  
  public zzsz$zze()
  {
    zzJH();
  }
  
  public static zze[] zzJG()
  {
    if (zzbvj == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzbvj == null) {
        zzbvj = new zze[0];
      }
      return zzbvj;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof zze)) {
        return false;
      }
      paramObject = (zze)paramObject;
      if (key == null)
      {
        if (key != null) {
          return false;
        }
      }
      else if (!key.equals(key)) {
        return false;
      }
      if (value == null)
      {
        if (value != null) {
          return false;
        }
      }
      else if (!value.equals(value)) {
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
    if (key == null)
    {
      i = 0;
      if (value != null) {
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
      i = key.hashCode();
      break;
      j = value.hashCode();
      break label33;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (!key.equals("")) {
      paramzzsn.zzn(1, key);
    }
    if (!value.equals("")) {
      paramzzsn.zzn(2, value);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zze zzJH()
  {
    key = "";
    value = "";
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  public final zze zzW(zzsm paramzzsm)
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
        key = paramzzsm.readString();
        break;
      case 18: 
        value = paramzzsm.readString();
      }
    }
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (!key.equals("")) {
      i = j + zzsn.zzo(1, key);
    }
    j = i;
    if (!value.equals("")) {
      j = i + zzsn.zzo(2, value);
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsz.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */