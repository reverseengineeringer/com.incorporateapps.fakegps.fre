package com.google.ads.a.a;

import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzsu;

public final class f
  extends zzsu
{
  public Long a = null;
  public Integer b = null;
  public Boolean c = null;
  public Integer d = null;
  
  public f()
  {
    zzbuu = -1;
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (a != null) {
      paramzzsn.zzb(1, a.longValue());
    }
    if (b != null) {
      paramzzsn.zzA(2, b.intValue());
    }
    if (c != null) {
      paramzzsn.zze(3, c.booleanValue());
    }
    if (d != null) {
      paramzzsn.zzA(4, d.intValue());
    }
    super.writeTo(paramzzsn);
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (a != null) {
      i = j + zzsn.zzd(1, a.longValue());
    }
    j = i;
    if (b != null) {
      j = i + zzsn.zzC(2, b.intValue());
    }
    i = j;
    if (c != null) {
      i = j + zzsn.zzf(3, c.booleanValue());
    }
    j = i;
    if (d != null) {
      j = i + zzsn.zzC(4, d.intValue());
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.a.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */