package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.Window;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzdj;
import com.google.android.gms.internal.zzdn;
import com.google.android.gms.internal.zzdn.zza;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjr;

public class zzk
  extends zzc
  implements zzdj, zzdn.zza
{
  protected transient boolean zzqc = false;
  private boolean zzqd;
  private float zzqe;
  private String zzqf = "background" + hashCode() + ".png";
  
  public zzk(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramzzex, paramVersionInfoParcel, paramzzd);
  }
  
  private void zzb(Bundle paramBundle)
  {
    zzr.zzbC().zzb(zzpj.context, zzpj.zzrl.afmaVersion, "gmob-apps", paramBundle, false);
  }
  
  public void showInterstitial()
  {
    zzx.zzcD("showInterstitial must be called on the main UI thread.");
    if (zzpj.zzrq == null)
    {
      zzin.zzaK("The interstitial has not loaded.");
      return;
    }
    if (((Boolean)zzbt.zzwN.get()).booleanValue()) {
      if (zzpj.context.getApplicationContext() == null) {
        break label211;
      }
    }
    label211:
    for (String str = zzpj.context.getApplicationContext().getPackageName();; localObject = zzpj.context.getPackageName())
    {
      Bundle localBundle;
      if (!zzqc)
      {
        zzin.zzaK("It is not recommended to show an interstitial before onAdLoaded completes.");
        localBundle = new Bundle();
        localBundle.putString("appid", str);
        localBundle.putString("action", "show_interstitial_before_load_finish");
        zzb(localBundle);
      }
      if (!zzr.zzbC().zzO(zzpj.context))
      {
        zzin.zzaK("It is not recommended to show an interstitial when app is not in foreground.");
        localBundle = new Bundle();
        localBundle.putString("appid", str);
        localBundle.putString("action", "show_interstitial_app_not_in_foreground");
        zzb(localBundle);
      }
      if (zzpj.zzbX()) {
        break;
      }
      if (!zzpj.zzrq.zzHT) {
        break label225;
      }
      try
      {
        zzpj.zzrq.zzCq.showInterstitial();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzd("Could not show interstitial.", localRemoteException);
        zzbp();
        return;
      }
    }
    label225:
    if (zzpj.zzrq.zzED == null)
    {
      zzin.zzaK("The interstitial failed to load.");
      return;
    }
    if (zzpj.zzrq.zzED.zzhY())
    {
      zzin.zzaK("The interstitial is already showing.");
      return;
    }
    zzpj.zzrq.zzED.zzD(true);
    if (zzpj.zzrq.zzKT != null) {
      zzpl.zza(zzpj.zzrp, zzpj.zzrq);
    }
    if (zzpj.zzql) {}
    for (Object localObject = zzr.zzbC().zzP(zzpj.context); (((Boolean)zzbt.zzxe.get()).booleanValue()) && (localObject != null); localObject = null)
    {
      new zzk.zzb(this, (Bitmap)localObject, zzqf).zzhn();
      return;
    }
    localObject = new InterstitialAdParameterParcel(zzpj.zzql, zzbo(), null, false, 0.0F);
    int j = zzpj.zzrq.zzED.getRequestedOrientation();
    int i = j;
    if (j == -1) {
      i = zzpj.zzrq.orientation;
    }
    localObject = new AdOverlayInfoParcel(this, this, this, zzpj.zzrq.zzED, i, zzpj.zzrl, zzpj.zzrq.zzHY, (InterstitialAdParameterParcel)localObject);
    zzr.zzbA().zza(zzpj.context, (AdOverlayInfoParcel)localObject);
  }
  
  protected zzjp zza(zzif.zza paramzza, zze paramzze)
  {
    zzjp localzzjp = zzr.zzbD().zza(zzpj.context, zzpj.zzrp, false, false, zzpj.zzrk, zzpj.zzrl, zzpe, zzpm);
    localzzjp.zzhU().zzb(this, null, this, this, ((Boolean)zzbt.zzwv.get()).booleanValue(), this, this, paramzze, null);
    zza(localzzjp);
    localzzjp.zzaM(zzLd.zzHI);
    zzdn.zza(localzzjp, this);
    return localzzjp;
  }
  
  public void zza(boolean paramBoolean, float paramFloat)
  {
    zzqd = paramBoolean;
    zzqe = paramFloat;
  }
  
  public boolean zza(AdRequestParcel paramAdRequestParcel, zzcb paramzzcb)
  {
    if (zzpj.zzrq != null)
    {
      zzin.zzaK("An interstitial is already loading. Aborting.");
      return false;
    }
    return super.zza(paramAdRequestParcel, paramzzcb);
  }
  
  protected boolean zza(AdRequestParcel paramAdRequestParcel, zzif paramzzif, boolean paramBoolean)
  {
    if ((zzpj.zzbW()) && (zzED != null)) {
      zzr.zzbE().zzi(zzED);
    }
    return zzpi.zzbw();
  }
  
  public boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    if (!super.zza(paramzzif1, paramzzif2)) {
      return false;
    }
    if ((!zzpj.zzbW()) && (zzpj.zzrK != null) && (zzKT != null)) {
      zzpl.zza(zzpj.zzrp, paramzzif2, zzpj.zzrK);
    }
    return true;
  }
  
  protected void zzaQ()
  {
    zzbp();
    super.zzaQ();
  }
  
  protected void zzaT()
  {
    super.zzaT();
    zzqc = true;
  }
  
  public void zzaX()
  {
    recordImpression();
    super.zzaX();
  }
  
  public void zzb(RewardItemParcel paramRewardItemParcel)
  {
    RewardItemParcel localRewardItemParcel = paramRewardItemParcel;
    if (zzpj.zzrq != null)
    {
      if (zzpj.zzrq.zzIl != null) {
        zzr.zzbC().zza(zzpj.context, zzpj.zzrl.afmaVersion, zzpj.zzrq.zzIl);
      }
      localRewardItemParcel = paramRewardItemParcel;
      if (zzpj.zzrq.zzIj != null) {
        localRewardItemParcel = zzpj.zzrq.zzIj;
      }
    }
    zza(localRewardItemParcel);
  }
  
  protected boolean zzbo()
  {
    if (!(zzpj.context instanceof Activity)) {
      return false;
    }
    Window localWindow = ((Activity)zzpj.context).getWindow();
    if ((localWindow == null) || (localWindow.getDecorView() == null)) {
      return false;
    }
    Rect localRect1 = new Rect();
    Rect localRect2 = new Rect();
    localWindow.getDecorView().getGlobalVisibleRect(localRect1, null);
    localWindow.getDecorView().getWindowVisibleDisplayFrame(localRect2);
    return (bottom != 0) && (bottom != 0) && (top == top);
  }
  
  public void zzbp()
  {
    new zzk.zza(this, zzqf).zzhn();
    if (zzpj.zzbW())
    {
      zzpj.zzbT();
      zzpj.zzrq = null;
      zzpj.zzql = false;
      zzqc = false;
    }
  }
  
  public void zzbq()
  {
    if ((zzpj.zzrq != null) && (zzpj.zzrq.zzKX != null)) {
      zzr.zzbC().zza(zzpj.context, zzpj.zzrl.afmaVersion, zzpj.zzrq.zzKX);
    }
    zzaU();
  }
  
  public void zzd(boolean paramBoolean)
  {
    zzpj.zzql = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */