package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.appinvite.AppInviteInvitationResult;
import com.google.android.gms.common.api.Status;

public class zzkn
  implements AppInviteInvitationResult
{
  private final Status zzUX;
  private final Intent zzUY;
  
  public zzkn(Status paramStatus, Intent paramIntent)
  {
    zzUX = paramStatus;
    zzUY = paramIntent;
  }
  
  public Intent getInvitationIntent()
  {
    return zzUY;
  }
  
  public Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzkn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */