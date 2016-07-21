package com.google.android.gms.internal;

public final class zzqa$zza
  extends zzsu
{
  private static volatile zza[] zzaZR;
  public String name;
  public Boolean zzaZS;
  
  public zzqa$zza()
  {
    zzDL();
  }
  
  public static zza[] zzDK()
  {
    if (zzaZR == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzaZR == null) {
        zzaZR = new zza[0];
      }
      return zzaZR;
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
        if (zzaZS != null) {
          break;
        }
      } while (zzaZS == null);
      return false;
    } while (zzaZS.equals(zzaZS));
    return false;
  }
  
  public final int hashCode()
  {
    int j = 0;
    int k = getClass().getName().hashCode();
    int i;
    if (name == null)
    {
      i = 0;
      if (zzaZS != null) {
        break label56;
      }
    }
    for (;;)
    {
      return (i + (k + 527) * 31) * 31 + j;
      i = name.hashCode();
      break;
      label56:
      j = zzaZS.hashCode();
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (name != null) {
      paramzzsn.zzn(1, name);
    }
    if (zzaZS != null) {
      paramzzsn.zze(2, zzaZS.booleanValue());
    }
    super.writeTo(paramzzsn);
  }
  
  public final zza zzDL()
  {
    name = null;
    zzaZS = null;
    zzbuu = -1;
    return this;
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (name != null) {
      i = j + zzsn.zzo(1, name);
    }
    j = i;
    if (zzaZS != null) {
      j = i + zzsn.zzf(2, zzaZS.booleanValue());
    }
    return j;
  }
  
  public final zza zzz(zzsm paramzzsm)
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
      case 16: 
        zzaZS = Boolean.valueOf(paramzzsm.zzJc());
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqa.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */