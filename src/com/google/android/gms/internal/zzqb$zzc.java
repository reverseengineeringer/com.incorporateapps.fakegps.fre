package com.google.android.gms.internal;

public final class zzqb$zzc
  extends zzsu
{
  private static volatile zzc[] zzbah;
  public String name;
  public Float zzaZo;
  public String zzamJ;
  public Long zzbai;
  
  public zzqb$zzc()
  {
    zzDU();
  }
  
  public static zzc[] zzDT()
  {
    if (zzbah == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzbah == null) {
        zzbah = new zzc[0];
      }
      return zzbah;
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
        if (name == null)
        {
          if (name != null) {
            return false;
          }
        }
        else if (!name.equals(name)) {
          return false;
        }
        if (zzamJ == null)
        {
          if (zzamJ != null) {
            return false;
          }
        }
        else if (!zzamJ.equals(zzamJ)) {
          return false;
        }
        if (zzbai == null)
        {
          if (zzbai != null) {
            return false;
          }
        }
        else if (!zzbai.equals(zzbai)) {
          return false;
        }
        if (zzaZo != null) {
          break;
        }
      } while (zzaZo == null);
      return false;
    } while (zzaZo.equals(zzaZo));
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
    if (name == null)
    {
      i = 0;
      if (zzamJ != null) {
        break label88;
      }
      j = 0;
      if (zzbai != null) {
        break label99;
      }
      k = 0;
      label42:
      if (zzaZo != null) {
        break label110;
      }
    }
    for (;;)
    {
      return (k + (j + (i + (n + 527) * 31) * 31) * 31) * 31 + m;
      i = name.hashCode();
      break;
      label88:
      j = zzamJ.hashCode();
      break label33;
      label99:
      k = zzbai.hashCode();
      break label42;
      label110:
      m = zzaZo.hashCode();
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (name != null) {
      paramzzsn.zzn(1, name);
    }
    if (zzamJ != null) {
      paramzzsn.zzn(2, zzamJ);
    }
    if (zzbai != null) {
      paramzzsn.zzb(3, zzbai.longValue());
    }
    if (zzaZo != null) {
      paramzzsn.zzb(4, zzaZo.floatValue());
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzc zzDU()
  {
    name = null;
    zzamJ = null;
    zzbai = null;
    zzaZo = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzc zzE(zzsm paramzzsm)
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
        name = paramzzsm.readString();
        break;
      case 18: 
        zzamJ = paramzzsm.readString();
        break;
      case 24: 
        zzbai = Long.valueOf(paramzzsm.zzJa());
        break;
      case 37: 
        zzaZo = Float.valueOf(paramzzsm.readFloat());
      }
    }
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (name != null) {
      i = j + zzsn.zzo(1, name);
    }
    j = i;
    if (zzamJ != null) {
      j = i + zzsn.zzo(2, zzamJ);
    }
    i = j;
    if (zzbai != null) {
      i = j + zzsn.zzd(3, zzbai.longValue());
    }
    j = i;
    if (zzaZo != null) {
      j = i + zzsn.zzc(4, zzaZo.floatValue());
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqb.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */