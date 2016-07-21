package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class zzi
  implements RewardedVideoAd
{
  private final Context mContext;
  private final zzb zzKA;
  private RewardedVideoAdListener zzaX;
  private final Object zzpV = new Object();
  private String zzrG;
  
  public zzi(Context paramContext, zzb paramzzb)
  {
    zzKA = paramzzb;
    mContext = paramContext;
  }
  
  public void destroy()
  {
    synchronized (zzpV)
    {
      if (zzKA == null) {
        return;
      }
    }
    try
    {
      zzKA.destroy();
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward destroy to RewardedVideoAd", localRemoteException);
      }
    }
  }
  
  public RewardedVideoAdListener getRewardedVideoAdListener()
  {
    synchronized (zzpV)
    {
      RewardedVideoAdListener localRewardedVideoAdListener = zzaX;
      return localRewardedVideoAdListener;
    }
  }
  
  public String getUserId()
  {
    synchronized (zzpV)
    {
      String str = zzrG;
      return str;
    }
  }
  
  public boolean isLoaded()
  {
    boolean bool;
    synchronized (zzpV)
    {
      if (zzKA == null) {
        return false;
      }
    }
    return false;
  }
  
  public void loadAd(String paramString, AdRequest paramAdRequest)
  {
    synchronized (zzpV)
    {
      if (zzKA == null) {
        return;
      }
    }
    try
    {
      zzKA.zza(zzh.zzcO().zza(mContext, paramAdRequest.zzaE(), paramString));
      return;
      paramString = finally;
      throw paramString;
    }
    catch (RemoteException paramString)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward loadAd to RewardedVideoAd", paramString);
      }
    }
  }
  
  public void pause()
  {
    synchronized (zzpV)
    {
      if (zzKA == null) {
        return;
      }
    }
    try
    {
      zzKA.pause();
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward pause to RewardedVideoAd", localRemoteException);
      }
    }
  }
  
  public void resume()
  {
    synchronized (zzpV)
    {
      if (zzKA == null) {
        return;
      }
    }
    try
    {
      zzKA.resume();
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward resume to RewardedVideoAd", localRemoteException);
      }
    }
  }
  
  public void setRewardedVideoAdListener(RewardedVideoAdListener paramRewardedVideoAdListener)
  {
    synchronized (zzpV)
    {
      zzaX = paramRewardedVideoAdListener;
      zzb localzzb = zzKA;
      if (localzzb != null) {}
      try
      {
        zzKA.zza(new zzg(paramRewardedVideoAdListener));
        return;
      }
      catch (RemoteException paramRewardedVideoAdListener)
      {
        for (;;)
        {
          com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward setRewardedVideoAdListener to RewardedVideoAd", paramRewardedVideoAdListener);
        }
      }
    }
  }
  
  public void setUserId(String paramString)
  {
    synchronized (zzpV)
    {
      if (!TextUtils.isEmpty(zzrG))
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzaK("A user id has already been set, ignoring.");
        return;
      }
      zzrG = paramString;
      zzb localzzb = zzKA;
      if (localzzb == null) {}
    }
    try
    {
      zzKA.setUserId(paramString);
      return;
      paramString = finally;
      throw paramString;
    }
    catch (RemoteException paramString)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward setUserId to RewardedVideoAd", paramString);
      }
    }
  }
  
  public void show()
  {
    synchronized (zzpV)
    {
      if (zzKA == null) {
        return;
      }
    }
    try
    {
      zzKA.show();
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward show to RewardedVideoAd", localRemoteException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.zzi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */