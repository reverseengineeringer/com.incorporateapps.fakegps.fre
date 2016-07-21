package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

public class zze
  implements zzn
{
  private final Executor zzs;
  
  public zze(Handler paramHandler)
  {
    zzs = new zze.1(this, paramHandler);
  }
  
  public void zza(zzk paramzzk, zzm paramzzm)
  {
    zza(paramzzk, paramzzm, null);
  }
  
  public void zza(zzk paramzzk, zzm paramzzm, Runnable paramRunnable)
  {
    paramzzk.zzv();
    paramzzk.zzc("post-response");
    zzs.execute(new zze.zza(this, paramzzk, paramzzm, paramRunnable));
  }
  
  public void zza(zzk paramzzk, zzr paramzzr)
  {
    paramzzk.zzc("post-error");
    paramzzr = zzm.zzd(paramzzr);
    zzs.execute(new zze.zza(this, paramzzk, paramzzr, null));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */