package com.google.android.gms.internal;

public abstract class zzso
  extends zzsu
{
  protected zzsq zzbuj;
  
  public void writeTo(zzsn paramzzsn)
  {
    if (zzbuj == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < zzbuj.size())
      {
        zzbuj.zzmG(i).writeTo(paramzzsn);
        i += 1;
      }
    }
  }
  
  public zzso zzJp()
  {
    zzso localzzso = (zzso)super.clone();
    zzss.zza(this, localzzso);
    return localzzso;
  }
  
  public final Object zza(zzsp paramzzsp)
  {
    if (zzbuj == null) {}
    zzsr localzzsr;
    do
    {
      return null;
      localzzsr = zzbuj.zzmF(zzsx.zzmJ(tag));
    } while (localzzsr == null);
    return localzzsr.zzb(paramzzsp);
  }
  
  protected final boolean zza(zzsm paramzzsm, int paramInt)
  {
    int i = paramzzsm.getPosition();
    if (!paramzzsm.zzmo(paramInt)) {
      return false;
    }
    int j = zzsx.zzmJ(paramInt);
    zzsw localzzsw = new zzsw(paramInt, paramzzsm.zzz(i, paramzzsm.getPosition() - i));
    paramzzsm = null;
    if (zzbuj == null) {
      zzbuj = new zzsq();
    }
    for (;;)
    {
      Object localObject = paramzzsm;
      if (paramzzsm == null)
      {
        localObject = new zzsr();
        zzbuj.zza(j, (zzsr)localObject);
      }
      ((zzsr)localObject).zza(localzzsw);
      return true;
      paramzzsm = zzbuj.zzmF(j);
    }
  }
  
  protected int zzz()
  {
    int j = 0;
    if (zzbuj != null)
    {
      int i = 0;
      for (;;)
      {
        k = i;
        if (j >= zzbuj.size()) {
          break;
        }
        i += zzbuj.zzmG(j).zzz();
        j += 1;
      }
    }
    int k = 0;
    return k;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzso
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */