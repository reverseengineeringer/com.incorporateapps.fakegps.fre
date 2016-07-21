package com.google.ads.a.a;

import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzss;
import com.google.android.gms.internal.zzsu;

public final class e
  extends zzsu
{
  private static volatile e[] c;
  public Long a = null;
  public Long b = null;
  
  public e()
  {
    zzbuu = -1;
  }
  
  public static e[] a()
  {
    if (c == null) {}
    synchronized (zzss.zzbut)
    {
      if (c == null) {
        c = new e[0];
      }
      return c;
    }
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (a != null) {
      paramzzsn.zzb(1, a.longValue());
    }
    if (b != null) {
      paramzzsn.zzb(2, b.longValue());
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
      j = i + zzsn.zzd(2, b.longValue());
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.a.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */