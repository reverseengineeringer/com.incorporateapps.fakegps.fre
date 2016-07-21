package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzcc;
import com.google.android.gms.internal.zzce;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzgr;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzjp;

class zzc$3
  implements Runnable
{
  zzc$3(zzc paramzzc, zzif.zza paramzza, zzcb paramzzcb) {}
  
  public void run()
  {
    if ((zzps.zzLe.zzIc) && (zzpr.zzpj.zzrE != null))
    {
      Object localObject = null;
      if (zzps.zzLe.zzEF != null) {
        localObject = zzr.zzbC().zzaC(zzps.zzLe.zzEF);
      }
      localObject = new zzcc(zzpr, (String)localObject, zzps.zzLe.body);
      zzpr.zzpj.zzrL = 1;
      try
      {
        zzpr.zzph = false;
        zzpr.zzpj.zzrE.zza((zzce)localObject);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzd("Could not call the onCustomRenderedAdLoadedListener.", localRemoteException);
        zzpr.zzph = true;
      }
    }
    zze localzze = new zze();
    zzjp localzzjp = zzpr.zza(zzps, localzze);
    localzze.zza(new zze.zzb(zzps, localzzjp));
    localzzjp.setOnTouchListener(new zzc.3.1(this, localzze));
    localzzjp.setOnClickListener(new zzc.3.2(this, localzze));
    zzpr.zzpj.zzrL = 0;
    zzpr.zzpj.zzro = zzr.zzbB().zza(zzpr.zzpj.context, zzpr, zzps, zzpr.zzpj.zzrk, localzzjp, zzpr.zzpn, zzpr, zzpt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzc.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */