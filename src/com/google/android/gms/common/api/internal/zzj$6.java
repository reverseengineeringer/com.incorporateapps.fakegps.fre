package com.google.android.gms.common.api.internal;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

class zzj$6
  implements Runnable
{
  zzj$6(zzj paramzzj, FragmentActivity paramFragmentActivity) {}
  
  public void run()
  {
    if ((zzaih.isFinishing()) || (zzaih.getSupportFragmentManager().isDestroyed())) {
      return;
    }
    zzw.zzb(zzaih).zzbD(zzj.zze(zzaid));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzj.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */