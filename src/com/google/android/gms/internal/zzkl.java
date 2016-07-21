package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.appinvite.AppInviteApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public class zzkl
  implements AppInviteApi
{
  public PendingResult convertInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zza(new zzkl.zzd(this, paramGoogleApiClient, paramString));
  }
  
  public PendingResult getInvitation(GoogleApiClient paramGoogleApiClient, Activity paramActivity, boolean paramBoolean)
  {
    return paramGoogleApiClient.zza(new zzkl.zze(this, paramGoogleApiClient, paramActivity, paramBoolean));
  }
  
  public PendingResult updateInvitationOnInstall(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zza(new zzkl.zzc(this, paramGoogleApiClient, paramString));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */