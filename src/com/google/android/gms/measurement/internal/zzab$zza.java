package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

class zzab$zza
  implements Application.ActivityLifecycleCallbacks
{
  private zzab$zza(zzab paramzzab) {}
  
  private boolean zzfo(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      zzaYH.zza("auto", "_ldl", paramString);
      return true;
    }
    return false;
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    try
    {
      zzaYH.zzAo().zzCK().zzfg("onActivityCreated");
      paramActivity = paramActivity.getIntent();
      if (paramActivity == null) {
        return;
      }
      paramActivity = paramActivity.getData();
      if ((paramActivity == null) || (!paramActivity.isHierarchical())) {
        return;
      }
      paramActivity = paramActivity.getQueryParameter("referrer");
      if (TextUtils.isEmpty(paramActivity)) {
        return;
      }
      if (!paramActivity.contains("gclid"))
      {
        zzaYH.zzAo().zzCJ().zzfg("Activity created with data 'referrer' param without gclid");
        return;
      }
    }
    catch (Throwable paramActivity)
    {
      zzaYH.zzAo().zzCE().zzj("Throwable caught in onActivityCreated", paramActivity);
      return;
    }
    zzaYH.zzAo().zzCJ().zzj("Activity created with referrer", paramActivity);
    zzfo(paramActivity);
  }
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity)
  {
    zzaYH.zzCm().zzDw();
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    zzaYH.zzCm().zzDu();
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzab.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */