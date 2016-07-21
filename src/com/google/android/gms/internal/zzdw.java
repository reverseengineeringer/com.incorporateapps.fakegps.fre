package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.zzk;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class zzdw
{
  private final List zzpH = new LinkedList();
  
  void zza(zzdx paramzzdx)
  {
    Handler localHandler = zzir.zzMc;
    Iterator localIterator = zzpH.iterator();
    while (localIterator.hasNext()) {
      localHandler.post(new zzdw.7(this, (zzdw.zza)localIterator.next(), paramzzdx));
    }
  }
  
  void zzc(zzk paramzzk)
  {
    paramzzk.zza(new zzdw.1(this));
    paramzzk.zza(new zzdw.2(this));
    paramzzk.zza(new zzdw.3(this));
    paramzzk.zza(new zzdw.4(this));
    paramzzk.zza(new zzdw.5(this));
    paramzzk.zza(new zzdw.6(this));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */