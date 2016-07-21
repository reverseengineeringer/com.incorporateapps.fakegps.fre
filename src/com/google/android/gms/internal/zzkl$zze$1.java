package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.appinvite.AppInviteReferral;
import com.google.android.gms.common.api.Status;

class zzkl$zze$1
  extends zzkl.zza
{
  zzkl$zze$1(zzkl.zze paramzze) {}
  
  public void zza(Status paramStatus, Intent paramIntent)
  {
    zzUV.zza(new zzkn(paramStatus, paramIntent));
    if ((AppInviteReferral.hasReferral(paramIntent)) && (zzkl.zze.zza(zzUV)) && (zzkl.zze.zzb(zzUV) != null)) {
      zzkl.zze.zzb(zzUV).startActivity(paramIntent);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkl.zze.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */