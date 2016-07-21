package com.google.android.gms.ads.internal.request;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zzji;

public abstract class zzd
  implements zzc.zza, zzit
{
  private final zzji zzHl;
  private final zzc.zza zzHm;
  private final Object zzpV = new Object();
  
  public zzd(zzji paramzzji, zzc.zza paramzza)
  {
    zzHl = paramzzji;
    zzHm = paramzza;
  }
  
  public void cancel()
  {
    zzgr();
  }
  
  boolean zza(zzj paramzzj, AdRequestInfoParcel paramAdRequestInfoParcel)
  {
    try
    {
      paramzzj.zza(paramAdRequestInfoParcel, new zzg(this));
      return true;
    }
    catch (RemoteException paramzzj)
    {
      zzin.zzd("Could not fetch ad response from ad request service.", paramzzj);
      zzr.zzbF().zzb(paramzzj, true);
      zzHm.zzb(new AdResponseParcel(0));
      return false;
    }
    catch (NullPointerException paramzzj)
    {
      for (;;)
      {
        zzin.zzd("Could not fetch ad response from ad request service due to an Exception.", paramzzj);
        zzr.zzbF().zzb(paramzzj, true);
      }
    }
    catch (SecurityException paramzzj)
    {
      for (;;)
      {
        zzin.zzd("Could not fetch ad response from ad request service due to an Exception.", paramzzj);
        zzr.zzbF().zzb(paramzzj, true);
      }
    }
    catch (Throwable paramzzj)
    {
      for (;;)
      {
        zzin.zzd("Could not fetch ad response from ad request service due to an Exception.", paramzzj);
        zzr.zzbF().zzb(paramzzj, true);
      }
    }
  }
  
  public void zzb(AdResponseParcel paramAdResponseParcel)
  {
    synchronized (zzpV)
    {
      zzHm.zzb(paramAdResponseParcel);
      zzgr();
      return;
    }
  }
  
  public Void zzga()
  {
    zzj localzzj = zzgs();
    if (localzzj == null)
    {
      zzHm.zzb(new AdResponseParcel(0));
      zzgr();
      return null;
    }
    zzHl.zza(new zzd.1(this, localzzj), new zzd.2(this));
    return null;
  }
  
  public abstract void zzgr();
  
  public abstract zzj zzgs();
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */