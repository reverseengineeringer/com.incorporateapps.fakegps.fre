package com.google.android.gms.internal;

public final class zzpm$zzb
  extends zzso
{
  private static volatile zzb[] zzaMs;
  public String name;
  public zzpm.zzd zzaMt;
  
  public zzpm$zzb()
  {
    zzyt();
  }
  
  public static zzb[] zzys()
  {
    if (zzaMs == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzaMs == null) {
        zzaMs = new zzb[0];
      }
      return zzaMs;
    }
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
      if (name == null)
      {
        if (name != null) {
          return false;
        }
      }
      else if (!name.equals(name)) {
        return false;
      }
      if (zzaMt == null)
      {
        if (zzaMt != null) {
          return false;
        }
      }
      else if (!zzaMt.equals(zzaMt)) {
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
      if (zzaMt != null) {
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
      j = zzaMt.hashCode();
      break label33;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (!name.equals("")) {
      paramzzsn.zzn(1, name);
    }
    if (zzaMt != null) {
      paramzzsn.zza(2, zzaMt);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzb zzq(zzsm paramzzsm)
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
        if (zzaMt == null) {
          zzaMt = new zzpm.zzd();
        }
        paramzzsm.zza(zzaMt);
      }
    }
  }
  
  public final zzb zzyt()
  {
    name = "";
    zzaMt = null;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (!name.equals("")) {
      i = j + zzsn.zzo(1, name);
    }
    j = i;
    if (zzaMt != null) {
      j = i + zzsn.zzc(2, zzaMt);
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpm.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */