package com.google.android.gms.internal;

import android.content.MutableContextWrapper;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzr;
import java.util.Iterator;
import java.util.LinkedList;

class zzea$zza
{
  zzk zzAD;
  zzdw zzAE;
  long zzAF;
  boolean zzAG;
  boolean zzAH;
  MutableContextWrapper zzAb;
  
  zzea$zza(zzea paramzzea, zzdv paramzzdv)
  {
    zzdv localzzdv = paramzzdv.zzec();
    zzAb = paramzzdv.zzed();
    zzAD = localzzdv.zzX(zzea.zza(paramzzea));
    zzAE = new zzdw();
    zzAE.zzc(zzAD);
  }
  
  private void zzek()
  {
    if ((!zzAG) && (zzea.zzc(zzAI) != null))
    {
      zzAH = zzAD.zzb(zzea.zzc(zzAI));
      zzAG = true;
      zzAF = zzr.zzbG().currentTimeMillis();
    }
  }
  
  void zzc(zzdv paramzzdv)
  {
    paramzzdv = paramzzdv.zzed().getBaseContext();
    zzAb.setBaseContext(paramzzdv);
  }
  
  void zzh(AdRequestParcel paramAdRequestParcel)
  {
    if (paramAdRequestParcel != null) {
      zzea.zza(zzAI, paramAdRequestParcel);
    }
    zzek();
    paramAdRequestParcel = zzea.zzb(zzAI).iterator();
    while (paramAdRequestParcel.hasNext()) {
      ((zza)paramAdRequestParcel.next()).zzek();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzea.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */