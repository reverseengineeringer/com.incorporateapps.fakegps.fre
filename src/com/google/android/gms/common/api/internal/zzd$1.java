package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

class zzd$1
  implements zzp.zza
{
  zzd$1(zzd paramzzd) {}
  
  public void zzc(int paramInt, boolean paramBoolean)
  {
    zzd.zza(zzahh).lock();
    try
    {
      if ((zzd.zzc(zzahh)) || (zzd.zzd(zzahh) == null) || (!zzd.zzd(zzahh).isSuccess()))
      {
        zzd.zza(zzahh, false);
        zzd.zza(zzahh, paramInt, paramBoolean);
        return;
      }
      zzd.zza(zzahh, true);
      zzd.zze(zzahh).onConnectionSuspended(paramInt);
      return;
    }
    finally
    {
      zzd.zza(zzahh).unlock();
    }
  }
  
  public void zzd(ConnectionResult paramConnectionResult)
  {
    zzd.zza(zzahh).lock();
    try
    {
      zzd.zza(zzahh, paramConnectionResult);
      zzd.zzb(zzahh);
      return;
    }
    finally
    {
      zzd.zza(zzahh).unlock();
    }
  }
  
  public void zzi(Bundle paramBundle)
  {
    zzd.zza(zzahh).lock();
    try
    {
      zzd.zza(zzahh, paramBundle);
      zzd.zza(zzahh, ConnectionResult.zzafB);
      zzd.zzb(zzahh);
      return;
    }
    finally
    {
      zzd.zza(zzahh).unlock();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.zzd.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */