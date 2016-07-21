package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.util.SimpleArrayMap;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.zzc;
import com.google.android.gms.ads.internal.purchase.zzf;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.purchase.zzj;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzdh;
import com.google.android.gms.internal.zzen;
import com.google.android.gms.internal.zzeo;
import com.google.android.gms.internal.zzep;
import com.google.android.gms.internal.zzeq;
import com.google.android.gms.internal.zzet;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzik;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzis;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class zzb
  extends zza
  implements com.google.android.gms.ads.internal.overlay.zzg, zzj, zzdh, zzep
{
  private final Messenger mMessenger;
  protected final zzex zzpn;
  protected transient boolean zzpo;
  
  public zzb(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    this(new zzs(paramContext, paramAdSizeParcel, paramString, paramVersionInfoParcel), paramzzex, null, paramzzd);
  }
  
  zzb(zzs paramzzs, zzex paramzzex, zzq paramzzq, zzd paramzzd)
  {
    super(paramzzs, paramzzq, paramzzd);
    zzpn = paramzzex;
    mMessenger = new Messenger(new zzga(zzpj.context));
    zzpo = false;
  }
  
  private AdRequestInfoParcel.zza zza(AdRequestParcel paramAdRequestParcel, Bundle paramBundle)
  {
    ApplicationInfo localApplicationInfo = zzpj.context.getApplicationInfo();
    DisplayMetrics localDisplayMetrics;
    String str1;
    Object localObject;
    String str2;
    long l1;
    Bundle localBundle;
    ArrayList localArrayList;
    PackageInfo localPackageInfo2;
    try
    {
      PackageInfo localPackageInfo1 = zzpj.context.getPackageManager().getPackageInfo(packageName, 0);
      localDisplayMetrics = zzpj.context.getResources().getDisplayMetrics();
      str1 = null;
      localObject = str1;
      if (zzpj.zzrm != null)
      {
        localObject = str1;
        if (zzpj.zzrm.getParent() != null)
        {
          localObject = new int[2];
          zzpj.zzrm.getLocationOnScreen((int[])localObject);
          int k = localObject[0];
          int m = localObject[1];
          int n = zzpj.zzrm.getWidth();
          int i1 = zzpj.zzrm.getHeight();
          int j = 0;
          i = j;
          if (zzpj.zzrm.isShown())
          {
            i = j;
            if (k + n > 0)
            {
              i = j;
              if (m + i1 > 0)
              {
                i = j;
                if (k <= widthPixels)
                {
                  i = j;
                  if (m <= heightPixels) {
                    i = 1;
                  }
                }
              }
            }
          }
          localObject = new Bundle(5);
          ((Bundle)localObject).putInt("x", k);
          ((Bundle)localObject).putInt("y", m);
          ((Bundle)localObject).putInt("width", n);
          ((Bundle)localObject).putInt("height", i1);
          ((Bundle)localObject).putInt("visible", i);
        }
      }
      str1 = zzr.zzbF().zzgZ();
      zzpj.zzrs = new zzig(str1, zzpj.zzrj);
      zzpj.zzrs.zzk(paramAdRequestParcel);
      str2 = zzr.zzbC().zza(zzpj.context, zzpj.zzrm, zzpj.zzrp);
      l2 = 0L;
      l1 = l2;
      if (zzpj.zzrw == null) {}
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      try
      {
        l1 = zzpj.zzrw.getValue();
        String str3 = UUID.randomUUID().toString();
        localBundle = zzr.zzbF().zza(zzpj.context, this, str1);
        localArrayList = new ArrayList();
        int i = 0;
        while (i < zzpj.zzrC.size())
        {
          localArrayList.add(zzpj.zzrC.keyAt(i));
          i += 1;
          continue;
          localNameNotFoundException = localNameNotFoundException;
          localPackageInfo2 = null;
        }
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          long l2;
          zzin.zzaK("Cannot get correlation id, default to 0.");
          l1 = l2;
        }
      }
    }
    boolean bool1;
    if (zzpj.zzrx != null)
    {
      bool1 = true;
      if ((zzpj.zzry == null) || (!zzr.zzbF().zzhj())) {
        break label670;
      }
    }
    label670:
    for (boolean bool2 = true;; bool2 = false)
    {
      boolean bool3 = zzpm.zzpy.zzfM();
      return new AdRequestInfoParcel.zza((Bundle)localObject, paramAdRequestParcel, zzpj.zzrp, zzpj.zzrj, localApplicationInfo, localPackageInfo2, str1, zzr.zzbF().getSessionId(), zzpj.zzrl, localBundle, zzpj.zzrH, localArrayList, paramBundle, zzr.zzbF().zzhd(), mMessenger, widthPixels, heightPixels, density, str2, l1, localRemoteException, zzbt.zzdr(), zzpj.zzri, zzpj.zzrD, new CapabilityParcel(bool1, bool2, bool3), zzpj.zzca(), zzr.zzbC().zzbt(), zzr.zzbC().zzR(zzpj.context), zzr.zzbC().zzl(zzpj.zzrm));
      bool1 = false;
      break;
    }
  }
  
  public String getMediationAdapterClassName()
  {
    if (zzpj.zzrq == null) {
      return null;
    }
    return zzpj.zzrq.zzCr;
  }
  
  public void onAdClicked()
  {
    if (zzpj.zzrq == null)
    {
      zzin.zzaK("Ad state was null when trying to ping click URLs.");
      return;
    }
    if ((zzpj.zzrq.zzKV != null) && (zzpj.zzrq.zzKV.zzBQ != null)) {
      zzr.zzbP().zza(zzpj.context, zzpj.zzrl.afmaVersion, zzpj.zzrq, zzpj.zzrj, false, zzpj.zzrq.zzKV.zzBQ);
    }
    if ((zzpj.zzrq.zzCp != null) && (zzpj.zzrq.zzCp.zzBE != null)) {
      zzr.zzbP().zza(zzpj.context, zzpj.zzrl.afmaVersion, zzpj.zzrq, zzpj.zzrj, false, zzpj.zzrq.zzCp.zzBE);
    }
    super.onAdClicked();
  }
  
  public void onPause()
  {
    zzpl.zzk(zzpj.zzrq);
  }
  
  public void onResume()
  {
    zzpl.zzl(zzpj.zzrq);
  }
  
  public void pause()
  {
    com.google.android.gms.common.internal.zzx.zzcD("pause must be called on the main UI thread.");
    if ((zzpj.zzrq != null) && (zzpj.zzrq.zzED != null) && (zzpj.zzbW())) {
      zzr.zzbE().zzi(zzpj.zzrq.zzED);
    }
    if ((zzpj.zzrq != null) && (zzpj.zzrq.zzCq != null)) {}
    try
    {
      zzpj.zzrq.zzCq.pause();
      zzpl.zzk(zzpj.zzrq);
      zzpi.pause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzin.zzaK("Could not pause mediation adapter.");
      }
    }
  }
  
  public void recordImpression()
  {
    zza(zzpj.zzrq, false);
  }
  
  public void resume()
  {
    com.google.android.gms.common.internal.zzx.zzcD("resume must be called on the main UI thread.");
    if ((zzpj.zzrq != null) && (zzpj.zzrq.zzED != null) && (zzpj.zzbW())) {
      zzr.zzbE().zzj(zzpj.zzrq.zzED);
    }
    if ((zzpj.zzrq != null) && (zzpj.zzrq.zzCq != null)) {}
    try
    {
      zzpj.zzrq.zzCq.resume();
      zzpi.resume();
      zzpl.zzl(zzpj.zzrq);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzin.zzaK("Could not resume mediation adapter.");
      }
    }
  }
  
  public void showInterstitial()
  {
    throw new IllegalStateException("showInterstitial is not supported for current ad type");
  }
  
  public void zza(zzgd paramzzgd)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setInAppPurchaseListener must be called on the main UI thread.");
    zzpj.zzrx = paramzzgd;
  }
  
  public void zza(zzgh paramzzgh, String paramString)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setPlayStorePurchaseParams must be called on the main UI thread.");
    zzpj.zzrI = new zzk(paramString);
    zzpj.zzry = paramzzgh;
    if ((!zzr.zzbF().zzhc()) && (paramzzgh != null)) {
      new zzc(zzpj.context, zzpj.zzry, zzpj.zzrI).zzhn();
    }
  }
  
  protected void zza(zzif paramzzif, boolean paramBoolean)
  {
    if (paramzzif == null) {
      zzin.zzaK("Ad state was null when trying to ping impression URLs.");
    }
    do
    {
      return;
      super.zzc(paramzzif);
      if ((zzKV != null) && (zzKV.zzBR != null)) {
        zzr.zzbP().zza(zzpj.context, zzpj.zzrl.afmaVersion, paramzzif, zzpj.zzrj, paramBoolean, zzKV.zzBR);
      }
    } while ((zzCp == null) || (zzCp.zzBF == null));
    zzr.zzbP().zza(zzpj.context, zzpj.zzrl.afmaVersion, paramzzif, zzpj.zzrj, paramBoolean, zzCp.zzBF);
  }
  
  public void zza(String paramString, ArrayList paramArrayList)
  {
    paramArrayList = new com.google.android.gms.ads.internal.purchase.zzd(paramString, paramArrayList, zzpj.context, zzpj.zzrl.afmaVersion);
    if (zzpj.zzrx == null)
    {
      zzin.zzaK("InAppPurchaseListener is not set. Try to launch default purchase flow.");
      if (!zzn.zzcS().zzU(zzpj.context))
      {
        zzin.zzaK("Google Play Service unavailable, cannot launch default purchase flow.");
        return;
      }
      if (zzpj.zzry == null)
      {
        zzin.zzaK("PlayStorePurchaseListener is not set.");
        return;
      }
      if (zzpj.zzrI == null)
      {
        zzin.zzaK("PlayStorePurchaseVerifier is not initialized.");
        return;
      }
      if (zzpj.zzrM)
      {
        zzin.zzaK("An in-app purchase request is already in progress, abort");
        return;
      }
      zzpj.zzrM = true;
      try
      {
        if (!zzpj.zzry.isValidPurchase(paramString))
        {
          zzpj.zzrM = false;
          return;
        }
      }
      catch (RemoteException paramString)
      {
        zzin.zzaK("Could not start In-App purchase.");
        zzpj.zzrM = false;
        return;
      }
      zzr.zzbM().zza(zzpj.context, zzpj.zzrl.zzNb, new GInAppPurchaseManagerInfoParcel(zzpj.context, zzpj.zzrI, paramArrayList, this));
      return;
    }
    try
    {
      zzpj.zzrx.zza(paramArrayList);
      return;
    }
    catch (RemoteException paramString)
    {
      zzin.zzaK("Could not start In-App purchase.");
    }
  }
  
  public void zza(String paramString, boolean paramBoolean, int paramInt, Intent paramIntent, zzf paramzzf)
  {
    try
    {
      if (zzpj.zzry != null) {
        zzpj.zzry.zza(new com.google.android.gms.ads.internal.purchase.zzg(zzpj.context, paramString, paramBoolean, paramInt, paramIntent, paramzzf));
      }
      zzir.zzMc.postDelayed(new zzb.1(this, paramIntent), 500L);
      return;
    }
    catch (RemoteException paramString)
    {
      for (;;)
      {
        zzin.zzaK("Fail to invoke PlayStorePurchaseListener.");
      }
    }
  }
  
  public boolean zza(AdRequestParcel paramAdRequestParcel, zzcb paramzzcb)
  {
    if (!zzaV()) {
      return false;
    }
    Bundle localBundle = zza(zzr.zzbF().zzG(zzpj.context));
    zzpi.cancel();
    zzpj.zzrL = 0;
    paramAdRequestParcel = zza(paramAdRequestParcel, localBundle);
    paramzzcb.zzc("seq_num", zzHw);
    paramzzcb.zzc("request_id", zzHI);
    paramzzcb.zzc("session_id", zzHx);
    if (zzHu != null) {
      paramzzcb.zzc("app_version", String.valueOf(zzHu.versionCode));
    }
    zzpj.zzrn = zzr.zzby().zza(zzpj.context, paramAdRequestParcel, zzpj.zzrk, this);
    return true;
  }
  
  protected boolean zza(AdRequestParcel paramAdRequestParcel, zzif paramzzif, boolean paramBoolean)
  {
    if ((!paramBoolean) && (zzpj.zzbW()))
    {
      if (zzBU <= 0L) {
        break label43;
      }
      zzpi.zza(paramAdRequestParcel, zzBU);
    }
    for (;;)
    {
      return zzpi.zzbw();
      label43:
      if ((zzKV != null) && (zzKV.zzBU > 0L)) {
        zzpi.zza(paramAdRequestParcel, zzKV.zzBU);
      } else if ((!zzHT) && (errorCode == 2)) {
        zzpi.zzg(paramAdRequestParcel);
      }
    }
  }
  
  boolean zza(zzif paramzzif)
  {
    boolean bool = false;
    Object localObject;
    if (zzpk != null)
    {
      localObject = zzpk;
      zzpk = null;
    }
    for (;;)
    {
      return zza((AdRequestParcel)localObject, paramzzif, bool);
      AdRequestParcel localAdRequestParcel = zzHt;
      localObject = localAdRequestParcel;
      if (extras != null)
      {
        bool = extras.getBoolean("_noRefresh", false);
        localObject = localAdRequestParcel;
      }
    }
  }
  
  protected boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    int i = 0;
    if ((paramzzif1 != null) && (zzCs != null)) {
      zzCs.zza(null);
    }
    if (zzCs != null) {
      zzCs.zza(this);
    }
    int j;
    if (zzKV != null)
    {
      j = zzKV.zzBZ;
      i = zzKV.zzCa;
    }
    for (;;)
    {
      zzpj.zzrJ.zzg(j, i);
      return true;
      j = 0;
    }
  }
  
  protected boolean zzaV()
  {
    boolean bool = true;
    if ((!zzr.zzbC().zza(zzpj.context.getPackageManager(), zzpj.context.getPackageName(), "android.permission.INTERNET")) || (!zzr.zzbC().zzI(zzpj.context))) {
      bool = false;
    }
    return bool;
  }
  
  public void zzaW()
  {
    zzpl.zzi(zzpj.zzrq);
    zzpo = false;
    zzaQ();
    zzpj.zzrs.zzgU();
  }
  
  public void zzaX()
  {
    zzpo = true;
    zzaS();
  }
  
  public void zzaY()
  {
    onAdClicked();
  }
  
  public void zzaZ()
  {
    zzaW();
  }
  
  public void zzb(zzif paramzzif)
  {
    super.zzb(paramzzif);
    if ((errorCode == 3) && (zzKV != null) && (zzKV.zzBS != null))
    {
      zzin.zzaI("Pinging no fill URLs.");
      zzr.zzbP().zza(zzpj.context, zzpj.zzrl.afmaVersion, paramzzif, zzpj.zzrj, false, zzKV.zzBS);
    }
  }
  
  public void zzba()
  {
    zzaO();
  }
  
  public void zzbb()
  {
    zzaX();
  }
  
  public void zzbc()
  {
    if (zzpj.zzrq != null) {
      zzin.zzaK("Mediation adapter " + zzpj.zzrq.zzCr + " refreshed, but mediation adapters should never refresh.");
    }
    zza(zzpj.zzrq, true);
    zzaT();
  }
  
  protected boolean zzc(AdRequestParcel paramAdRequestParcel)
  {
    return (super.zzc(paramAdRequestParcel)) && (!zzpo);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */