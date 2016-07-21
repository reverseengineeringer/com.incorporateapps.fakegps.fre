package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.BooleanResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

class zzse$zzb
  extends zzse.zza
{
  private final zza.zzb zzamC;
  
  public zzse$zzb(zza.zzb paramzzb)
  {
    super(null);
    zzamC = paramzzb;
  }
  
  public void zza(Status paramStatus, boolean paramBoolean, Bundle paramBundle)
  {
    zzamC.zzs(new BooleanResult(paramStatus, paramBoolean));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzse.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */