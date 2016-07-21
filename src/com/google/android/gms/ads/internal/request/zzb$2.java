package com.google.android.gms.ads.internal.request;

import android.os.Handler;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzji;

class zzb$2
  implements Runnable
{
  zzb$2(zzb paramzzb, zzji paramzzji) {}
  
  public void run()
  {
    synchronized (zzb.zza(zzHj))
    {
      zzHj.zzHi = zzHj.zza(zzbzzHj).zzrl, zzHk);
      if (zzHj.zzHi == null)
      {
        zzb.zza(zzHj, 0, "Could not start the ad request service.");
        zzir.zzMc.removeCallbacks(zzb.zzc(zzHj));
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzb.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */