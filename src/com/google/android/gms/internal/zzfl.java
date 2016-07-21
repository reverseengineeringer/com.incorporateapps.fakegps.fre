package com.google.android.gms.internal;

import com.google.ads.b;
import com.google.ads.c;
import com.google.ads.d;
import com.google.ads.mediation.h;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.zza;
import java.util.Date;
import java.util.HashSet;

public final class zzfl
{
  public static int zza(b paramb)
  {
    switch (zzfl.1.zzCT[paramb.ordinal()])
    {
    default: 
      return 0;
    case 2: 
      return 1;
    case 3: 
      return 2;
    }
    return 3;
  }
  
  public static d zzb(AdSizeParcel paramAdSizeParcel)
  {
    int i = 0;
    d[] arrayOfd = new d[6];
    arrayOfd[0] = d.a;
    arrayOfd[1] = d.b;
    arrayOfd[2] = d.c;
    arrayOfd[3] = d.d;
    arrayOfd[4] = d.e;
    arrayOfd[5] = d.f;
    while (i < arrayOfd.length)
    {
      if ((arrayOfd[i].a() == width) && (arrayOfd[i].b() == height)) {
        return arrayOfd[i];
      }
      i += 1;
    }
    return new d(zza.zza(width, height, zzuh));
  }
  
  public static h zzj(AdRequestParcel paramAdRequestParcel)
  {
    if (zztE != null) {}
    for (HashSet localHashSet = new HashSet(zztE);; localHashSet = null) {
      return new h(new Date(zztC), zzu(zztD), localHashSet, zztF, zztK);
    }
  }
  
  public static c zzu(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return c.a;
    case 2: 
      return c.c;
    }
    return c.b;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */