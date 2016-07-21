package com.google.ads.a.a;

import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzsu;

public final class b
  extends zzsu
{
  public String a = "";
  
  public b()
  {
    zzbuu = -1;
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (!a.equals("")) {
      paramzzsn.zzn(1, a);
    }
    super.writeTo(paramzzsn);
  }
  
  protected final int zzz()
  {
    int j = super.zzz();
    int i = j;
    if (!a.equals("")) {
      i = j + zzsn.zzo(1, a);
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.a.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */