package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzin;

class zzc$1
  implements Runnable
{
  zzc$1(zzc paramzzc, zzf paramzzf, Intent paramIntent) {}
  
  public void run()
  {
    try
    {
      if (zzc.zza(zzFH).zza(zzFG.zzFQ, -1, val$intent))
      {
        zzc.zzc(zzFH).zza(new zzg(zzc.zzb(zzFH), zzFG.zzFR, true, -1, val$intent, zzFG));
        return;
      }
      zzc.zzc(zzFH).zza(new zzg(zzc.zzb(zzFH), zzFG.zzFR, false, -1, val$intent, zzFG));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzaK("Fail to verify and dispatch pending transaction");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzc.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */