package com.google.android.gms.internal;

public final class zzpm$zza$zza
  extends zzso
{
  private static volatile zza[] zzaMp;
  public int viewId;
  public String zzaMq;
  public String zzaMr;
  
  public zzpm$zza$zza()
  {
    zzyr();
  }
  
  public static zza[] zzyq()
  {
    if (zzaMp == null) {}
    synchronized (zzss.zzbut)
    {
      if (zzaMp == null) {
        zzaMp = new zza[0];
      }
      return zzaMp;
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
      if (zzaMq == null)
      {
        if (zzaMq != null) {
          return false;
        }
      }
      else if (!zzaMq.equals(zzaMq)) {
        return false;
      }
      if (zzaMr == null)
      {
        if (zzaMr != null) {
          return false;
        }
      }
      else if (!zzaMr.equals(zzaMr)) {
        return false;
      }
      if (viewId != viewId) {
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
    label33:
    int i1;
    if (zzaMq == null)
    {
      i = 0;
      if (zzaMr != null) {
        break label101;
      }
      j = 0;
      i1 = viewId;
      k = m;
      if (zzbuj != null) {
        if (!zzbuj.isEmpty()) {
          break label112;
        }
      }
    }
    label101:
    label112:
    for (int k = m;; k = zzbuj.hashCode())
    {
      return ((j + (i + (n + 527) * 31) * 31) * 31 + i1) * 31 + k;
      i = zzaMq.hashCode();
      break;
      j = zzaMr.hashCode();
      break label33;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (!zzaMq.equals("")) {
      paramzzsn.zzn(1, zzaMq);
    }
    if (!zzaMr.equals("")) {
      paramzzsn.zzn(2, zzaMr);
    }
    if (viewId != 0) {
      paramzzsn.zzA(3, viewId);
    }
    super.writeTo(paramzzsn);
  }
  
  public final zza zzp(zzsm paramzzsm)
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
        zzaMq = paramzzsm.readString();
        break;
      case 18: 
        zzaMr = paramzzsm.readString();
        break;
      case 24: 
        viewId = paramzzsm.zzJb();
      }
    }
  }
  
  public final zza zzyr()
  {
    zzaMq = "";
    zzaMr = "";
    viewId = 0;
    zzbuj = null;
    zzbuu = -1;
    return this;
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (!zzaMq.equals("")) {
      i = j + zzsn.zzo(1, zzaMq);
    }
    j = i;
    if (!zzaMr.equals("")) {
      j = i + zzsn.zzo(2, zzaMr);
    }
    i = j;
    if (viewId != 0) {
      i = j + zzsn.zzC(3, viewId);
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpm.zza.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */