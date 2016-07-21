package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

class zzli$zzc$1
  implements zzo
{
  zzli$zzc$1(zzli.zzc paramzzc, zzli paramzzli) {}
  
  public void zza(long paramLong, int paramInt, Object paramObject)
  {
    if (paramObject == null) {}
    try
    {
      zzacW.zza(new zzli.zzd(new Status(paramInt, null, null), zzli.zzc.zza(zzacW)));
      return;
    }
    catch (ClassCastException paramObject)
    {
      zzlj localzzlj;
      zzacW.zza(zzacW.zzs(new Status(13)));
      return;
    }
    paramObject = (zzlk)paramObject;
    localzzlj = ((zzlk)paramObject).zzod();
    if ((localzzlj != null) && (!zzf.zza("1.0.0", localzzlj.getVersion())))
    {
      zzacW.zza(zzacW.zzs(new Status(2150, String.format(Locale.ROOT, "Incorrect Game Manager SDK version. Receiver: %s Sender: %s", new Object[] { localzzlj.getVersion(), "1.0.0" }))));
      zzli.zza(zzacW.zzacN, null);
      return;
    }
    zzacW.zza(new zzli.zzd(new Status(paramInt, ((zzlk)paramObject).zznZ(), null), zzli.zzc.zza(zzacW)));
  }
  
  public void zzy(long paramLong)
  {
    zzacW.zza(zzacW.zzs(new Status(2103)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzli.zzc.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */