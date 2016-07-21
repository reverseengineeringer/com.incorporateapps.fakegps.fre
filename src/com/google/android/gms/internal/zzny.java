package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.fitness.zza;
import java.util.Set;

public abstract class zzny
  extends zzj
{
  protected zzny(Context paramContext, Looper paramLooper, int paramInt, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, zzf paramzzf)
  {
    super(paramContext, paramLooper, paramInt, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  protected Set zzb(Set paramSet)
  {
    return zza.zze(paramSet);
  }
  
  public boolean zzmE()
  {
    return !zznv.zzaD(getContext());
  }
  
  public boolean zzqK()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzny
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */