package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzev
  implements zzem
{
  private final Context mContext;
  private zzer zzCD;
  private final zzeo zzCf;
  private final AdRequestInfoParcel zzCu;
  private final long zzCv;
  private final long zzCw;
  private boolean zzCy = false;
  private final Object zzpV = new Object();
  private final zzcb zzpe;
  private final zzex zzpn;
  private final boolean zzsA;
  private final boolean zzuS;
  
  public zzev(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, zzex paramzzex, zzeo paramzzeo, boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2, zzcb paramzzcb)
  {
    mContext = paramContext;
    zzCu = paramAdRequestInfoParcel;
    zzpn = paramzzex;
    zzCf = paramzzeo;
    zzsA = paramBoolean1;
    zzuS = paramBoolean2;
    zzCv = paramLong1;
    zzCw = paramLong2;
    zzpe = paramzzcb;
  }
  
  public void cancel()
  {
    synchronized (zzpV)
    {
      zzCy = true;
      if (zzCD != null) {
        zzCD.cancel();
      }
      return;
    }
  }
  
  public zzes zzc(List arg1)
  {
    zzin.zzaI("Starting mediation.");
    Object localObject = new ArrayList();
    zzbz localzzbz1 = zzpe.zzdB();
    Iterator localIterator1 = ???.iterator();
    while (localIterator1.hasNext())
    {
      zzen localzzen = (zzen)localIterator1.next();
      zzin.zzaJ("Trying mediation network: " + zzBA);
      Iterator localIterator2 = zzBB.iterator();
      while (localIterator2.hasNext())
      {
        String str = (String)localIterator2.next();
        zzbz localzzbz2 = zzpe.zzdB();
        synchronized (zzpV)
        {
          if (zzCy)
          {
            localObject = new zzes(-1);
            return (zzes)localObject;
          }
          zzCD = new zzer(mContext, str, zzpn, zzCf, localzzen, zzCu.zzHt, zzCu.zzrp, zzCu.zzrl, zzsA, zzuS, zzCu.zzrD, zzCu.zzrH);
          ??? = zzCD.zza(zzCv, zzCw);
          if (zzCo == 0)
          {
            zzin.zzaI("Adapter succeeded.");
            zzpe.zzc("mediation_network_succeed", str);
            if (!((List)localObject).isEmpty()) {
              zzpe.zzc("mediation_networks_fail", TextUtils.join(",", (Iterable)localObject));
            }
            zzpe.zza(localzzbz2, new String[] { "mls" });
            zzpe.zza(localzzbz1, new String[] { "ttm" });
            return (zzes)???;
          }
        }
        localIterable.add(str);
        zzpe.zza(localzzbz2, new String[] { "mlf" });
        if (zzCq != null) {
          zzir.zzMc.post(new zzev.1(this, ???));
        }
      }
    }
    if (!localIterable.isEmpty()) {
      zzpe.zzc("mediation_networks_fail", TextUtils.join(",", localIterable));
    }
    return new zzes(1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzev
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */