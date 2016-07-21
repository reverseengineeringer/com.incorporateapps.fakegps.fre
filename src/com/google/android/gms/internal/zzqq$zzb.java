package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;

final class zzqq$zzb
  extends zzqo.zza
{
  private final zza.zzb zzamC;
  
  public zzqq$zzb(zza.zzb paramzzb)
  {
    zzamC = paramzzb;
  }
  
  public final void zza(int paramInt1, Bundle paramBundle, int paramInt2, Intent paramIntent)
  {
    if (paramBundle != null) {}
    for (paramBundle = (PendingIntent)paramBundle.getParcelable("pendingIntent");; paramBundle = null)
    {
      paramBundle = new Status(paramInt1, null, paramBundle);
      zzamC.zzs(new zzqs(paramBundle, paramIntent));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzqq.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */