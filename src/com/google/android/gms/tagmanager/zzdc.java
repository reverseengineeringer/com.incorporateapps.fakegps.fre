package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

public class zzdc
{
  private Context mContext;
  private Tracker zzPb;
  private GoogleAnalytics zzPd;
  
  public zzdc(Context paramContext)
  {
    mContext = paramContext;
  }
  
  private void zzgr(String paramString)
  {
    try
    {
      if (zzPd == null)
      {
        zzPd = GoogleAnalytics.getInstance(mContext);
        zzPd.setLogger(new zzdc.zza());
        zzPb = zzPd.newTracker(paramString);
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public Tracker zzgq(String paramString)
  {
    zzgr(paramString);
    return zzPb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzdc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */