package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqb.zzb;
import com.google.android.gms.internal.zzqb.zze;
import java.util.ArrayList;
import java.util.List;

class zzw$zza
  implements zze.zzb
{
  zzqb.zze zzaYt;
  List zzaYu;
  long zzaYv;
  List zzpH;
  
  private zzw$zza(zzw paramzzw) {}
  
  private long zza(zzqb.zzb paramzzb)
  {
    return zzbaf.longValue() / 1000L / 60L / 60L;
  }
  
  boolean isEmpty()
  {
    return (zzpH == null) || (zzpH.isEmpty());
  }
  
  public boolean zza(long paramLong, zzqb.zzb paramzzb)
  {
    zzx.zzz(paramzzb);
    if (zzpH == null) {
      zzpH = new ArrayList();
    }
    if (zzaYu == null) {
      zzaYu = new ArrayList();
    }
    if ((zzpH.size() > 0) && (zza((zzqb.zzb)zzpH.get(0)) != zza(paramzzb))) {
      return false;
    }
    long l = zzaYv + paramzzb.getSerializedSize();
    if (l >= zzaYs.zzCp().zzBT()) {
      return false;
    }
    zzaYv = l;
    zzpH.add(paramzzb);
    zzaYu.add(Long.valueOf(paramLong));
    return zzpH.size() < zzaYs.zzCp().zzBU();
  }
  
  public void zzc(zzqb.zze paramzze)
  {
    zzx.zzz(paramzze);
    zzaYt = paramzze;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzw.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */