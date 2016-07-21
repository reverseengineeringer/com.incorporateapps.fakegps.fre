package com.google.android.gms.internal;

public final class zzpz$zzc
  extends zzsu
{
  private static volatile zzc[] zzaZA;
  public zzpz.zzf zzaZB;
  public zzpz.zzd zzaZC;
  public Boolean zzaZD;
  public String zzaZE;
  
  public zzpz$zzc()
  {
    zzDF();
  }
  
  public static zzc[] zzDE()
  {
    if (zzaZA == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzaZA == null) {
        zzaZA = new zzc[0];
      }
      return zzaZA;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      do
      {
        return true;
        if (!(paramObject instanceof zzc)) {
          return false;
        }
        paramObject = (zzc)paramObject;
        if (zzaZB == null)
        {
          if (zzaZB != null) {
            return false;
          }
        }
        else if (!zzaZB.equals(zzaZB)) {
          return false;
        }
        if (zzaZC == null)
        {
          if (zzaZC != null) {
            return false;
          }
        }
        else if (!zzaZC.equals(zzaZC)) {
          return false;
        }
        if (zzaZD == null)
        {
          if (zzaZD != null) {
            return false;
          }
        }
        else if (!zzaZD.equals(zzaZD)) {
          return false;
        }
        if (zzaZE != null) {
          break;
        }
      } while (zzaZE == null);
      return false;
    } while (zzaZE.equals(zzaZE));
    return false;
  }
  
  public final int hashCode()
  {
    int m = 0;
    int n = getClass().getName().hashCode();
    int i;
    int j;
    label33:
    int k;
    if (zzaZB == null)
    {
      i = 0;
      if (zzaZC != null) {
        break label88;
      }
      j = 0;
      if (zzaZD != null) {
        break label99;
      }
      k = 0;
      label42:
      if (zzaZE != null) {
        break label110;
      }
    }
    for (;;)
    {
      return (k + (j + (i + (n + 527) * 31) * 31) * 31) * 31 + m;
      i = zzaZB.hashCode();
      break;
      label88:
      j = zzaZC.hashCode();
      break label33;
      label99:
      k = zzaZD.hashCode();
      break label42;
      label110:
      m = zzaZE.hashCode();
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (zzaZB != null) {
      paramzzsn.zza(1, zzaZB);
    }
    if (zzaZC != null) {
      paramzzsn.zza(2, zzaZC);
    }
    if (zzaZD != null) {
      paramzzsn.zze(3, zzaZD.booleanValue());
    }
    if (zzaZE != null) {
      paramzzsn.zzn(4, zzaZE);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzc zzDF()
  {
    zzaZB = null;
    zzaZC = null;
    zzaZD = null;
    zzaZE = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzc zzv(zzsm paramzzsm)
  {
    for (;;)
    {
      int i = paramzzsm.zzIX();
      switch (i)
      {
      default: 
        if (zzsx.zzb(paramzzsm, i)) {}
        break;
      case 0: 
        return this;
      case 10: 
        if (zzaZB == null) {
          zzaZB = new zzpz.zzf();
        }
        paramzzsm.zza(zzaZB);
        break;
      case 18: 
        if (zzaZC == null) {
          zzaZC = new zzpz.zzd();
        }
        paramzzsm.zza(zzaZC);
        break;
      case 24: 
        zzaZD = Boolean.valueOf(paramzzsm.zzJc());
        break;
      case 34: 
        zzaZE = paramzzsm.readString();
      }
    }
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (zzaZB != null) {
      i = j + zzsn.zzc(1, zzaZB);
    }
    j = i;
    if (zzaZC != null) {
      j = i + zzsn.zzc(2, zzaZC);
    }
    i = j;
    if (zzaZD != null) {
      i = j + zzsn.zzf(3, zzaZD.booleanValue());
    }
    j = i;
    if (zzaZE != null) {
      j = i + zzsn.zzo(4, zzaZE);
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpz.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */