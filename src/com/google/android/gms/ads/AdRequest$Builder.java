package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzaa.zza;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.zzx;
import java.util.Date;

public final class AdRequest$Builder
{
  private final zzaa.zza zzoF = new zzaa.zza();
  
  public AdRequest$Builder()
  {
    zzoF.zzB(AdRequest.DEVICE_ID_EMULATOR);
  }
  
  public final Builder addCustomEventExtrasBundle(Class paramClass, Bundle paramBundle)
  {
    zzoF.zzb(paramClass, paramBundle);
    return this;
  }
  
  public final Builder addKeyword(String paramString)
  {
    zzoF.zzA(paramString);
    return this;
  }
  
  public final Builder addNetworkExtras(NetworkExtras paramNetworkExtras)
  {
    zzoF.zza(paramNetworkExtras);
    return this;
  }
  
  public final Builder addNetworkExtrasBundle(Class paramClass, Bundle paramBundle)
  {
    zzoF.zza(paramClass, paramBundle);
    if ((paramClass.equals(AdMobAdapter.class)) && (paramBundle.getBoolean("_emulatorLiveAds"))) {
      zzoF.zzC(AdRequest.DEVICE_ID_EMULATOR);
    }
    return this;
  }
  
  public final Builder addTestDevice(String paramString)
  {
    zzoF.zzB(paramString);
    return this;
  }
  
  public final AdRequest build()
  {
    return new AdRequest(this, null);
  }
  
  public final Builder setBirthday(Date paramDate)
  {
    zzoF.zza(paramDate);
    return this;
  }
  
  public final Builder setContentUrl(String paramString)
  {
    zzx.zzb(paramString, "Content URL must be non-null.");
    zzx.zzh(paramString, "Content URL must be non-empty.");
    if (paramString.length() <= 512) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] { Integer.valueOf(512), Integer.valueOf(paramString.length()) });
      zzoF.zzD(paramString);
      return this;
    }
  }
  
  public final Builder setGender(int paramInt)
  {
    zzoF.zzn(paramInt);
    return this;
  }
  
  public final Builder setIsDesignedForFamilies(boolean paramBoolean)
  {
    zzoF.zzl(paramBoolean);
    return this;
  }
  
  public final Builder setLocation(Location paramLocation)
  {
    zzoF.zzb(paramLocation);
    return this;
  }
  
  public final Builder setRequestAgent(String paramString)
  {
    zzoF.zzF(paramString);
    return this;
  }
  
  public final Builder tagForChildDirectedTreatment(boolean paramBoolean)
  {
    zzoF.zzk(paramBoolean);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.AdRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */