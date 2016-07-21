package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzu.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzr;
import java.util.Set;

public class zzeb
  extends zzu.zza
{
  private zzk zzAD;
  private zzdx zzAJ;
  private zzgh zzAK;
  private String zzAL;
  private zzdv zzAz;
  private String zzpS;
  
  public zzeb(Context paramContext, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, com.google.android.gms.ads.internal.zzd paramzzd)
  {
    this(paramString, new zzdv(paramContext.getApplicationContext(), paramzzex, paramVersionInfoParcel, paramzzd));
  }
  
  public zzeb(String paramString, zzdv paramzzdv)
  {
    zzpS = paramString;
    zzAz = paramzzdv;
    zzAJ = new zzdx();
    zzr.zzbN().zza(paramzzdv);
  }
  
  private void zzel()
  {
    if ((zzAD != null) && (zzAK != null)) {
      zzAD.zza(zzAK, zzAL);
    }
  }
  
  void abort()
  {
    if (zzAD != null) {
      return;
    }
    zzAD = zzAz.zzX(zzpS);
    zzAJ.zzc(zzAD);
    zzel();
  }
  
  public void destroy()
  {
    if (zzAD != null) {
      zzAD.destroy();
    }
  }
  
  public String getMediationAdapterClassName()
  {
    if (zzAD != null) {
      return zzAD.getMediationAdapterClassName();
    }
    return null;
  }
  
  public boolean isLoading()
  {
    return (zzAD != null) && (zzAD.isLoading());
  }
  
  public boolean isReady()
  {
    return (zzAD != null) && (zzAD.isReady());
  }
  
  public void pause()
  {
    if (zzAD != null) {
      zzAD.pause();
    }
  }
  
  public void resume()
  {
    if (zzAD != null) {
      zzAD.resume();
    }
  }
  
  public void setManualImpressionsEnabled(boolean paramBoolean)
  {
    abort();
    if (zzAD != null) {
      zzAD.setManualImpressionsEnabled(paramBoolean);
    }
  }
  
  public void setUserId(String paramString) {}
  
  public void showInterstitial()
  {
    if (zzAD != null)
    {
      zzAD.showInterstitial();
      return;
    }
    zzin.zzaK("Interstitial ad must be loaded before showInterstitial().");
  }
  
  public void stopLoading()
  {
    if (zzAD != null) {
      zzAD.stopLoading();
    }
  }
  
  public void zza(AdSizeParcel paramAdSizeParcel)
  {
    if (zzAD != null) {
      zzAD.zza(paramAdSizeParcel);
    }
  }
  
  public void zza(zzp paramzzp)
  {
    zzAJ.zzAt = paramzzp;
    if (zzAD != null) {
      zzAJ.zzc(zzAD);
    }
  }
  
  public void zza(zzq paramzzq)
  {
    zzAJ.zzpK = paramzzq;
    if (zzAD != null) {
      zzAJ.zzc(zzAD);
    }
  }
  
  public void zza(zzw paramzzw)
  {
    zzAJ.zzAq = paramzzw;
    if (zzAD != null) {
      zzAJ.zzc(zzAD);
    }
  }
  
  public void zza(zzx paramzzx)
  {
    abort();
    if (zzAD != null) {
      zzAD.zza(paramzzx);
    }
  }
  
  public void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd)
  {
    zzAJ.zzAu = paramzzd;
    if (zzAD != null) {
      zzAJ.zzc(zzAD);
    }
  }
  
  public void zza(zzcf paramzzcf)
  {
    zzAJ.zzAs = paramzzcf;
    if (zzAD != null) {
      zzAJ.zzc(zzAD);
    }
  }
  
  public void zza(zzgd paramzzgd)
  {
    zzAJ.zzAr = paramzzgd;
    if (zzAD != null) {
      zzAJ.zzc(zzAD);
    }
  }
  
  public void zza(zzgh paramzzgh, String paramString)
  {
    zzAK = paramzzgh;
    zzAL = paramString;
    zzel();
  }
  
  public com.google.android.gms.dynamic.zzd zzaM()
  {
    if (zzAD != null) {
      return zzAD.zzaM();
    }
    return null;
  }
  
  public AdSizeParcel zzaN()
  {
    if (zzAD != null) {
      return zzAD.zzaN();
    }
    return null;
  }
  
  public void zzaP()
  {
    if (zzAD != null)
    {
      zzAD.zzaP();
      return;
    }
    zzin.zzaK("Interstitial ad must be loaded before pingManualTrackingUrl().");
  }
  
  public boolean zzb(AdRequestParcel paramAdRequestParcel)
  {
    if (zzi(paramAdRequestParcel)) {
      abort();
    }
    if (zztJ != null) {
      abort();
    }
    if (zzAD != null) {
      return zzAD.zzb(paramAdRequestParcel);
    }
    zzea.zza localzza = zzr.zzbN().zza(paramAdRequestParcel, zzpS);
    if (localzza != null)
    {
      if (!zzAG) {
        localzza.zzh(paramAdRequestParcel);
      }
      zzAD = zzAD;
      localzza.zzc(zzAz);
      zzAE.zza(zzAJ);
      zzAJ.zzc(zzAD);
      zzel();
      return zzAH;
    }
    zzAD = zzAz.zzX(zzpS);
    zzAJ.zzc(zzAD);
    zzel();
    return zzAD.zzb(paramAdRequestParcel);
  }
  
  boolean zzi(AdRequestParcel paramAdRequestParcel)
  {
    paramAdRequestParcel = zztM;
    if (paramAdRequestParcel == null) {}
    do
    {
      return false;
      paramAdRequestParcel = paramAdRequestParcel.getBundle(AdMobAdapter.class.getCanonicalName());
    } while (paramAdRequestParcel == null);
    return paramAdRequestParcel.keySet().contains("gw");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzeb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */