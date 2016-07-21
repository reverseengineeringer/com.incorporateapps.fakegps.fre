package com.google.android.gms.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class zzpn$zza
  extends zzpo.zza
{
  private Activity mActivity;
  private final int zzagz;
  
  public zzpn$zza(int paramInt, Activity paramActivity)
  {
    zzagz = paramInt;
    mActivity = paramActivity;
  }
  
  private void setActivity(Activity paramActivity)
  {
    mActivity = paramActivity;
  }
  
  public final void zzh(int paramInt, Bundle paramBundle)
  {
    Object localObject;
    if (paramInt == 1)
    {
      localObject = new Intent();
      ((Intent)localObject).putExtras(paramBundle);
      paramBundle = mActivity.createPendingResult(zzagz, (Intent)localObject, 1073741824);
      if (paramBundle != null) {}
    }
    for (;;)
    {
      return;
      try
      {
        paramBundle.send(1);
        return;
      }
      catch (PendingIntent.CanceledException paramBundle)
      {
        Log.w("AddressClientImpl", "Exception settng pending result", paramBundle);
        return;
      }
      localObject = null;
      if (paramBundle != null) {
        localObject = (PendingIntent)paramBundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT");
      }
      paramBundle = new ConnectionResult(paramInt, (PendingIntent)localObject);
      if (paramBundle.hasResolution()) {
        try
        {
          paramBundle.startResolutionForResult(mActivity, zzagz);
          return;
        }
        catch (IntentSender.SendIntentException paramBundle)
        {
          Log.w("AddressClientImpl", "Exception starting pending intent", paramBundle);
          return;
        }
      }
      try
      {
        paramBundle = mActivity.createPendingResult(zzagz, new Intent(), 1073741824);
        if (paramBundle != null)
        {
          paramBundle.send(1);
          return;
        }
      }
      catch (PendingIntent.CanceledException paramBundle)
      {
        Log.w("AddressClientImpl", "Exception setting pending result", paramBundle);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzpn.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */