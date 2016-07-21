package com.google.android.gms.internal;

public final class zzsy$zzb
  extends zzsu
{
  private static volatile zzb[] zzbuF;
  public String name;
  public Integer zzbuG;
  public Boolean zzbuH;
  
  public zzsy$zzb()
  {
    zzJB();
  }
  
  public static zzb[] zzJA()
  {
    if (zzbuF == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzbuF == null) {
        zzbuF = new zzb[0];
      }
      return zzbuF;
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
        if (zzbuG == null)
        {
          if (zzbuG != null) {
            return false;
          }
        }
        else if (!zzbuG.equals(zzbuG)) {
          return false;
        }
        if (zzbuH != null) {
          break;
        }
      } while (zzbuH == null);
      return false;
    } while (zzbuH.equals(zzbuH));
    return false;
  }
  
  public final int hashCode()
  {
    int k = 0;
    int m = getClass().getName().hashCode();
    int i;
    int j;
    if (name == null)
    {
      i = 0;
      if (zzbuG != null) {
        break label72;
      }
      j = 0;
      label32:
      if (zzbuH != null) {
        break label83;
      }
    }
    for (;;)
    {
      return (j + (i + (m + 527) * 31) * 31) * 31 + k;
      i = name.hashCode();
      break;
      label72:
      j = zzbuG.intValue();
      break label32;
      label83:
      k = zzbuH.hashCode();
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (name != null) {
      paramzzsn.zzn(1, name);
    }
    if (zzbuG != null) {
      paramzzsn.zzA(3, zzbuG.intValue());
    }
    if (zzbuH != null) {
      paramzzsn.zze(4, zzbuH.booleanValue());
    }
    super.writeTo(paramzzsn);
  }
  
  public final zzb zzJB()
  {
    name = null;
    zzbuG = null;
    zzbuH = null;
    zzbuu = -1;
    return this;
  }
  
  public final zzb zzR(zzsm paramzzsm)
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
      case 24: 
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
          zzbuG = Integer.valueOf(i);
        }
        break;
      case 32: 
        zzbuH = Boolean.valueOf(paramzzsm.zzJc());
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
    if (zzbuG != null) {
      j = i + zzsn.zzC(3, zzbuG.intValue());
    }
    i = j;
    if (zzbuH != null) {
      i = j + zzsn.zzf(4, zzbuH.booleanValue());
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzsy.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */