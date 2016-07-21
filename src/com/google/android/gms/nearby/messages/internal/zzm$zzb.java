package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

class zzm$zzb
  implements Application.ActivityLifecycleCallbacks
{
  private final Activity zzbcA;
  private final zzm zzbcB;
  
  private zzm$zzb(Activity paramActivity, zzm paramzzm)
  {
    zzbcA = paramActivity;
    zzbcB = paramzzm;
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    if (paramActivity == zzbcA)
    {
      Log.v("NearbyMessagesClient", String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[] { paramActivity.getPackageName() }));
      paramActivity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }
  }
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity) {}
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity)
  {
    if (paramActivity == zzbcA) {}
    try
    {
      zzbcB.zzjq(1);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Log.v("NearbyMessagesClient", String.format("Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s", new Object[] { paramActivity.getPackageName(), localRemoteException }));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzm.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */