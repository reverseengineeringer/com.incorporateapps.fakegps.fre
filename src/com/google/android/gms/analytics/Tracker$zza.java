package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.internal.zzmq;
import java.util.HashMap;
import java.util.Map;

class Tracker$zza
  extends zzd
  implements GoogleAnalytics.zza
{
  private boolean zzPG;
  private int zzPH;
  private long zzPI = -1L;
  private boolean zzPJ;
  private long zzPK;
  
  protected Tracker$zza(Tracker paramTracker, zzf paramzzf)
  {
    super(paramzzf);
  }
  
  private void zziN()
  {
    if ((zzPI >= 0L) || (zzPG))
    {
      zziC().zza(Tracker.zza(zzPF));
      return;
    }
    zziC().zzb(Tracker.zza(zzPF));
  }
  
  public void enableAutoActivityTracking(boolean paramBoolean)
  {
    zzPG = paramBoolean;
    zziN();
  }
  
  public void setSessionTimeout(long paramLong)
  {
    zzPI = paramLong;
    zziN();
  }
  
  protected void zziJ() {}
  
  public boolean zziM()
  {
    try
    {
      boolean bool = zzPJ;
      zzPJ = false;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  boolean zziO()
  {
    return zzjl().elapsedRealtime() >= zzPK + Math.max(1000L, zzPI);
  }
  
  public void zzl(Activity paramActivity)
  {
    if ((zzPH == 0) && (zziO())) {
      zzPJ = true;
    }
    zzPH += 1;
    HashMap localHashMap;
    Tracker localTracker;
    if (zzPG)
    {
      localObject = paramActivity.getIntent();
      if (localObject != null) {
        zzPF.setCampaignParamsOnNextHit(((Intent)localObject).getData());
      }
      localHashMap = new HashMap();
      localHashMap.put("&t", "screenview");
      localTracker = zzPF;
      if (Tracker.zzk(zzPF) == null) {
        break label159;
      }
    }
    label159:
    for (Object localObject = Tracker.zzk(zzPF).zzo(paramActivity);; localObject = paramActivity.getClass().getCanonicalName())
    {
      localTracker.set("&cd", (String)localObject);
      if (TextUtils.isEmpty((CharSequence)localHashMap.get("&dr")))
      {
        paramActivity = Tracker.zzn(paramActivity);
        if (!TextUtils.isEmpty(paramActivity)) {
          localHashMap.put("&dr", paramActivity);
        }
      }
      zzPF.send(localHashMap);
      return;
    }
  }
  
  public void zzm(Activity paramActivity)
  {
    zzPH -= 1;
    zzPH = Math.max(0, zzPH);
    if (zzPH == 0) {
      zzPK = zzjl().elapsedRealtime();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.Tracker.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */