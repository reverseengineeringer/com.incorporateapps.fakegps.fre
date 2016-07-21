package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.zzk;
import com.google.android.gms.ads.internal.zzr;

class zzhd$7
  implements Runnable
{
  zzhd$7(zzhd paramzzhd, AdRequestInfoParcel paramAdRequestInfoParcel, zzk paramzzk) {}
  
  public void run()
  {
    try
    {
      AdResponseParcel localAdResponseParcel1 = zzJe.zzd(zzIV);
      localAdResponseParcel2 = localAdResponseParcel1;
      if (localAdResponseParcel1 == null) {
        localAdResponseParcel2 = new AdResponseParcel(0);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          AdResponseParcel localAdResponseParcel2;
          zzJf.zzb(localAdResponseParcel2);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          Object localObject;
          zzin.zzd("Fail to forward ad response.", localRemoteException);
        }
        localException = localException;
        zzr.zzbF().zzb(localException, true);
        zzin.zzd("Could not fetch ad response due to an Exception.", localException);
        localObject = null;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhd.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */