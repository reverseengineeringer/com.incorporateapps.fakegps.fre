package com.google.android.gms.ads.internal.reward.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.reward.RewardItem;

public class zze
  implements RewardItem
{
  private final zza zzKz;
  
  public zze(zza paramzza)
  {
    zzKz = paramzza;
  }
  
  public int getAmount()
  {
    if (zzKz == null) {
      return 0;
    }
    try
    {
      int i = zzKz.getAmount();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not forward getAmount to RewardItem", localRemoteException);
    }
    return 0;
  }
  
  public String getType()
  {
    if (zzKz == null) {
      return null;
    }
    try
    {
      String str = zzKz.getType();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not forward getType to RewardItem", localRemoteException);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */