package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.zzb;
import java.util.HashSet;
import java.util.Set;

final class zzm$zzb
{
  private int mState;
  private IBinder zzakD;
  private ComponentName zzamc;
  private final zzm.zzb.zza zzamd;
  private final Set zzame;
  private boolean zzamf;
  private final zzm.zza zzamg;
  
  public zzm$zzb(zzm paramzzm, zzm.zza paramzza)
  {
    zzamg = paramzza;
    zzamd = new zzm.zzb.zza(this);
    zzame = new HashSet();
    mState = 2;
  }
  
  public final IBinder getBinder()
  {
    return zzakD;
  }
  
  public final ComponentName getComponentName()
  {
    return zzamc;
  }
  
  public final int getState()
  {
    return mState;
  }
  
  public final boolean isBound()
  {
    return zzamf;
  }
  
  public final void zza(ServiceConnection paramServiceConnection, String paramString)
  {
    zzm.zzc(zzamh).zza(zzm.zzb(zzamh), paramServiceConnection, paramString, zzamg.zzqS());
    zzame.add(paramServiceConnection);
  }
  
  public final boolean zza(ServiceConnection paramServiceConnection)
  {
    return zzame.contains(paramServiceConnection);
  }
  
  public final void zzb(ServiceConnection paramServiceConnection, String paramString)
  {
    zzm.zzc(zzamh).zzb(zzm.zzb(zzamh), paramServiceConnection);
    zzame.remove(paramServiceConnection);
  }
  
  public final void zzcH(String paramString)
  {
    mState = 3;
    zzamf = zzm.zzc(zzamh).zza(zzm.zzb(zzamh), paramString, zzamg.zzqS(), zzamd, 129);
    if (!zzamf) {
      mState = 2;
    }
    try
    {
      zzm.zzc(zzamh).zza(zzm.zzb(zzamh), zzamd);
      return;
    }
    catch (IllegalArgumentException paramString) {}
  }
  
  public final void zzcI(String paramString)
  {
    zzm.zzc(zzamh).zza(zzm.zzb(zzamh), zzamd);
    zzamf = false;
    mState = 2;
  }
  
  public final boolean zzqT()
  {
    return zzame.isEmpty();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzm.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */