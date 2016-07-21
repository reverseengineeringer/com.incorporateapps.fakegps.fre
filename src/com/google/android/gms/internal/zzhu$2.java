package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.dynamic.zze;

class zzhu$2
  implements Runnable
{
  zzhu$2(zzhu paramzzhu, zzey paramzzey, AdRequestParcel paramAdRequestParcel, zzhx paramzzhx) {}
  
  public void run()
  {
    try
    {
      zzKG.zza(zze.zzC(zzhu.zza(zzKH)), zzpW, zzhu.zzb(zzKH), zzKI, zzhu.zzc(zzKH));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Fail to initialize adapter " + zzhu.zzd(zzKH), localRemoteException);
      zzKH.zza(zzhu.zzd(zzKH), 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhu.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */