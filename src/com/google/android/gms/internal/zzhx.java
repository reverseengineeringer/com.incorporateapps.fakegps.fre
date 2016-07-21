package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.zza.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

public class zzhx
  extends zza.zza
{
  private zzhy zzKC;
  private zzhv zzKJ;
  private zzhw zzKK;
  
  public zzhx(zzhw paramzzhw)
  {
    zzKK = paramzzhw;
  }
  
  public void zza(zzd paramzzd, RewardItemParcel paramRewardItemParcel)
  {
    if (zzKK != null) {
      zzKK.zzc(paramRewardItemParcel);
    }
  }
  
  public void zza(zzhv paramzzhv)
  {
    zzKJ = paramzzhv;
  }
  
  public void zza(zzhy paramzzhy)
  {
    zzKC = paramzzhy;
  }
  
  public void zzb(zzd paramzzd, int paramInt)
  {
    if (zzKJ != null) {
      zzKJ.zzN(paramInt);
    }
  }
  
  public void zzc(zzd paramzzd, int paramInt)
  {
    if (zzKC != null) {
      zzKC.zza(zze.zzp(paramzzd).getClass().getName(), paramInt);
    }
  }
  
  public void zzg(zzd paramzzd)
  {
    if (zzKJ != null) {
      zzKJ.zzgN();
    }
  }
  
  public void zzh(zzd paramzzd)
  {
    if (zzKC != null) {
      zzKC.zzax(zze.zzp(paramzzd).getClass().getName());
    }
  }
  
  public void zzi(zzd paramzzd)
  {
    if (zzKK != null) {
      zzKK.onRewardedVideoAdOpened();
    }
  }
  
  public void zzj(zzd paramzzd)
  {
    if (zzKK != null) {
      zzKK.onRewardedVideoStarted();
    }
  }
  
  public void zzk(zzd paramzzd)
  {
    if (zzKK != null) {
      zzKK.onRewardedVideoAdClosed();
    }
  }
  
  public void zzl(zzd paramzzd)
  {
    if (zzKK != null) {
      zzKK.zzgM();
    }
  }
  
  public void zzm(zzd paramzzd)
  {
    if (zzKK != null) {
      zzKK.onRewardedVideoAdLeftApplication();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */