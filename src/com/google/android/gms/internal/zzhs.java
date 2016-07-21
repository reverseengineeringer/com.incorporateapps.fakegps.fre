package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.zzb.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public class zzhs
  extends zzb.zza
{
  private final Context mContext;
  private final zzht zzKu;
  private final VersionInfoParcel zzpT;
  private final Object zzpV;
  
  public zzhs(Context paramContext, com.google.android.gms.ads.internal.zzd paramzzd, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel)
  {
    mContext = paramContext;
    zzpT = paramVersionInfoParcel;
    zzKu = new zzht(paramContext, paramzzd, AdSizeParcel.zzcP(), paramzzex, paramVersionInfoParcel);
    zzpV = new Object();
  }
  
  public void destroy()
  {
    synchronized (zzpV)
    {
      zzKu.destroy();
      return;
    }
  }
  
  public boolean isLoaded()
  {
    synchronized (zzpV)
    {
      boolean bool = zzKu.isLoaded();
      return bool;
    }
  }
  
  public void pause()
  {
    synchronized (zzpV)
    {
      zzKu.pause();
      return;
    }
  }
  
  public void resume()
  {
    synchronized (zzpV)
    {
      zzKu.resume();
      return;
    }
  }
  
  public void setUserId(String paramString)
  {
    synchronized (zzpV)
    {
      zzKu.setUserId(paramString);
      return;
    }
  }
  
  public void show()
  {
    synchronized (zzpV)
    {
      zzKu.zzgL();
      return;
    }
  }
  
  public void zza(RewardedVideoAdRequestParcel paramRewardedVideoAdRequestParcel)
  {
    synchronized (zzpV)
    {
      zzKu.zza(paramRewardedVideoAdRequestParcel);
      return;
    }
  }
  
  public void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd)
  {
    synchronized (zzpV)
    {
      zzKu.zza(paramzzd);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */