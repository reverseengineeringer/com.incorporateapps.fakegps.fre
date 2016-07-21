package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.google.android.gms.common.api.zza;
import java.lang.ref.WeakReference;

class zzj$zzb
  implements IBinder.DeathRecipient, zzj.zzd
{
  private final WeakReference zzaii;
  private final WeakReference zzaij;
  private final WeakReference zzaik;
  
  private zzj$zzb(zzj.zze paramzze, zza paramzza, IBinder paramIBinder)
  {
    zzaij = new WeakReference(paramzza);
    zzaii = new WeakReference(paramzze);
    zzaik = new WeakReference(paramIBinder);
  }
  
  private void zzpI()
  {
    Object localObject = (zzj.zze)zzaii.get();
    zza localzza = (zza)zzaij.get();
    if ((localzza != null) && (localObject != null)) {
      localzza.remove(((zzj.zze)localObject).zzpa().intValue());
    }
    localObject = (IBinder)zzaik.get();
    if (zzaik != null) {
      ((IBinder)localObject).unlinkToDeath(this, 0);
    }
  }
  
  public void binderDied()
  {
    zzpI();
  }
  
  public void zzc(zzj.zze paramzze)
  {
    zzpI();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzj.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */