package com.google.android.gms.appinvite;

import android.app.Activity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface AppInviteApi
{
  public abstract PendingResult convertInvitation(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult getInvitation(GoogleApiClient paramGoogleApiClient, Activity paramActivity, boolean paramBoolean);
  
  public abstract PendingResult updateInvitationOnInstall(GoogleApiClient paramGoogleApiClient, String paramString);
}

/* Location:
 * Qualified Name:     com.google.android.gms.appinvite.AppInviteApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */