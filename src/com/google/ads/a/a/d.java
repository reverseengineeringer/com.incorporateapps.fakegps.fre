package com.google.ads.a.a;

import com.google.android.gms.internal.zzsn;
import com.google.android.gms.internal.zzsu;

public final class d
  extends zzsu
{
  public Long A = null;
  public String B = null;
  public Long C = null;
  public Long D = null;
  public Long E = null;
  public f F = null;
  public Long G = null;
  public Long H = null;
  public Long I = null;
  public Long J = null;
  public e[] K = e.a();
  public Long L = null;
  public String M = null;
  public Integer N = null;
  public Boolean O = null;
  public String P = null;
  public Long Q = null;
  public g R = null;
  public String a = null;
  public String b = null;
  public Long c = null;
  public Long d = null;
  public Long e = null;
  public Long f = null;
  public Long g = null;
  public Long h = null;
  public Long i = null;
  public Long j = null;
  public Long k = null;
  public Long l = null;
  public String m = null;
  public Long n = null;
  public Long o = null;
  public Long p = null;
  public Long q = null;
  public Long r = null;
  public Long s = null;
  public Long t = null;
  public Long u = null;
  public Long v = null;
  public String w = null;
  public String x = null;
  public Long y = null;
  public Long z = null;
  
  public d()
  {
    zzbuu = -1;
  }
  
  public final void writeTo(zzsn paramzzsn)
  {
    if (a != null) {
      paramzzsn.zzn(1, a);
    }
    if (b != null) {
      paramzzsn.zzn(2, b);
    }
    if (c != null) {
      paramzzsn.zzb(3, c.longValue());
    }
    if (d != null) {
      paramzzsn.zzb(4, d.longValue());
    }
    if (e != null) {
      paramzzsn.zzb(5, e.longValue());
    }
    if (f != null) {
      paramzzsn.zzb(6, f.longValue());
    }
    if (g != null) {
      paramzzsn.zzb(7, g.longValue());
    }
    if (h != null) {
      paramzzsn.zzb(8, h.longValue());
    }
    if (i != null) {
      paramzzsn.zzb(9, i.longValue());
    }
    if (j != null) {
      paramzzsn.zzb(10, j.longValue());
    }
    if (k != null) {
      paramzzsn.zzb(11, k.longValue());
    }
    if (l != null) {
      paramzzsn.zzb(12, l.longValue());
    }
    if (m != null) {
      paramzzsn.zzn(13, m);
    }
    if (n != null) {
      paramzzsn.zzb(14, n.longValue());
    }
    if (o != null) {
      paramzzsn.zzb(15, o.longValue());
    }
    if (p != null) {
      paramzzsn.zzb(16, p.longValue());
    }
    if (q != null) {
      paramzzsn.zzb(17, q.longValue());
    }
    if (r != null) {
      paramzzsn.zzb(18, r.longValue());
    }
    if (s != null) {
      paramzzsn.zzb(19, s.longValue());
    }
    if (t != null) {
      paramzzsn.zzb(20, t.longValue());
    }
    if (L != null) {
      paramzzsn.zzb(21, L.longValue());
    }
    if (u != null) {
      paramzzsn.zzb(22, u.longValue());
    }
    if (v != null) {
      paramzzsn.zzb(23, v.longValue());
    }
    if (M != null) {
      paramzzsn.zzn(24, M);
    }
    if (Q != null) {
      paramzzsn.zzb(25, Q.longValue());
    }
    if (N != null) {
      paramzzsn.zzA(26, N.intValue());
    }
    if (w != null) {
      paramzzsn.zzn(27, w);
    }
    if (O != null) {
      paramzzsn.zze(28, O.booleanValue());
    }
    if (x != null) {
      paramzzsn.zzn(29, x);
    }
    if (P != null) {
      paramzzsn.zzn(30, P);
    }
    if (y != null) {
      paramzzsn.zzb(31, y.longValue());
    }
    if (z != null) {
      paramzzsn.zzb(32, z.longValue());
    }
    if (A != null) {
      paramzzsn.zzb(33, A.longValue());
    }
    if (B != null) {
      paramzzsn.zzn(34, B);
    }
    if (C != null) {
      paramzzsn.zzb(35, C.longValue());
    }
    if (D != null) {
      paramzzsn.zzb(36, D.longValue());
    }
    if (E != null) {
      paramzzsn.zzb(37, E.longValue());
    }
    if (F != null) {
      paramzzsn.zza(38, F);
    }
    if (G != null) {
      paramzzsn.zzb(39, G.longValue());
    }
    if (H != null) {
      paramzzsn.zzb(40, H.longValue());
    }
    if (I != null) {
      paramzzsn.zzb(41, I.longValue());
    }
    if (J != null) {
      paramzzsn.zzb(42, J.longValue());
    }
    if ((K != null) && (K.length > 0))
    {
      int i1 = 0;
      while (i1 < K.length)
      {
        e locale = K[i1];
        if (locale != null) {
          paramzzsn.zza(43, locale);
        }
        i1 += 1;
      }
    }
    if (R != null) {
      paramzzsn.zza(201, R);
    }
    super.writeTo(paramzzsn);
  }
  
  protected final int zzz()
  {
    int i2 = super.zzz();
    int i1 = i2;
    if (a != null) {
      i1 = i2 + zzsn.zzo(1, a);
    }
    i2 = i1;
    if (b != null) {
      i2 = i1 + zzsn.zzo(2, b);
    }
    i1 = i2;
    if (c != null) {
      i1 = i2 + zzsn.zzd(3, c.longValue());
    }
    i2 = i1;
    if (d != null) {
      i2 = i1 + zzsn.zzd(4, d.longValue());
    }
    i1 = i2;
    if (e != null) {
      i1 = i2 + zzsn.zzd(5, e.longValue());
    }
    i2 = i1;
    if (f != null) {
      i2 = i1 + zzsn.zzd(6, f.longValue());
    }
    i1 = i2;
    if (g != null) {
      i1 = i2 + zzsn.zzd(7, g.longValue());
    }
    i2 = i1;
    if (h != null) {
      i2 = i1 + zzsn.zzd(8, h.longValue());
    }
    i1 = i2;
    if (i != null) {
      i1 = i2 + zzsn.zzd(9, i.longValue());
    }
    i2 = i1;
    if (j != null) {
      i2 = i1 + zzsn.zzd(10, j.longValue());
    }
    i1 = i2;
    if (k != null) {
      i1 = i2 + zzsn.zzd(11, k.longValue());
    }
    i2 = i1;
    if (l != null) {
      i2 = i1 + zzsn.zzd(12, l.longValue());
    }
    i1 = i2;
    if (m != null) {
      i1 = i2 + zzsn.zzo(13, m);
    }
    i2 = i1;
    if (n != null) {
      i2 = i1 + zzsn.zzd(14, n.longValue());
    }
    i1 = i2;
    if (o != null) {
      i1 = i2 + zzsn.zzd(15, o.longValue());
    }
    i2 = i1;
    if (p != null) {
      i2 = i1 + zzsn.zzd(16, p.longValue());
    }
    i1 = i2;
    if (q != null) {
      i1 = i2 + zzsn.zzd(17, q.longValue());
    }
    i2 = i1;
    if (r != null) {
      i2 = i1 + zzsn.zzd(18, r.longValue());
    }
    i1 = i2;
    if (s != null) {
      i1 = i2 + zzsn.zzd(19, s.longValue());
    }
    i2 = i1;
    if (t != null) {
      i2 = i1 + zzsn.zzd(20, t.longValue());
    }
    i1 = i2;
    if (L != null) {
      i1 = i2 + zzsn.zzd(21, L.longValue());
    }
    i2 = i1;
    if (u != null) {
      i2 = i1 + zzsn.zzd(22, u.longValue());
    }
    i1 = i2;
    if (v != null) {
      i1 = i2 + zzsn.zzd(23, v.longValue());
    }
    i2 = i1;
    if (M != null) {
      i2 = i1 + zzsn.zzo(24, M);
    }
    i1 = i2;
    if (Q != null) {
      i1 = i2 + zzsn.zzd(25, Q.longValue());
    }
    i2 = i1;
    if (N != null) {
      i2 = i1 + zzsn.zzC(26, N.intValue());
    }
    i1 = i2;
    if (w != null) {
      i1 = i2 + zzsn.zzo(27, w);
    }
    i2 = i1;
    if (O != null) {
      i2 = i1 + zzsn.zzf(28, O.booleanValue());
    }
    i1 = i2;
    if (x != null) {
      i1 = i2 + zzsn.zzo(29, x);
    }
    i2 = i1;
    if (P != null) {
      i2 = i1 + zzsn.zzo(30, P);
    }
    i1 = i2;
    if (y != null) {
      i1 = i2 + zzsn.zzd(31, y.longValue());
    }
    i2 = i1;
    if (z != null) {
      i2 = i1 + zzsn.zzd(32, z.longValue());
    }
    i1 = i2;
    if (A != null) {
      i1 = i2 + zzsn.zzd(33, A.longValue());
    }
    i2 = i1;
    if (B != null) {
      i2 = i1 + zzsn.zzo(34, B);
    }
    i1 = i2;
    if (C != null) {
      i1 = i2 + zzsn.zzd(35, C.longValue());
    }
    i2 = i1;
    if (D != null) {
      i2 = i1 + zzsn.zzd(36, D.longValue());
    }
    i1 = i2;
    if (E != null) {
      i1 = i2 + zzsn.zzd(37, E.longValue());
    }
    i2 = i1;
    if (F != null) {
      i2 = i1 + zzsn.zzc(38, F);
    }
    i1 = i2;
    if (G != null) {
      i1 = i2 + zzsn.zzd(39, G.longValue());
    }
    i2 = i1;
    if (H != null) {
      i2 = i1 + zzsn.zzd(40, H.longValue());
    }
    int i3 = i2;
    if (I != null) {
      i3 = i2 + zzsn.zzd(41, I.longValue());
    }
    i1 = i3;
    if (J != null) {
      i1 = i3 + zzsn.zzd(42, J.longValue());
    }
    i2 = i1;
    if (K != null)
    {
      i2 = i1;
      if (K.length > 0)
      {
        i2 = 0;
        while (i2 < K.length)
        {
          e locale = K[i2];
          i3 = i1;
          if (locale != null) {
            i3 = i1 + zzsn.zzc(43, locale);
          }
          i2 += 1;
          i1 = i3;
        }
        i2 = i1;
      }
    }
    i1 = i2;
    if (R != null) {
      i1 = i2 + zzsn.zzc(201, R);
    }
    return i1;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.a.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */