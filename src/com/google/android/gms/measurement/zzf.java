package com.google.android.gms.measurement;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class zzf
{
  private final zzg zzaUs;
  protected final zzc zzaUt;
  private final List zzaUu;
  
  protected zzf(zzg paramzzg, zzmq paramzzmq)
  {
    zzx.zzz(paramzzg);
    zzaUs = paramzzg;
    zzaUu = new ArrayList();
    paramzzg = new zzc(this, paramzzmq);
    paramzzg.zzAE();
    zzaUt = paramzzg;
  }
  
  protected zzg zzAC()
  {
    return zzaUs;
  }
  
  public zzc zzAF()
  {
    return zzaUt;
  }
  
  public List zzAG()
  {
    return zzaUt.zzAw();
  }
  
  protected void zza(zzc paramzzc) {}
  
  protected void zzd(zzc paramzzc)
  {
    Iterator localIterator = zzaUu.iterator();
    while (localIterator.hasNext()) {
      ((zzd)localIterator.next()).zza(this, paramzzc);
    }
  }
  
  public zzc zziy()
  {
    zzc localzzc = zzaUt.zzAu();
    zzd(localzzc);
    return localzzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */