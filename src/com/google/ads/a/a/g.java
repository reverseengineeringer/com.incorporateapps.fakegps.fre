package com.google.ads.a.a;

import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzsu;

public final class g
  extends zzsu
{
  public Long a = null;
  public String b = null;
  public byte[] c = null;
  
  public g()
  {
    zzbuu = -1;
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (a != null) {
      paramzzsn.zzb(1, a.longValue());
    }
    if (b != null) {
      paramzzsn.zzn(3, b);
    }
    if (c != null) {
      paramzzsn.zza(4, c);
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
      j = i + zzsn.zzo(3, b);
    }
    i = j;
    if (c != null) {
      i = j + zzsn.zzb(4, c);
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.a.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */