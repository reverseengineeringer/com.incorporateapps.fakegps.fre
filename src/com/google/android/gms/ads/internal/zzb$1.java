package com.google.android.gms.ads.internal;

import android.content.Intent;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzjp;

class zzb$1
  implements Runnable
{
  zzb$1(zzb paramzzb, Intent paramIntent) {}
  
  public void run()
  {
    int i = zzr.zzbM().zzd(zzpp);
    zzr.zzbM();
    if ((i == 0) && (zzpq.zzpj.zzrq != null) && (zzpq.zzpj.zzrq.zzED != null) && (zzpq.zzpj.zzrq.zzED.zzhS() != null)) {
      zzpq.zzpj.zzrq.zzED.zzhS().close();
    }
    zzpq.zzpj.zzrM = false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzb.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */