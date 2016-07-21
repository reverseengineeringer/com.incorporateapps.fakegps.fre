package com.google.android.gms.auth;

import android.os.IBinder;
import com.google.android.gms.internal.zzas;
import com.google.android.gms.internal.zzas.zza;
import java.util.List;

final class zzd$3
  implements zzd.zza
{
  zzd$3(String paramString, int paramInt) {}
  
  public final List zzap(IBinder paramIBinder)
  {
    return ((AccountChangeEventsResponse)zzd.zzn(zzas.zza.zza(paramIBinder).zza(new AccountChangeEventsRequest().setAccountName(zzVl).setEventIndex(zzVm)))).getEvents();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.zzd.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */