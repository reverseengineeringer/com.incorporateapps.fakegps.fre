package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ThinAdSizeParcel;
import com.google.android.gms.ads.internal.client.zzf;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzu.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.zza.zza;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzbc;
import com.google.android.gms.internal.zzbf;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzdb;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzgr.zza;
import com.google.android.gms.internal.zzhr;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzij;
import com.google.android.gms.internal.zzik;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import java.util.HashSet;

public abstract class zza
  extends zzu.zza
  implements com.google.android.gms.ads.internal.client.zza, com.google.android.gms.ads.internal.overlay.zzp, zza.zza, zzdb, zzgr.zza, zzij
{
  protected zzcb zzpe;
  protected zzbz zzpf;
  protected zzbz zzpg;
  protected boolean zzph = false;
  protected final zzq zzpi;
  protected final zzs zzpj;
  protected transient AdRequestParcel zzpk;
  protected final zzax zzpl;
  protected final zzd zzpm;
  
  zza(zzs paramzzs, zzq paramzzq, zzd paramzzd)
  {
    zzpj = paramzzs;
    if (paramzzq != null) {}
    for (;;)
    {
      zzpi = paramzzq;
      zzpm = paramzzd;
      zzr.zzbC().zzJ(zzpj.context);
      zzr.zzbF().zzb(zzpj.context, zzpj.zzrl);
      zzpl = zzr.zzbF().zzhh();
      return;
      paramzzq = new zzq(this);
    }
  }
  
  private AdRequestParcel zza(AdRequestParcel paramAdRequestParcel)
  {
    AdRequestParcel localAdRequestParcel = paramAdRequestParcel;
    if (com.google.android.gms.common.zze.zzap(zzpj.context))
    {
      localAdRequestParcel = paramAdRequestParcel;
      if (zztK != null) {
        localAdRequestParcel = new zzf(paramAdRequestParcel).zza(null).zzcN();
      }
    }
    return localAdRequestParcel;
  }
  
  public void destroy()
  {
    com.google.android.gms.common.internal.zzx.zzcD("destroy must be called on the main UI thread.");
    zzpi.cancel();
    zzpl.zzj(zzpj.zzrq);
    zzpj.destroy();
  }
  
  public boolean isLoading()
  {
    return zzph;
  }
  
  public boolean isReady()
  {
    com.google.android.gms.common.internal.zzx.zzcD("isLoaded must be called on the main UI thread.");
    return (zzpj.zzrn == null) && (zzpj.zzro == null) && (zzpj.zzrq != null);
  }
  
  public void onAdClicked()
  {
    if (zzpj.zzrq == null) {
      zzin.zzaK("Ad state was null when trying to ping click URLs.");
    }
    do
    {
      return;
      zzin.zzaI("Pinging click URLs.");
      zzpj.zzrs.zzgT();
      if (zzpj.zzrq.zzBQ != null) {
        zzr.zzbC().zza(zzpj.context, zzpj.zzrl.afmaVersion, zzpj.zzrq.zzBQ);
      }
    } while (zzpj.zzrt == null);
    try
    {
      zzpj.zzrt.onAdClicked();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not notify onAdClicked event.", localRemoteException);
    }
  }
  
  public void onAppEvent(String paramString1, String paramString2)
  {
    if (zzpj.zzrv != null) {}
    try
    {
      zzpj.zzrv.onAppEvent(paramString1, paramString2);
      return;
    }
    catch (RemoteException paramString1)
    {
      zzin.zzd("Could not call the AppEventListener.", paramString1);
    }
  }
  
  public void pause()
  {
    com.google.android.gms.common.internal.zzx.zzcD("pause must be called on the main UI thread.");
  }
  
  public void resume()
  {
    com.google.android.gms.common.internal.zzx.zzcD("resume must be called on the main UI thread.");
  }
  
  public void setManualImpressionsEnabled(boolean paramBoolean)
  {
    throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
  }
  
  public void setUserId(String paramString)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setUserId must be called on the main UI thread.");
    zzpj.setUserId(paramString);
  }
  
  public void stopLoading()
  {
    com.google.android.gms.common.internal.zzx.zzcD("stopLoading must be called on the main UI thread.");
    zzph = false;
    zzpj.zzf(true);
  }
  
  Bundle zza(zzbf paramzzbf)
  {
    Object localObject2 = null;
    if (paramzzbf == null) {}
    label145:
    for (;;)
    {
      return (Bundle)localObject2;
      if (paramzzbf.zzcK()) {
        paramzzbf.wakeup();
      }
      paramzzbf = paramzzbf.zzcI();
      Object localObject3;
      String str;
      Object localObject1;
      if (paramzzbf != null)
      {
        localObject3 = paramzzbf.zzcy();
        str = paramzzbf.zzcz();
        zzin.zzaI("In AdManager: loadAd, " + paramzzbf.toString());
        paramzzbf = str;
        localObject1 = localObject3;
        if (localObject3 != null)
        {
          zzr.zzbF().zzaA((String)localObject3);
          localObject1 = localObject3;
        }
      }
      for (paramzzbf = str;; paramzzbf = null)
      {
        if (localObject1 == null) {
          break label145;
        }
        localObject3 = new Bundle(1);
        ((Bundle)localObject3).putString("fingerprint", (String)localObject1);
        localObject2 = localObject3;
        if (((String)localObject1).equals(paramzzbf)) {
          break;
        }
        ((Bundle)localObject3).putString("v_fp", paramzzbf);
        return (Bundle)localObject3;
        localObject1 = zzr.zzbF().zzhf();
      }
    }
  }
  
  public void zza(AdSizeParcel paramAdSizeParcel)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setAdSize must be called on the main UI thread.");
    zzpj.zzrp = paramAdSizeParcel;
    if ((zzpj.zzrq != null) && (zzpj.zzrq.zzED != null) && (zzpj.zzrL == 0)) {
      zzpj.zzrq.zzED.zza(paramAdSizeParcel);
    }
    if (zzpj.zzrm == null) {
      return;
    }
    if (zzpj.zzrm.getChildCount() > 1) {
      zzpj.zzrm.removeView(zzpj.zzrm.getNextView());
    }
    zzpj.zzrm.setMinimumWidth(widthPixels);
    zzpj.zzrm.setMinimumHeight(heightPixels);
    zzpj.zzrm.requestLayout();
  }
  
  public void zza(com.google.android.gms.ads.internal.client.zzp paramzzp)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setAdListener must be called on the main UI thread.");
    zzpj.zzrt = paramzzp;
  }
  
  public void zza(com.google.android.gms.ads.internal.client.zzq paramzzq)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setAdListener must be called on the main UI thread.");
    zzpj.zzru = paramzzq;
  }
  
  public void zza(zzw paramzzw)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setAppEventListener must be called on the main UI thread.");
    zzpj.zzrv = paramzzw;
  }
  
  public void zza(com.google.android.gms.ads.internal.client.zzx paramzzx)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setCorrelationIdProvider must be called on the main UI thread");
    zzpj.zzrw = paramzzx;
  }
  
  public void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setRewardedVideoAdListener can only be called from the UI thread.");
    zzpj.zzrF = paramzzd;
  }
  
  protected void zza(RewardItemParcel paramRewardItemParcel)
  {
    if (zzpj.zzrF == null) {
      return;
    }
    String str = "";
    int i = 0;
    if (paramRewardItemParcel != null) {}
    try
    {
      str = type;
      i = zzKS;
      zzpj.zzrF.zza(new zzhr(str, i));
      return;
    }
    catch (RemoteException paramRewardItemParcel)
    {
      zzin.zzd("Could not call RewardedVideoAdListener.onRewarded().", paramRewardItemParcel);
    }
  }
  
  public void zza(zzcf paramzzcf)
  {
    throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
  }
  
  public void zza(zzgd paramzzgd)
  {
    throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
  }
  
  public void zza(zzgh paramzzgh, String paramString)
  {
    throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
  }
  
  public void zza(zzif.zza paramzza)
  {
    if ((zzLe.zzHX != -1L) && (!TextUtils.isEmpty(zzLe.zzIh)))
    {
      long l = zzp(zzLe.zzIh);
      if (l != -1L)
      {
        zzbz localzzbz = zzpe.zzb(l + zzLe.zzHX);
        zzpe.zza(localzzbz, new String[] { "stc" });
      }
    }
    zzpe.zzN(zzLe.zzIh);
    zzpe.zza(zzpf, new String[] { "arf" });
    zzpg = zzpe.zzdB();
    zzpe.zzc("gqi", zzLe.zzIi);
    zzpj.zzrn = null;
    zzpj.zzrr = paramzza;
    zza(paramzza, zzpe);
  }
  
  protected abstract void zza(zzif.zza paramzza, zzcb paramzzcb);
  
  public void zza(HashSet paramHashSet)
  {
    zzpj.zza(paramHashSet);
  }
  
  protected abstract boolean zza(AdRequestParcel paramAdRequestParcel, zzcb paramzzcb);
  
  boolean zza(zzif paramzzif)
  {
    return false;
  }
  
  protected abstract boolean zza(zzif paramzzif1, zzif paramzzif2);
  
  void zzaL()
  {
    zzpe = new zzcb(((Boolean)zzbt.zzwg.get()).booleanValue(), "load_ad", zzpj.zzrp.zzuh);
    zzpf = new zzbz(-1L, null, null);
    zzpg = new zzbz(-1L, null, null);
  }
  
  public com.google.android.gms.dynamic.zzd zzaM()
  {
    com.google.android.gms.common.internal.zzx.zzcD("getAdFrame must be called on the main UI thread.");
    return com.google.android.gms.dynamic.zze.zzC(zzpj.zzrm);
  }
  
  public AdSizeParcel zzaN()
  {
    com.google.android.gms.common.internal.zzx.zzcD("getAdSize must be called on the main UI thread.");
    if (zzpj.zzrp == null) {
      return null;
    }
    return new ThinAdSizeParcel(zzpj.zzrp);
  }
  
  public void zzaO()
  {
    zzaR();
  }
  
  public void zzaP()
  {
    com.google.android.gms.common.internal.zzx.zzcD("recordManualImpression must be called on the main UI thread.");
    if (zzpj.zzrq == null) {
      zzin.zzaK("Ad state was null when trying to ping manual tracking URLs.");
    }
    do
    {
      return;
      zzin.zzaI("Pinging manual tracking URLs.");
    } while ((zzpj.zzrq.zzHV == null) || (zzpj.zzrq.zzLc));
    zzr.zzbC().zza(zzpj.context, zzpj.zzrl.afmaVersion, zzpj.zzrq.zzHV);
    zzpj.zzrq.zzLc = true;
  }
  
  protected void zzaQ()
  {
    zzin.zzaJ("Ad closing.");
    if (zzpj.zzru != null) {}
    try
    {
      zzpj.zzru.onAdClosed();
      if (zzpj.zzrF == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          zzpj.zzrF.onRewardedVideoAdClosed();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          zzin.zzd("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        zzin.zzd("Could not call AdListener.onAdClosed().", localRemoteException1);
      }
    }
  }
  
  protected void zzaR()
  {
    zzin.zzaJ("Ad leaving application.");
    if (zzpj.zzru != null) {}
    try
    {
      zzpj.zzru.onAdLeftApplication();
      if (zzpj.zzrF == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          zzpj.zzrF.onRewardedVideoAdLeftApplication();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          zzin.zzd("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        zzin.zzd("Could not call AdListener.onAdLeftApplication().", localRemoteException1);
      }
    }
  }
  
  protected void zzaS()
  {
    zzin.zzaJ("Ad opening.");
    if (zzpj.zzru != null) {}
    try
    {
      zzpj.zzru.onAdOpened();
      if (zzpj.zzrF == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          zzpj.zzrF.onRewardedVideoAdOpened();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          zzin.zzd("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        zzin.zzd("Could not call AdListener.onAdOpened().", localRemoteException1);
      }
    }
  }
  
  protected void zzaT()
  {
    zzin.zzaJ("Ad finished loading.");
    zzph = false;
    if (zzpj.zzru != null) {}
    try
    {
      zzpj.zzru.onAdLoaded();
      if (zzpj.zzrF == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          zzpj.zzrF.onRewardedVideoAdLoaded();
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          zzin.zzd("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        zzin.zzd("Could not call AdListener.onAdLoaded().", localRemoteException1);
      }
    }
  }
  
  protected void zzaU()
  {
    if (zzpj.zzrF == null) {
      return;
    }
    try
    {
      zzpj.zzrF.onRewardedVideoStarted();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call RewardedVideoAdListener.onVideoStarted().", localRemoteException);
    }
  }
  
  protected void zzb(View paramView)
  {
    zzpj.zzrm.addView(paramView, zzr.zzbE().zzhy());
  }
  
  public void zzb(zzif paramzzif)
  {
    zzpe.zza(zzpg, new String[] { "awr" });
    zzpj.zzro = null;
    if ((errorCode != -2) && (errorCode != 3)) {
      zzr.zzbF().zzb(zzpj.zzbS());
    }
    if (errorCode == -1) {
      zzph = false;
    }
    do
    {
      return;
      if (zza(paramzzif)) {
        zzin.zzaI("Ad refresh scheduled.");
      }
      if (errorCode != -2)
      {
        zzf(errorCode);
        return;
      }
      if (zzpj.zzrJ == null) {
        zzpj.zzrJ = new zzik(zzpj.zzrj);
      }
      zzpl.zzi(zzpj.zzrq);
    } while (!zza(zzpj.zzrq, paramzzif));
    zzpj.zzrq = paramzzif;
    zzpj.zzcb();
    zzcb localzzcb = zzpe;
    if (zzpj.zzrq.zzcv())
    {
      paramzzif = "1";
      label203:
      localzzcb.zzc("is_mraid", paramzzif);
      localzzcb = zzpe;
      if (!zzpj.zzrq.zzHT) {
        break label377;
      }
      paramzzif = "1";
      label233:
      localzzcb.zzc("is_mediation", paramzzif);
      if ((zzpj.zzrq.zzED != null) && (zzpj.zzrq.zzED.zzhU() != null))
      {
        localzzcb = zzpe;
        if (!zzpj.zzrq.zzED.zzhU().zzih()) {
          break label384;
        }
      }
    }
    label377:
    label384:
    for (paramzzif = "1";; paramzzif = "0")
    {
      localzzcb.zzc("is_video", paramzzif);
      zzpe.zza(zzpf, new String[] { "ttc" });
      if (zzr.zzbF().zzhb() != null) {
        zzr.zzbF().zzhb().zza(zzpe);
      }
      if (!zzpj.zzbW()) {
        break;
      }
      zzaT();
      return;
      paramzzif = "0";
      break label203;
      paramzzif = "0";
      break label233;
    }
  }
  
  public boolean zzb(AdRequestParcel paramAdRequestParcel)
  {
    com.google.android.gms.common.internal.zzx.zzcD("loadAd must be called on the main UI thread.");
    paramAdRequestParcel = zza(paramAdRequestParcel);
    if ((zzpj.zzrn != null) || (zzpj.zzro != null))
    {
      if (zzpk != null) {
        zzin.zzaK("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
      }
      for (;;)
      {
        zzpk = paramAdRequestParcel;
        return false;
        zzin.zzaK("Loading already in progress, saving this object for future refreshes.");
      }
    }
    zzin.zzaJ("Starting ad request.");
    zzaL();
    zzpf = zzpe.zzdB();
    if (!zztF) {
      zzin.zzaJ("Use AdRequest.Builder.addTestDevice(\"" + zzn.zzcS().zzT(zzpj.context) + "\") to get test ads on this device.");
    }
    zzph = zza(paramAdRequestParcel, zzpe);
    return zzph;
  }
  
  protected void zzc(zzif paramzzif)
  {
    if (paramzzif == null) {
      zzin.zzaK("Ad state was null when trying to ping impression URLs.");
    }
    do
    {
      return;
      zzin.zzaI("Pinging Impression URLs.");
      zzpj.zzrs.zzgS();
    } while ((zzBR == null) || (zzLb));
    zzr.zzbC().zza(zzpj.context, zzpj.zzrl.afmaVersion, zzBR);
    zzLb = true;
  }
  
  protected boolean zzc(AdRequestParcel paramAdRequestParcel)
  {
    paramAdRequestParcel = zzpj.zzrm.getParent();
    return ((paramAdRequestParcel instanceof View)) && (((View)paramAdRequestParcel).isShown()) && (zzr.zzbC().zzhq());
  }
  
  public void zzd(AdRequestParcel paramAdRequestParcel)
  {
    if (zzc(paramAdRequestParcel))
    {
      zzb(paramAdRequestParcel);
      return;
    }
    zzin.zzaJ("Ad is not visible. Not refreshing ad.");
    zzpi.zzg(paramAdRequestParcel);
  }
  
  protected void zzf(int paramInt)
  {
    zzin.zzaK("Failed to load ad: " + paramInt);
    zzph = false;
    if (zzpj.zzru != null) {}
    try
    {
      zzpj.zzru.onAdFailedToLoad(paramInt);
      if (zzpj.zzrF == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      for (;;)
      {
        try
        {
          zzpj.zzrF.onRewardedVideoAdFailedToLoad(paramInt);
          return;
        }
        catch (RemoteException localRemoteException2)
        {
          zzin.zzd("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", localRemoteException2);
        }
        localRemoteException1 = localRemoteException1;
        zzin.zzd("Could not call AdListener.onAdFailedToLoad().", localRemoteException1);
      }
    }
  }
  
  long zzp(String paramString)
  {
    int k = paramString.indexOf("ufe");
    int j = paramString.indexOf(',', k);
    int i = j;
    if (j == -1) {
      i = paramString.length();
    }
    try
    {
      long l = Long.parseLong(paramString.substring(k + 4, i));
      return l;
    }
    catch (IndexOutOfBoundsException paramString)
    {
      zzin.zzaK("Invalid index for Url fetch time in CSI latency info.");
      return -1L;
    }
    catch (NumberFormatException paramString)
    {
      for (;;)
      {
        zzin.zzaK("Cannot find valid format of Url fetch time in CSI latency info.");
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */