package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.appinvite.AppInviteInvitationResult;
import com.google.android.gms.appinvite.AppInviteReferral;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class zzkl$zze
  extends zzkl.zzb
{
  private final Activity zzUS;
  private final boolean zzUT;
  private final Intent zzUU;
  
  public zzkl$zze(zzkl paramzzkl, GoogleApiClient paramGoogleApiClient, Activity paramActivity, boolean paramBoolean)
  {
    super(paramGoogleApiClient);
    zzUS = paramActivity;
    zzUT = paramBoolean;
    if (zzUS != null) {}
    for (paramzzkl = zzUS.getIntent();; paramzzkl = null)
    {
      zzUU = paramzzkl;
      return;
    }
  }
  
  protected final void zza(zzkm paramzzkm)
  {
    if (AppInviteReferral.hasReferral(zzUU))
    {
      zza(new zzkn(Status.zzagC, zzUU));
      return;
    }
    paramzzkm.zza(new zzkl.zze.1(this));
  }
  
  protected final AppInviteInvitationResult zze(Status paramStatus)
  {
    return new zzkn(paramStatus, new Intent());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkl.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */